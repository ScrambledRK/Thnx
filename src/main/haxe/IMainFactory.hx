package haxe;
import haxe.socket.IClientSocket;
import haxe.view.IViewController;

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