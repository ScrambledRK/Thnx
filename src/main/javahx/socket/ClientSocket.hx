package javahx.socket;

import haxe.Json;
import haxe.socket.IClientSocket;
import haxe.socket.response.SocketResponse;
import java.lang.Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Collection;

import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

/**
 * ...
 * @author RK
 */
class ClientSocket extends WebSocketServer implements IClientSocket
{

	/**
	 *
	 */
	public var responseList:Array<SocketResponse>;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 */
	public function new( ?port:Int = 9998 )
	{
		super( new InetSocketAddress( port ) );
	}

	// ************************************************************************ //
	// IClientSocket
	// ************************************************************************ //

	//
	public function setResponseList( list:Array<SocketResponse> ):Void
	{
		this.responseList = list;
	}

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
		if( message == null || this.responseList == null )
			return;

		var json:Dynamic = Json.parse( message );

		for( response in this.responseList )
		{
			if( response.ID == json.n )
			{
				response.execute( json.d );
				break;
			}
		}

		ThnxMain.instance.view.update();
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