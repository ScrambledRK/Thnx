package haxe.thnx.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TilesetParser_sortRectangles_206__Fun extends haxe.lang.Function
{
	public TilesetParser_sortRectangles_206__Fun(haxe.at.dotpoint.math.vector.Vector2 center)
	{
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		super(2, 1);
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.center = center;
	}
	
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> blist = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (__fn_dyn2) )) );
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> alist = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>) (__fn_dyn1) )) );
		//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 a = ((haxe.at.dotpoint.math.vector.Vector2) (alist.__get(0).getPoint(this.center, null)) );
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 b = ((haxe.at.dotpoint.math.vector.Vector2) (blist.__get(0).getPoint(this.center, null)) );
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return ((double) (((int) (java.lang.Math.round(( a.get_y() - b.get_y() ))) )) );
	}
	
	
	public haxe.at.dotpoint.math.vector.Vector2 center;
	
}


