package haxe.at.dotpoint.core.dispatcher.event.generic;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ErrorEvent extends haxe.at.dotpoint.core.dispatcher.event.Event
{
	static
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.ERROR = "ErrorEvent.error";
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.IO_ERROR = "ErrorEvent.ioError";
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.SECURITY_ERROR = "ErrorEvent.securityError";
	}
	
	public ErrorEvent(haxe.lang.EmptyObject empty)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public ErrorEvent(java.lang.String type, java.lang.String message)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_generic_ErrorEvent(this, type, message);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_dispatcher_event_generic_ErrorEvent(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent __temp_me29, java.lang.String type, java.lang.String message)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(__temp_me29, type);
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		__temp_me29.message = message;
	}
	
	
	public static java.lang.String ERROR;
	
	public static java.lang.String IO_ERROR;
	
	public static java.lang.String SECURITY_ERROR;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent(haxe.lang.Runtime.toString(arr.__get(0)), haxe.lang.Runtime.toString(arr.__get(1)));
	}
	
	
	public int errorID;
	
	public java.lang.String message;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			switch (field.hashCode())
			{
				case -1478985437:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("errorID")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						this.errorID = ((int) (value) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			switch (field.hashCode())
			{
				case 954925063:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("message")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						this.message = haxe.lang.Runtime.toString(value);
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
				case -1478985437:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("errorID")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						this.errorID = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			switch (field.hashCode())
			{
				case 954925063:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("message")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return this.message;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
				case -1478985437:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("errorID")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return this.errorID;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			switch (field.hashCode())
			{
				case -1478985437:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					if (field.equals("errorID")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
						return ((double) (this.errorID) );
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		baseArr.push("message");
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		baseArr.push("errorID");
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\generic\\ErrorEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


