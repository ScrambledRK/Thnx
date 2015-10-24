package haxe.at.dotpoint.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DataHelper extends haxe.lang.HxObject
{
	public DataHelper(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DataHelper()
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		haxe.at.dotpoint.loader.DataHelper.__hx_ctor_haxe_at_dotpoint_loader_DataHelper(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_DataHelper(haxe.at.dotpoint.loader.DataHelper __temp_me36)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		__temp_me36.formats = __temp_me36.initFormats();
	}
	
	
	public static haxe.at.dotpoint.loader.DataHelper instance;
	
	public static haxe.at.dotpoint.loader.DataHelper get_instance()
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		if (( haxe.at.dotpoint.loader.DataHelper.instance == null )) 
		{
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			haxe.at.dotpoint.loader.DataHelper.instance = new haxe.at.dotpoint.loader.DataHelper();
		}
		
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		return haxe.at.dotpoint.loader.DataHelper.instance;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		return new haxe.at.dotpoint.loader.DataHelper(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		return new haxe.at.dotpoint.loader.DataHelper();
	}
	
	
	public haxe.root.Array<haxe.at.dotpoint.loader.format.IDataFormat> formats;
	
	public haxe.root.Array groups;
	
	public haxe.root.Array<haxe.at.dotpoint.loader.format.IDataFormat> initFormats()
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		haxe.root.Array<haxe.at.dotpoint.loader.format.IDataFormat> list = new haxe.root.Array<haxe.at.dotpoint.loader.format.IDataFormat>();
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		list.push(haxe.at.dotpoint.loader.format.StringFormat.get_instance());
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		list.push(haxe.at.dotpoint.loader.format.BitmapFormat.get_instance());
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		list.push(haxe.at.dotpoint.loader.format.SoundFormat.get_instance());
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		list.push(haxe.at.dotpoint.loader.format.SWFFormat.get_instance());
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		return list;
	}
	
	
	public haxe.at.dotpoint.loader.format.IDataFormat guessFormat(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		{
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			int _g1 = 0;
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			int _g = this.formats.length;
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			while (( _g1 < _g ))
			{
				//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				int i = _g1++;
				//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				haxe.at.dotpoint.loader.format.IDataFormat format = this.formats.__get(i);
				//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				if (format.isFormat(request)) 
				{
					//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					return format;
				}
				
			}
			
		}
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			switch (field.hashCode())
			{
				case -1237460524:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("groups")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						this.groups = ((haxe.root.Array) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
				case -677443748:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("formats")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						this.formats = ((haxe.root.Array<haxe.at.dotpoint.loader.format.IDataFormat>) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			switch (field.hashCode())
			{
				case -135457618:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("guessFormat")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "guessFormat")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
				case -677443748:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("formats")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return this.formats;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
				case 642607148:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("initFormats")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initFormats")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
				case -1237460524:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("groups")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return this.groups;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			switch (field.hashCode())
			{
				case -135457618:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("guessFormat")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return this.guessFormat(((haxe.at.dotpoint.loader.DataRequest) (dynargs.__get(0)) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
				case 642607148:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					if (field.equals("initFormats")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
						return this.initFormats();
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		baseArr.push("groups");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		baseArr.push("formats");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataHelper.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


