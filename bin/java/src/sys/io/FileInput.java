package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileInput extends haxe.io.Input
{
	public FileInput(haxe.lang.EmptyObject empty)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public FileInput(java.io.RandomAccessFile f)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		sys.io.FileInput.__hx_ctor_sys_io_FileInput(this, f);
	}
	
	
	public static void __hx_ctor_sys_io_FileInput(sys.io.FileInput __temp_me161, java.io.RandomAccessFile f)
	{
		//line 35 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		__temp_me161.f = f;
		//line 36 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		__temp_me161._eof = false;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		return new sys.io.FileInput(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		return new sys.io.FileInput(((java.io.RandomAccessFile) (arr.__get(0)) ));
	}
	
	
	public java.io.RandomAccessFile f;
	
	public boolean _eof;
	
	public void close()
	{
		//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		try 
		{
			//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			this.f.close();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			{
				//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				java.lang.Object e = __temp_catchall2;
				//line 41 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	@Override public int readByte()
	{
		//line 48 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		try 
		{
			//line 48 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			return this.f.readUnsignedByte();
		}
		catch (java.io.EOFException e)
		{
			//line 51 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 52 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			this._eof = true;
			//line 53 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 57 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 57 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
	}
	
	
	@Override public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 63 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		int ret = 0;
		//line 66 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		try 
		{
			//line 66 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			ret = this.f.read(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
		}
		catch (java.io.EOFException e)
		{
			//line 69 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 70 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			this._eof = true;
			//line 71 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 75 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 75 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
		//line 78 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		if (( ret == -1 )) 
		{
			//line 79 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			this._eof = true;
			//line 80 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 83 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		return ret;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			switch (field.hashCode())
			{
				case 2930749:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("_eof")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						this._eof = haxe.lang.Runtime.toBool(value);
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case 102:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("f")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						this.f = ((java.io.RandomAccessFile) (value) );
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case 102:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("f")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return this.f;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("readByte")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case 2930749:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("_eof")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return this._eof;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("close")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			int __temp_hash2 = field.hashCode();
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			switch (__temp_hash2)
			{
				case -1140063115:
				case -868060226:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (( (( ( __temp_hash2 == -1140063115 ) && field.equals("readBytes") )) || field.equals("readByte") )) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					if (field.equals("close")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
						this.close();
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		baseArr.push("_eof");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		baseArr.push("f");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\FileInput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


