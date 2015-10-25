package javahx.thnx;

import haxe.thnx.IMainFactory;
import haxe.thnx.socket.IClientSocket;
import haxe.thnx.view.IViewController;

/**
 * ...
 * @author RK
 */
class MainFactory implements IMainFactory
{

	//
	public function new() {}

	// --------------------------------------------------------- //
	// --------------------------------------------------------- //

	//
	public function createViewController():IViewController
	{
		return
	}

	//
	public function createClientSocket( host:String, port:Int ):IClientSocket
	{
		return ;
	}
}