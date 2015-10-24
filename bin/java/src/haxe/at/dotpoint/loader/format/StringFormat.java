package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringFormat extends haxe.at.dotpoint.loader.format.ABaseDataFormat
{
	public StringFormat(haxe.lang.EmptyObject empty)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public StringFormat()
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		haxe.at.dotpoint.loader.format.StringFormat.__hx_ctor_haxe_at_dotpoint_loader_format_StringFormat(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_format_StringFormat(haxe.at.dotpoint.loader.format.StringFormat __temp_me47)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		haxe.at.dotpoint.loader.format.ABaseDataFormat.__hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(__temp_me47, new haxe.root.Array<java.lang.String>(new java.lang.String[]{"xml", "txt", "html", "htm", "css", "json"}));
	}
	
	
	public static haxe.at.dotpoint.loader.format.StringFormat instance;
	
	public static haxe.at.dotpoint.loader.format.StringFormat get_instance()
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		if (( haxe.at.dotpoint.loader.format.StringFormat.instance == null )) 
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			haxe.at.dotpoint.loader.format.StringFormat.instance = new haxe.at.dotpoint.loader.format.StringFormat();
		}
		
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		return haxe.at.dotpoint.loader.format.StringFormat.instance;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		return new haxe.at.dotpoint.loader.format.StringFormat(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		return new haxe.at.dotpoint.loader.format.StringFormat();
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		return ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new sys.at.dotpoint.loader.processor.loader.StringLoader()) );
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createParser(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		java.lang.String extension = this.extractExtension(request.request.url);
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		{
			//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			java.lang.String __temp_svar1 = (extension);
			//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			switch (__temp_svar1.hashCode())
			{
				case 3271912:
				{
					//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					if (__temp_svar1.equals("json")) 
					{
						//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						return ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new haxe.at.dotpoint.loader.processor.parser.JSONParser()) );
					}
					
					//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					break;
				}
				
				
				case 118807:
				{
					//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					if (__temp_svar1.equals("xml")) 
					{
						//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						return ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new haxe.at.dotpoint.loader.processor.parser.XMLParser()) );
					}
					
					//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		return new haxe.at.dotpoint.loader.processor.parser.NullParser();
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			switch (field.hashCode())
			{
				case 1432362043:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					if (field.equals("createParser")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createParser")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					break;
				}
				
				
				case 1330253871:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createLoader")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\StringFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


