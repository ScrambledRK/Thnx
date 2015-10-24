package haxe.at.dotpoint.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LoggerSettings extends haxe.lang.HxObject
{
	public LoggerSettings(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LoggerSettings()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		haxe.at.dotpoint.logger.LoggerSettings.__hx_ctor_haxe_at_dotpoint_logger_LoggerSettings(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_logger_LoggerSettings(haxe.at.dotpoint.logger.LoggerSettings __temp_me54)
	{
		//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		__temp_me54.enableInfo = true;
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		__temp_me54.enableWarning = true;
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		__temp_me54.enableError = true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		return new haxe.at.dotpoint.logger.LoggerSettings(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		return new haxe.at.dotpoint.logger.LoggerSettings();
	}
	
	
	public boolean enableInfo;
	
	public boolean enableWarning;
	
	public boolean enableError;
	
	public boolean ignoreLogType(haxe.at.dotpoint.logger.LogType type)
	{
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		if (( ( ( this.enableInfo && ( type == haxe.at.dotpoint.logger.LogType.INFO ) ) || ( this.enableWarning && ( type == haxe.at.dotpoint.logger.LogType.WARNING ) ) ) || ( this.enableError && ( type == haxe.at.dotpoint.logger.LogType.ERROR ) ) )) 
		{
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			return false;
		}
		else
		{
			//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			return true;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			switch (field.hashCode())
			{
				case -1452886459:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableError")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						this.enableError = haxe.lang.Runtime.toBool(value);
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
				case 1892910289:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableInfo")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						this.enableInfo = haxe.lang.Runtime.toBool(value);
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
				case -2051049319:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableWarning")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						this.enableWarning = haxe.lang.Runtime.toBool(value);
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			switch (field.hashCode())
			{
				case 1278946924:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("ignoreLogType")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ignoreLogType")) );
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
				case 1892910289:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableInfo")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return this.enableInfo;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
				case -1452886459:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableError")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return this.enableError;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
				case -2051049319:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("enableWarning")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return this.enableWarning;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			switch (field.hashCode())
			{
				case 1278946924:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					if (field.equals("ignoreLogType")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
						return this.ignoreLogType(((haxe.at.dotpoint.logger.LogType) (dynargs.__get(0)) ));
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		baseArr.push("enableError");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		baseArr.push("enableWarning");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		baseArr.push("enableInfo");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\LoggerSettings.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


