package haxe.thnx.model.components;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PowerupEffect extends haxe.at.dotpoint.core.entity.Component<haxe.thnx.model.entities.TankEntity>
{
	public PowerupEffect(haxe.lang.EmptyObject empty)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public PowerupEffect(haxe.thnx.model.enums.PowerupType type, java.lang.Object stamp)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		haxe.thnx.model.components.PowerupEffect.__hx_ctor_haxe_thnx_model_components_PowerupEffect(this, type, stamp);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_components_PowerupEffect(haxe.thnx.model.components.PowerupEffect __temp_me119, haxe.thnx.model.enums.PowerupType type, java.lang.Object stamp)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		haxe.at.dotpoint.core.entity.Component.__hx_ctor_haxe_at_dotpoint_core_entity_Component(__temp_me119);
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		if (haxe.lang.Runtime.eq(stamp, null)) 
		{
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			stamp = haxe.Timer.stamp();
		}
		
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		__temp_me119.stamp = ((double) (haxe.lang.Runtime.toDouble(stamp)) );
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		__temp_me119.type = type;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		return new haxe.thnx.model.components.PowerupEffect(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		return new haxe.thnx.model.components.PowerupEffect(((haxe.thnx.model.enums.PowerupType) (arr.__get(0)) ), arr.__get(1));
	}
	
	
	public haxe.thnx.model.enums.PowerupType type;
	
	public double stamp;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			switch (field.hashCode())
			{
				case 109757379:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("stamp")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						this.stamp = ((double) (value) );
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return value;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			switch (field.hashCode())
			{
				case 109757379:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("stamp")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						this.stamp = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return value;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("type")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						this.type = ((haxe.thnx.model.enums.PowerupType) (value) );
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return value;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			switch (field.hashCode())
			{
				case 109757379:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("stamp")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return this.stamp;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("type")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return this.type;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			switch (field.hashCode())
			{
				case 109757379:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					if (field.equals("stamp")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
						return this.stamp;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		baseArr.push("stamp");
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		baseArr.push("type");
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\components\\PowerupEffect.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


