package haxe.thnx.model;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class World extends haxe.lang.HxObject
{
	public World(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public World()
	{
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		haxe.thnx.model.World.__hx_ctor_haxe_thnx_model_World(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_World(haxe.thnx.model.World __temp_me118)
	{
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		__temp_me118.reset();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return new haxe.thnx.model.World(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return new haxe.thnx.model.World();
	}
	
	
	public haxe.thnx.model.tileset.Tileset tileset;
	
	public haxe.at.dotpoint.math.geom.Rectangle bounds;
	
	public haxe.root.Array<haxe.thnx.model.entities.TankEntity> tanks;
	
	public haxe.root.Array<haxe.thnx.model.entities.PowerupEntity> powerups;
	
	public haxe.root.Array<haxe.thnx.model.entities.BulletEntity> bullets;
	
	public void reset()
	{
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.tanks = new haxe.root.Array<haxe.thnx.model.entities.TankEntity>();
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.powerups = new haxe.root.Array<haxe.thnx.model.entities.PowerupEntity>();
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.bullets = new haxe.root.Array<haxe.thnx.model.entities.BulletEntity>();
	}
	
	
	public void addTank(haxe.thnx.model.entities.TankEntity tank)
	{
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( this.getTankByID(tank.ID) != null )) 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.tanks.push(tank);
	}
	
	
	public void removeTank(int ID)
	{
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		haxe.thnx.model.entities.TankEntity tank = this.getTankByID(ID);
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( tank == null )) 
		{
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.tanks.remove(tank);
	}
	
	
	public haxe.thnx.model.entities.TankEntity getTankByID(int ID)
	{
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			int _g = 0;
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.root.Array<haxe.thnx.model.entities.TankEntity> _g1 = this.tanks;
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			while (( _g < _g1.length ))
			{
				//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				haxe.thnx.model.entities.TankEntity tank = _g1.__get(_g);
				//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				 ++ _g;
				//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				if (( tank.ID == ID )) 
				{
					//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					return tank;
				}
				
			}
			
		}
		
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return null;
	}
	
	
	public haxe.thnx.model.entities.TankEntity getTankByUserID(java.lang.String userID)
	{
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			int _g = 0;
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.root.Array<haxe.thnx.model.entities.TankEntity> _g1 = this.tanks;
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			while (( _g < _g1.length ))
			{
				//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				haxe.thnx.model.entities.TankEntity tank = _g1.__get(_g);
				//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				 ++ _g;
				//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				if (haxe.lang.Runtime.valEq(tank.userID, userID)) 
				{
					//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					return tank;
				}
				
			}
			
		}
		
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return null;
	}
	
	
	public void addPowerup(haxe.thnx.model.entities.PowerupEntity powerup)
	{
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( this.getPowerupByID(powerup.ID) != null )) 
		{
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.powerups.push(powerup);
	}
	
	
	public void removePowerup(int ID)
	{
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		haxe.thnx.model.entities.PowerupEntity powerup = this.getPowerupByID(ID);
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( powerup == null )) 
		{
			//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.powerups.remove(powerup);
	}
	
	
	public haxe.thnx.model.entities.PowerupEntity getPowerupByID(int ID)
	{
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			int _g = 0;
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.root.Array<haxe.thnx.model.entities.PowerupEntity> _g1 = this.powerups;
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			while (( _g < _g1.length ))
			{
				//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				haxe.thnx.model.entities.PowerupEntity powerup = _g1.__get(_g);
				//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				 ++ _g;
				//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				if (( powerup.ID == ID )) 
				{
					//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					return powerup;
				}
				
			}
			
		}
		
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return null;
	}
	
	
	public void addBullet(haxe.thnx.model.entities.BulletEntity bullet)
	{
		//line 188 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( this.getBulletByID(bullet.ID) != null )) 
		{
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.Log.trace.__hx_invoke2_o(0.0, ( "allready there ... " + bullet.ID ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.thnx.model.World", "World.hx", "addBullet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (190) )) )}));
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.bullets.push(bullet);
	}
	
	
	public void removeBullet(int ID)
	{
		//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		haxe.thnx.model.entities.BulletEntity bullet = this.getBulletByID(ID);
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( bullet == null )) 
		{
			//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.Log.trace.__hx_invoke2_o(0.0, ( ( "bullet:" + ID ) + " not found ... " ), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.thnx.model.World", "World.hx", "removeBullet"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (209) )) )}));
			//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			return ;
		}
		
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		this.bullets.remove(bullet);
	}
	
	
	public haxe.thnx.model.entities.BulletEntity getBulletByID(int ID)
	{
		//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			int _g = 0;
			//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.root.Array<haxe.thnx.model.entities.BulletEntity> _g1 = this.bullets;
			//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			while (( _g < _g1.length ))
			{
				//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				haxe.thnx.model.entities.BulletEntity bullet = _g1.__get(_g);
				//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				 ++ _g;
				//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				if (( bullet.ID == ID )) 
				{
					//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					return bullet;
				}
				
			}
			
		}
		
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return null;
	}
	
	
	public haxe.root.Array<haxe.thnx.model.entities.BulletEntity> getBulletsByTankID(int tankID, haxe.root.Array<haxe.thnx.model.entities.BulletEntity> output)
	{
		//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		if (( output == null )) 
		{
			//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			output = new haxe.root.Array<haxe.thnx.model.entities.BulletEntity>();
		}
		
		//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			int _g = 0;
			//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			haxe.root.Array<haxe.thnx.model.entities.BulletEntity> _g1 = this.bullets;
			//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			while (( _g < _g1.length ))
			{
				//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				haxe.thnx.model.entities.BulletEntity bullet = _g1.__get(_g);
				//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				 ++ _g;
				//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				if (( bullet.tankID == tankID )) 
				{
					//line 247 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					output.push(bullet);
				}
				
			}
			
		}
		
		//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return output;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			switch (field.hashCode())
			{
				case 233716657:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("bullets")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.bullets = ((haxe.root.Array<haxe.thnx.model.entities.BulletEntity>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1314831628:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("tileset")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.tileset = ((haxe.thnx.model.tileset.Tileset) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 858579475:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("powerups")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.powerups = ((haxe.root.Array<haxe.thnx.model.entities.PowerupEntity>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1383205195:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("bounds")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.bounds = ((haxe.at.dotpoint.math.geom.Rectangle) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 110127305:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("tanks")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.tanks = ((haxe.root.Array<haxe.thnx.model.entities.TankEntity>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			switch (field.hashCode())
			{
				case -889784489:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getBulletsByTankID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBulletsByTankID")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1314831628:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("tileset")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.tileset;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 211852234:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getBulletByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBulletByID")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1383205195:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("bounds")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.bounds;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1339369818:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removeBullet")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeBullet")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 110127305:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("tanks")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.tanks;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -485094141:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addBullet")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addBullet")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 858579475:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("powerups")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.powerups;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 769282300:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getPowerupByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPowerupByID")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 233716657:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("bullets")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.bullets;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 807546172:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removePowerup")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removePowerup")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 108404047:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("reset")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reset")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1520288383:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addPowerup")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addPowerup")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1148589781:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addTank")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addTank")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1733170467:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getTankByUserID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTankByUserID")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1098563470:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removeTank")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeTank")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1524088114:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getTankByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTankByID")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			switch (field.hashCode())
			{
				case -889784489:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getBulletsByTankID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.getBulletsByTankID(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((haxe.root.Array<haxe.thnx.model.entities.BulletEntity>) (dynargs.__get(1)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 108404047:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("reset")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.reset();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 211852234:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getBulletByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.getBulletByID(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1148589781:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addTank")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.addTank(((haxe.thnx.model.entities.TankEntity) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1339369818:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removeBullet")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.removeBullet(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1098563470:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removeTank")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.removeTank(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -485094141:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addBullet")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.addBullet(((haxe.thnx.model.entities.BulletEntity) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1524088114:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getTankByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.getTankByID(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 769282300:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getPowerupByID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.getPowerupByID(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case -1733170467:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("getTankByUserID")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						return this.getTankByUserID(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 807546172:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("removePowerup")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.removePowerup(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
				case 1520288383:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					if (field.equals("addPowerup")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
						this.addPowerup(((haxe.thnx.model.entities.PowerupEntity) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		baseArr.push("bullets");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		baseArr.push("powerups");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		baseArr.push("tanks");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		baseArr.push("bounds");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		baseArr.push("tileset");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\World.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


