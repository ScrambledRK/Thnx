package js;

/**
 * ...
 * @author RK
 */
@:native("SockJS")
extern class SockJS
{
	/**
	 *
	 * @param	url
	 */
	function new( url:String );

	/**
	 *
	 */
	var onopen:haxe.Constraints.Function;

	/**
	 *
	 */
	var onerror:haxe.Constraints.Function;

	/**
	 *
	 */
	var onclose:haxe.Constraints.Function;

	/**
	 *
	 */
	var onmessage:haxe.Constraints.Function;

	/**
	 *
	 * @param	data
	 */
	function send( data:String ):Void;

}