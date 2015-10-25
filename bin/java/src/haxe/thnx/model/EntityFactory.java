package haxe.thnx.model;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class EntityFactory extends haxe.lang.HxObject
{
	public EntityFactory(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public EntityFactory()
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		haxe.thnx.model.EntityFactory.__hx_ctor_haxe_thnx_model_EntityFactory(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_EntityFactory(haxe.thnx.model.EntityFactory __temp_me116)
	{
	}
	
	
	public static haxe.thnx.model.enums.PowerupType getPowerupType(java.lang.String name)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			java.lang.String __temp_svar1 = (name);
			//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			switch (__temp_svar1.hashCode())
			{
				case -934535283:
				{
					//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					if (__temp_svar1.equals("repair")) 
					{
						//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
						return haxe.thnx.model.enums.PowerupType.REPAIR;
					}
					
					//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					break;
				}
				
				
				case -903340183:
				{
					//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					if (__temp_svar1.equals("shield")) 
					{
						//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
						return haxe.thnx.model.enums.PowerupType.SHIELD;
					}
					
					//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					break;
				}
				
				
				case -1339126929:
				{
					//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					if (__temp_svar1.equals("damage")) 
					{
						//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
						return haxe.thnx.model.enums.PowerupType.DAMAGE;
					}
					
					//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return null;
	}
	
	
	public static haxe.thnx.model.entities.PowerupEntity createPowerup(java.lang.Object data)
	{
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		haxe.thnx.model.entities.PowerupEntity entity = new haxe.thnx.model.entities.PowerupEntity(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ), haxe.thnx.model.EntityFactory.getPowerupType(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(data, "t", true))));
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.boundings.changePolicy = haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_MODELBOUNDS;
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			haxe.thnx.model.enums.PowerupType _g = entity.type;
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			switch (_g)
			{
				case SHIELD:
				{
					//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_width(((double) (2) ));
					//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_height(((double) (2) ));
					//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_length(((double) (1) ));
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					break;
				}
				
				
				default:
				{
					//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_width(((double) (1) ));
					//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_height(((double) (1) ));
					//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					entity.boundings.modelSpace.set_length(((double) (1) ));
					//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
					break;
				}
				
			}
			
		}
		
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "x", true))) );
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			entity.transform.get_position().set_x(value);
		}
		
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			double value1 = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "y", true))) );
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			entity.transform.get_position().set_y(value1);
		}
		
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return entity;
	}
	
	
	public static haxe.thnx.model.entities.TankEntity createTank(java.lang.Object data)
	{
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		haxe.thnx.model.entities.TankEntity entity = new haxe.thnx.model.entities.TankEntity(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(data, "owner", true)));
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.boundings.changePolicy = haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_MODELBOUNDS;
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.boundings.modelSpace.set_width(0.8);
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.boundings.modelSpace.set_height(1.2);
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.boundings.modelSpace.set_length(0.5);
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.transform.get_position().set_x(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(data, "pos", true), "__get", new haxe.root.Array(new java.lang.Object[]{0})))) ));
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.transform.get_position().set_y(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.callField(haxe.lang.Runtime.getField(data, "pos", true), "__get", new haxe.root.Array(new java.lang.Object[]{1})))) ));
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.cannon.setRotation(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "angle", true))) ));
		//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			int index = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "team", true))) );
			//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			entity.status.team = ((haxe.thnx.model.enums.TeamColor) (haxe.root.Type.createEnumIndex(haxe.thnx.model.enums.TeamColor.class, index, null)) );
		}
		
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.status.health = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "hp", true))) );
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.status.shield = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "shield", true))) );
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.getUser().score = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "score", true))) );
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return entity;
	}
	
	
	public static haxe.thnx.model.entities.BulletEntity createBullet(java.lang.Object data)
	{
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		haxe.thnx.model.entities.BulletEntity entity = new haxe.thnx.model.entities.BulletEntity(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ));
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.tankID = ((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "tank", true))) );
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "x", true))) );
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			entity.transform.get_position().set_x(value);
		}
		
		//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		{
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			double value1 = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "y", true))) );
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
			entity.transform.get_position().set_y(value1);
		}
		
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.target.set_x(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "tx", true))) ));
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.target.set_y(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "ty", true))) ));
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		entity.speed = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "sp", true))) );
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return entity;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return new haxe.thnx.model.EntityFactory(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\EntityFactory.hx"
		return new haxe.thnx.model.EntityFactory();
	}
	
	
}


