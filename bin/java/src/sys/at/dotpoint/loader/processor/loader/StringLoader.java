package sys.at.dotpoint.loader.processor.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringLoader extends sys.at.dotpoint.loader.processor.loader.AFileLoader implements haxe.at.dotpoint.loader.processor.loader.IDataLoader<java.lang.String>
{
	public StringLoader(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public StringLoader()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		sys.at.dotpoint.loader.processor.loader.StringLoader.__hx_ctor_sys_at_dotpoint_loader_processor_loader_StringLoader(this);
	}
	
	
	public static void __hx_ctor_sys_at_dotpoint_loader_processor_loader_StringLoader(sys.at.dotpoint.loader.processor.loader.StringLoader __temp_me160)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		sys.at.dotpoint.loader.processor.loader.AFileLoader.__hx_ctor_sys_at_dotpoint_loader_processor_loader_AFileLoader(__temp_me160, null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.StringLoader(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.StringLoader();
	}
	
	
	public java.lang.String result;
	
	@Override public void onComplete(java.lang.Object event)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		try 
		{
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			this.result = this.bytes.getString(0, this.bytes.length);
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			{
				//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				java.lang.Object error = __temp_catchall2;
				//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, "readString Error", 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"sys.at.dotpoint.loader.processor.loader.StringLoader", "StringLoader.hx", "onComplete"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (40) )) )}));
			}
			
		}
		
		
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		super.onComplete(event);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					if (field.equals("result")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						this.result = haxe.lang.Runtime.toString(value);
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			switch (field.hashCode())
			{
				case -2124458952:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					if (field.equals("onComplete")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					if (field.equals("result")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
						return this.result;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		baseArr.push("result");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\StringLoader.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


