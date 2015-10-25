package haxe.thnx.model.entities;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TankEntity extends haxe.thnx.model.entities.WorldEntity
{
	public TankEntity(haxe.lang.EmptyObject empty)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TankEntity(int ID, java.lang.String userID)
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		haxe.thnx.model.entities.TankEntity.__hx_ctor_haxe_thnx_model_entities_TankEntity(this, ID, userID);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_entities_TankEntity(haxe.thnx.model.entities.TankEntity __temp_me123, int ID, java.lang.String userID)
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		haxe.thnx.model.entities.WorldEntity.__hx_ctor_haxe_thnx_model_entities_WorldEntity(__temp_me123, ID, 8);
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		__temp_me123.userID = userID;
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		__temp_me123.status = new haxe.thnx.model.components.TankStatus(((java.lang.Object) (null) ));
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		__temp_me123.cannon = new haxe.thnx.model.components.TankCannon();
		//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		__temp_me123.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (__temp_me123.status) ));
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		__temp_me123.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (__temp_me123.cannon) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		return new haxe.thnx.model.entities.TankEntity(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		return new haxe.thnx.model.entities.TankEntity(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), haxe.lang.Runtime.toString(arr.__get(1)));
	}
	
	
	public haxe.thnx.model.components.TankStatus status;
	
	public haxe.thnx.model.components.TankCannon cannon;
	
	public java.lang.String userID;
	
	public haxe.thnx.model.user.User getUser()
	{
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		return javahx.thnx.ThnxMain.instance.lobby.getUserByID(this.userID);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			switch (field.hashCode())
			{
				case -836030938:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("userID")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						this.userID = haxe.lang.Runtime.toString(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
				case -892481550:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("status")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						this.status = ((haxe.thnx.model.components.TankStatus) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
				case -1367713539:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("cannon")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						this.cannon = ((haxe.thnx.model.components.TankCannon) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			switch (field.hashCode())
			{
				case -75082687:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("getUser")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUser")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
				case -892481550:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("status")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return this.status;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
				case -836030938:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("userID")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return this.userID;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
				case -1367713539:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("cannon")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return this.cannon;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			switch (field.hashCode())
			{
				case -75082687:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					if (field.equals("getUser")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
						return this.getUser();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		baseArr.push("userID");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		baseArr.push("cannon");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		baseArr.push("status");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\TankEntity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


