package haxe.at.dotpoint.core.entity;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Entity extends haxe.lang.HxObject implements haxe.at.dotpoint.core.entity.IEntity
{
	public Entity(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Entity(java.lang.Object numComponents)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		haxe.at.dotpoint.core.entity.Entity.__hx_ctor_haxe_at_dotpoint_core_entity_Entity(this, numComponents);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_entity_Entity(haxe.at.dotpoint.core.entity.Entity __temp_me33, java.lang.Object numComponents)
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		int __temp_numComponents32 = ( (haxe.lang.Runtime.eq(numComponents, null)) ? (1) : (((int) (haxe.lang.Runtime.toInt(numComponents)) )) );
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		__temp_me33.componentSet = new haxe.at.dotpoint.core.datastructure.VectorSet<haxe.at.dotpoint.core.entity.IComponent>(__temp_numComponents32, true);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return new haxe.at.dotpoint.core.entity.Entity(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return new haxe.at.dotpoint.core.entity.Entity(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher dispatcher;
	
	public haxe.at.dotpoint.core.datastructure.VectorSet<haxe.at.dotpoint.core.entity.IComponent> componentSet;
	
	public void destoryEntity()
	{
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			java.lang.Object __temp_iterator1 = this.componentSet.iterator();
			//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
			{
				//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				haxe.at.dotpoint.core.entity.IComponent component = ((haxe.at.dotpoint.core.entity.IComponent) (haxe.lang.Runtime.callField(__temp_iterator1, "next", null)) );
				//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				this.removeComponent(component, true);
			}
			
		}
		
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (( this.get_dispatcher() != null )) 
		{
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.get_dispatcher().clearListeners();
			//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.set_dispatcher(null);
		}
		
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher get_dispatcher()
	{
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (( this.dispatcher == null )) 
		{
			//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.set_dispatcher(new haxe.at.dotpoint.core.dispatcher.event.EventDispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (this) )));
		}
		
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return this.dispatcher;
	}
	
	
	public haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher set_dispatcher(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher value)
	{
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return this.dispatcher = value;
	}
	
	
	public void setComponent(haxe.at.dotpoint.core.entity.IComponent component)
	{
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		haxe.at.dotpoint.core.entity.IComponent existing = ((haxe.at.dotpoint.core.entity.IComponent) (this.getComponent(((java.lang.Class) (haxe.root.Type.getClass(component)) ))) );
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (( existing != component )) 
		{
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			if (( existing != null )) 
			{
				//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				this.removeComponent(existing, null);
			}
			
			//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.addComponent(component);
		}
		
	}
	
	
	public <T> java.lang.Object getComponent(java.lang.Class type)
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			java.lang.Object __temp_iterator1 = this.componentSet.iterator();
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
			{
				//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				haxe.at.dotpoint.core.entity.IComponent component = ((haxe.at.dotpoint.core.entity.IComponent) (haxe.lang.Runtime.callField(__temp_iterator1, "next", null)) );
				//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				if (haxe.root.Std.is(component, type)) 
				{
					//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					return ((java.lang.Object) (component) );
				}
				
			}
			
		}
		
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return null;
	}
	
	
	public boolean addComponent(haxe.at.dotpoint.core.entity.IComponent component)
	{
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (( ! (( component.get_entity() == null )) )) 
		{
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			haxe.lang.Runtime.callField(component.get_entity(), "removeComponent", new haxe.root.Array(new java.lang.Object[]{component}));
		}
		
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		component.set_entity(this);
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		boolean success = this.componentSet.add(component);
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if ( ! (success) ) 
		{
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			throw haxe.lang.HaxeException.wrap(( "unknown error adding the component " + haxe.root.Std.string(component) ));
		}
		
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (this.hasListener(haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_ADDED)) 
		{
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			haxe.at.dotpoint.core.entity.event.EntityEvent event = new haxe.at.dotpoint.core.entity.event.EntityEvent(haxe.lang.Runtime.toString(haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_ADDED));
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			event.set_component(component);
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.dispatch(event);
		}
		
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return success;
	}
	
	
	public boolean removeComponent(haxe.at.dotpoint.core.entity.IComponent component, java.lang.Object destroy)
	{
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		java.lang.Object __temp_destroy31 = ( (haxe.lang.Runtime.eq(destroy, null)) ? (((java.lang.Object) (true) )) : (destroy) );
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (( ! (haxe.lang.Runtime.eq(component.get_entity(), this)) )) 
		{
			//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			throw haxe.lang.HaxeException.wrap("can\'t remove a component not beeing added to this entity");
		}
		
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		boolean success = this.componentSet.remove(component);
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (haxe.lang.Runtime.toBool((__temp_destroy31))) 
		{
			//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			component.destroyComponent();
		}
		
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		component.set_entity(null);
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if ( ! (success) ) 
		{
			//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			throw haxe.lang.HaxeException.wrap(( "unknown error removing the component " + haxe.root.Std.string(component) ));
		}
		
		//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		if (this.hasListener(haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_REMOVED)) 
		{
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			haxe.at.dotpoint.core.entity.event.EntityEvent event = new haxe.at.dotpoint.core.entity.event.EntityEvent(haxe.lang.Runtime.toString(haxe.at.dotpoint.core.entity.event.EntityEvent.COMPONENT_REMOVED));
			//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			event.set_component(component);
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			this.dispatch(event);
		}
		
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return success;
	}
	
	
	public java.lang.Object getComponentIterator()
	{
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return this.componentSet.iterator();
	}
	
	
	public boolean dispatch(haxe.at.dotpoint.core.dispatcher.event.Event event)
	{
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return this.get_dispatcher().dispatch(event);
	}
	
	
	public void addListener(java.lang.String type, haxe.lang.Function call)
	{
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		this.get_dispatcher().addListener(type, call);
	}
	
	
	public void removeListener(java.lang.String type, haxe.lang.Function call)
	{
		//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		this.get_dispatcher().removeListener(type, call);
	}
	
	
	public boolean hasListener(java.lang.String type)
	{
		//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return this.get_dispatcher().hasListener(type);
	}
	
	
	public void clearListeners()
	{
		//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		this.get_dispatcher().clearListeners();
		//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return ;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			switch (field.hashCode())
			{
				case -499144155:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("componentSet")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.componentSet = ((haxe.at.dotpoint.core.datastructure.VectorSet<haxe.at.dotpoint.core.entity.IComponent>) (value) );
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1212540249:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						if (handleProperties) 
						{
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							this.set_dispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) ));
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							return value;
						}
						else
						{
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							this.dispatcher = ((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (value) );
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							return value;
						}
						
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			switch (field.hashCode())
			{
				case 1665925746:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("clearListeners")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clearListeners")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1212540249:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						if (handleProperties) 
						{
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							return this.get_dispatcher();
						}
						else
						{
							//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
							return this.dispatcher;
						}
						
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -74350226:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("hasListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasListener")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -499144155:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("componentSet")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.componentSet;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -248292008:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("removeListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeListener")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -787528169:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("destoryEntity")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "destoryEntity")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 371880053:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("addListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addListener")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 1862602544:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("get_dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_dispatcher")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("dispatch")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatch")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 90866340:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("set_dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_dispatcher")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 1323287509:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("getComponentIterator")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponentIterator")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 139480763:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("setComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setComponent")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 711694553:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("removeComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeComponent")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1409511865:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("getComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getComponent")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1537808036:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("addComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addComponent")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			switch (field.hashCode())
			{
				case 1665925746:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("clearListeners")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.clearListeners();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -787528169:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("destoryEntity")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.destoryEntity();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -74350226:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("hasListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.hasListener(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 1862602544:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("get_dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.get_dispatcher();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -248292008:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("removeListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.removeListener(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.lang.Function) (dynargs.__get(1)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 90866340:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("set_dispatcher")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.set_dispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 371880053:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("addListener")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.addListener(haxe.lang.Runtime.toString(dynargs.__get(0)), ((haxe.lang.Function) (dynargs.__get(1)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 139480763:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("setComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						this.setComponent(((haxe.at.dotpoint.core.entity.IComponent) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("dispatch")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.dispatch(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1409511865:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("getComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return ((java.lang.Object) (this.getComponent(((java.lang.Class) (dynargs.__get(0)) ))) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 1323287509:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("getComponentIterator")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.getComponentIterator();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case -1537808036:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("addComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
				case 711694553:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					if (field.equals("removeComponent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
						return this.removeComponent(((haxe.at.dotpoint.core.entity.IComponent) (dynargs.__get(0)) ), dynargs.__get(1));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		baseArr.push("componentSet");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		baseArr.push("dispatcher");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\entity\\Entity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


