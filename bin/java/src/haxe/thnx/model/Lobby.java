package haxe.thnx.model;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Lobby extends haxe.lang.HxObject
{
	public Lobby(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Lobby()
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		haxe.thnx.model.Lobby.__hx_ctor_haxe_thnx_model_Lobby(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_Lobby(haxe.thnx.model.Lobby __temp_me117)
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		__temp_me117.reset();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		return new haxe.thnx.model.Lobby(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		return new haxe.thnx.model.Lobby();
	}
	
	
	public haxe.root.Array<haxe.thnx.model.user.User> users;
	
	public haxe.thnx.model.user.User player;
	
	public void reset()
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		this.users = new haxe.root.Array<haxe.thnx.model.user.User>();
	}
	
	
	public void addUser(haxe.thnx.model.user.User user)
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		if (( this.getUserByID(user.ID) != null )) 
		{
			//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			return ;
		}
		
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		this.users.push(user);
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		if (( this.player == null )) 
		{
			//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			this.player = user;
		}
		
	}
	
	
	public void removeUser(java.lang.String userID)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		haxe.thnx.model.user.User user = this.getUserByID(userID);
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		if (( user == null )) 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			return ;
		}
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		this.users.remove(user);
	}
	
	
	public haxe.thnx.model.user.User getUserByID(java.lang.String userID)
	{
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		{
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			int _g = 0;
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			haxe.root.Array<haxe.thnx.model.user.User> _g1 = this.users;
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			while (( _g < _g1.length ))
			{
				//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				haxe.thnx.model.user.User user = _g1.__get(_g);
				//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				 ++ _g;
				//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				if (haxe.lang.Runtime.valEq(user.ID, userID)) 
				{
					//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					return user;
				}
				
			}
			
		}
		
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			switch (field.hashCode())
			{
				case -985752863:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("player")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						this.player = ((haxe.thnx.model.user.User) (value) );
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return value;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 111578632:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("users")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						this.users = ((haxe.root.Array<haxe.thnx.model.user.User>) (value) );
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return value;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			switch (field.hashCode())
			{
				case 1810897811:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("getUserByID")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getUserByID")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 111578632:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("users")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return this.users;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 1098610287:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("removeUser")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeUser")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case -985752863:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("player")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return this.player;
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case -1148542964:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("addUser")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addUser")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 108404047:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("reset")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "reset")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			switch (field.hashCode())
			{
				case 1810897811:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("getUserByID")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						return this.getUserByID(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 108404047:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("reset")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						this.reset();
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case 1098610287:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("removeUser")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						this.removeUser(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
				case -1148542964:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					if (field.equals("addUser")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
						this.addUser(((haxe.thnx.model.user.User) (dynargs.__get(0)) ));
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		baseArr.push("player");
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		baseArr.push("users");
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\Lobby.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


