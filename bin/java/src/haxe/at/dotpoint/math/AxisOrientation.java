package haxe.at.dotpoint.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AxisOrientation extends haxe.lang.HxObject
{
	static
	{
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.UP = new haxe.at.dotpoint.math.vector.Vector3(0.0, 1.0, 0.0, null);
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.RIGHT = new haxe.at.dotpoint.math.vector.Vector3(1.0, 0.0, 0.0, null);
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.FRONT = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.0, 1.0, null);
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.DOWN = new haxe.at.dotpoint.math.vector.Vector3(0.0, -1.0, 0.0, null);
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.LEFT = new haxe.at.dotpoint.math.vector.Vector3(-1.0, 0.0, 0.0, null);
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.BACK = new haxe.at.dotpoint.math.vector.Vector3(0.0, 0.0, -1.0, null);
	}
	
	public AxisOrientation(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public AxisOrientation()
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		haxe.at.dotpoint.math.AxisOrientation.__hx_ctor_haxe_at_dotpoint_math_AxisOrientation(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_AxisOrientation(haxe.at.dotpoint.math.AxisOrientation __temp_me64)
	{
	}
	
	
	public static haxe.at.dotpoint.math.vector.Vector3 UP;
	
	public static haxe.at.dotpoint.math.vector.Vector3 RIGHT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 FRONT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 DOWN;
	
	public static haxe.at.dotpoint.math.vector.Vector3 LEFT;
	
	public static haxe.at.dotpoint.math.vector.Vector3 BACK;
	
	public static haxe.at.dotpoint.math.vector.Vector3 getOrientation(haxe.at.dotpoint.math.AxisDirection direction)
	{
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		switch (direction)
		{
			case LEFT:
			{
				//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.LEFT;
			}
			
			
			case RIGHT:
			{
				//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.RIGHT;
			}
			
			
			case UP:
			{
				//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.UP;
			}
			
			
			case DOWN:
			{
				//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.DOWN;
			}
			
			
			case FRONT:
			{
				//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.FRONT;
			}
			
			
			case BACK:
			{
				//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
				return haxe.at.dotpoint.math.AxisOrientation.BACK;
			}
			
			
		}
		
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		return null;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		return new haxe.at.dotpoint.math.AxisOrientation(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Axis.hx"
		return new haxe.at.dotpoint.math.AxisOrientation();
	}
	
	
}


