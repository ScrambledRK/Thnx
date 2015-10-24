package haxe.at.dotpoint.core.dispatcher.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Event extends haxe.lang.HxObject
{
	public Event(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Event(java.lang.String type)
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(this, type);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(haxe.at.dotpoint.core.dispatcher.event.Event __temp_me24, java.lang.String type)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		__temp_me24.set_type(type);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.Event(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.Event(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String type;
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target;
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher currentTarget;
	
	public haxe.at.dotpoint.core.dispatcher.event.Event clone(haxe.at.dotpoint.core.dispatcher.event.Event instance)
	{
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event clone = null;
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		if (( instance != null )) 
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			clone = instance;
		}
		else
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			clone = new haxe.at.dotpoint.core.dispatcher.event.Event(haxe.lang.Runtime.toString(this.get_type()));
		}
		
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		clone.set_target(this.get_target());
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		clone.set_currentTarget(this.get_currentTarget());
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return clone;
	}
	
	
	public java.lang.String get_type()
	{
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.type;
	}
	
	
	public java.lang.String set_type(java.lang.String value)
	{
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.type = value;
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher get_target()
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.target;
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher set_target(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher value)
	{
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.target = value;
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher get_currentTarget()
	{
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.currentTarget;
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher set_currentTarget(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher value)
	{
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return this.currentTarget = value;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		return ( ( "[Event:" + this.get_type() ) + "]" );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			switch (field.hashCode())
			{
				case -2040570774:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.set_currentTarget(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) ));
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.currentTarget = ((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) );
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.set_type(haxe.lang.Runtime.toString(value));
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.type = haxe.lang.Runtime.toString(value);
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.set_target(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) ));
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							this.target = ((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) );
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return value;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("toString")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.get_type();
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.type;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1240766285:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_currentTarget")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.get_target();
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.target;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -2114048191:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_currentTarget")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -2040570774:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						if (handleProperties) 
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.get_currentTarget();
						}
						else
						{
							//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
							return this.currentTarget;
						}
						
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -1158389746:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_target")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("clone")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1199772314:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_target")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1976688259:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_type")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1415575799:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_type")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("toString")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.toString();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("clone")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.clone(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1240766285:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.set_currentTarget(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1976688259:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.get_type();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -2114048191:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_currentTarget")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.get_currentTarget();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1415575799:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_type")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.set_type(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case -1158389746:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("set_target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.set_target(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
				case 1199772314:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					if (field.equals("get_target")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
						return this.get_target();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		baseArr.push("currentTarget");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		baseArr.push("target");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		baseArr.push("type");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\Event.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


