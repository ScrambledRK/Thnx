package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HaxeException extends java.lang.RuntimeException
{
	public static final long serialVersionUID = 5956463319488556322L;public HaxeException(java.lang.Object obj, java.lang.String msg, java.lang.Throwable cause)
	{
		//line 49 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		super(msg, cause);
		//line 51 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof haxe.lang.HaxeException )) 
		{
			//line 53 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
			haxe.lang.HaxeException _obj = ((haxe.lang.HaxeException) (obj) );
			//line 54 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
			obj = _obj.getObject();
		}
		
		//line 57 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		this.obj = obj;
	}
	
	
	public static java.lang.RuntimeException wrap(java.lang.Object obj)
	{
		//line 79 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		java.lang.RuntimeException ret = null;
		//line 80 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof java.lang.RuntimeException )) 
		{
			//line 81 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
			ret = ((java.lang.RuntimeException) (obj) );
		}
		else
		{
			//line 82 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
			if (( obj instanceof java.lang.String )) 
			{
				//line 83 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
				ret = new haxe.lang.HaxeException(obj, haxe.lang.Runtime.toString(obj), null);
			}
			else
			{
				//line 84 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
				if (( obj instanceof java.lang.Throwable )) 
				{
					//line 85 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, null, ((java.lang.Throwable) (obj) ));
				}
				else
				{
					//line 87 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, null, null);
				}
				
			}
			
		}
		
		//line 88 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ret;
	}
	
	
	public java.lang.Object obj;
	
	public java.lang.Object getObject()
	{
		//line 62 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this.obj;
	}
	
	
	@Override public java.lang.Throwable fillInStackTrace()
	{
		//line 68 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 74 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ( "Haxe Exception: " + haxe.root.Std.string(this.obj) );
	}
	
	
}


