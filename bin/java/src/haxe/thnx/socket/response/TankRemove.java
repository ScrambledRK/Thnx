package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TankRemove extends haxe.thnx.socket.response.SocketResponse
{
	public TankRemove(haxe.lang.EmptyObject empty)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TankRemove()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		haxe.thnx.socket.response.TankRemove.__hx_ctor_haxe_thnx_socket_response_TankRemove(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_TankRemove(haxe.thnx.socket.response.TankRemove __temp_me136)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(__temp_me136, "tank.delete");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		return new haxe.thnx.socket.response.TankRemove(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		return new haxe.thnx.socket.response.TankRemove();
	}
	
	
	@Override public void execute(java.lang.Object data)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		javahx.thnx.ThnxMain.instance.world.removeTank(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ));
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		haxe.root.Array<haxe.thnx.model.entities.BulletEntity> bullets = javahx.thnx.ThnxMain.instance.world.getBulletsByTankID(((int) (haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(data, "id", true))) ), null);
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		{
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			int _g = 0;
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			while (( _g < bullets.length ))
			{
				//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				haxe.thnx.model.entities.BulletEntity bullet = bullets.__get(_g);
				//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				 ++ _g;
				//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				javahx.thnx.ThnxMain.instance.world.removeBullet(bullet.ID);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		{
			//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
					if (field.equals("execute")) 
					{
						//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
						__temp_executeDef1 = false;
						//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
					break;
				}
				
				
			}
			
			//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


