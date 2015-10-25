package javahx.thnx;

import haxe.at.dotpoint.core.dispatcher.event.Event;
import haxe.at.dotpoint.core.dispatcher.event.EventDispatcher;
import haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent;
import haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher;
import haxe.at.dotpoint.loader.URLRequest;
import haxe.at.dotpoint.math.vector.Vector2;
import haxe.Json;
import haxe.thnx.event.SocketEvent;
import haxe.thnx.loader.TilesetRequest;
import haxe.thnx.model.Lobby;
import haxe.thnx.model.World;
import haxe.thnx.socket.IClientSocket;
import haxe.thnx.socket.ResponseList;
import haxe.thnx.view.IViewController;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javahx.thnx.socket.ClientSocket;
import javahx.thnx.view.ViewController;
import haxe.at.dotpoint.math.Trigonometry;

/**
 *
 */
class ThnxMain extends EventDispatcher
{

	/**
	 * singleton (habit, convinience, ... )
	 */
	public static var instance:ThnxMain;

	// ------------------ //

	/**
	 *
	 */
	public var socket:IClientSocket;

	/**
	 *
	 */
	public var view:IViewController;

	// ------------------ //

	/**
	 *
	 */
	public var world:World;

	/**
	 *
	 */
	public var lobby:Lobby;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	static public function main()
	{
		ThnxMain.instance = new ThnxMain();

		ThnxMain.instance.initView();
		ThnxMain.instance.initModel();
		ThnxMain.instance.startServer();

		ThnxMain.instance.startConsoleCommands();
	}

	public function new( ?proxy:IEventDispatcher )
	{
		super( proxy );
	}

	// ************************************************************************ //
	// Update
	// ************************************************************************ //

	/**
	 *
	 */
	private function onMessage( value:Event ):Void
	{
		this.respondeToMessage( cast( value, SocketEvent ).data );

		if( this.view != null )
			this.view.update();
	}

	/**
	 *
	 * @param	message
	 */
	public function respondeToMessage( message:String ):Void
	{
		var data:Dynamic = Json.parse( message );

		for( response in ResponseList.instance.getResponseList() )
		{
			if( response.ID == data.n )
			{
				response.execute( data.d );
				break;
			}
		}
	}

	// ************************************************************************ //
	// Init
	// ************************************************************************ //

	/**
	 *
	 */
	public function initModel( ?levelURL:String ):Void
	{
		if( this.lobby == null )
			this.lobby = new Lobby();

		if( this.world == null )
			this.world = new World();

		if( this.world.tileset == null )
		{
			if( levelURL == null )
				levelURL = "res/level_definition.json";

			var request:TilesetRequest = new TilesetRequest( new URLRequest( levelURL ) );
				request.load( this.onLevelComplete );
		}
	}

	/**
	 *
	 * @param	event
	 */
	private function onLevelComplete( event:StatusEvent ):Void
	{
		this.world.tileset = cast( event.target, TilesetRequest ).result;

		if( this.view != null )
			this.view.update();
	}

	/**
	 *
	 */
	public function initView():Void
	{
		if( this.view == null )
		{
			this.view = new ViewController();
			this.view.initialize( new Vector2( 480, 600 ) );
		}
	}

	/**
	 *
	 */
	public function startServer():Void
	{
		trace("starting server ...");

		if( this.socket == null )
			this.socket = new ClientSocket( ThnxMain.instance, 9998 );

		if(!this.hasListener( SocketEvent.MESSAGE_RECIEVED ) )
			this.addListener( SocketEvent.MESSAGE_RECIEVED, this.onMessage );

		this.socket.start();
	}

	/**
	 *
	 */
	public function startConsoleCommands():Void
	{
		var sysin:BufferedReader = new BufferedReader( new InputStreamReader( java.lang.System._in ) );

		while( true )
		{
			var line:String = sysin.readLine();

			if( line == "shoot" )
			{
				this.socket.requestShoot( !this.lobby.player.getTank().cannon.isShooting );
			}
			else if( line == "move" )
			{
				var x:Float = -1 + Math.random() * 2;
				var y:Float = -1 + Math.random() * 2;

				// ------------ //

				var t:Float = 0;

				t = x * Math.sin(Math.PI * 0.75) - y * Math.cos(Math.PI * 0.75);
				y = y * Math.sin(Math.PI * 0.75) + x * Math.cos(Math.PI * 0.75);
				x = t;

				// ------------ //

				this.socket.requestMove( x, y );
			}
			else if( line == "target" )
			{
				this.socket.requestTarget( -180 + Math.random() * 360 );
			}
		}
	}

}