package haxe.at.dotpoint.loader._URLRequest;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DotURLRequest extends haxe.lang.HxObject
{
	public DotURLRequest(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DotURLRequest(java.lang.String url)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		haxe.at.dotpoint.loader._URLRequest.DotURLRequest.__hx_ctor_haxe_at_dotpoint_loader__URLRequest_DotURLRequest(this, url);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader__URLRequest_DotURLRequest(haxe.at.dotpoint.loader._URLRequest.DotURLRequest __temp_me40, java.lang.String url)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		__temp_me40.url = url;
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		__temp_me40.method = haxe.at.dotpoint.loader.URLRequestMethod.GET;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		return new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		return new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public java.lang.String url;
	
	public java.lang.String method;
	
	public java.lang.Object data;
	
	public haxe.at.dotpoint.loader._URLRequest.DotURLRequest clone()
	{
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		haxe.at.dotpoint.loader._URLRequest.DotURLRequest request = new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(haxe.lang.Runtime.toString(null));
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		request.url = this.url;
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		request.method = this.method;
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		request.data = this.data;
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		return request;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		return ( ( "[URLRequest:" + this.url ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			switch (field.hashCode())
			{
				case 3076010:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("data")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						this.data = ((java.lang.Object) (value) );
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			switch (field.hashCode())
			{
				case 3076010:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("data")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						this.data = ((java.lang.Object) (value) );
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case 116079:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("url")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						this.url = haxe.lang.Runtime.toString(value);
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("method")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						this.method = haxe.lang.Runtime.toString(value);
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("toString")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case 116079:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("url")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return this.url;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("clone")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case -1077554975:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("method")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return this.method;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case 3076010:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("data")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return this.data;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			switch (field.hashCode())
			{
				case 3076010:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("data")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.data)) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("toString")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return this.toString();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					if (field.equals("clone")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
						return this.clone();
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		baseArr.push("data");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		baseArr.push("method");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		baseArr.push("url");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\URLRequest.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


