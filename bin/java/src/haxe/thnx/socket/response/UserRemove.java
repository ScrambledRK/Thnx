package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class UserRemove extends haxe.thnx.socket.response.SocketResponse
{
	public UserRemove(haxe.lang.EmptyObject empty)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public UserRemove()
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		haxe.thnx.socket.response.UserRemove.__hx_ctor_haxe_thnx_socket_response_UserRemove(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_UserRemove(haxe.thnx.socket.response.UserRemove __temp_me130)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(__temp_me130, "user.remove");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		return new haxe.thnx.socket.response.UserRemove(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		return new haxe.thnx.socket.response.UserRemove();
	}
	
	
	@Override public void execute(java.lang.Object data)
	{
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		javahx.thnx.ThnxMain.instance.lobby.removeUser(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(data, "id", true)));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
					if (field.equals("execute")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
					break;
				}
				
				
			}
			
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\LobbyResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


