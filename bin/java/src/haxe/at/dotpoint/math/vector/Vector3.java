package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Vector3 extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IVector3
{
	public Vector3(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Vector3(java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.at.dotpoint.math.vector.Vector3.__hx_ctor_haxe_at_dotpoint_math_vector_Vector3(this, x, y, z, w);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_vector_Vector3(haxe.at.dotpoint.math.vector.Vector3 __temp_me62, java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double __temp_w61 = ( (haxe.lang.Runtime.eq(w, null)) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(w)) )) );
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double __temp_z60 = ( (haxe.lang.Runtime.eq(z, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(z)) )) );
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double __temp_y59 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double __temp_x58 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		__temp_me62.x = __temp_x58;
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		__temp_me62.y = __temp_y59;
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		__temp_me62.z = __temp_z60;
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		__temp_me62.w = __temp_w61;
	}
	
	
	public static <T> T add(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b, java.lang.Object output)
	{
		//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() + b.get_x() )}));
		//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() + b.get_y() )}));
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() + b.get_z() )}));
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T subtract(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b, java.lang.Object output)
	{
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() - b.get_x() )}));
		//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() - b.get_y() )}));
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() - b.get_z() )}));
		//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T scale(haxe.at.dotpoint.math.vector.IVector3 a, double scalar, java.lang.Object output)
	{
		//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() * scalar )}));
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() * scalar )}));
		//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() * scalar )}));
		//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T cross(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b, java.lang.Object output)
	{
		//line 248 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 249 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		else
		{
			//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (haxe.lang.Runtime.eq(output, a)) 
			{
				//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				a = new haxe.at.dotpoint.math.vector.Vector3(a.get_x(), a.get_y(), a.get_z(), a.get_w());
			}
			else
			{
				//line 252 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				if (haxe.lang.Runtime.eq(output, b)) 
				{
					//line 252 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					b = new haxe.at.dotpoint.math.vector.Vector3(b.get_x(), b.get_y(), b.get_z(), b.get_w());
				}
				
			}
			
		}
		
		//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( a.get_y() * b.get_z() ) - ( a.get_z() * b.get_y() ) )}));
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( a.get_z() * b.get_x() ) - ( a.get_x() * b.get_z() ) )}));
		//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( a.get_x() * b.get_y() ) - ( a.get_y() * b.get_x() ) )}));
		//line 258 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public static double dot(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b)
	{
		//line 270 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ( ( ( a.get_x() * b.get_x() ) + ( a.get_y() * b.get_y() ) ) + ( a.get_z() * b.get_z() ) );
	}
	
	
	public static <T> T multiplyMatrix(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IMatrix44 b, java.lang.Object output)
	{
		//line 287 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 288 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 290 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( ( ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) * ((double) (a.get_x()) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) * ((double) (a.get_y()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) * ((double) (a.get_z()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) * ((double) (a.get_w()) ) ) )}));
		//line 291 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( ( ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) * ((double) (a.get_x()) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) * ((double) (a.get_y()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) * ((double) (a.get_z()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) * ((double) (a.get_w()) ) ) )}));
		//line 292 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( ( ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) * ((double) (a.get_x()) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) * ((double) (a.get_y()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) * ((double) (a.get_z()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) * ((double) (a.get_w()) ) ) )}));
		//line 293 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( ( ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) * ((double) (a.get_x()) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) * ((double) (a.get_y()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) * ((double) (a.get_z()) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) * ((double) (a.get_w()) ) ) )}));
		//line 295 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public static boolean isEqual(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b)
	{
		//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		boolean __temp_stmt1 = false;
		//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double a1 = a.get_x();
			//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double b1 = b.get_x();
			//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			__temp_stmt1 = ( (( a1 > b1 )) ? (( ( a1 - b1 ) < 1e-08 )) : (( ( b1 - a1 ) < 1e-08 )) );
		}
		
		//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			return false;
		}
		
		//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		boolean __temp_stmt2 = false;
		//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double a2 = a.get_y();
			//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double b2 = b.get_y();
			//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			__temp_stmt2 = ( (( a2 > b2 )) ? (( ( a2 - b2 ) < 1e-08 )) : (( ( b2 - a2 ) < 1e-08 )) );
		}
		
		//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if ( ! (__temp_stmt2) ) 
		{
			//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			return false;
		}
		
		//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		boolean __temp_stmt3 = false;
		//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double a3 = a.get_z();
			//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double b3 = b.get_z();
			//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			__temp_stmt3 = ( (( a3 > b3 )) ? (( ( a3 - b3 ) < 1e-08 )) : (( ( b3 - a3 ) < 1e-08 )) );
		}
		
		//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if ( ! (__temp_stmt3) ) 
		{
			//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			return false;
		}
		
		//line 323 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return new haxe.at.dotpoint.math.vector.Vector3(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return new haxe.at.dotpoint.math.vector.Vector3(arr.__get(0), arr.__get(1), arr.__get(2), arr.__get(3));
	}
	
	
	public double x;
	
	public double y;
	
	public double z;
	
	public double w;
	
	public <T> T clone(java.lang.Object output)
	{
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( output == null )) 
		{
			//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{this.x}));
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{this.y}));
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{this.z}));
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{this.w}));
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ((T) (output) );
	}
	
	
	public final double get_x()
	{
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.x;
	}
	
	
	public final double set_x(double value)
	{
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.x = value;
	}
	
	
	public final double get_y()
	{
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.y;
	}
	
	
	public final double set_y(double value)
	{
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.y = value;
	}
	
	
	public final double get_z()
	{
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.z;
	}
	
	
	public final double set_z(double value)
	{
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.z = value;
	}
	
	
	public final double get_w()
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.w;
	}
	
	
	public final double set_w(double value)
	{
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return this.w = value;
	}
	
	
	public void set(double x, double y, double z, java.lang.Object w)
	{
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		this.x = x;
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		this.y = y;
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		this.z = z;
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( ! (haxe.lang.Runtime.eq(w, null)) )) 
		{
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(w)) );
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			this.w = value;
		}
		
	}
	
	
	public void normalize()
	{
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double l = java.lang.Math.sqrt(( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ));
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (( l == 0 )) 
		{
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			this.set(((double) (0) ), ((double) (0) ), ((double) (0) ), 1);
			//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			return ;
		}
		
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		double k = ( 1. / l );
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			haxe.at.dotpoint.math.vector.Vector3 _g = this;
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			_g.x = ( _g.x * k );
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			haxe.at.dotpoint.math.vector.Vector3 _g1 = this;
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			_g1.y = ( _g1.y * k );
		}
		
		//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			haxe.at.dotpoint.math.vector.Vector3 _g2 = this;
			//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			_g2.z = ( _g2.z * k );
		}
		
	}
	
	
	public final double length()
	{
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return java.lang.Math.sqrt(( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ));
	}
	
	
	public final double lengthSq()
	{
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) );
	}
	
	
	public haxe.root.Array<java.lang.Object> toArray(java.lang.Object includeW)
	{
		//line 303 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		java.lang.Object __temp_includeW57 = ( (haxe.lang.Runtime.eq(includeW, null)) ? (((java.lang.Object) (false) )) : (includeW) );
		//line 304 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		if (haxe.lang.Runtime.toBool((__temp_includeW57))) 
		{
			//line 305 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (this.x) ), ((java.lang.Object) (this.y) ), ((java.lang.Object) (this.z) ), ((java.lang.Object) (this.w) )});
		}
		
		//line 307 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{((java.lang.Object) (this.x) ), ((java.lang.Object) (this.y) ), ((java.lang.Object) (this.z) )});
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 332 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return ( ( ( ( ( ( ( ( "[Vector3;" + haxe.lang.Runtime.toString(this.x) ) + ", " ) + haxe.lang.Runtime.toString(this.y) ) + ", " ) + haxe.lang.Runtime.toString(this.z) ) + ", " ) + haxe.lang.Runtime.toString(this.w) ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_w(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.w = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_x(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.x = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_z(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.z = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_y(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.y = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_w(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.w = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_z(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.z = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_x();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.x;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("toArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toArray")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_y();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.y;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("lengthSq")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lengthSq")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_z();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.z;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("length")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 119:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_w();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.w;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("normalize")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("clone")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_w")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_w")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_z")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_z")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_w();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.w;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_x();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.x;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_z();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.z;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.get_y();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
							return this.y;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.toString();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("clone")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return ((java.lang.Object) (this.clone(dynargs.__get(0))) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case -1182381922:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("toArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.toArray(dynargs.__get(0));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.get_x();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("lengthSq")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.lengthSq();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("length")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.length();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.get_y();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("normalize")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						this.normalize();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						this.set(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), dynargs.__get(3));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.get_z();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.set_w(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("set_z")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.set_z(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					if (field.equals("get_w")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
						return this.get_w();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		baseArr.push("w");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		baseArr.push("z");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		baseArr.push("y");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		baseArr.push("x");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector3.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


