package haxe.thnx.socket;
import haxe.thnx.socket.response.SocketResponse;

/**
 * @author RK
 */

interface IClientSocket
{

	//
	public function requestMove( x:Float, y:Float ):Void;

	//
	public function requestShoot( isShooting:Bool ):Void;

	//
	public function requestTarget( degree:Float ):Void;

	//
	public function sendRequest( name:String, data:Dynamic ):Void;

	// ---------------- //

	//
	public function start():Void;

}