package haxe.at.dotpoint.logger.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TraceLogger extends haxe.at.dotpoint.logger.logger.BaseLogger implements haxe.at.dotpoint.logger.logger.ILogger
{
	public TraceLogger(haxe.lang.EmptyObject empty)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TraceLogger(haxe.at.dotpoint.logger.LoggerSettings settings)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		haxe.at.dotpoint.logger.logger.TraceLogger.__hx_ctor_haxe_at_dotpoint_logger_logger_TraceLogger(this, settings);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_logger_logger_TraceLogger(haxe.at.dotpoint.logger.logger.TraceLogger __temp_me56, haxe.at.dotpoint.logger.LoggerSettings settings)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		haxe.at.dotpoint.logger.logger.BaseLogger.__hx_ctor_haxe_at_dotpoint_logger_logger_BaseLogger(__temp_me56, settings);
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		__temp_me56.step = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		return new haxe.at.dotpoint.logger.logger.TraceLogger(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		return new haxe.at.dotpoint.logger.logger.TraceLogger(((haxe.at.dotpoint.logger.LoggerSettings) (arr.__get(0)) ));
	}
	
	
	public int step;
	
	public void log(haxe.at.dotpoint.logger.LogType type, java.lang.Object msg, java.lang.Object info)
	{
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		if (( this.step < 0 )) 
		{
			//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			this.step = 0;
		}
		
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		java.lang.String prefix = this.getPrefix();
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		if (( msg instanceof java.lang.String )) 
		{
			//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			java.lang.String code = haxe.lang.StringExt.substring(haxe.root.Std.string(msg), 0, 2);
			//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (haxe.lang.Runtime.valEq(code, ">>")) 
			{
				//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				this.step++;
			}
			
			//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (haxe.lang.Runtime.valEq(code, "<<")) 
			{
				//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				this.step--;
				//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				prefix = this.getPrefix();
			}
			
		}
		
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		if (( type == haxe.at.dotpoint.logger.LogType.INFO )) 
		{
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			haxe.at.dotpoint.logger.Log.nativeTrace.__hx_invoke2_o(0.0, ( prefix + haxe.root.Std.string(msg) ), 0.0, info);
		}
		else
		{
			//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			haxe.at.dotpoint.logger.Log.nativeTrace.__hx_invoke2_o(0.0, ( ( ( prefix + haxe.root.Std.string(type) ) + " :: " ) + haxe.root.Std.string(msg) ), 0.0, info);
		}
		
	}
	
	
	public java.lang.String getPrefix()
	{
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		java.lang.String prefix = "";
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			int _g1 = 0;
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			int _g = this.step;
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			while (( _g1 < _g ))
			{
				//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				int j = _g1++;
				//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				prefix += "\t";
			}
			
		}
		
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		return prefix;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			switch (field.hashCode())
			{
				case 3540684:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("step")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						this.step = ((int) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			switch (field.hashCode())
			{
				case 3540684:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("step")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						this.step = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			switch (field.hashCode())
			{
				case 715904392:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("getPrefix")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPrefix")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
				case 3540684:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("step")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return this.step;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
				case 107332:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("log")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "log")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			switch (field.hashCode())
			{
				case 3540684:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("step")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return ((double) (this.step) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			switch (field.hashCode())
			{
				case 715904392:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("getPrefix")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						return this.getPrefix();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
				case 107332:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					if (field.equals("log")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
						this.log(((haxe.at.dotpoint.logger.LogType) (dynargs.__get(0)) ), dynargs.__get(1), dynargs.__get(2));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		baseArr.push("step");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\TraceLogger.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


