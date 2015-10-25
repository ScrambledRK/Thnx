package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Update extends haxe.thnx.socket.response.SocketResponse
{
	public Update(haxe.lang.EmptyObject empty)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Update()
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		haxe.thnx.socket.response.Update.__hx_ctor_haxe_thnx_socket_response_Update(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_Update(haxe.thnx.socket.response.Update __temp_me138)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(__temp_me138, "update");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		return new haxe.thnx.socket.response.Update(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		return new haxe.thnx.socket.response.Update();
	}
	
	
	@Override public void execute(java.lang.Object data)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		if (( ! (( haxe.lang.Runtime.getField(data, "tanks", true) == null )) )) 
		{
			//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			this.updateTanks(((haxe.root.Array) (haxe.lang.Runtime.getField(data, "tanks", true)) ));
		}
		
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		if (( ! (( haxe.lang.Runtime.getField(data, "pickable", true) == null )) )) 
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			this.addPickups(((haxe.root.Array) (haxe.lang.Runtime.getField(data, "pickable", true)) ));
		}
		
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		if (( ! (( haxe.lang.Runtime.getField(data, "pickableDelete", true) == null )) )) 
		{
			//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			this.removePickups(((haxe.root.Array) (haxe.lang.Runtime.getField(data, "pickableDelete", true)) ));
		}
		
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		if (( ! (( haxe.lang.Runtime.getField(data, "bullets", true) == null )) )) 
		{
			//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			this.addBullets(((haxe.root.Array) (haxe.lang.Runtime.getField(data, "bullets", true)) ));
		}
		
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		if (( ! (( haxe.lang.Runtime.getField(data, "bulletsDelete", true) == null )) )) 
		{
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			this.removeBullets(((haxe.root.Array) (haxe.lang.Runtime.getField(data, "bulletsDelete", true)) ));
		}
		
	}
	
	
	public void updateTanks(haxe.root.Array list)
	{
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		int _g = 0;
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		while (( _g < list.length ))
		{
			//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			java.lang.Object data = list.__get(_g);
			//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			 ++ _g;
			//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			haxe.thnx.model.entities.TankEntity tank = javahx.thnx.ThnxMain.instance.world.getTankByID(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ));
			//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (( tank == null )) 
			{
				//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				continue;
			}
			
			//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			tank.cannon.setRotation(((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "a", true))) ));
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			{
				//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				double value = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "x", true))) );
				//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.transform.get_position().set_x(value);
			}
			
			//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			{
				//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				double value1 = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "y", true))) );
				//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.transform.get_position().set_y(value1);
			}
			
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (( ! (( haxe.lang.Runtime.getField(data, "hp", true) == null )) )) 
			{
				//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.status.health = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "hp", true))) );
			}
			
			//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (( ! (( haxe.lang.Runtime.getField(data, "sp", true) == null )) )) 
			{
				//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.status.shield = ((double) (haxe.lang.Runtime.toDouble(haxe.lang.Runtime.getField(data, "sp", true))) );
			}
			
			//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (( ! (( haxe.lang.Runtime.getField(data, "dead", true) == null )) )) 
			{
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.status.health = ((double) (-1) );
				//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				tank.status.shield = ((double) (-1) );
			}
			
		}
		
	}
	
	
	public void addPickups(haxe.root.Array list)
	{
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		int _g = 0;
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		while (( _g < list.length ))
		{
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			java.lang.Object data = list.__get(_g);
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			 ++ _g;
			//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			javahx.thnx.ThnxMain.instance.world.addPowerup(haxe.thnx.model.EntityFactory.createPowerup(data));
		}
		
	}
	
	
	public void removePickups(haxe.root.Array list)
	{
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		int _g = 0;
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		while (( _g < list.length ))
		{
			//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			java.lang.Object data = list.__get(_g);
			//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			 ++ _g;
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			javahx.thnx.ThnxMain.instance.world.removePowerup(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ));
		}
		
	}
	
	
	public void addBullets(haxe.root.Array list)
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		int _g = 0;
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		while (( _g < list.length ))
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			java.lang.Object data = list.__get(_g);
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			 ++ _g;
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			javahx.thnx.ThnxMain.instance.world.addBullet(haxe.thnx.model.EntityFactory.createBullet(data));
		}
		
	}
	
	
	public void removeBullets(haxe.root.Array list)
	{
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		int _g = 0;
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		while (( _g < list.length ))
		{
			//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			java.lang.Object data = list.__get(_g);
			//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			 ++ _g;
			//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			javahx.thnx.ThnxMain.instance.world.removeBullet(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ));
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			switch (field.hashCode())
			{
				case 1429208717:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("removeBullets")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeBullets")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case -1319569547:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("execute")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 2141950928:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("addBullets")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addBullets")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case -584166016:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("updateTanks")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateTanks")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 617482323:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("removePickups")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removePickups")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 1330224534:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("addPickups")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addPickups")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
			}
			
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("execute")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case -584166016:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("updateTanks")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						this.updateTanks(((haxe.root.Array) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 1429208717:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("removeBullets")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						this.removeBullets(((haxe.root.Array) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 1330224534:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("addPickups")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						this.addPickups(((haxe.root.Array) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 2141950928:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("addBullets")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						this.addBullets(((haxe.root.Array) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
				case 617482323:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					if (field.equals("removePickups")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
						this.removePickups(((haxe.root.Array) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
					break;
				}
				
				
			}
			
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\UpdateResponse.hx"
		return null;
	}
	
	
}


