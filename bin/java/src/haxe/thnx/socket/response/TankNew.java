package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TankNew extends haxe.thnx.socket.response.SocketResponse
{
	public TankNew(haxe.lang.EmptyObject empty)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TankNew()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		haxe.thnx.socket.response.TankNew.__hx_ctor_haxe_thnx_socket_response_TankNew(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_TankNew(haxe.thnx.socket.response.TankNew __temp_me135)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(__temp_me135, "tank.new");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		return new haxe.thnx.socket.response.TankNew(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		return new haxe.thnx.socket.response.TankNew();
	}
	
	
	@Override public void execute(java.lang.Object data)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		javahx.thnx.ThnxMain.instance.world.addTank(haxe.thnx.model.EntityFactory.createTank(data));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
					if (field.equals("execute")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\TankResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


