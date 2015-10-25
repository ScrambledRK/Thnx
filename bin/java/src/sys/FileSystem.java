package sys;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class FileSystem extends haxe.lang.HxObject
{
	public FileSystem(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public FileSystem()
	{
		//line 27 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		sys.FileSystem.__hx_ctor_sys_FileSystem(this);
	}
	
	
	public static void __hx_ctor_sys_FileSystem(sys.FileSystem __temp_me155)
	{
	}
	
	
	public static java.lang.Object stat(java.lang.String path)
	{
		//line 44 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		java.io.File f = new java.io.File(haxe.lang.Runtime.toString(path));
		//line 45 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		if ( ! (f.exists()) ) 
		{
			//line 46 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			throw haxe.lang.HaxeException.wrap(( ( "Path " + path ) + " doesn\'t exist" ));
		}
		
		//line 47 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		{
			//line 50 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			haxe.root.Date __temp_odecl1 = haxe.root.Date.now();
			//line 51 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			haxe.root.Date __temp_odecl2 = haxe.root.Date.fromTime(((double) (haxe.lang.Runtime.toDouble(f.lastModified())) ));
			//line 52 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			haxe.root.Date __temp_odecl3 = haxe.root.Date.fromTime(((double) (haxe.lang.Runtime.toDouble(f.lastModified())) ));
			//line 53 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			int __temp_odecl4 = ((int) (haxe.lang.Runtime.toInt(f.length())) );
			//line 47 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
			return new haxe.lang.DynamicObject(new java.lang.String[]{"atime", "ctime", "mtime"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl3, __temp_odecl2}, new java.lang.String[]{"dev", "gid", "ino", "mode", "nlink", "rdev", "size", "uid"}, new double[]{((double) (((double) (0) )) ), ((double) (((double) (0) )) ), ((double) (((double) (0) )) ), ((double) (((double) (0) )) ), ((double) (((double) (0) )) ), ((double) (((double) (0) )) ), ((double) (((double) (__temp_odecl4) )) ), ((double) (((double) (0) )) )});
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 27 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		return new sys.FileSystem(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 27 "C:\\Apps\\Haxe\\haxe\\std\\java\\_std\\sys\\FileSystem.hx"
		return new sys.FileSystem();
	}
	
	
}


