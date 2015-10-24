package haxe.at.dotpoint.logger.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BaseLogger extends haxe.lang.HxObject
{
	public BaseLogger(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BaseLogger(haxe.at.dotpoint.logger.LoggerSettings settings)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		haxe.at.dotpoint.logger.logger.BaseLogger.__hx_ctor_haxe_at_dotpoint_logger_logger_BaseLogger(this, settings);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_logger_logger_BaseLogger(haxe.at.dotpoint.logger.logger.BaseLogger __temp_me55, haxe.at.dotpoint.logger.LoggerSettings settings)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		if (( settings != null )) 
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			__temp_me55.settings = settings;
		}
		else
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			__temp_me55.settings = new haxe.at.dotpoint.logger.LoggerSettings();
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		return new haxe.at.dotpoint.logger.logger.BaseLogger(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		return new haxe.at.dotpoint.logger.logger.BaseLogger(((haxe.at.dotpoint.logger.LoggerSettings) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.logger.LoggerSettings settings;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			switch (field.hashCode())
			{
				case 1434631203:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
					if (field.equals("settings")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
						this.settings = ((haxe.at.dotpoint.logger.LoggerSettings) (value) );
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
						return value;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			switch (field.hashCode())
			{
				case 1434631203:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
					if (field.equals("settings")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
						return this.settings;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		baseArr.push("settings");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\logger\\logger\\BaseLogger.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


