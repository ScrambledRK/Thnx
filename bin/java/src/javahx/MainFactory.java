package javahx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MainFactory extends haxe.lang.HxObject implements haxe.IMainFactory
{
	public MainFactory(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public MainFactory()
	{
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		javahx.MainFactory.__hx_ctor_javahx_MainFactory(this);
	}
	
	
	public static void __hx_ctor_javahx_MainFactory(javahx.MainFactory __temp_me146)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		return new javahx.MainFactory(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		return new javahx.MainFactory();
	}
	
	
	public haxe.view.IViewController createViewController()
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		return new javahx.view.ViewController();
	}
	
	
	public haxe.socket.IClientSocket createClientSocket(java.lang.String host, int port)
	{
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		haxe.socket.IClientSocket socket = new javahx.socket.ClientSocket(((java.lang.Object) (port) ));
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		socket.setResponseList(haxe.socket.ResponseList.instance.getResponseList());
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		return socket;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			switch (field.hashCode())
			{
				case 554309178:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					if (field.equals("createClientSocket")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createClientSocket")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					break;
				}
				
				
				case -2122369987:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					if (field.equals("createViewController")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createViewController")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			switch (field.hashCode())
			{
				case 554309178:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					if (field.equals("createClientSocket")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						return this.createClientSocket(haxe.lang.Runtime.toString(dynargs.__get(0)), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					break;
				}
				
				
				case -2122369987:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					if (field.equals("createViewController")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
						return this.createViewController();
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\MainFactory.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


