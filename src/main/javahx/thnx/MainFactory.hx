package javahx.thnx;
import haxe.thnx.IMainFactory;
import haxe.thnx.socket.IClientSocket;
import haxe.thnx.socket.ResponseList;
import haxe.thnx.view.IViewController;
import javahx.thnx.socket.ClientSocket;
import javahx.thnx.view.ViewController;

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