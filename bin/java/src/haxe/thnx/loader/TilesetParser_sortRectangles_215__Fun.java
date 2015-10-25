package haxe.thnx.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TilesetParser_sortRectangles_215__Fun extends haxe.lang.Function
{
	public TilesetParser_sortRectangles_215__Fun(haxe.at.dotpoint.math.vector.Vector2 center)
	{
		//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		super(2, 1);
		//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.center = center;
	}
	
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.geom.Rectangle brect = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.at.dotpoint.math.geom.Rectangle) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.at.dotpoint.math.geom.Rectangle) (__fn_dyn2) )) );
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.geom.Rectangle arect = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((haxe.at.dotpoint.math.geom.Rectangle) (((java.lang.Object) (__fn_float1) )) )) : (((haxe.at.dotpoint.math.geom.Rectangle) (__fn_dyn1) )) );
		//line 217 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 a1 = ((haxe.at.dotpoint.math.vector.Vector2) (arect.getPoint(this.center, null)) );
		//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 b1 = ((haxe.at.dotpoint.math.vector.Vector2) (brect.getPoint(this.center, null)) );
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return ((double) (((int) (java.lang.Math.round(( a1.get_x() - b1.get_x() ))) )) );
	}
	
	
	public haxe.at.dotpoint.math.vector.Vector2 center;
	
}


