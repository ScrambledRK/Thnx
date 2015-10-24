package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SWFFormat extends haxe.at.dotpoint.loader.format.ABaseDataFormat
{
	public SWFFormat(haxe.lang.EmptyObject empty)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SWFFormat()
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		haxe.at.dotpoint.loader.format.SWFFormat.__hx_ctor_haxe_at_dotpoint_loader_format_SWFFormat(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_format_SWFFormat(haxe.at.dotpoint.loader.format.SWFFormat __temp_me45)
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		haxe.at.dotpoint.loader.format.ABaseDataFormat.__hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(__temp_me45, new haxe.root.Array<java.lang.String>(new java.lang.String[]{"swf"}));
	}
	
	
	public static haxe.at.dotpoint.loader.format.SWFFormat instance;
	
	public static haxe.at.dotpoint.loader.format.SWFFormat get_instance()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		if (( haxe.at.dotpoint.loader.format.SWFFormat.instance == null )) 
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
			haxe.at.dotpoint.loader.format.SWFFormat.instance = new haxe.at.dotpoint.loader.format.SWFFormat();
		}
		
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		return haxe.at.dotpoint.loader.format.SWFFormat.instance;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		return new haxe.at.dotpoint.loader.format.SWFFormat(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		return new haxe.at.dotpoint.loader.format.SWFFormat();
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
			switch (field.hashCode())
			{
				case 1330253871:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createLoader")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SWFFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


