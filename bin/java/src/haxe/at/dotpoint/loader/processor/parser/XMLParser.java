package haxe.at.dotpoint.loader.processor.parser;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class XMLParser extends haxe.at.dotpoint.loader.processor.ADataProcessor implements haxe.at.dotpoint.loader.processor.IDataProcessor<java.lang.String, haxe.root.Xml>
{
	public XMLParser(haxe.lang.EmptyObject empty)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public XMLParser()
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		haxe.at.dotpoint.loader.processor.parser.XMLParser.__hx_ctor_haxe_at_dotpoint_loader_processor_parser_XMLParser(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_processor_parser_XMLParser(haxe.at.dotpoint.loader.processor.parser.XMLParser __temp_me50)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me50, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		return new haxe.at.dotpoint.loader.processor.parser.XMLParser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		return new haxe.at.dotpoint.loader.processor.parser.XMLParser();
	}
	
	
	public haxe.root.Xml result;
	
	public void start(java.lang.String input)
	{
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		try 
		{
			//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			this.result = haxe.root.Xml.parse(input);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			{
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				java.lang.Object error = __temp_catchall2;
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.at.dotpoint.loader.processor.parser.XMLParser", "XMLParser.hx", "start"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (42) )) )});
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				haxe.at.dotpoint.logger.Log.check();
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				{
					//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					int _g = 0;
					//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
					//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					while (( _g < _g1.length ))
					{
						//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
						//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						 ++ _g;
						//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, error, info);
					}
					
				}
				
				//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				java.lang.Object __temp_expr3 = error;
			}
			
		}
		
		
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					if (field.equals("result")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						this.result = ((haxe.root.Xml) (value) );
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						return value;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			switch (field.hashCode())
			{
				case 109757538:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					if (field.equals("start")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					if (field.equals("result")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						return this.result;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			switch (field.hashCode())
			{
				case 109757538:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					if (field.equals("start")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
						this.start(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		baseArr.push("result");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\parser\\XMLParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


