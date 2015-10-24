package haxe.at.dotpoint.loader.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ProgressEvent extends haxe.at.dotpoint.core.dispatcher.event.Event
{
	static
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		haxe.at.dotpoint.loader.event.ProgressEvent.PROGRESS = "ProgressEvent.progress";
	}
	
	public ProgressEvent(haxe.lang.EmptyObject empty)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public ProgressEvent(java.lang.String type)
	{
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		haxe.at.dotpoint.loader.event.ProgressEvent.__hx_ctor_haxe_at_dotpoint_loader_event_ProgressEvent(this, type);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_event_ProgressEvent(haxe.at.dotpoint.loader.event.ProgressEvent __temp_me42, java.lang.String type)
	{
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(__temp_me42, type);
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		__temp_me42.bytesLoaded = ((double) (0) );
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		__temp_me42.bytesTotal = ((double) (0) );
	}
	
	
	public static java.lang.String PROGRESS;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		return new haxe.at.dotpoint.loader.event.ProgressEvent(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		return new haxe.at.dotpoint.loader.event.ProgressEvent(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public double bytesLoaded;
	
	public double bytesTotal;
	
	
	
	public final double get_ratio()
	{
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		if (( this.bytesTotal != 0 )) 
		{
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			return ( this.bytesLoaded / this.bytesTotal );
		}
		else
		{
			//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			return ((double) (0) );
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			switch (field.hashCode())
			{
				case 1382331801:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesTotal")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						this.bytesTotal = ((double) (value) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case -326983600:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesLoaded")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						this.bytesLoaded = ((double) (value) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			switch (field.hashCode())
			{
				case 1382331801:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesTotal")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						this.bytesTotal = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case -326983600:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesLoaded")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						this.bytesLoaded = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return value;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			switch (field.hashCode())
			{
				case 1145235938:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("get_ratio")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_ratio")) );
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case -326983600:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesLoaded")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.bytesLoaded;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case 108285963:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("ratio")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.get_ratio();
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case 1382331801:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesTotal")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.bytesTotal;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			switch (field.hashCode())
			{
				case 108285963:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("ratio")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.get_ratio();
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case -326983600:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesLoaded")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.bytesLoaded;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
				case 1382331801:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("bytesTotal")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.bytesTotal;
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			switch (field.hashCode())
			{
				case 1145235938:
				{
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					if (field.equals("get_ratio")) 
					{
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						__temp_executeDef1 = false;
						//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
						return this.get_ratio();
					}
					
					//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
					break;
				}
				
				
			}
			
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		baseArr.push("ratio");
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		baseArr.push("bytesTotal");
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		baseArr.push("bytesLoaded");
		//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
		{
			//line 4 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\event\\ProgressEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


