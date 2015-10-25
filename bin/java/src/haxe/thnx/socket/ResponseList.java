package haxe.thnx.socket;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ResponseList extends haxe.lang.HxObject
{
	static
	{
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		haxe.thnx.socket.ResponseList.instance = new haxe.thnx.socket.ResponseList();
	}
	
	public ResponseList(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ResponseList()
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		haxe.thnx.socket.ResponseList.__hx_ctor_haxe_thnx_socket_ResponseList(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_ResponseList(haxe.thnx.socket.ResponseList __temp_me127)
	{
	}
	
	
	public static haxe.thnx.socket.ResponseList instance;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		return new haxe.thnx.socket.ResponseList(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		return new haxe.thnx.socket.ResponseList();
	}
	
	
	public haxe.root.Array<haxe.thnx.socket.response.SocketResponse> getResponseList()
	{
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		haxe.root.Array<haxe.thnx.socket.response.SocketResponse> list = new haxe.root.Array<haxe.thnx.socket.response.SocketResponse>();
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.Update());
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.UserAdd());
		//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.UserRemove());
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.UserSync());
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.TankNew());
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.TankRemove());
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		list.push(new haxe.thnx.socket.response.Init());
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		return list;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			switch (field.hashCode())
			{
				case -1229470987:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
					if (field.equals("getResponseList")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getResponseList")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			switch (field.hashCode())
			{
				case -1229470987:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
					if (field.equals("getResponseList")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
						return this.getResponseList();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\ResponseList.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


