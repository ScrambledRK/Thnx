package sys.at.dotpoint.loader.processor.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitmapLoader extends sys.at.dotpoint.loader.processor.loader.AFileLoader implements haxe.at.dotpoint.loader.processor.loader.IDataLoader<haxe.at.dotpoint.display.renderable.bitmap.BitmapData>
{
	public BitmapLoader(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BitmapLoader()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		sys.at.dotpoint.loader.processor.loader.BitmapLoader.__hx_ctor_sys_at_dotpoint_loader_processor_loader_BitmapLoader(this);
	}
	
	
	public static void __hx_ctor_sys_at_dotpoint_loader_processor_loader_BitmapLoader(sys.at.dotpoint.loader.processor.loader.BitmapLoader __temp_me157)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		sys.at.dotpoint.loader.processor.loader.AFileLoader.__hx_ctor_sys_at_dotpoint_loader_processor_loader_AFileLoader(__temp_me157, null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.BitmapLoader(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.BitmapLoader();
	}
	
	
	public haxe.at.dotpoint.display.renderable.bitmap.BitmapData result;
	
	@Override public void onComplete(java.lang.Object event)
	{
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		this.result = new haxe.at.dotpoint.display.renderable.bitmap.BitmapData(0, 0, this.bytes);
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		super.onComplete(event);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					if (field.equals("result")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						this.result = ((haxe.at.dotpoint.display.renderable.bitmap.BitmapData) (value) );
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			switch (field.hashCode())
			{
				case -2124458952:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					if (field.equals("onComplete")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					if (field.equals("result")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
						return this.result;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		baseArr.push("result");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\BitmapLoader.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


