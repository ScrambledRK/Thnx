package sys.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class File extends haxe.lang.HxObject
{
	public File(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public File()
	{
		//line 25 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		sys.io.File.__hx_ctor_sys_io_File(this);
	}
	
	
	public static void __hx_ctor_sys_io_File(sys.io.File __temp_me160)
	{
	}
	
	
	public static sys.io.FileInput read(java.lang.String path, java.lang.Object binary)
	{
		//line 59 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		boolean __temp_binary159 = ( (haxe.lang.Runtime.eq(binary, null)) ? (true) : (haxe.lang.Runtime.toBool(binary)) );
		//line 61 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		try 
		{
			//line 61 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			return new sys.io.FileInput(((java.io.RandomAccessFile) (new java.io.RandomAccessFile(((java.io.File) (new java.io.File(haxe.lang.Runtime.toString(path))) ), haxe.lang.Runtime.toString("r"))) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 61 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
			{
				//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				java.lang.Object e = __temp_catchall2;
				//line 65 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return new sys.io.File(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\io\\File.hx"
		return new sys.io.File();
	}
	
	
}


