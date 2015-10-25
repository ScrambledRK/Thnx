package haxe.thnx.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SocketEvent extends haxe.at.dotpoint.core.dispatcher.event.Event
{
	static
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		haxe.thnx.event.SocketEvent.MESSAGE_RECIEVED = "SocketEvent.MESSAGE_RECIEVED";
	}
	
	public SocketEvent(haxe.lang.EmptyObject empty)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public SocketEvent(java.lang.String type)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		haxe.thnx.event.SocketEvent.__hx_ctor_haxe_thnx_event_SocketEvent(this, type);
	}
	
	
	public static void __hx_ctor_haxe_thnx_event_SocketEvent(haxe.thnx.event.SocketEvent __temp_me113, java.lang.String type)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(__temp_me113, type);
	}
	
	
	public static java.lang.String MESSAGE_RECIEVED;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		return new haxe.thnx.event.SocketEvent(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		return new haxe.thnx.event.SocketEvent(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String data;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			switch (field.hashCode())
			{
				case 3076010:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
					if (field.equals("data")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
						this.data = haxe.lang.Runtime.toString(value);
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
						return value;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			switch (field.hashCode())
			{
				case 3076010:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
					if (field.equals("data")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
						return this.data;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		baseArr.push("data");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\event\\SocketEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


