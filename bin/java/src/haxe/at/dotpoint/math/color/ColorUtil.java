package haxe.at.dotpoint.math.color;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ColorUtil extends haxe.lang.HxObject
{
	public ColorUtil(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ColorUtil()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		haxe.at.dotpoint.math.color.ColorUtil.__hx_ctor_haxe_at_dotpoint_math_color_ColorUtil(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_color_ColorUtil(haxe.at.dotpoint.math.color.ColorUtil __temp_me69)
	{
	}
	
	
	public static int getRandomColorInt()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		haxe.at.dotpoint.math.vector.Vector3 vector = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			double value = ((double) (((int) (java.lang.Math.floor(( java.lang.Math.random() * 255 ))) )) );
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			vector.x = value;
		}
		
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			double value1 = ((double) (((int) (java.lang.Math.floor(( java.lang.Math.random() * 255 ))) )) );
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			vector.y = value1;
		}
		
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		{
			//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			double value2 = ((double) (((int) (java.lang.Math.floor(( java.lang.Math.random() * 255 ))) )) );
			//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			vector.z = value2;
		}
		
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return haxe.at.dotpoint.math.color.ColorUtil.toInt(vector, haxe.at.dotpoint.math.color.ColorFormat.RGB);
	}
	
	
	public static haxe.at.dotpoint.math.vector.Vector3 toVector(int value, haxe.at.dotpoint.math.color.ColorFormat format, haxe.at.dotpoint.math.vector.Vector3 output)
	{
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		if (( format == null )) 
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			format = haxe.at.dotpoint.math.color.ColorFormat.RGBA;
		}
		
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		if (( output == null )) 
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			output = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		}
		
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		double a = ( ((double) ((( ( value >> 24 ) & 255 ))) ) / 255 );
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		double r = ( ((double) ((( ( value >> 16 ) & 255 ))) ) / 255 );
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		double g = ( ((double) ((( ( value >> 8 ) & 255 ))) ) / 255 );
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		double b = ( ((double) ((( value & 255 ))) ) / 255 );
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		if (( format != null )) 
		{
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			switch (format)
			{
				case ARGB:
				{
					//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.x = a;
					//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.y = r;
					//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.z = g;
					//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.w = b;
					//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					break;
				}
				
				
				case RGBA:
				{
					//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.x = r;
					//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.y = g;
					//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.z = b;
					//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.w = a;
					//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					break;
				}
				
				
				case RGB:
				{
					//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.x = r;
					//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.y = g;
					//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					output.z = b;
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return output;
	}
	
	
	public static int toInt(haxe.at.dotpoint.math.vector.Vector3 value, haxe.at.dotpoint.math.color.ColorFormat format)
	{
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		if (( format == null )) 
		{
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			format = haxe.at.dotpoint.math.color.ColorFormat.RGBA;
		}
		
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		int x = ((int) (( value.x * 255 )) );
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		int y = ((int) (( value.y * 255 )) );
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		int z = ((int) (( value.z * 255 )) );
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		int w = ((int) (( value.w * 255 )) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		if (( format != null )) 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
			switch (format)
			{
				case ARGB:
				{
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					return ( ( ( ( x << 24 ) | ( y << 16 ) ) | ( z << 8 ) ) | w );
				}
				
				
				case RGBA:
				{
					//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					return ( ( ( ( w << 24 ) | ( x << 16 ) ) | ( y << 8 ) ) | z );
				}
				
				
				case RGB:
				{
					//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
					return ( ( ( x << 16 ) | ( y << 8 ) ) | z );
				}
				
				
			}
			
		}
		
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return -1;
	}
	
	
	public static java.lang.String toString(int value, java.lang.Object alpha)
	{
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		boolean __temp_alpha68 = ( (haxe.lang.Runtime.eq(alpha, null)) ? (true) : (haxe.lang.Runtime.toBool(alpha)) );
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return haxe.root.StringTools.hex(value, ( (__temp_alpha68) ? (8) : (6) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return new haxe.at.dotpoint.math.color.ColorUtil(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\color\\ColorUtil.hx"
		return new haxe.at.dotpoint.math.color.ColorUtil();
	}
	
	
}


