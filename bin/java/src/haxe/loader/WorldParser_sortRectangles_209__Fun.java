package haxe.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WorldParser_sortRectangles_209__Fun extends haxe.lang.Function
{
	public WorldParser_sortRectangles_209__Fun(haxe.at.dotpoint.math.vector.Vector2 center)
	{
		//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		super(2, 1);
		//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		this.center = center;
	}
	
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> blist = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (__fn_dyn2) )) );
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> alist = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (__fn_dyn1) )) );
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 a = ((haxe.at.dotpoint.math.vector.Vector2) (alist.__get(0).getPoint(this.center, null)) );
		//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 b = ((haxe.at.dotpoint.math.vector.Vector2) (blist.__get(0).getPoint(this.center, null)) );
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldParser.hx"
		return ((double) (((int) (java.lang.Math.round(( a.get_y() - b.get_y() ))) )) );
	}
	
	
	public haxe.at.dotpoint.math.vector.Vector2 center;
	
}


