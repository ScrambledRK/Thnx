package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CallStack extends haxe.lang.HxObject
{
	public CallStack(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CallStack()
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		haxe.CallStack.__hx_ctor_haxe_CallStack(this);
	}
	
	
	public static void __hx_ctor_haxe_CallStack(haxe.CallStack __temp_me10)
	{
	}
	
	
	public static haxe.root.Array<haxe.StackItem> callStack()
	{
		//line 101 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		haxe.root.Array<haxe.StackItem> stack = new haxe.root.Array<haxe.StackItem>(new haxe.StackItem[]{});
		//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		{
			//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
			int _g = 0;
			//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
			java.lang.StackTraceElement[] _g1 = java.lang.Thread.currentThread().getStackTrace();
			//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
			while (( _g < _g1.length ))
			{
				//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				java.lang.StackTraceElement el = _g1[_g];
				//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				 ++ _g;
				//line 103 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				java.lang.String className = el.getClassName();
				//line 104 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				java.lang.String methodName = el.getMethodName();
				//line 105 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				java.lang.String fileName = el.getFileName();
				//line 106 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				int lineNumber = el.getLineNumber();
				//line 107 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				haxe.StackItem method = haxe.StackItem.Method(className, methodName);
				//line 108 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
				if (( ( fileName != null ) || ( lineNumber >= 0 ) )) 
				{
					//line 109 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
					stack.push(haxe.StackItem.FilePos(method, fileName, lineNumber));
				}
				else
				{
					//line 112 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
					stack.push(method);
				}
				
			}
			
		}
		
		//line 115 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		stack.shift();
		//line 116 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		stack.shift();
		//line 117 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		stack.pop();
		//line 118 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		return stack;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.CallStack(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.CallStack();
	}
	
	
}


