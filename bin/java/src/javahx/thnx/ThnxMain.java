package javahx.thnx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ThnxMain extends haxe.at.dotpoint.core.dispatcher.event.EventDispatcher
{
	public static void main(String[] args)
	{
		main();
	}
	
	public ThnxMain(haxe.lang.EmptyObject empty)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public ThnxMain(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.__hx_ctor_javahx_thnx_ThnxMain(this, proxy);
	}
	
	
	public static void __hx_ctor_javahx_thnx_ThnxMain(javahx.thnx.ThnxMain __temp_me147, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		haxe.at.dotpoint.core.dispatcher.event.EventDispatcher.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_EventDispatcher(__temp_me147, proxy);
	}
	
	
	public static javahx.thnx.ThnxMain instance;
	
	public static void main()
	{
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance = new javahx.thnx.ThnxMain(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (null) ));
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance.initView();
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance.initModel(null);
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance.startServer(null);
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		javahx.thnx.ThnxMain.instance.startConsoleCommands();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return new javahx.thnx.ThnxMain(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return new javahx.thnx.ThnxMain(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (arr.__get(0)) ));
	}
	
	
	public haxe.thnx.socket.IClientSocket socket;
	
	public haxe.thnx.view.IViewController view;
	
	public haxe.thnx.model.World world;
	
	public haxe.thnx.model.Lobby lobby;
	
	public void onMessage(haxe.at.dotpoint.core.dispatcher.event.Event value)
	{
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.respondeToMessage((((haxe.thnx.event.SocketEvent) (value) )).data);
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.view != null )) 
		{
			//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view.update();
		}
		
	}
	
	
	public void respondeToMessage(java.lang.String message)
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		java.lang.Object data = new haxe.format.JsonParser(haxe.lang.Runtime.toString(message)).parseRec();
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			int _g = 0;
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			haxe.root.Array<haxe.thnx.socket.response.SocketResponse> _g1 = haxe.thnx.socket.ResponseList.instance.getResponseList();
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			while (( _g < _g1.length ))
			{
				//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				haxe.thnx.socket.response.SocketResponse response = _g1.__get(_g);
				//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				 ++ _g;
				//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				if (haxe.lang.Runtime.eq(response.ID, haxe.lang.Runtime.getField(data, "n", true))) 
				{
					//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					response.execute(haxe.lang.Runtime.getField(data, "d", true));
					//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
			}
			
		}
		
	}
	
	
	public void initModel(java.lang.String levelURL)
	{
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.lobby == null )) 
		{
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.lobby = new haxe.thnx.model.Lobby();
		}
		
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.world == null )) 
		{
			//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.world = new haxe.thnx.model.World();
		}
		
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.world.tileset == null )) 
		{
			//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (( levelURL == null )) 
			{
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				levelURL = "res/level_definition.json";
			}
			
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			haxe.thnx.loader.TilesetRequest request = new haxe.thnx.loader.TilesetRequest(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(haxe.lang.Runtime.toString(levelURL))) ));
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			request.load(((haxe.lang.Function) (new haxe.lang.Closure(this, "onLevelComplete")) ), null, null);
		}
		
	}
	
	
	public void onLevelComplete(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent event)
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.world.tileset = ((haxe.thnx.model.tileset.Tileset) ((((haxe.thnx.loader.TilesetRequest) (event.get_target()) )).result) );
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.view != null )) 
		{
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view.update();
		}
		
	}
	
	
	public void initView()
	{
		//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.view == null )) 
		{
			//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view = new javahx.thnx.view.ViewController();
			//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.view.initialize(new haxe.at.dotpoint.math.vector.Vector2(520, 545), null);
		}
		
	}
	
	
	public void startServer(java.net.InetSocketAddress address)
	{
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "starting server ...", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"javahx.thnx.ThnxMain", "ThnxMain.hx", "startServer"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (166) )) )}));
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( address == null )) 
		{
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			address = new java.net.InetSocketAddress(9998);
		}
		
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if (( this.socket == null )) 
		{
			//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.socket = new javahx.thnx.socket.ClientSocket(javahx.thnx.ThnxMain.instance, address);
		}
		
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		if ( ! (this.hasListener(haxe.thnx.event.SocketEvent.MESSAGE_RECIEVED)) ) 
		{
			//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			this.addListener(haxe.thnx.event.SocketEvent.MESSAGE_RECIEVED, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onMessage")) ));
		}
		
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		this.socket.start();
	}
	
	
	public void startConsoleCommands()
	{
		//line 184 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		try 
		{
			//line 185 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			java.io.BufferedReader sysin = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
			//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			while (true)
			{
				//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				java.lang.String line = sysin.readLine();
				//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				if (haxe.lang.Runtime.valEq(line, "shoot")) 
				{
					//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					this.socket.requestShoot( ! (this.lobby.player.getTank().cannon.isShooting) );
				}
				else
				{
					//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (haxe.lang.Runtime.valEq(line, "move")) 
					{
						//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double x = ( -1 + ( java.lang.Math.random() * 2 ) );
						//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double y = ( -1 + ( java.lang.Math.random() * 2 ) );
						//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						double t = ((double) (0) );
						//line 204 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						t = ( ( x * java.lang.Math.sin(( java.lang.Math.PI * 0.75 )) ) - ( y * java.lang.Math.cos(( java.lang.Math.PI * 0.75 )) ) );
						//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						y = ( ( y * java.lang.Math.sin(( java.lang.Math.PI * 0.75 )) ) + ( x * java.lang.Math.cos(( java.lang.Math.PI * 0.75 )) ) );
						//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						x = t;
						//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.socket.requestMove(x, y);
					}
					else
					{
						//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						if (haxe.lang.Runtime.valEq(line, "target")) 
						{
							//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
							this.socket.requestTarget(( -180 + ( java.lang.Math.random() * 360 ) ));
						}
						
					}
					
				}
				
			}
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 103144406:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("lobby")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.lobby = ((haxe.thnx.model.Lobby) (value) );
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -897048717:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("socket")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.socket = ((haxe.thnx.socket.IClientSocket) (value) );
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 113318802:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("world")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.world = ((haxe.thnx.model.World) (value) );
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 3619493:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("view")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.view = ((haxe.thnx.view.IViewController) (value) );
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return value;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 1035104317:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startConsoleCommands")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "startConsoleCommands")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -897048717:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("socket")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.socket;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1879994811:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startServer")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "startServer")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 3619493:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("view")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.view;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 268504021:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initView")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initView")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 113318802:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("world")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.world;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 1255035198:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onLevelComplete")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onLevelComplete")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 103144406:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("lobby")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return this.lobby;
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -274444295:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initModel")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initModel")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -2003762904:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onMessage")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onMessage")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1451678596:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("respondeToMessage")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "respondeToMessage")) );
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			boolean __temp_executeDef1 = true;
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			switch (field.hashCode())
			{
				case 1035104317:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startConsoleCommands")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.startConsoleCommands();
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -2003762904:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onMessage")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.onMessage(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1879994811:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("startServer")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.startServer(((java.net.InetSocketAddress) (dynargs.__get(0)) ));
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -1451678596:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("respondeToMessage")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.respondeToMessage(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 268504021:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initView")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.initView();
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case -274444295:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("initModel")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.initModel(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
				case 1255035198:
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					if (field.equals("onLevelComplete")) 
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						__temp_executeDef1 = false;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
						this.onLevelComplete(((haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent) (dynargs.__get(0)) ));
					}
					
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
					break;
				}
				
				
			}
			
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			if (__temp_executeDef1) 
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("lobby");
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("world");
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("view");
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		baseArr.push("socket");
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\ThnxMain.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


