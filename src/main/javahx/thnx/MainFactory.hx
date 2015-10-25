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

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{

	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	//
	public function createViewController():IViewController
	{
		return new ViewController();
	}

	//
	public function createClientSocket( host:String, port:Int ):IClientSocket
	{
		var socket:IClientSocket = new ClientSocket( port );
			socket.setResponseList( ResponseList.instance.getResponseList() );

		return socket;
	}
}