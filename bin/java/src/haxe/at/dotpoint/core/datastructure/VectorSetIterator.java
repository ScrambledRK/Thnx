package haxe.at.dotpoint.core.datastructure;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VectorSetIterator<T> extends haxe.lang.HxObject
{
	public VectorSetIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public VectorSetIterator(haxe.at.dotpoint.core.datastructure.VectorSet<T> set)
	{
		//line 264 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		haxe.at.dotpoint.core.datastructure.VectorSetIterator.__hx_ctor_haxe_at_dotpoint_core_datastructure_VectorSetIterator(this, set);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_at_dotpoint_core_datastructure_VectorSetIterator(haxe.at.dotpoint.core.datastructure.VectorSetIterator<T_c> __temp_me17, haxe.at.dotpoint.core.datastructure.VectorSet<T_c> set)
	{
		//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me17.set = set;
		//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		__temp_me17.count = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorSetIterator<java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorSetIterator<java.lang.Object>(((haxe.at.dotpoint.core.datastructure.VectorSet<java.lang.Object>) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.core.datastructure.VectorSet<T> set;
	
	public int count;
	
	public boolean hasNext()
	{
		//line 283 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		return ( this.count < this.set.size() );
	}
	
	
	public T next()
	{
		//line 294 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 294 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			int index = this.count++;
			//line 294 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			return ((T[]) (this.set.list) )[index];
		}
		
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 94851343:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("count")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.count = ((int) (value) );
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 94851343:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("count")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.count = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("set")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						this.set = ((haxe.at.dotpoint.core.datastructure.VectorSet<T>) (value) );
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return value;
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("next")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("set")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.set;
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("hasNext")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 94851343:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("count")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.count;
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 94851343:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("count")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return ((double) (this.count) );
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			boolean __temp_executeDef1 = true;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("next")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.next();
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					if (field.equals("hasNext")) 
					{
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						__temp_executeDef1 = false;
						//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
						return this.hasNext();
					}
					
					//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
					break;
				}
				
				
			}
			
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			if (__temp_executeDef1) 
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("count");
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		baseArr.push("set");
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorSet.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


