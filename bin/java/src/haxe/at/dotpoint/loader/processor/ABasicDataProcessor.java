package haxe.at.dotpoint.loader.processor;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ABasicDataProcessor extends haxe.at.dotpoint.core.dispatcher.event.EventDispatcher
{
	public ABasicDataProcessor(haxe.lang.EmptyObject empty)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public ABasicDataProcessor(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target)
	{
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.at.dotpoint.loader.processor.ABasicDataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ABasicDataProcessor(this, target);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_processor_ABasicDataProcessor(haxe.at.dotpoint.loader.processor.ABasicDataProcessor __temp_me37, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		__temp_me37.isComplete = false;
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		__temp_me37.isProcessing = false;
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.at.dotpoint.core.dispatcher.event.EventDispatcher.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_EventDispatcher(__temp_me37, target);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return new haxe.at.dotpoint.loader.processor.ABasicDataProcessor(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return new haxe.at.dotpoint.loader.processor.ABasicDataProcessor(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (arr.__get(0)) ));
	}
	
	
	public boolean isProcessing;
	
	public boolean isComplete;
	
	public void stop()
	{
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STOPPED);
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		this.close();
	}
	
	
	public void close()
	{
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return ;
	}
	
	
	public void onComplete(java.lang.Object event)
	{
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE);
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		this.close();
	}
	
	
	public void onError(haxe.at.dotpoint.core.dispatcher.event.Event event)
	{
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( ( event != null ) && this.hasListener(event.get_type()) )) 
		{
			//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.dispatch(event);
		}
		
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		this.stop();
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent error = ((haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent) (event) );
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( error != null )) 
		{
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object value = ( ( error.errorID + ": " ) + error.message );
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.at.dotpoint.loader.processor.ABasicDataProcessor", "ADataProcessor.hx", "onError"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (84) )) )});
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			haxe.at.dotpoint.logger.Log.check();
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			{
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				int _g = 0;
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				while (( _g < _g1.length ))
				{
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					 ++ _g;
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, value, info);
				}
				
			}
			
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object __temp_expr2 = value;
		}
		else
		{
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object value1 = haxe.at.dotpoint.core.StringTool.dumpObject(event);
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object info1 = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.at.dotpoint.loader.processor.ABasicDataProcessor", "ADataProcessor.hx", "onError"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (86) )) )});
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			haxe.at.dotpoint.logger.Log.check();
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			{
				//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				int _g2 = 0;
				//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g11 = haxe.at.dotpoint.logger.Log.loggerList;
				//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				while (( _g2 < _g11.length ))
				{
					//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					haxe.at.dotpoint.logger.logger.ILogger logger1 = _g11.__get(_g2);
					//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					 ++ _g2;
					//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					haxe.at.dotpoint.logger.Log.delegateLog(logger1, haxe.at.dotpoint.logger.LogType.ERROR, value1, info1);
				}
				
			}
			
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.Object __temp_expr1 = value1;
		}
		
	}
	
	
	public void setStatus(java.lang.String type)
	{
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			java.lang.String __temp_svar1 = (type);
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef2 = true;
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (__temp_svar1.hashCode())
			{
				case 753022491:
				{
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (__temp_svar1.equals("StatusEvent.STARTED")) 
					{
						//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef2 = false;
						//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						if (this.isProcessing) 
						{
							//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
							throw haxe.lang.HaxeException.wrap("cannot start an already running process");
						}
						
						//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isProcessing = true;
						//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isComplete = false;
					}
					
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -47386945:
				{
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (__temp_svar1.equals("StatusEvent.COMPLETE")) 
					{
						//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef2 = false;
						//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						if ((  ! (this.isProcessing)  || this.isComplete )) 
						{
							//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
							throw haxe.lang.HaxeException.wrap("cannot complete an idle process");
						}
						
						//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isProcessing = false;
						//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isComplete = true;
					}
					
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 765888359:
				{
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (__temp_svar1.equals("StatusEvent.STOPPED")) 
					{
						//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef2 = false;
						//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						if ((  ! (this.isProcessing)  || this.isComplete )) 
						{
							//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
							throw haxe.lang.HaxeException.wrap("cannot stop an idle process");
						}
						
						//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isProcessing = false;
						//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isComplete = false;
					}
					
					//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef2) 
			{
				//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				throw haxe.lang.HaxeException.wrap(( "unknown status " + type ));
			}
			
		}
		
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (this.hasListener(type)) 
		{
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.dispatch(new haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent(haxe.lang.Runtime.toString(type)));
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (field.hashCode())
			{
				case -1392715645:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("isComplete")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isComplete = haxe.lang.Runtime.toBool(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -1701499939:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("isProcessing")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.isProcessing = haxe.lang.Runtime.toBool(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (field.hashCode())
			{
				case 588916468:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("setStatus")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setStatus")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -1701499939:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("isProcessing")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return this.isProcessing;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("onError")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -1392715645:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("isComplete")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return this.isComplete;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("onComplete")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("stop")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("close")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (field.hashCode())
			{
				case 588916468:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("setStatus")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.setStatus(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("stop")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.stop();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("onError")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.onError(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("close")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.close();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("onComplete")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.onComplete(dynargs.__get(0));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		baseArr.push("isComplete");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		baseArr.push("isProcessing");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


