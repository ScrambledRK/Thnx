package haxe.at.dotpoint.loader.processor.parser;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JSONParser extends haxe.at.dotpoint.loader.processor.ADataProcessor implements haxe.at.dotpoint.loader.processor.IDataProcessor<java.lang.String, java.lang.Object>
{
	public JSONParser(haxe.lang.EmptyObject empty)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public JSONParser()
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		haxe.at.dotpoint.loader.processor.parser.JSONParser.__hx_ctor_haxe_at_dotpoint_loader_processor_parser_JSONParser(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_processor_parser_JSONParser(haxe.at.dotpoint.loader.processor.parser.JSONParser __temp_me48)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me48, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		return new haxe.at.dotpoint.loader.processor.parser.JSONParser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		return new haxe.at.dotpoint.loader.processor.parser.JSONParser();
	}
	
	
	public java.lang.Object result;
	
	public void start(java.lang.String input)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		try 
		{
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			this.result = new haxe.format.JsonParser(haxe.lang.Runtime.toString(input)).parseRec();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			{
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				java.lang.Object error = __temp_catchall2;
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.at.dotpoint.loader.processor.parser.JSONParser", "JSONParser.hx", "start"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (46) )) )});
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				haxe.at.dotpoint.logger.Log.check();
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				{
					//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					int _g = 0;
					//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
					//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					while (( _g < _g1.length ))
					{
						//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
						//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						 ++ _g;
						//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, error, info);
					}
					
				}
				
				//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				java.lang.Object __temp_expr3 = error;
			}
			
		}
		
		
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("result")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						this.result = ((java.lang.Object) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("result")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						this.result = ((java.lang.Object) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			switch (field.hashCode())
			{
				case 109757538:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("start")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("result")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						return this.result;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("result")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.result)) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			switch (field.hashCode())
			{
				case 109757538:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					if (field.equals("start")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
						this.start(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		baseArr.push("result");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\JSONParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


