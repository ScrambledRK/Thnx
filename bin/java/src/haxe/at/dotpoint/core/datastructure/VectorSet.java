package haxe.at.dotpoint.core.datastructure;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VectorSet<T> extends haxe.lang.HxObject implements haxe.at.dotpoint.core.datastructure.ICollection<T>
{
	public VectorSet(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public VectorSet(java.lang.Object size, java.lang.Object autoResize)
	{
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		haxe.at.dotpoint.core.datastructure.VectorSet.__hx_ctor_haxe_at_dotpoint_core_datastructure_VectorSet(this, size, autoResize);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_at_dotpoint_core_datastructure_VectorSet(haxe.at.dotpoint.core.datastructure.VectorSet<T_c> __temp_me16, java.lang.Object size, java.lang.Object autoResize)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		boolean __temp_autoResize15 = ( (haxe.lang.Runtime.eq(autoResize, null)) ? (true) : (haxe.lang.Runtime.toBool(autoResize)) );
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		int __temp_size14 = ( (haxe.lang.Runtime.eq(size, null)) ? (1) : (((int) (haxe.lang.Runtime.toInt(size)) )) );
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me16.list = ((T_c[]) (((T_c[]) (((java.lang.Object) (new java.lang.Object[__temp_size14]) )) )) );
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me16.maxEntries = __temp_size14;
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me16.numEntries = 0;
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me16.autoResize = __temp_autoResize15;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorSet<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorSet<java.lang.Object>(arr.__get(0), arr.__get(1));
	}
	
	
	public T[] list;
	
	public int numEntries;
	
	public int maxEntries;
	
	public boolean autoResize;
	
	public boolean has(T obj)
	{
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return ( this.indexOf(obj) != -1 );
	}
	
	
	public boolean add(T obj)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( ( obj == null ) || this.has(obj) )) 
		{
			//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return false;
		}
		
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.checkSize(( this.numEntries + 1 ));
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		((T[]) (this.list) )[this.numEntries] = obj;
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.numEntries++;
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.sortList();
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return true;
	}
	
	
	public boolean remove(T obj)
	{
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		int index = this.indexOf(obj);
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( ( obj == null ) || ( index == -1 ) )) 
		{
			//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return false;
		}
		
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		((T[]) (this.list) )[index] = null;
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.numEntries--;
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.sortList();
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return true;
	}
	
	
	public T get(int index)
	{
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( ( index < 0 ) || ( index > this.numEntries ) )) 
		{
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return null;
		}
		
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return ((T) (((T[]) (this.list) )[index]) );
	}
	
	
	public void set(int index, T obj)
	{
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( index < 0 )) 
		{
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			throw haxe.lang.HaxeException.wrap("can\'t set below zero");
		}
		
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( index > ( this.numEntries + 1 ) )) 
		{
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			throw haxe.lang.HaxeException.wrap("can\'t have null-gaps");
		}
		
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		this.checkSize(index);
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		((T[]) (this.list) )[index] = obj;
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( index == ( this.numEntries + 1 ) )) 
		{
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			this.numEntries++;
		}
		
	}
	
	
	public int size()
	{
		//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return this.numEntries;
	}
	
	
	public haxe.root.Array<T> toArray()
	{
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		haxe.root.Array<T> array = new haxe.root.Array<T>();
		//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			int _g1 = 0;
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			int _g = this.numEntries;
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			while (( _g1 < _g ))
			{
				//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				int j = _g1++;
				//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				array.push(((T) (((T[]) (this.list) )[j]) ));
			}
			
		}
		
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return array;
	}
	
	
	public java.lang.Object iterator()
	{
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorSetIterator<T>(((haxe.at.dotpoint.core.datastructure.VectorSet<T>) (this) ));
	}
	
	
	public int indexOf(T obj)
	{
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			int _g1 = 0;
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			int _g = this.numEntries;
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			while (( _g1 < _g ))
			{
				//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				int i = _g1++;
				//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				if (haxe.lang.Runtime.eq(((T) (((T[]) (this.list) )[i]) ), obj)) 
				{
					//line 192 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					return i;
				}
				
			}
			
		}
		
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return -1;
	}
	
	
	public void sortList()
	{
		//line 204 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		haxe.at.dotpoint.core.datastructure.VectorUtil.sort(this.list, ((haxe.lang.Function) (new haxe.lang.Closure(this, "sort")) ));
	}
	
	
	public int sort(T x, T y)
	{
		//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( ! (( x == null )) )) 
		{
			//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return -1;
		}
		
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (( ! (( y == null )) )) 
		{
			//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return 1;
		}
		
		//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return 0;
	}
	
	
	public void checkSize(int size)
	{
		//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		boolean requires = ( size > this.maxEntries );
		//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		if (requires) 
		{
			//line 235 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if ( ! (this.autoResize) ) 
			{
				//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw haxe.lang.HaxeException.wrap("out of bounds");
			}
			
			//line 238 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			T[] nList = ((T[]) (((T[]) (((java.lang.Object) (new java.lang.Object[size]) )) )) );
			//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			java.lang.System.arraycopy(((java.lang.Object) (this.list) ), ((int) (0) ), ((java.lang.Object) (nList) ), ((int) (0) ), ((int) (((T[]) (this.list) ).length) ));
			//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			this.list = nList;
			//line 242 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			this.maxEntries = size;
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case -417636724:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("maxEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.maxEntries = ((int) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -99578326:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("numEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.numEntries = ((int) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case -425121981:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("autoResize")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.autoResize = haxe.lang.Runtime.toBool(value);
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3322014:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("list")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.list = ((T[]) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -417636724:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("maxEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.maxEntries = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -99578326:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("numEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.numEntries = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 398554409:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("checkSize")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "checkSize")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3322014:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("list")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.list;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3536286:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("sort")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sort")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -99578326:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("numEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.numEntries;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1661606748:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("sortList")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sortList")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -417636724:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("maxEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.maxEntries;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1943291465:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("indexOf")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "indexOf")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -425121981:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("autoResize")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.autoResize;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("iterator")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "iterator")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 103066:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("has")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "has")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("toArray")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toArray")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("add")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("size")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "size")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("remove")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remove")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("set")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("get")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case -417636724:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("maxEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((double) (this.maxEntries) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -99578326:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("numEntries")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((double) (this.numEntries) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 398554409:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("checkSize")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.checkSize(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 103066:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("has")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.has(((T) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3536286:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("sort")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.sort(((T) (dynargs.__get(0)) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("add")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.add(((T) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1661606748:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("sortList")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.sortList();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -934610812:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("remove")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.remove(((T) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1943291465:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("indexOf")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.indexOf(((T) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 102230:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("get")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.get(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 1182533742:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("iterator")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.iterator();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("set")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.set(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((T) (dynargs.__get(1)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("toArray")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.toArray();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 3530753:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("size")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.size();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("autoResize");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("maxEntries");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("numEntries");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("list");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


