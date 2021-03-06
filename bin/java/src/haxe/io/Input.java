package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Input extends haxe.lang.HxObject
{
	public Input(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Input()
	{
		//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Input(haxe.io.Input __temp_me110)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		return new haxe.io.Input(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		return new haxe.io.Input();
	}
	
	
	public int readByte()
	{
		//line 50 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 62 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		int k = len;
		//line 63 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		byte[] b = s.b;
		//line 64 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 65 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		//line 66 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		while (( k > 0 ))
		{
			//line 74 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			b[pos] = ((byte) (this.readByte()) );
			//line 76 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			pos++;
			//line 77 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			k--;
		}
		
		//line 79 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		return len;
	}
	
	
	public haxe.io.Bytes read(int nbytes)
	{
		//line 142 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		haxe.io.Bytes s = haxe.io.Bytes.alloc(nbytes);
		//line 143 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		int p = 0;
		//line 144 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		while (( nbytes > 0 ))
		{
			//line 145 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			int k = this.readBytes(s, p, nbytes);
			//line 146 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			if (( k == 0 )) 
			{
				//line 146 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			//line 147 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			p += k;
			//line 148 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			nbytes -= k;
		}
		
		//line 150 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		return s;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		{
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			switch (field.hashCode())
			{
				case 3496342:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("read")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "read")) );
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
		{
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			switch (field.hashCode())
			{
				case 3496342:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("read")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return this.read(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readByte")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return this.readByte();
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
				case -1140063115:
				{
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					if (field.equals("readBytes")) 
					{
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						__temp_executeDef1 = false;
						//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
					break;
				}
				
				
			}
			
			//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\io\\Input.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


