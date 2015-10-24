package javahx;
import haxe.IMainFactory;
import haxe.socket.IClientSocket;
import haxe.socket.ResponseList;
import haxe.view.IViewController;
import javahx.socket.ClientSocket;
import javahx.view.ViewController;

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