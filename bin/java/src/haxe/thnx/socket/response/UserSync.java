package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class UserSync extends haxe.thnx.socket.response.SocketResponse
{
	public UserSync(haxe.lang.EmptyObject empty)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public UserSync()
	{
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		haxe.thnx.socket.response.UserSync.__hx_ctor_haxe_thnx_socket_response_UserSync(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_UserSync(haxe.thnx.socket.response.UserSync __temp_me133)
	{
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(__temp_me133, "user.sync");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		return new haxe.thnx.socket.response.UserSync(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		return new haxe.thnx.socket.response.UserSync();
	}
	
	
	@Override public void execute(java.lang.Object data)
	{
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		haxe.root.Array list = ((haxe.root.Array) (data) );
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		{
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			int _g = 0;
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			while (( _g < list.length ))
			{
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				java.lang.Object user = list.__get(_g);
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				 ++ _g;
				//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				javahx.thnx.ThnxMain.instance.lobby.addUser(new haxe.thnx.model.user.User(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(user, "id", true)), haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(user, "name", true))));
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		{
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
					if (field.equals("execute")) 
					{
						//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
						__temp_executeDef1 = false;
						//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
					break;
				}
				
				
			}
			
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


