package javahx.thnx.socket;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ClientSocket extends org.java_websocket.server.WebSocketServer implements haxe.lang.IHxObject, haxe.thnx.socket.IClientSocket
{
	public ClientSocket(haxe.lang.EmptyObject empty)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		super();
	}
	
	
	public ClientSocket(java.lang.Object port)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		super(new java.net.InetSocketAddress(((int) (haxe.lang.Runtime.toInt(( (haxe.lang.Runtime.eq(port, null)) ? (((java.lang.Object) (9998) )) : (port) ))) )));
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		java.lang.Object __temp_port150 = ( (haxe.lang.Runtime.eq(port, null)) ? (((java.lang.Object) (9998) )) : (port) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		return new javahx.thnx.socket.ClientSocket(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		return new javahx.thnx.socket.ClientSocket(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
	public haxe.root.Array<haxe.thnx.socket.response.SocketResponse> responseList;
	
	public void setResponseList(haxe.root.Array<haxe.thnx.socket.response.SocketResponse> list)
	{
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		this.responseList = list;
	}
	
	
	public void requestMove(double x, double y)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		this.sendRequest("move", new haxe.root.Array(new java.lang.Object[]{x, y}));
	}
	
	
	public void requestShoot(boolean isShooting)
	{
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		this.sendRequest("shoot", isShooting);
	}
	
	
	public void requestTarget(double degree)
	{
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		this.sendRequest("target", degree);
	}
	
	
	public void sendRequest(java.lang.String name, java.lang.Object data)
	{
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		try 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			java.lang.Object json = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			haxe.lang.Runtime.setField(json, "n", name);
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			haxe.lang.Runtime.setField(json, "d", data);
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			java.lang.String message = haxe.format.JsonPrinter.print(json, null, null);
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			{
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				java.util.Iterator<org.java_websocket.WebSocket> __temp_iterator1 = this.connections().iterator();
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				while (__temp_iterator1.hasNext())
				{
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					org.java_websocket.WebSocket socket = __temp_iterator1.next();
					//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					socket.send(haxe.lang.Runtime.toString(message));
				}
				
			}
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	@Override public void onOpen(org.java_websocket.WebSocket cnx, org.java_websocket.handshake.ClientHandshake handshake)
	{
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "open", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "customParams", "fileName", "methodName"}, new java.lang.Object[]{"javahx.thnx.socket.ClientSocket", new haxe.root.Array(new java.lang.Object[]{handshake}), "ClientSocket.hx", "onOpen"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (101) )) )}));
	}
	
	
	@Override public void onClose(org.java_websocket.WebSocket cnx, int code, java.lang.String reason, boolean remote)
	{
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "close", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "customParams", "fileName", "methodName"}, new java.lang.Object[]{"javahx.thnx.socket.ClientSocket", new haxe.root.Array(new java.lang.Object[]{code, reason}), "ClientSocket.hx", "onClose"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (113) )) )}));
	}
	
	
	@Override public void onMessage(org.java_websocket.WebSocket cnx, java.lang.String message)
	{
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		if (( ( message == null ) || ( this.responseList == null ) )) 
		{
			//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			return ;
		}
		
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		java.lang.Object json = new haxe.format.JsonParser(haxe.lang.Runtime.toString(message)).parseRec();
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			int _g = 0;
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			haxe.root.Array<haxe.thnx.socket.response.SocketResponse> _g1 = this.responseList;
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			while (( _g < _g1.length ))
			{
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				haxe.thnx.socket.response.SocketResponse response = _g1.__get(_g);
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				 ++ _g;
				//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				if (haxe.lang.Runtime.eq(response.ID, haxe.lang.Runtime.getField(json, "n", true))) 
				{
					//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					response.execute(haxe.lang.Runtime.getField(json, "d", true));
					//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
			}
			
		}
		
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		javahx.thnx.ThnxMain.instance.view.update();
	}
	
	
	@Override public void onError(org.java_websocket.WebSocket cnx, java.lang.Exception error)
	{
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		haxe.Log.trace.__hx_invoke2_o(0.0, "msg:", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "customParams", "fileName", "methodName"}, new java.lang.Object[]{"javahx.thnx.socket.ClientSocket", new haxe.root.Array(new java.lang.Object[]{error}), "ClientSocket.hx", "onError"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (151) )) )}));
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		if (isCheck) 
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			if (throwErrors) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			else
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		if (throwErrors) 
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		else
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			switch (field.hashCode())
			{
				case 1438986367:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("responseList")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.responseList = ((haxe.root.Array<haxe.thnx.socket.response.SocketResponse>) (value) );
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return value;
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
			}
			
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			switch (field.hashCode())
			{
				case -2036342291:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketHandshakeReceivedAsClient")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketHandshakeReceivedAsClient")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1438986367:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("responseList")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return this.responseList;
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -563765212:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketHandshakeSentAsClient")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketHandshakeSentAsClient")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -318718463:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("setResponseList")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setResponseList")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 477411898:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketPing")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketPing")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1149879040:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestMove")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestMove")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 477417664:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketPong")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketPong")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1291838160:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestShoot")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestShoot")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 543233036:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getFlashPolicy")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFlashPolicy")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1414523136:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestTarget")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestTarget")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("start")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 832221671:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("sendRequest")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sendRequest")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("stop")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -1013079863:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onOpen")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onOpen")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1724603733:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("connections")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "connections")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -1351896231:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onClose")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onClose")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -110831682:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getAddress")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getAddress")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -2003762904:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onMessage")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onMessage")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -75235081:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getPort")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPort")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onError")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1951670251:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getDraft")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDraft")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1119683919:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onFragment")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onFragment")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 113291:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("run")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "run")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 2140836645:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getRemoteSocketAddress")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRemoteSocketAddress")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 183455286:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("allocateBuffers")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "allocateBuffers")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -1792428724:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getLocalSocketAddress")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLocalSocketAddress")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1121558060:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("releaseBuffers")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "releaseBuffers")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -2007336437:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onConnect")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onConnect")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1049654364:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("createBuffer")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createBuffer")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 2045757081:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getWebSocketFactory")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getWebSocketFactory")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 854232428:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("getFlashSecurityPolicy")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getFlashSecurityPolicy")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 502029221:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("setWebSocketFactory")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setWebSocketFactory")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1744652719:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketMessageFragment")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketMessageFragment")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -2092147242:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onClosing")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onClosing")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -830819777:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketMessage")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketMessage")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 691069330:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onCloseInitiated")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onCloseInitiated")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 477388562:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketOpen")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketOpen")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -919204115:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketClosing")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketClosing")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1902951984:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketClose")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketClose")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 543758491:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketCloseInitiated")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketCloseInitiated")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 259489410:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("removeConnection")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeConnection")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1447891883:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWriteDemand")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWriteDemand")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -1584456347:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketHandshakeReceivedAsServer")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketHandshakeReceivedAsServer")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1904980544:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("onWebsocketError")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onWebsocketError")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -755614113:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("addConnection")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addConnection")) );
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
			}
			
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			int __temp_hash2 = field.hashCode();
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			boolean __temp_executeDef1 = true;
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			switch (__temp_hash2)
			{
				case -2036342291:
				case -563765212:
				case 477411898:
				case 477417664:
				case 543233036:
				case 109757538:
				case 3540994:
				case 1724603733:
				case -110831682:
				case -75235081:
				case 1951670251:
				case 113291:
				case 183455286:
				case 1121558060:
				case 1049654364:
				case 854232428:
				case 1744652719:
				case -830819777:
				case 477388562:
				case 1902951984:
				case 259489410:
				case -1584456347:
				case -755614113:
				case 1904980544:
				case 1447891883:
				case 543758491:
				case -919204115:
				case 691069330:
				case -2092147242:
				case 502029221:
				case 2045757081:
				case -2007336437:
				case -1792428724:
				case 2140836645:
				case 1119683919:
				case -1349867671:
				case -2003762904:
				case -1351896231:
				case -1013079863:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (( (( ( __temp_hash2 == -2036342291 ) && field.equals("onWebsocketHandshakeReceivedAsClient") )) || ( (( ( __temp_hash2 == -563765212 ) && field.equals("onWebsocketHandshakeSentAsClient") )) || ( (( ( __temp_hash2 == 477411898 ) && field.equals("onWebsocketPing") )) || ( (( ( __temp_hash2 == 477417664 ) && field.equals("onWebsocketPong") )) || ( (( ( __temp_hash2 == 543233036 ) && field.equals("getFlashPolicy") )) || ( (( ( __temp_hash2 == 109757538 ) && field.equals("start") )) || ( (( ( __temp_hash2 == 3540994 ) && field.equals("stop") )) || ( (( ( __temp_hash2 == 1724603733 ) && field.equals("connections") )) || ( (( ( __temp_hash2 == -110831682 ) && field.equals("getAddress") )) || ( (( ( __temp_hash2 == -75235081 ) && field.equals("getPort") )) || ( (( ( __temp_hash2 == 1951670251 ) && field.equals("getDraft") )) || ( (( ( __temp_hash2 == 113291 ) && field.equals("run") )) || ( (( ( __temp_hash2 == 183455286 ) && field.equals("allocateBuffers") )) || ( (( ( __temp_hash2 == 1121558060 ) && field.equals("releaseBuffers") )) || ( (( ( __temp_hash2 == 1049654364 ) && field.equals("createBuffer") )) || ( (( ( __temp_hash2 == 854232428 ) && field.equals("getFlashSecurityPolicy") )) || ( (( ( __temp_hash2 == 1744652719 ) && field.equals("onWebsocketMessageFragment") )) || ( (( ( __temp_hash2 == -830819777 ) && field.equals("onWebsocketMessage") )) || ( (( ( __temp_hash2 == 477388562 ) && field.equals("onWebsocketOpen") )) || ( (( ( __temp_hash2 == 1902951984 ) && field.equals("onWebsocketClose") )) || ( (( ( __temp_hash2 == 259489410 ) && field.equals("removeConnection") )) || ( (( ( __temp_hash2 == -1584456347 ) && field.equals("onWebsocketHandshakeReceivedAsServer") )) || ( (( ( __temp_hash2 == -755614113 ) && field.equals("addConnection") )) || ( (( ( __temp_hash2 == 1904980544 ) && field.equals("onWebsocketError") )) || ( (( ( __temp_hash2 == 1447891883 ) && field.equals("onWriteDemand") )) || ( (( ( __temp_hash2 == 543758491 ) && field.equals("onWebsocketCloseInitiated") )) || ( (( ( __temp_hash2 == -919204115 ) && field.equals("onWebsocketClosing") )) || ( (( ( __temp_hash2 == 691069330 ) && field.equals("onCloseInitiated") )) || ( (( ( __temp_hash2 == -2092147242 ) && field.equals("onClosing") )) || ( (( ( __temp_hash2 == 502029221 ) && field.equals("setWebSocketFactory") )) || ( (( ( __temp_hash2 == 2045757081 ) && field.equals("getWebSocketFactory") )) || ( (( ( __temp_hash2 == -2007336437 ) && field.equals("onConnect") )) || ( (( ( __temp_hash2 == -1792428724 ) && field.equals("getLocalSocketAddress") )) || ( (( ( __temp_hash2 == 2140836645 ) && field.equals("getRemoteSocketAddress") )) || ( (( ( __temp_hash2 == 1119683919 ) && field.equals("onFragment") )) || ( (( ( __temp_hash2 == -1349867671 ) && field.equals("onError") )) || ( (( ( __temp_hash2 == -2003762904 ) && field.equals("onMessage") )) || ( (( ( __temp_hash2 == -1351896231 ) && field.equals("onClose") )) || field.equals("onOpen") ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case -318718463:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("setResponseList")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.setResponseList(((haxe.root.Array<haxe.thnx.socket.response.SocketResponse>) (dynargs.__get(0)) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 832221671:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("sendRequest")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.sendRequest(haxe.lang.Runtime.toString(dynargs.__get(0)), dynargs.__get(1));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1149879040:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestMove")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.requestMove(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1414523136:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestTarget")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.requestTarget(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
				case 1291838160:
				{
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					if (field.equals("requestShoot")) 
					{
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						__temp_executeDef1 = false;
						//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
						this.requestShoot(haxe.lang.Runtime.toBool(dynargs.__get(0)));
					}
					
					//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
					break;
				}
				
				
			}
			
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
			if (__temp_executeDef1) 
			{
				//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			
		}
		
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		return null;
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\socket\\ClientSocket.hx"
		baseArr.push("responseList");
	}
	
	
}


