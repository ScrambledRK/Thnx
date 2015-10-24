package haxe.at.dotpoint.core;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTool extends haxe.lang.HxObject
{
	public StringTool(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTool()
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		haxe.at.dotpoint.core.StringTool.__hx_ctor_haxe_at_dotpoint_core_StringTool(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_StringTool(haxe.at.dotpoint.core.StringTool __temp_me13)
	{
	}
	
	
	public static java.lang.String dumpObject(java.lang.Object instance)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		if (( instance == null )) 
		{
			//line 20 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			return "null";
		}
		
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		java.lang.String output = "";
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		try 
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			output = ( haxe.root.Type.getClassName(((java.lang.Class) (haxe.root.Type.getClass(instance)) )) + "\n{" );
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			{
				//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				java.lang.Object error = __temp_catchall2;
				//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				output = "Dynamic\n{";
			}
			
		}
		
		
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			int _g = 0;
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(instance);
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
			while (( _g < _g1.length ))
			{
				//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				java.lang.String n = _g1.__get(_g);
				//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				 ++ _g;
				//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
				output += ( ( ( "\n\t." + n ) + " = " ) + haxe.root.Std.string(haxe.root.Reflect.field(instance, n)) );
			}
			
		}
		
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		output += "\n}";
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		return output;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		return new haxe.at.dotpoint.core.StringTool(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\StringTool.hx"
		return new haxe.at.dotpoint.core.StringTool();
	}
	
	
}


