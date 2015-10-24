package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SoundFormat extends haxe.at.dotpoint.loader.format.ABaseDataFormat
{
	public SoundFormat(haxe.lang.EmptyObject empty)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SoundFormat()
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		haxe.at.dotpoint.loader.format.SoundFormat.__hx_ctor_haxe_at_dotpoint_loader_format_SoundFormat(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_format_SoundFormat(haxe.at.dotpoint.loader.format.SoundFormat __temp_me46)
	{
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		haxe.at.dotpoint.loader.format.ABaseDataFormat.__hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(__temp_me46, new haxe.root.Array<java.lang.String>(new java.lang.String[]{"mp3"}));
	}
	
	
	public static haxe.at.dotpoint.loader.format.SoundFormat instance;
	
	public static haxe.at.dotpoint.loader.format.SoundFormat get_instance()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		if (( haxe.at.dotpoint.loader.format.SoundFormat.instance == null )) 
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
			haxe.at.dotpoint.loader.format.SoundFormat.instance = new haxe.at.dotpoint.loader.format.SoundFormat();
		}
		
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		return haxe.at.dotpoint.loader.format.SoundFormat.instance;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		return new haxe.at.dotpoint.loader.format.SoundFormat(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		return new haxe.at.dotpoint.loader.format.SoundFormat();
	}
	
	
	@Override public haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
		{
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
			switch (field.hashCode())
			{
				case 1330253871:
				{
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
						__temp_executeDef1 = false;
						//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createLoader")) );
					}
					
					//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
					break;
				}
				
				
			}
			
			//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 11 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\SoundFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


