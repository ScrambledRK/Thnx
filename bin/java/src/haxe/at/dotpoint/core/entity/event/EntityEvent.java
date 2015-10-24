package haxe.at.dotpoint.core.entity.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EntityEvent extends haxe.at.dotpoint.core.dispatcher.event.Event
{
	static
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_ADDED = "EntityEvent.COMPONENT_ADDED";
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_REMOVED = "EntityEvent.COMPONENT_REMOVED";
	}
	
	public EntityEvent(haxe.lang.EmptyObject empty)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public EntityEvent(java.lang.String type)
	{
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		haxe.at.dotpoint.core.entity.event.EntityEvent.__hx_ctor_haxe_at_dotpoint_core_entity_event_EntityEvent(this, type);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_entity_event_EntityEvent(haxe.at.dotpoint.core.entity.event.EntityEvent __temp_me25, java.lang.String type)
	{
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		haxe.at.dotpoint.core.dispatcher.event.Event.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_Event(__temp_me25, type);
	}
	
	
	public static java.lang.String COMPONENT_ADDED;
	
	public static java.lang.String COMPONENT_REMOVED;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return new haxe.at.dotpoint.core.entity.event.EntityEvent(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return new haxe.at.dotpoint.core.entity.event.EntityEvent(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public haxe.at.dotpoint.core.entity.IComponent component;
	
	public haxe.at.dotpoint.core.entity.IEntity entity;
	
	public haxe.at.dotpoint.core.entity.IComponent set_component(haxe.at.dotpoint.core.entity.IComponent value)
	{
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return this.component = value;
	}
	
	
	public haxe.at.dotpoint.core.entity.IComponent get_component()
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		if (( this.component != null )) 
		{
			//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			return this.component;
		}
		
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		if (( this.get_target() instanceof haxe.at.dotpoint.core.entity.IComponent )) 
		{
			//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			return ((haxe.at.dotpoint.core.entity.IComponent) (this.get_target()) );
		}
		
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return null;
	}
	
	
	public haxe.at.dotpoint.core.entity.IEntity set_entity(haxe.at.dotpoint.core.entity.IEntity value)
	{
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return this.entity = value;
	}
	
	
	public haxe.at.dotpoint.core.entity.IEntity get_entity()
	{
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		if (( this.entity != null )) 
		{
			//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			return this.entity;
		}
		
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		if (( this.get_target() instanceof haxe.at.dotpoint.core.entity.IEntity )) 
		{
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			return ((haxe.at.dotpoint.core.entity.IEntity) (this.get_target()) );
		}
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		if (( this.get_target() instanceof haxe.at.dotpoint.core.entity.IComponent )) 
		{
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			return ((haxe.at.dotpoint.core.entity.IEntity) ((((haxe.at.dotpoint.core.entity.IComponent) (this.get_target()) )).get_entity()) );
		}
		
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			switch (field.hashCode())
			{
				case -1298275357:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							this.set_entity(((haxe.at.dotpoint.core.entity.IEntity) (value) ));
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return value;
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							this.entity = ((haxe.at.dotpoint.core.entity.IEntity) (value) );
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return value;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -1399907075:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							this.set_component(((haxe.at.dotpoint.core.entity.IComponent) (value) ));
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return value;
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							this.component = ((haxe.at.dotpoint.core.entity.IComponent) (value) );
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return value;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			switch (field.hashCode())
			{
				case 782402796:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("get_entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_entity")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -1399907075:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return this.get_component();
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return this.component;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -1575759264:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("set_entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_entity")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -1298275357:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return this.get_entity();
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
							return this.entity;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -885066924:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("get_component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_component")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -110935712:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("set_component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_component")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			switch (field.hashCode())
			{
				case 782402796:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("get_entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return this.get_entity();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -110935712:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("set_component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return this.set_component(((haxe.at.dotpoint.core.entity.IComponent) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -1575759264:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("set_entity")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return this.set_entity(((haxe.at.dotpoint.core.entity.IEntity) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
				case -885066924:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					if (field.equals("get_component")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
						return this.get_component();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		baseArr.push("entity");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		baseArr.push("component");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\event\\EntityEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


