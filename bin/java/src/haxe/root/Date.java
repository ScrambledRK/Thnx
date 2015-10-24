package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Date extends haxe.lang.HxObject
{
	public Date(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Date(int year, int month, int day, int hour, int min, int sec)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date.__hx_ctor__Date(this, year, month, day, hour, min, sec);
	}
	
	
	public static void __hx_ctor__Date(haxe.root.Date __temp_me3, int year, int month, int day, int hour, int min, int sec)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		if (( year != 0 )) 
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			year = ( year - 1900 );
		}
		else
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			year = 0;
		}
		
		//line 34 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		__temp_me3.date = new java.util.Date(year, month, day, hour, min, sec);
	}
	
	
	public static haxe.root.Date now()
	{
		//line 94 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date d = new haxe.root.Date(0, 0, 0, 0, 0, 0);
		//line 95 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		d.date = new java.util.Date();
		//line 96 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		return d;
	}
	
	
	public static haxe.root.Date fromTime(double t)
	{
		//line 101 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		haxe.root.Date d = new haxe.root.Date(0, 0, 0, 0, 0, 0);
		//line 102 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		d.date = new java.util.Date(((long) (t) ));
		//line 103 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		return d;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		return new haxe.root.Date(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		return new haxe.root.Date(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(2))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(3))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(4))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(5))) ));
	}
	
	
	public java.util.Date date;
	
	@Override public java.lang.String toString()
	{
		//line 79 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		int m = ( this.date.getMonth() + 1 );
		//line 80 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		int d = this.date.getDate();
		//line 81 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		int h = this.date.getHours();
		//line 82 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		int mi = this.date.getMinutes();
		//line 83 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		int s = this.date.getSeconds();
		//line 84 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		return ( ( ( ( ( ( ( ( ( ( ( this.date.getYear() + 1900 ) + "-" ) + (( (( m < 10 )) ? (( "0" + m )) : (( "" + m )) )) ) + "-" ) + (( (( d < 10 )) ? (( "0" + d )) : (( "" + d )) )) ) + " " ) + (( (( h < 10 )) ? (( "0" + h )) : (( "" + h )) )) ) + ":" ) + (( (( mi < 10 )) ? (( "0" + mi )) : (( "" + mi )) )) ) + ":" ) + (( (( s < 10 )) ? (( "0" + s )) : (( "" + s )) )) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			switch (field.hashCode())
			{
				case 3076014:
				{
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					if (field.equals("date")) 
					{
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						__temp_executeDef1 = false;
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						this.date = ((java.util.Date) (value) );
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						return value;
					}
					
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					break;
				}
				
				
			}
			
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					if (field.equals("toString")) 
					{
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						__temp_executeDef1 = false;
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					break;
				}
				
				
				case 3076014:
				{
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					if (field.equals("date")) 
					{
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						__temp_executeDef1 = false;
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						return this.date;
					}
					
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					break;
				}
				
				
			}
			
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					if (field.equals("toString")) 
					{
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						__temp_executeDef1 = false;
						//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
						return this.toString();
					}
					
					//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
					break;
				}
				
				
			}
			
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		baseArr.push("date");
		//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
		{
			//line 26 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\Date.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


