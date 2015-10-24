package haxe.socket.response;

/**
 * ...
 * @author RK
 */
class SocketResponse
{

	/**
	 *
	 */
	public var ID(default,null):String;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( ID:String )
	{
		this.ID = ID;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	data
	 */
	public function execute( data:Dynamic ):Void
	{
		return;
	}
}