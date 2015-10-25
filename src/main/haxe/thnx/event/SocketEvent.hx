package haxe.thnx.event;

import haxe.at.dotpoint.core.dispatcher.event.Event;

/**
 * ...
 * @author RK
 */
class SocketEvent extends Event
{

	//
	public static var MESSAGE_RECIEVED:String = "SocketEvent.MESSAGE_RECIEVED";

	// --------------- //

	/**
	 * json
	 */
	public var data:String;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( type:String )
	{
		super( type );
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //
}