package haxe.thnx.socket.response;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SocketResponse extends haxe.lang.HxObject
{
	public SocketResponse(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public SocketResponse(java.lang.String ID)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		haxe.thnx.socket.response.SocketResponse.__hx_ctor_haxe_thnx_socket_response_SocketResponse(this, ID);
	}
	
	
	public static void __hx_ctor_haxe_thnx_socket_response_SocketResponse(haxe.thnx.socket.response.SocketResponse __temp_me131, java.lang.String ID)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		__temp_me131.ID = ID;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		return new haxe.thnx.socket.response.SocketResponse(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		return new haxe.thnx.socket.response.SocketResponse(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String ID;
	
	public void execute(java.lang.Object data)
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		return ;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			switch (field.hashCode())
			{
				case 2331:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					if (field.equals("ID")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						this.ID = haxe.lang.Runtime.toString(value);
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					if (field.equals("execute")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					break;
				}
				
				
				case 2331:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					if (field.equals("ID")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						return this.ID;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			switch (field.hashCode())
			{
				case -1319569547:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					if (field.equals("execute")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
						this.execute(dynargs.__get(0));
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		baseArr.push("ID");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\socket\\response\\SocketResponse.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


