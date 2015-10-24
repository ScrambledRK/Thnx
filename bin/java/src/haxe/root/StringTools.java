package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 32 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static void __hx_ctor__StringTools(haxe.root.StringTools __temp_me6)
	{
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 187 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 188 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		return ( ( ( haxe.lang.Runtime.compare(c, 8) > 0 ) && ( haxe.lang.Runtime.compare(c, 14) < 0 ) ) || haxe.lang.Runtime.eq(c, 32) );
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 204 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		int l = s.length();
		//line 205 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		int r = 0;
		//line 206 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 207 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			r++;
		}
		
		//line 209 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		if (( r > 0 )) 
		{
			//line 210 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 212 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
	public static java.lang.String lpad(java.lang.String s, java.lang.String c, int l)
	{
		//line 270 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		if (( c.length() <= 0 )) 
		{
			//line 271 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			return s;
		}
		
		//line 273 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		while (( s.length() < l ))
		{
			//line 274 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			s = ( c + s );
		}
		
		//line 276 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		return s;
	}
	
	
	public static java.lang.String hex(int n, java.lang.Object digits)
	{
		//line 340 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		java.lang.String s = "";
		//line 341 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		java.lang.String hexChars = "0123456789ABCDEF";
		//line 342 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		do 
		{
			//line 343 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			s = ( haxe.lang.StringExt.charAt(hexChars, ( n & 15 )) + s );
			//line 344 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			n >>>= 4;
		}
		while (( n > 0 ));
		//line 355 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		if (( ! (haxe.lang.Runtime.eq(digits, null)) )) 
		{
			//line 356 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
			while (( haxe.lang.Runtime.compare(s.length(), digits) < 0 ))
			{
				//line 357 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
				s = ( "0" + s );
			}
			
		}
		
		//line 359 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		return s;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 32 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		return new haxe.root.StringTools(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 32 "C:\\Apps\\Haxe\\haxe\\std\\StringTools.hx"
		return new haxe.root.StringTools();
	}
	
	
}


