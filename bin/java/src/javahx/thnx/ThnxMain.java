package javahx.thnx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ThnxMain extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		main();
	}
	
	public ThnxMain(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ThnxMain()
	{
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.__hx_ctor_javahx_thnx_ThnxMain(this);
	}
	
	
	public static void __hx_ctor_javahx_thnx_ThnxMain(javahx.thnx.ThnxMain __temp_me149)
	{
	}
	
	
	public static javahx.thnx.ThnxMain instance;
	
	public static haxe.thnx.IMainFactory factory;
	
	public static void main()
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.factory = new javahx.thnx.MainFactory();
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance = new javahx.thnx.ThnxMain();
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance.initialize("res/level_definition.json", null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return new javahx.thnx.ThnxMain(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return new javahx.thnx.ThnxMain();
	}
	
	
	public haxe.thnx.socket.IClientSocket socket;
	
	public haxe.thnx.view.IViewController view;
	
	public haxe.thnx.model.World world;
	
	public haxe.thnx.model.Lobby lobby;
	
	public void initialize(java.lang.String urlLevel, java.lang.Object useView, java.lang.Object autostart)
	{
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		boolean __temp_autostart148 = ( (haxe.lang.Runtime.eq(autostart, null)) ? (true) : (haxe.lang.Runtime.toBool(autostart)) );
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		boolean __temp_useView147 = ( (haxe.lang.Runtime.eq(useView, null)) ? (true) : (haxe.lang.Runtime.toBool(useView)) );
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (__temp_useView147) 
		{
			//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view = javahx.thnx.ThnxMain.factory.createViewController();
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view.initialize(new haxe.at.dotpoint.math.vector.Vector2(480, 600), null);
		}
		else
		{
			//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view = new haxe.thnx.view.NullViewController();
		}
		
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.lobby = new haxe.thnx.model.Lobby();
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		haxe.thnx.loader.WorldRequest request = new haxe.thnx.loader.WorldRequest(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(haxe.lang.Runtime.toString(urlLevel))) ));
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		request.load(((haxe.lang.Function) (new haxe.lang.Closure(this, "onLevelComplete")) ), null, null);
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (__temp_autostart148) 
		{
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.startServer();
		}
		
	}
	
	
	public void onLevelComplete(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent event)
	{
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.world = ((haxe.thnx.model.World) ((((haxe.thnx.loader.WorldRequest) (event.get_target()) )).result) );
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.view.update();
	}
	
	
	public void startServer()
	{
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "starting server ...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"javahx.thnx.ThnxMain", "ThnxMain.hx", "startServer"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (119) )) )}));
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.socket = javahx.thnx.ThnxMain.factory.createClientSocket("localhost", 9998);
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.socket.start();
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.startListenSystemInput();
	}
	
	
	public void startListenSystemInput()
	{
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		try 
		{
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			java.io.BufferedReader sysin = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			while (true)
			{
				//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				java.lang.String line = sysin.readLine();
				//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				if (haxe.lang.Runtime.valEq(line, "shoot")) 
				{
					//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					this.socket.requestShoot( ! (this.lobby.player.getTank().cannon.isShooting) );
				}
				else
				{
					//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (haxe.lang.Runtime.valEq(line, "move")) 
					{
						//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double x = ( -1 + ( java.lang.Math.random() * 2 ) );
						//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double y = ( -1 + ( java.lang.Math.random() * 2 ) );
						//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double t = ((double) (0) );
						//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						t = ( ( x * java.lang.Math.sin(( java.lang.Math.PI * 0.75 )) ) - ( y * java.lang.Math.cos(( java.lang.Math.PI * 0.75 )) ) );
						//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						y = ( ( y * java.lang.Math.sin(( java.lang.Math.PI * 0.75 )) ) + ( x * java.lang.Math.cos(( java.lang.Math.PI * 0.75 )) ) );
						//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						x = t;
						//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.socket.requestMove(x, y);
					}
					else
					{
						//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						if (haxe.lang.Runtime.valEq(line, "target")) 
						{
							//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
							this.socket.requestTarget(( -180 + ( java.lang.Math.random() * 360 ) ));
						}
						
					}
					
				}
				
			}
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 103144406:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("lobby")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.lobby = ((haxe.thnx.model.Lobby) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -897048717:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("socket")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.socket = ((haxe.thnx.socket.IClientSocket) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 113318802:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("world")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.world = ((haxe.thnx.model.World) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 3619493:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("view")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.view = ((haxe.thnx.view.IViewController) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 733449810:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startListenSystemInput")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "startListenSystemInput")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -897048717:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("socket")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.socket;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1879994811:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startServer")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "startServer")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 3619493:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("view")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.view;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 1255035198:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onLevelComplete")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onLevelComplete")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 113318802:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("world")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.world;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initialize")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 103144406:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("lobby")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.lobby;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 733449810:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startListenSystemInput")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.startListenSystemInput();
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initialize")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.initialize(haxe.lang.Runtime.toString(dynargs.__get(0)), dynargs.__get(1), dynargs.__get(2));
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1879994811:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startServer")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.startServer();
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 1255035198:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onLevelComplete")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.onLevelComplete(((haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent) (dynargs.__get(0)) ));
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("lobby");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("world");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("view");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("socket");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


