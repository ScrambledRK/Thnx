package haxe.at.dotpoint.core.dispatcher.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EventDispatcher extends haxe.lang.HxObject implements haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher
{
	public EventDispatcher(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EventDispatcher(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		haxe.at.dotpoint.core.dispatcher.event.EventDispatcher.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_EventDispatcher(this, proxy);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_dispatcher_event_EventDispatcher(haxe.at.dotpoint.core.dispatcher.event.EventDispatcher __temp_me22, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		if (( proxy != null )) 
		{
			//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			__temp_me22.target = proxy;
		}
		else
		{
			//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			__temp_me22.target = __temp_me22;
		}
		
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		__temp_me22.listeners = new haxe.ds.StringMap<haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>>();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.EventDispatcher(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return new haxe.at.dotpoint.core.dispatcher.event.EventDispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target;
	
	public haxe.ds.StringMap<haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>> listeners;
	
	public boolean dispatch(haxe.at.dotpoint.core.dispatcher.event.Event event)
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		event.set_currentTarget(this.target);
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		if (( event.get_target() == null )) 
		{
			//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			event.set_target(this.target);
		}
		
		//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function> list = ((haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>) (this.listeners.get(event.get_type())) );
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		if (( ( list != null ) && ( list.size() > 0 ) )) 
		{
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			{
				//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				int _g1 = 0;
				//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				int _g = list.size();
				//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				while (( _g1 < _g ))
				{
					//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					int i = _g1++;
					//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					list.get(i).__hx_invoke1_o(0.0, event);
				}
				
			}
			
			//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			return true;
		}
		
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return false;
	}
	
	
	public void addListener(java.lang.String type, haxe.lang.Function call)
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function> list = ((haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>) (this.listeners.get(type)) );
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		if (( list == null )) 
		{
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			list = new haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>(10, true);
			//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			this.listeners.set(type, list);
		}
		
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		list.add(call);
	}
	
	
	public void removeListener(java.lang.String type, haxe.lang.Function call)
	{
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function> list = ((haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>) (this.listeners.get(type)) );
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		if (( list != null )) 
		{
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			list.remove(call);
			//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			if (( list.size() == 0 )) 
			{
				//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				this.listeners.remove(type);
			}
			
		}
		
	}
	
	
	public boolean hasListener(java.lang.String type)
	{
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function> list = ((haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>) (this.listeners.get(type)) );
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return ( ( list != null ) && ( list.size() > 0 ) );
	}
	
	
	public void clearListeners()
	{
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		{
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			java.lang.Object __temp_iterator1 = this.listeners.keys();
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
			{
				//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				java.lang.String type = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(__temp_iterator1, "next", null));
				//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				this.listeners.remove(type);
			}
			
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return ( ( "[" + haxe.root.Type.getClassName(((java.lang.Class) (haxe.root.Type.getClass(this)) )) ) + "]" );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			switch (field.hashCode())
			{
				case -1218719169:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("listeners")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						this.listeners = ((haxe.ds.StringMap<haxe.at.dotpoint.core.datastructure.VectorSet<haxe.lang.Function>>) (value) );
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("target")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						this.target = ((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) );
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("toString")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("target")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return this.target;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 1665925746:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("clearListeners")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clearListeners")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -1218719169:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("listeners")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return this.listeners;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -74350226:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("hasListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasListener")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatch")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -248292008:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("removeListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeListener")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 371880053:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("addListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addListener")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("toString")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return this.toString();
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return this.dispatch(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 1665925746:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("clearListeners")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						this.clearListeners();
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case 371880053:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("addListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						this.addListener(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.lang.Function) (dynargs.__get(1)) ));
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -74350226:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("hasListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						return this.hasListener(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
				case -248292008:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					if (field.equals("removeListener")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
						this.removeListener(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.lang.Function) (dynargs.__get(1)) ));
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		baseArr.push("listeners");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		baseArr.push("target");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\dispatcher\\event\\EventDispatcher.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


