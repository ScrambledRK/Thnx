package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringMap_keys_363__Fun<T> extends haxe.lang.Function
{
	public StringMap_keys_363__Fun(int len, int[] i, haxe.ds.StringMap<T> _g1)
	{
		//line 363 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		super(0, 0);
		//line 363 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this.len = len;
		//line 363 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this.i = i;
		//line 363 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		this._g1 = _g1;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 364 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		{
			//line 364 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
			int _g = this.i[0];
			//line 364 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
			while (( _g < this.len ))
			{
				//line 364 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
				int j = _g++;
				//line 366 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
				if ( ! ((( (( this._g1.hashes[j] & -2 )) == 0 ))) ) 
				{
					//line 368 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
					this.i[0] = j;
					//line 369 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 372 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\haxe\\ds\\StringMap.hx"
		return false;
	}
	
	
	public int len;
	
	public int[] i;
	
	public haxe.ds.StringMap<T> _g1;
	
}


