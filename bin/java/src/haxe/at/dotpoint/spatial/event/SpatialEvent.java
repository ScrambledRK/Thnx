package haxe.at.dotpoint.spatial.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SpatialEvent extends haxe.at.dotpoint.core.entity.event.EntityEvent
{
	static
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED = "SpatialEvent.TRANSFORM_CHANGED";
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED = "SpatialEvent.BOUNDINGS_CHANGED";
	}
	
	public SpatialEvent(haxe.lang.EmptyObject empty)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SpatialEvent(java.lang.String type, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent.__hx_ctor_haxe_at_dotpoint_spatial_event_SpatialEvent(this, type, space);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_spatial_event_SpatialEvent(haxe.at.dotpoint.spatial.event.SpatialEvent __temp_me101, java.lang.String type, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.core.entity.event.EntityEvent.__hx_ctor_haxe_at_dotpoint_core_entity_event_EntityEvent(__temp_me101, type);
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		__temp_me101.space = space;
	}
	
	
	public static java.lang.String TRANSFORM_CHANGED;
	
	public static java.lang.String BOUNDINGS_CHANGED;
	
	public static haxe.at.dotpoint.spatial.event.SpatialEvent instance;
	
	public static haxe.at.dotpoint.spatial.event.SpatialEvent getInstance(java.lang.String type, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		if (( haxe.at.dotpoint.spatial.event.SpatialEvent.instance == null )) 
		{
			//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			haxe.at.dotpoint.spatial.event.SpatialEvent.instance = new haxe.at.dotpoint.spatial.event.SpatialEvent(type, space);
		}
		
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent event = haxe.at.dotpoint.spatial.event.SpatialEvent.instance;
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		event.set_currentTarget(null);
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		event.set_target(null);
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		event.set_type(type);
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		event.space = space;
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		return event;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		return new haxe.at.dotpoint.spatial.event.SpatialEvent(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		return new haxe.at.dotpoint.spatial.event.SpatialEvent(haxe.lang.Runtime.toString(arr.__get(0)), ((haxe.at.dotpoint.math.geom.Space) (arr.__get(1)) ));
	}
	
	
	public haxe.at.dotpoint.math.geom.Space space;
	
	@Override public haxe.at.dotpoint.core.dispatcher.event.Event clone(haxe.at.dotpoint.core.dispatcher.event.Event instance)
	{
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		if (( ( instance != null ) &&  ! (( instance instanceof haxe.at.dotpoint.spatial.event.SpatialEvent ))  )) 
		{
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			throw haxe.lang.HaxeException.wrap("must provide TreeNodeEvent instance for clone");
		}
		
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		if (( instance == null )) 
		{
			//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			instance = new haxe.at.dotpoint.spatial.event.SpatialEvent(this.get_type(), null);
		}
		
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent event = ((haxe.at.dotpoint.spatial.event.SpatialEvent) (super.clone(instance)) );
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		event.space = this.space;
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		return event;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			switch (field.hashCode())
			{
				case 109637894:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					if (field.equals("space")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						this.space = ((haxe.at.dotpoint.math.geom.Space) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			switch (field.hashCode())
			{
				case 94756189:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					if (field.equals("clone")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					break;
				}
				
				
				case 109637894:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					if (field.equals("space")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
						return this.space;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		baseArr.push("space");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\event\\SpatialEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


