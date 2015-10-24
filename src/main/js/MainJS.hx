package js;

import haxe.at.dotpoint.core.StringTool;
import haxe.at.dotpoint.logger.Log;
import haxe.Timer;
import js.Browser;
import js.html.IFrameElement;
import js.html.MessageEvent;
import js.html.WebSocket;

/**
 *
 */
class MainJS
{

	/**
	 * singleton (habit, convinience, ... )
	 */
	public static var instance:MainJS;

	// ------------------ //

	/**
	 *
	 */
	private var gameURL:String = "http://playcanvas.com/editor/scene/390184/launch";
	// level: https://playcanvas.com/api/files/assets/2761105/1/level.json

	/**
	 *
	 */
	private var frame:IFrameElement;

	/**
	 *
	 */
	private var serverAI:WebSocket;

	/**
	 *
	 */
	private var isInitialized:Bool;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	static public function main()
	{
		MainJS.instance = new MainJS();
		MainJS.instance.initialize();
	}

	public function new()
	{
		//;
	}

	// ************************************************************************ //
	// Methodes
	// ************************************************************************ //

	/**
	 *
	 */
	private function initialize():Void
	{
		Log.initialize();
		this.connectAI();
	}

	/**
	 *
	 */
	private function openFrame():Void
	{
		Browser.window.addEventListener( "message", onGameMessage, false );

		this.frame = cast Browser.document.getElementById("game");
		this.frame.onload = this.onFrameComplete;
		this.frame.src = this.gameURL;
	}

	/**
	 *
	 * @param	event
	 */
	private function onFrameComplete( event:Dynamic ):Void
	{
		this.isInitialized = true;

	}

	// ************************************************************************ //
	// Socket:
	// ************************************************************************ //

	/**
	 *
	 */
	private function connectAI():Void
	{
		this.serverAI = new WebSocket( "ws://localhost:9998" );
		this.serverAI.onerror 	= this.onServerError;
		this.serverAI.onopen 	= this.onServerOpen;
		this.serverAI.onmessage = this.onServerMessage;
		this.serverAI.onclose 	= this.onServerClose;

		if( this.serverAI.readyState == 2 || this.serverAI.readyState == 3 )
			this.reconnectAI();
	}

	/**
	 *
	 */
	private function reconnectAI():Void
	{
		this.serverAI.close();
		this.serverAI = null;

		Timer.delay( this.connectAI, 2000 );
	}

	/**
	 *
	 * @param	event
	 */
	private function onServerError( event:Dynamic ):Void
	{
		trace("AI-Connection:error");
		this.reconnectAI();
	}

	/**
	 *
	 * @param	event
	 */
	private function onServerOpen( event:Dynamic ):Void
	{
		trace( "AI-Connection:successful" );

		if( !this.isInitialized ) this.openFrame();
		else					  Browser.location.reload();
	}

	/**
	 *
	 * @param	event
	 */
	private function onServerClose( event:Dynamic ):Void
	{
		trace("AI-Connection:close");

		if( this.serverAI != null && (this.serverAI.readyState == 2 || this.serverAI.readyState == 3) )
			this.reconnectAI();
	}

	// ************************************************************************ //
	// Methodes
	// ************************************************************************ //

	/**
	 *
	 * @param	event
	 */
	private function onServerMessage( event:Dynamic ):Void
	{
		if( event != null )
			this.frame.contentWindow.postMessage( event.data, "*" );
	}

	/**
	 *
	 */
	private function onGameMessage( message:MessageEvent ):Void
	{
		if( message != null )
			this.serverAI.send( message.data );
	}

}