package haxe.at.dotpoint.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AxisRelative extends haxe.lang.HxObject
{
	static
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.CENTER = new haxe.at.dotpoint.math.vector.Vector3(0.5, 0.5, 0.5, null);
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP = new haxe.at.dotpoint.math.vector.Vector3(0.5, 0.0, 0.5, null);
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.LEFT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.5, 0.5, null);
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.RIGHT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 0.5, 0.5, null);
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM = new haxe.at.dotpoint.math.vector.Vector3(0.5, 1.0, 0.5, null);
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_LEFT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.0, 0.5, null);
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_RIGHT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 0.0, 0.5, null);
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_LEFT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 1.0, 0.5, null);
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_RIGHT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 1.0, 0.5, null);
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_LEFT_FRONT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.0, 0.0, null);
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_LEFT_BACK = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.0, 1.0, null);
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_RIGHT_FRONT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 0.0, 0.0, null);
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.TOP_RIGHT_BACK = new haxe.at.dotpoint.math.vector.Vector3(1.0, 0.0, 1.0, null);
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_LEFT_FRONT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 1.0, 0.0, null);
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_LEFT_BACK = new haxe.at.dotpoint.math.vector.Vector3(0.0, 1.0, 1.0, null);
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_RIGHT_FRONT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 1.0, 0.0, null);
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.BOTTOM_RIGHT_BACK = new haxe.at.dotpoint.math.vector.Vector3(1.0, 1.0, 1.0, null);
	}
	
	public AxisRelative(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public AxisRelative()
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisRelative.__hx_ctor_haxe_at_dotpoint_math_AxisRelative(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_AxisRelative(haxe.at.dotpoint.math.AxisRelative __temp_me63)
	{
	}
	
	
	public static haxe.at.dotpoint.math.vector.Vector3 CENTER;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP;
	
	public static haxe.at.dotpoint.math.vector.Vector3 LEFT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 RIGHT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_LEFT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_RIGHT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_LEFT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_RIGHT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_LEFT_FRONT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_LEFT_BACK;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_RIGHT_FRONT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 TOP_RIGHT_BACK;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_LEFT_FRONT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_LEFT_BACK;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_RIGHT_FRONT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BOTTOM_RIGHT_BACK;
	
	public static haxe.at.dotpoint.math.vector.Vector3 getRelative(haxe.at.dotpoint.math.AxisDirection direction)
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		throw haxe.lang.HaxeException.wrap("not implemented");
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		return new haxe.at.dotpoint.math.AxisRelative(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		return new haxe.at.dotpoint.math.AxisRelative();
	}
	
	
}


