package haxe.thnx.model.entities;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BulletEntity extends haxe.thnx.model.entities.WorldEntity
{
	public BulletEntity(haxe.lang.EmptyObject empty)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public BulletEntity(int ID)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		haxe.thnx.model.entities.BulletEntity.__hx_ctor_haxe_thnx_model_entities_BulletEntity(this, ID);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_entities_BulletEntity(haxe.thnx.model.entities.BulletEntity __temp_me124, int ID)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		haxe.thnx.model.entities.WorldEntity.__hx_ctor_haxe_thnx_model_entities_WorldEntity(__temp_me124, ID, null);
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		__temp_me124.target = new haxe.at.dotpoint.math.vector.Vector2(null, null);
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		__temp_me124.speed = ((double) (0) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		return new haxe.thnx.model.entities.BulletEntity(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		return new haxe.thnx.model.entities.BulletEntity(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int tankID;
	
	public haxe.at.dotpoint.math.vector.Vector2 target;
	
	public double speed;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			switch (field.hashCode())
			{
				case 109641799:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("speed")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						this.speed = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -881022075:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("tankID")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						this.tankID = ((int) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			switch (field.hashCode())
			{
				case 109641799:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("speed")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						this.speed = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -881022075:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("tankID")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						this.tankID = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("target")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						this.target = ((haxe.at.dotpoint.math.vector.Vector2) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			switch (field.hashCode())
			{
				case 109641799:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("speed")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return this.speed;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -881022075:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("tankID")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return this.tankID;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -880905839:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("target")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return this.target;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			switch (field.hashCode())
			{
				case 109641799:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("speed")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return this.speed;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
				case -881022075:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					if (field.equals("tankID")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
						return ((double) (this.tankID) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		baseArr.push("speed");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		baseArr.push("target");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		baseArr.push("tankID");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\BulletEntity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


