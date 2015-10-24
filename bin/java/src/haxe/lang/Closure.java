package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Closure extends haxe.lang.VarArgsBase
{
	public Closure(java.lang.Object obj, java.lang.String field)
	{
		//line 71 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		super(-1, -1);
		//line 72 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		this.obj = obj;
		//line 73 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		this.field = field;
	}
	
	
	public java.lang.Object obj;
	
	public java.lang.String field;
	
	@Override public java.lang.Object __hx_invokeDynamic(haxe.root.Array dynArgs)
	{
		//line 78 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		return haxe.lang.Runtime.callField(this.obj, this.field, dynArgs);
	}
	
	
	@Override public boolean equals(java.lang.Object obj)
	{
		//line 83 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		if (( obj == null )) 
		{
			//line 84 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
			return false;
		}
		
		//line 86 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		haxe.lang.Closure c = ((haxe.lang.Closure) (obj) );
		//line 87 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		return ( haxe.lang.Runtime.eq(c.obj, this.obj) && haxe.lang.Runtime.valEq(c.field, this.field) );
	}
	
	
	@Override public int hashCode()
	{
		//line 92 "C:\\Apps\\Haxe\\haxe\\std\\java\\internal\\Function.hx"
		return ( ((int) (haxe.lang.Runtime.toInt(this.obj.hashCode())) ) ^ ((int) (this.field.hashCode()) ) );
	}
	
	
}


