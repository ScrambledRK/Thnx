package haxe.thnx.model.entities;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WorldEntity extends haxe.at.dotpoint.spatial.SpatialEntity
{
	public WorldEntity(haxe.lang.EmptyObject empty)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public WorldEntity(int ID, java.lang.Object numComponents)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		haxe.thnx.model.entities.WorldEntity.__hx_ctor_haxe_thnx_model_entities_WorldEntity(this, ID, numComponents);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_entities_WorldEntity(haxe.thnx.model.entities.WorldEntity __temp_me123, int ID, java.lang.Object numComponents)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		haxe.at.dotpoint.spatial.SpatialEntity.__hx_ctor_haxe_at_dotpoint_spatial_SpatialEntity(__temp_me123, numComponents, haxe.at.dotpoint.math.AxisRelative.CENTER);
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		__temp_me123.ID = ID;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		return new haxe.thnx.model.entities.WorldEntity(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		return new haxe.thnx.model.entities.WorldEntity(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), arr.__get(1));
	}
	
	
	public int ID;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			switch (field.hashCode())
			{
				case 2331:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					if (field.equals("ID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						this.ID = ((int) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			switch (field.hashCode())
			{
				case 2331:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					if (field.equals("ID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						this.ID = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			switch (field.hashCode())
			{
				case 2331:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					if (field.equals("ID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						return this.ID;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			switch (field.hashCode())
			{
				case 2331:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					if (field.equals("ID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
						return ((double) (this.ID) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		baseArr.push("ID");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\WorldEntity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


