package haxe.thnx;
import haxe.thnx.socket.IClientSocket;
import haxe.thnx.view.IViewController;

/**
 * @author RK
 */

interface IMainFactory
{
	//
	public function createViewController():IViewController;

	//
	public function createClientSocket( host:String, port:Int ):IClientSocket;
}