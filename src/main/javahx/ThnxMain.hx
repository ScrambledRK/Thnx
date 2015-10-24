package javahx;

import haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent;
import haxe.at.dotpoint.loader.URLRequest;
import haxe.at.dotpoint.math.vector.Vector2;
import haxe.IMainFactory;
import haxe.loader.WorldRequest;
import haxe.model.Lobby;
import haxe.model.World;
import haxe.socket.IClientSocket;
import haxe.view.IViewController;
import haxe.view.NullViewController;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */
class ThnxMain
{

	/**
	 * singleton (habit, convinience, ... )
	 */
	public static var instance:ThnxMain;

	/**
	 *
	 */
	public static var factory:IMainFactory;

	// ------------------ //

	/**
	 *
	 */
	public var socket(default, null):IClientSocket;

	/**
	 *
	 */
	public var view(default, null):IViewController;

	// ------------------ //

	/**
	 *
	 */
	public var world(default, null):World;

	/**
	 *
	 */
	public var lobby(default, null):Lobby;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	static public function main()
	{
		ThnxMain.factory  = new MainFactory();
		ThnxMain.instance = new ThnxMain();
		ThnxMain.instance.initialize( "res/level_definition.json" );
	}

	public function new()
	{
		//;
	}

	// ************************************************************************ //
	// Methodes
	// ************************************************************************ //

	/**
	 *
	 */
	private function initialize( urlLevel:String, useView:Bool = true, autostart:Bool = true ):Void
	{
		if( useView )
		{
			this.view = ThnxMain.factory.createViewController();
			this.view.initialize( new Vector2( 480, 600 ) );
		}
		else
		{
			this.view = new NullViewController();
		}

		// ---------------------- //

		this.lobby = new Lobby();

		var request:WorldRequest = new WorldRequest( new URLRequest( urlLevel ) );
			request.load( this.onLevelComplete );

		// ---------------------- //

		if( autostart )
			this.startServer();
	}

	/**
	 *
	 * @param	event
	 */
	private function onLevelComplete( event:StatusEvent ):Void
	{
		this.world = cast( event.target, WorldRequest ).result;
		this.view.update();
	}

	/**
	 *
	 */
	private function startServer():Void
	{
		trace("starting server ...");

		this.socket = ThnxMain.factory.createClientSocket( "localhost", 9998 );
		this.socket.start();

		this.startListenSystemInput();
	}

	/**
	 *
	 */
	private function startListenSystemInput():Void
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