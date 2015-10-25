package javahx.thnx.socket;

import haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher;
import haxe.Json;
import haxe.thnx.event.SocketEvent;
import haxe.thnx.socket.IClientSocket;
import java.lang.Exception;
import java.net.InetSocketAddress;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.java_websocket.WebSocket;


/**
 * ...
 * @author RK
 */
class ClientSocket extends WebSocketServer implements IClientSocket
{

	/**
	 *
	 */
	private var dispatcher:IEventDispatcher;

	/**
	 *
	 */
	private var event:SocketEvent;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 */
	public function new( dispatcher:IEventDispatcher, ?port:Int = 9998 )
	{
		super( new InetSocketAddress( port ) );

		// ------------- //

		this.dispatcher = dispatcher;
		this.event = new SocketEvent( SocketEvent.MESSAGE_RECIEVED );
	}

	// ************************************************************************ //
	// IClientSocket
	// ************************************************************************ //

	//
	public function requestMove( x:Float, y:Float ):Void
	{
		this.sendRequest( "move", [ x, y ] );
	}

	//
	public function requestShoot( isShooting:Bool ):Void
	{
		this.sendRequest( "shoot", isShooting );
	}

	//
	public function requestTarget( degree:Float ):Void
	{
		this.sendRequest( "target", degree );
	}

	//
	public function sendRequest( name:String, data:Dynamic ):Void
	{
		var json:Dynamic = {};
			json.n = name;
			json.d = data;

		var message:String = Json.stringify( json );

		// ----------- //

		for( socket in this.connections().iterator() )
			socket.send( message );
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	cnx
	 * @param	handshake
	 */
	@:overload
	//
	override public function onOpen( cnx:WebSocket, handshake:ClientHandshake ):Void
	{
		trace( "open", handshake );
	}

	/**
	 *
	 * @param	cnx
	 * @param	handshake
	 */
	@:overload
	//
	override public function onClose( cnx:WebSocket, code:Int, reason:String, remote:Bool ):Void
	{
		trace( "close", code, reason );
	}

	/**
	 *
	 * @param	cnx
	 * @param	handshake
	 */
	@:overload
	//
	override public function onMessage( cnx:WebSocket, message:String ):Void
	{
		this.event.data = message;
		this.dispatcher.dispatch( this.event );
	}

	/**
	 *
	 * @param	cnx
	 * @param	handshake
	 */
	@:overload
	//
	override public function onError( cnx:WebSocket, error:Exception ):Void
	{
		trace( "msg:", error );
	}

}