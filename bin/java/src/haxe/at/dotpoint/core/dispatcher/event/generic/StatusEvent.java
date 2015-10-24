package haxe.at.dotpoint.core.dispatcher.event.generic;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StatusEvent extends haxe.at.dotpoint.core.dispatcher.event.Event
{
	static
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED = "StatusEvent.STARTED";
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STOPPED = "StatusEvent.STOPPED";
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE = "StatusEvent.COMPLETE";
	}
	
	public StatusEvent(haxe.lang.EmptyObject empty)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public StatusEvent(java.lang.String type)
	{
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_generic_StatusEvent(this, type);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_dispatcher_event_generic_StatusEvent(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent __temp_me30, java.lang.String type)
	{
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(__temp_me30, type);
	}
	
	
	public static java.lang.String STARTED;
	
	public static java.lang.String STOPPED;
	
	public static java.lang.String COMPLETE;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\StatusEvent.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
}


