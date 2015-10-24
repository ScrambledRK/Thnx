package haxe.at.dotpoint.core.datastructure;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VectorUtil extends haxe.lang.HxObject
{
	public VectorUtil(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public VectorUtil()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		haxe.at.dotpoint.core.datastructure.VectorUtil.__hx_ctor_haxe_at_dotpoint_core_datastructure_VectorUtil(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_datastructure_VectorUtil(haxe.at.dotpoint.core.datastructure.VectorUtil __temp_me18)
	{
	}
	
	
	public static <T> void sort(T[] a, haxe.lang.Function cmp)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		haxe.org.ds.VectorSort.sort(a, cmp);
	}
	
	
	public static <T> haxe.root.Array<T> toArray(T[] a)
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		haxe.root.Array<T> array = new haxe.root.Array<T>();
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		{
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
			int _g1 = 0;
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
			int _g = ((T[]) (a) ).length;
			//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
			while (( _g1 < _g ))
			{
				//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
				int i = _g1++;
				//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
				array.__set(i, ((T) (((T[]) (a) )[i]) ));
			}
			
		}
		
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		return array;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorUtil(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\VectorUtil.hx"
		return new haxe.at.dotpoint.core.datastructure.VectorUtil();
	}
	
	
}


