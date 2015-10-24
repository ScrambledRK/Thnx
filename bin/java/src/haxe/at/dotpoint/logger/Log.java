package haxe.at.dotpoint.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Log extends haxe.lang.HxObject
{
	public Log(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Log()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.__hx_ctor_haxe_at_dotpoint_logger_Log(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_logger_Log(haxe.at.dotpoint.logger.Log __temp_me53)
	{
	}
	
	
	public static haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> loggerList;
	
	public static haxe.lang.Function nativeTrace;
	
	public static void initialize(haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> loggerList, java.lang.Object redirectTrace)
	{
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		boolean __temp_redirectTrace51 = ( (haxe.lang.Runtime.eq(redirectTrace, null)) ? (true) : (haxe.lang.Runtime.toBool(redirectTrace)) );
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (( loggerList == null )) 
		{
			//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			loggerList = new haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger>();
			//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			loggerList.push(new haxe.at.dotpoint.logger.logger.TraceLogger(((haxe.at.dotpoint.logger.LoggerSettings) (null) )));
		}
		
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.loggerList = loggerList;
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.nativeTrace = haxe.Log.trace;
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (__temp_redirectTrace51) 
		{
			//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.Log.trace = ((haxe.lang.Function) (new haxe.lang.Closure(haxe.at.dotpoint.logger.Log.class, "onTrace")) );
		}
		
	}
	
	
	public static void onTrace(java.lang.Object value, java.lang.Object info)
	{
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (( ( value instanceof haxe.at.dotpoint.logger.LogType ) && ( ((haxe.root.Array) (haxe.lang.Runtime.getField(info, "customParams", true)) ) != null ) )) 
		{
			//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			switch (haxe.root.Type.enumIndex(value))
			{
				case 2:
				{
					//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object value1 = ((haxe.root.Array) (haxe.lang.Runtime.getField(info, "customParams", true)) ).shift();
					//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					haxe.at.dotpoint.logger.Log.check();
					//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					{
						//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						int _g = 0;
						//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
						//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						while (( _g < _g1.length ))
						{
							//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
							//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							 ++ _g;
							//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, value1, info);
						}
						
					}
					
					//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object __temp_expr3 = value1;
					//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					break;
				}
				
				
				case 1:
				{
					//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object value2 = ((haxe.root.Array) (haxe.lang.Runtime.getField(info, "customParams", true)) ).shift();
					//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					haxe.at.dotpoint.logger.Log.check();
					//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					{
						//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						int _g2 = 0;
						//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g11 = haxe.at.dotpoint.logger.Log.loggerList;
						//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						while (( _g2 < _g11.length ))
						{
							//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.logger.ILogger logger1 = _g11.__get(_g2);
							//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							 ++ _g2;
							//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.Log.delegateLog(logger1, haxe.at.dotpoint.logger.LogType.WARNING, value2, info);
						}
						
					}
					
					//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object __temp_expr4 = value2;
					//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					break;
				}
				
				
				default:
				{
					//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object value3 = ((haxe.root.Array) (haxe.lang.Runtime.getField(info, "customParams", true)) ).shift();
					//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					haxe.at.dotpoint.logger.Log.check();
					//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					{
						//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						int _g3 = 0;
						//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g12 = haxe.at.dotpoint.logger.Log.loggerList;
						//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
						while (( _g3 < _g12.length ))
						{
							//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.logger.ILogger logger2 = _g12.__get(_g3);
							//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							 ++ _g3;
							//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
							haxe.at.dotpoint.logger.Log.delegateLog(logger2, haxe.at.dotpoint.logger.LogType.INFO, value3, info);
						}
						
					}
					
					//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					java.lang.Object __temp_expr2 = value3;
					//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					break;
				}
				
			}
			
		}
		else
		{
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.at.dotpoint.logger.Log.check();
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			{
				//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				int _g4 = 0;
				//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g13 = haxe.at.dotpoint.logger.Log.loggerList;
				//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				while (( _g4 < _g13.length ))
				{
					//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					haxe.at.dotpoint.logger.logger.ILogger logger3 = _g13.__get(_g4);
					//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					 ++ _g4;
					//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					haxe.at.dotpoint.logger.Log.delegateLog(logger3, haxe.at.dotpoint.logger.LogType.INFO, value, info);
				}
				
			}
			
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			java.lang.Object __temp_expr1 = value;
		}
		
	}
	
	
	public static java.lang.String getCallstack(java.lang.Object length, java.lang.String seperator, java.lang.Object startIndex)
	{
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		java.lang.Object __temp_startIndex52 = ( (haxe.lang.Runtime.eq(startIndex, null)) ? (((java.lang.Object) (2) )) : (startIndex) );
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (( seperator == null )) 
		{
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			seperator = "\n";
		}
		
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.root.Array<haxe.StackItem> stack = haxe.CallStack.callStack();
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		java.lang.String output = "";
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (haxe.lang.Runtime.eq(length, null)) 
		{
			//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			length = stack.length;
		}
		else
		{
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			double x = java.lang.Math.min(((double) (( ((int) (haxe.lang.Runtime.toInt(__temp_startIndex52)) ) + ((int) (haxe.lang.Runtime.toInt(length)) ) )) ), ((double) (stack.length) ));
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			length = ((int) (x) );
		}
		
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		{
			//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			int _g = ((int) (haxe.lang.Runtime.toInt(__temp_startIndex52)) );
			//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			while (( haxe.lang.Runtime.compare(_g, length) < 0 ))
			{
				//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				int j = _g++;
				//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				int index = j;
				//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				java.lang.String item = haxe.lang.Runtime.toString(haxe.root.Type.enumParameters(stack.__get(index)).__get(0));
				//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				item = haxe.lang.StringExt.substr(item, 6, null);
				//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				output += item;
				//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				if (( haxe.lang.Runtime.compare(( index + 1 ), length) < 0 )) 
				{
					//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
					output += seperator;
				}
				
			}
			
		}
		
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return output;
	}
	
	
	public static java.lang.Object info(java.lang.Object value, java.lang.Object info)
	{
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.check();
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		{
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			int _g = 0;
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			while (( _g < _g1.length ))
			{
				//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
				//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				 ++ _g;
				//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.INFO, value, info);
			}
			
		}
		
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return value;
	}
	
	
	public static java.lang.Object warn(java.lang.Object value, java.lang.Object info)
	{
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.check();
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		{
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			int _g = 0;
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			while (( _g < _g1.length ))
			{
				//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
				//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				 ++ _g;
				//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.WARNING, value, info);
			}
			
		}
		
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return value;
	}
	
	
	public static java.lang.Object error(java.lang.Object value, java.lang.Object info)
	{
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		haxe.at.dotpoint.logger.Log.check();
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			int _g = 0;
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			while (( _g < _g1.length ))
			{
				//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
				//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				 ++ _g;
				//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
				haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, value, info);
			}
			
		}
		
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return value;
	}
	
	
	public static void delegateLog(haxe.at.dotpoint.logger.logger.ILogger logger, haxe.at.dotpoint.logger.LogType type, java.lang.Object value, java.lang.Object info)
	{
		//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (((haxe.at.dotpoint.logger.LoggerSettings) (haxe.lang.Runtime.getField(logger, "settings", true)) ).ignoreLogType(type)) 
		{
			//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			return ;
		}
		
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		logger.log(type, value, info);
	}
	
	
	public static void check()
	{
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (( haxe.at.dotpoint.logger.Log.loggerList == null )) 
		{
			//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			haxe.at.dotpoint.logger.Log.initialize(null, null);
		}
		
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		if (( haxe.at.dotpoint.logger.Log.loggerList.length == 0 )) 
		{
			//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
			throw haxe.lang.HaxeException.wrap("must add a ILogger to Log.loggerList");
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return new haxe.at.dotpoint.logger.Log(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\Log.hx"
		return new haxe.at.dotpoint.logger.Log();
	}
	
	
}


