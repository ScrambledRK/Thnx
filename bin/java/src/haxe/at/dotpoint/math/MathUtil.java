package haxe.at.dotpoint.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MathUtil extends haxe.lang.HxObject
{
	static
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.ZERO_TOLERANCE = 1e-08;
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.RAD_DEG = 57.29577951308232;
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.DEG_RAD = 0.017453292519943295;
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.FLOAT_MAX = 3.4028234663852886e+37;
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.FLOAT_MIN = -3.4028234663852886e+37;
	}
	
	public MathUtil(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public MathUtil()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		haxe.at.dotpoint.math.MathUtil.__hx_ctor_haxe_at_dotpoint_math_MathUtil(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_MathUtil(haxe.at.dotpoint.math.MathUtil __temp_me65)
	{
	}
	
	
	public static double ZERO_TOLERANCE;
	
	public static double RAD_DEG;
	
	public static double DEG_RAD;
	
	public static double FLOAT_MAX;
	
	public static double FLOAT_MIN;
	
	public static boolean isEqual(double a, double b)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		if (( a > b )) 
		{
			//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
			return ( ( a - b ) < 1e-08 );
		}
		else
		{
			//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
			return ( ( b - a ) < 1e-08 );
		}
		
	}
	
	
	public static double getRadianAngle(double x1, double y1, double x2, double y2)
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		double dx = ( x2 - x1 );
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		double dy = ( y2 - y1 );
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		return java.lang.Math.atan2(dy, dx);
	}
	
	
	public static int getSign(double value)
	{
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		if (( value < 0 )) 
		{
			//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
			return -1;
		}
		
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		if (( value > 0 )) 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
			return 1;
		}
		
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		return 0;
	}
	
	
	public static double tanh(double value)
	{
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		double EX1 = java.lang.Math.exp(value);
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		double EX2 = java.lang.Math.exp( - (value) );
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		return ( (( EX1 - EX2 )) / (( EX1 + EX2 )) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		return new haxe.at.dotpoint.math.MathUtil(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\MathUtil.hx"
		return new haxe.at.dotpoint.math.MathUtil();
	}
	
	
}


