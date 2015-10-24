package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitmapFormat extends haxe.at.dotpoint.loader.format.ABaseDataFormat
{
	public BitmapFormat(haxe.lang.EmptyObject empty)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public BitmapFormat()
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		haxe.at.dotpoint.loader.format.BitmapFormat.__hx_ctor_haxe_at_dotpoint_loader_format_BitmapFormat(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_format_BitmapFormat(haxe.at.dotpoint.loader.format.BitmapFormat __temp_me44)
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		haxe.at.dotpoint.loader.format.ABaseDataFormat.__hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(__temp_me44, new haxe.root.Array<java.lang.String>(new java.lang.String[]{"png", "jpg", "jpeg", "gif"}));
	}
	
	
	public static haxe.at.dotpoint.loader.format.BitmapFormat instance;
	
	public static haxe.at.dotpoint.loader.format.BitmapFormat get_instance()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		if (( haxe.at.dotpoint.loader.format.BitmapFormat.instance == null )) 
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
			haxe.at.dotpoint.loader.format.BitmapFormat.instance = new haxe.at.dotpoint.loader.format.BitmapFormat();
		}
		
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		return haxe.at.dotpoint.loader.format.BitmapFormat.instance;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		return new haxe.at.dotpoint.loader.format.BitmapFormat(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		return new haxe.at.dotpoint.loader.format.BitmapFormat();
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		return ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new sys.at.dotpoint.loader.processor.loader.BitmapLoader()) );
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createParser(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		return super.createParser(request);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
			switch (field.hashCode())
			{
				case 1432362043:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
					if (field.equals("createParser")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createParser")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
					break;
				}
				
				
				case 1330253871:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createLoader")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\BitmapFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


