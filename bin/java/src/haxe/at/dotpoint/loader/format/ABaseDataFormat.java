package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ABaseDataFormat extends haxe.lang.HxObject implements haxe.at.dotpoint.loader.format.IDataFormat
{
	public ABaseDataFormat(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ABaseDataFormat(haxe.root.Array<java.lang.String> extensions)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		haxe.at.dotpoint.loader.format.ABaseDataFormat.__hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(this, extensions);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_format_ABaseDataFormat(haxe.at.dotpoint.loader.format.ABaseDataFormat __temp_me43, haxe.root.Array<java.lang.String> extensions)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		if (( extensions != null )) 
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			java.lang.String[] data = null;
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			{
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				java.lang.String[] ret = new java.lang.String[extensions.length];
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				{
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					int _g1 = 0;
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					int _g = extensions.length;
					//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					while (( _g1 < _g ))
					{
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						int i = _g1++;
						//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						ret[i] = extensions.__get(i);
					}
					
				}
				
				//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				data = ret;
			}
			
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			__temp_me43.extensions = ((java.lang.String[]) (data) );
		}
		else
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			__temp_me43.extensions = null;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return new haxe.at.dotpoint.loader.format.ABaseDataFormat(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return new haxe.at.dotpoint.loader.format.ABaseDataFormat(((haxe.root.Array<java.lang.String>) (arr.__get(0)) ));
	}
	
	
	public java.lang.String[] extensions;
	
	public boolean isFormat(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return this.isValidExtension(this.extractExtension(request.request.url));
	}
	
	
	public haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		throw haxe.lang.HaxeException.wrap("override this methode");
	}
	
	
	public haxe.at.dotpoint.loader.processor.IDataProcessor createParser(haxe.at.dotpoint.loader.DataRequest request)
	{
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return new haxe.at.dotpoint.loader.processor.parser.NullParser();
	}
	
	
	public java.lang.String extractExtension(java.lang.String url)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return haxe.lang.Runtime.toString(haxe.lang.StringExt.split(url, ".").pop()).toLowerCase();
	}
	
	
	public boolean isValidExtension(java.lang.String extension)
	{
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		if (( this.extensions == null )) 
		{
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			throw haxe.lang.HaxeException.wrap("override isFormat, or fill the extensions vector");
		}
		
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		{
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			int _g1 = 0;
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			int _g = ((java.lang.String[]) (this.extensions) ).length;
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			while (( _g1 < _g ))
			{
				//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				int i = _g1++;
				//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				if (haxe.lang.Runtime.valEq(haxe.lang.Runtime.toString(((java.lang.String[]) (this.extensions) )[i]), extension)) 
				{
					//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					return true;
				}
				
			}
			
		}
		
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			switch (field.hashCode())
			{
				case -1809421292:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("extensions")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						this.extensions = ((java.lang.String[]) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			switch (field.hashCode())
			{
				case 854224749:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("isValidExtension")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isValidExtension")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case -1809421292:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("extensions")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.extensions;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 792060094:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("extractExtension")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "extractExtension")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case -594744895:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("isFormat")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isFormat")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 1432362043:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("createParser")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createParser")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 1330253871:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "createLoader")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			switch (field.hashCode())
			{
				case 854224749:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("isValidExtension")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.isValidExtension(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case -594744895:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("isFormat")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.isFormat(((haxe.at.dotpoint.loader.DataRequest) (dynargs.__get(0)) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 792060094:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("extractExtension")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.extractExtension(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 1330253871:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("createLoader")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.createLoader(((haxe.at.dotpoint.loader.DataRequest) (dynargs.__get(0)) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
				case 1432362043:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					if (field.equals("createParser")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
						return this.createParser(((haxe.at.dotpoint.loader.DataRequest) (dynargs.__get(0)) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		baseArr.push("extensions");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\format\\ABaseDataFormat.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


