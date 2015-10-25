package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Matrix44 extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IMatrix44
{
	public Matrix44(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Matrix44(haxe.at.dotpoint.math.vector.IMatrix44 matrix)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.at.dotpoint.math.vector.Matrix44.__hx_ctor_haxe_at_dotpoint_math_vector_Matrix44(this, matrix);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_vector_Matrix44(haxe.at.dotpoint.math.vector.Matrix44 __temp_me89, haxe.at.dotpoint.math.vector.IMatrix44 matrix)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( matrix != null )) 
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_me89.set44(matrix);
		}
		else
		{
			//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_me89.toIdentity();
		}
		
	}
	
	
	public static <T> T add(haxe.at.dotpoint.math.vector.IMatrix44 a, haxe.at.dotpoint.math.vector.IMatrix44 b, java.lang.Object output)
	{
		//line 237 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( output == null )) 
		{
			//line 238 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ))) );
		}
		
		//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m11", ( haxe.lang.Runtime.getField_f(a, "m11", true) + haxe.lang.Runtime.getField_f(b, "m11", true) ));
		//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m12", ( haxe.lang.Runtime.getField_f(a, "m12", true) + haxe.lang.Runtime.getField_f(b, "m12", true) ));
		//line 242 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m13", ( haxe.lang.Runtime.getField_f(a, "m13", true) + haxe.lang.Runtime.getField_f(b, "m13", true) ));
		//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m14", ( haxe.lang.Runtime.getField_f(a, "m14", true) + haxe.lang.Runtime.getField_f(b, "m14", true) ));
		//line 245 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m21", ( haxe.lang.Runtime.getField_f(a, "m21", true) + haxe.lang.Runtime.getField_f(b, "m21", true) ));
		//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m22", ( haxe.lang.Runtime.getField_f(a, "m22", true) + haxe.lang.Runtime.getField_f(b, "m22", true) ));
		//line 247 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m23", ( haxe.lang.Runtime.getField_f(a, "m23", true) + haxe.lang.Runtime.getField_f(b, "m23", true) ));
		//line 248 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m24", ( haxe.lang.Runtime.getField_f(a, "m24", true) + haxe.lang.Runtime.getField_f(b, "m24", true) ));
		//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m31", ( haxe.lang.Runtime.getField_f(a, "m31", true) + haxe.lang.Runtime.getField_f(b, "m31", true) ));
		//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m32", ( haxe.lang.Runtime.getField_f(a, "m32", true) + haxe.lang.Runtime.getField_f(b, "m32", true) ));
		//line 252 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m33", ( haxe.lang.Runtime.getField_f(a, "m33", true) + haxe.lang.Runtime.getField_f(b, "m33", true) ));
		//line 253 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m34", ( haxe.lang.Runtime.getField_f(a, "m34", true) + haxe.lang.Runtime.getField_f(b, "m34", true) ));
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m41", ( haxe.lang.Runtime.getField_f(a, "m41", true) + haxe.lang.Runtime.getField_f(b, "m41", true) ));
		//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m42", ( haxe.lang.Runtime.getField_f(a, "m42", true) + haxe.lang.Runtime.getField_f(b, "m42", true) ));
		//line 257 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m43", ( haxe.lang.Runtime.getField_f(a, "m43", true) + haxe.lang.Runtime.getField_f(b, "m43", true) ));
		//line 258 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m44", ( haxe.lang.Runtime.getField_f(a, "m44", true) + haxe.lang.Runtime.getField_f(b, "m44", true) ));
		//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T subtract(haxe.at.dotpoint.math.vector.IMatrix44 a, haxe.at.dotpoint.math.vector.IMatrix44 b, java.lang.Object output)
	{
		//line 273 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( output == null )) 
		{
			//line 274 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ))) );
		}
		
		//line 276 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m11", ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) ));
		//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m12", ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) ));
		//line 278 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m13", ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) ));
		//line 279 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m14", ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) ));
		//line 281 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m21", ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) ));
		//line 282 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m22", ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) ));
		//line 283 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m23", ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) ));
		//line 284 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m24", ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) ));
		//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m31", ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) ));
		//line 287 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m32", ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) ));
		//line 288 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m33", ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) ));
		//line 289 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m34", ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) ));
		//line 291 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m41", ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) ));
		//line 292 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m42", ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) ));
		//line 293 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m43", ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) ));
		//line 294 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m44", ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) - ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) ));
		//line 296 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T scale(haxe.at.dotpoint.math.vector.IMatrix44 a, double scalar, java.lang.Object output)
	{
		//line 309 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( output == null )) 
		{
			//line 310 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ))) );
		}
		
		//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m11", ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) * ((double) (scalar) ) ));
		//line 313 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m12", ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) * ((double) (scalar) ) ));
		//line 314 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m13", ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) * ((double) (scalar) ) ));
		//line 315 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m14", ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) * ((double) (scalar) ) ));
		//line 317 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m21", ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) * ((double) (scalar) ) ));
		//line 318 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m22", ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) * ((double) (scalar) ) ));
		//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m23", ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) * ((double) (scalar) ) ));
		//line 320 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m24", ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) * ((double) (scalar) ) ));
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m31", ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) * ((double) (scalar) ) ));
		//line 323 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m32", ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) * ((double) (scalar) ) ));
		//line 324 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m33", ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) * ((double) (scalar) ) ));
		//line 325 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m34", ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) * ((double) (scalar) ) ));
		//line 327 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m41", ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) * ((double) (scalar) ) ));
		//line 328 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m42", ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) * ((double) (scalar) ) ));
		//line 329 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m43", ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) * ((double) (scalar) ) ));
		//line 330 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m44", ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) * ((double) (scalar) ) ));
		//line 332 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T multiply(haxe.at.dotpoint.math.vector.IMatrix44 a, haxe.at.dotpoint.math.vector.IMatrix44 b, java.lang.Object output)
	{
		//line 347 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( output == null )) 
		{
			//line 348 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ))) );
		}
		else
		{
			//line 350 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (haxe.lang.Runtime.eq(output, a)) 
			{
				//line 350 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				a = new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (a) ));
			}
			else
			{
				//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				if (haxe.lang.Runtime.eq(output, b)) 
				{
					//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					b = new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (b) ));
				}
				
			}
			
		}
		
		//line 355 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m11", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) ) ));
		//line 356 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m12", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) ) ));
		//line 357 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m13", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) ) ));
		//line 358 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m14", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m11", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m12", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m13", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m14", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) ) ));
		//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m21", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) ) ));
		//line 363 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m22", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) ) ));
		//line 364 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m23", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) ) ));
		//line 365 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m24", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m21", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m22", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m23", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m24", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) ) ));
		//line 369 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m31", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) ) ));
		//line 370 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m32", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) ) ));
		//line 371 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m33", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) ) ));
		//line 372 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m34", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m31", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m32", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m33", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m34", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) ) ));
		//line 376 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m41", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m11", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m21", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m31", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m41", true)) ) ) ));
		//line 377 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m42", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m12", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m22", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m32", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m42", true)) ) ) ));
		//line 378 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m43", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m13", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m23", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m33", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m43", true)) ) ) ));
		//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.lang.Runtime.setField_f(output, "m44", ( ( ( ( ((double) (haxe.lang.Runtime.getField_f(a, "m41", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m14", true)) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m42", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m24", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m43", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m34", true)) ) ) ) + ( ((double) (haxe.lang.Runtime.getField_f(a, "m44", true)) ) * ((double) (haxe.lang.Runtime.getField_f(b, "m44", true)) ) ) ));
		//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ((T) (output) );
	}
	
	
	public static boolean isEqual(haxe.at.dotpoint.math.vector.IMatrix44 a, haxe.at.dotpoint.math.vector.IMatrix44 b)
	{
		//line 397 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean success = true;
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt17 = false;
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			double a1 = haxe.lang.Runtime.getField_f(a, "m11", true);
			//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			double b1 = haxe.lang.Runtime.getField_f(b, "m11", true);
			//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_stmt17 = ( (( a1 > b1 )) ? (( ( a1 - b1 ) < 1e-08 )) : (( ( b1 - a1 ) < 1e-08 )) );
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt16 =  ! (__temp_stmt17) ;
		//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv18 = false;
		//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt16) ) 
		{
			//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt19 = false;
			//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a2 = haxe.lang.Runtime.getField_f(a, "m12", true);
				//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b2 = haxe.lang.Runtime.getField_f(b, "m12", true);
				//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt19 = ( (( a2 > b2 )) ? (( ( a2 - b2 ) < 1e-08 )) : (( ( b2 - a2 ) < 1e-08 )) );
			}
			
			//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv18 =  ! (__temp_stmt19) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt15 = ( __temp_stmt16 || __temp_boolv18 );
		//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv20 = false;
		//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt15) ) 
		{
			//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt21 = false;
			//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a3 = haxe.lang.Runtime.getField_f(a, "m13", true);
				//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b3 = haxe.lang.Runtime.getField_f(b, "m13", true);
				//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt21 = ( (( a3 > b3 )) ? (( ( a3 - b3 ) < 1e-08 )) : (( ( b3 - a3 ) < 1e-08 )) );
			}
			
			//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv20 =  ! (__temp_stmt21) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt14 = ( __temp_stmt15 || __temp_boolv20 );
		//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv22 = false;
		//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt14) ) 
		{
			//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt23 = false;
			//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a4 = haxe.lang.Runtime.getField_f(a, "m14", true);
				//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b4 = haxe.lang.Runtime.getField_f(b, "m14", true);
				//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt23 = ( (( a4 > b4 )) ? (( ( a4 - b4 ) < 1e-08 )) : (( ( b4 - a4 ) < 1e-08 )) );
			}
			
			//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv22 =  ! (__temp_stmt23) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt13 = ( __temp_stmt14 || __temp_boolv22 );
		//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv24 = false;
		//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt13) ) 
		{
			//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt25 = false;
			//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a5 = haxe.lang.Runtime.getField_f(a, "m21", true);
				//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b5 = haxe.lang.Runtime.getField_f(b, "m21", true);
				//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt25 = ( (( a5 > b5 )) ? (( ( a5 - b5 ) < 1e-08 )) : (( ( b5 - a5 ) < 1e-08 )) );
			}
			
			//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv24 =  ! (__temp_stmt25) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt12 = ( __temp_stmt13 || __temp_boolv24 );
		//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv26 = false;
		//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt12) ) 
		{
			//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt27 = false;
			//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a6 = haxe.lang.Runtime.getField_f(a, "m22", true);
				//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b6 = haxe.lang.Runtime.getField_f(b, "m22", true);
				//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt27 = ( (( a6 > b6 )) ? (( ( a6 - b6 ) < 1e-08 )) : (( ( b6 - a6 ) < 1e-08 )) );
			}
			
			//line 405 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv26 =  ! (__temp_stmt27) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt11 = ( __temp_stmt12 || __temp_boolv26 );
		//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv28 = false;
		//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt11) ) 
		{
			//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt29 = false;
			//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a7 = haxe.lang.Runtime.getField_f(a, "m23", true);
				//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b7 = haxe.lang.Runtime.getField_f(b, "m23", true);
				//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt29 = ( (( a7 > b7 )) ? (( ( a7 - b7 ) < 1e-08 )) : (( ( b7 - a7 ) < 1e-08 )) );
			}
			
			//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv28 =  ! (__temp_stmt29) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt10 = ( __temp_stmt11 || __temp_boolv28 );
		//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv30 = false;
		//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt10) ) 
		{
			//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt31 = false;
			//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a8 = haxe.lang.Runtime.getField_f(a, "m24", true);
				//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b8 = haxe.lang.Runtime.getField_f(b, "m24", true);
				//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt31 = ( (( a8 > b8 )) ? (( ( a8 - b8 ) < 1e-08 )) : (( ( b8 - a8 ) < 1e-08 )) );
			}
			
			//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv30 =  ! (__temp_stmt31) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt9 = ( __temp_stmt10 || __temp_boolv30 );
		//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv32 = false;
		//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt9) ) 
		{
			//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt33 = false;
			//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a9 = haxe.lang.Runtime.getField_f(a, "m31", true);
				//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b9 = haxe.lang.Runtime.getField_f(b, "m31", true);
				//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt33 = ( (( a9 > b9 )) ? (( ( a9 - b9 ) < 1e-08 )) : (( ( b9 - a9 ) < 1e-08 )) );
			}
			
			//line 409 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv32 =  ! (__temp_stmt33) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt8 = ( __temp_stmt9 || __temp_boolv32 );
		//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv34 = false;
		//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt8) ) 
		{
			//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt35 = false;
			//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a10 = haxe.lang.Runtime.getField_f(a, "m32", true);
				//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b10 = haxe.lang.Runtime.getField_f(b, "m32", true);
				//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt35 = ( (( a10 > b10 )) ? (( ( a10 - b10 ) < 1e-08 )) : (( ( b10 - a10 ) < 1e-08 )) );
			}
			
			//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv34 =  ! (__temp_stmt35) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt7 = ( __temp_stmt8 || __temp_boolv34 );
		//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv36 = false;
		//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt7) ) 
		{
			//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt37 = false;
			//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a11 = haxe.lang.Runtime.getField_f(a, "m33", true);
				//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b11 = haxe.lang.Runtime.getField_f(b, "m33", true);
				//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt37 = ( (( a11 > b11 )) ? (( ( a11 - b11 ) < 1e-08 )) : (( ( b11 - a11 ) < 1e-08 )) );
			}
			
			//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv36 =  ! (__temp_stmt37) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt6 = ( __temp_stmt7 || __temp_boolv36 );
		//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv38 = false;
		//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt6) ) 
		{
			//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt39 = false;
			//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a12 = haxe.lang.Runtime.getField_f(a, "m34", true);
				//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b12 = haxe.lang.Runtime.getField_f(b, "m34", true);
				//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt39 = ( (( a12 > b12 )) ? (( ( a12 - b12 ) < 1e-08 )) : (( ( b12 - a12 ) < 1e-08 )) );
			}
			
			//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv38 =  ! (__temp_stmt39) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt5 = ( __temp_stmt6 || __temp_boolv38 );
		//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv40 = false;
		//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt5) ) 
		{
			//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt41 = false;
			//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a13 = haxe.lang.Runtime.getField_f(a, "m41", true);
				//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b13 = haxe.lang.Runtime.getField_f(b, "m41", true);
				//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt41 = ( (( a13 > b13 )) ? (( ( a13 - b13 ) < 1e-08 )) : (( ( b13 - a13 ) < 1e-08 )) );
			}
			
			//line 414 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv40 =  ! (__temp_stmt41) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt4 = ( __temp_stmt5 || __temp_boolv40 );
		//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv42 = false;
		//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt4) ) 
		{
			//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt43 = false;
			//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a14 = haxe.lang.Runtime.getField_f(a, "m42", true);
				//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b14 = haxe.lang.Runtime.getField_f(b, "m42", true);
				//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt43 = ( (( a14 > b14 )) ? (( ( a14 - b14 ) < 1e-08 )) : (( ( b14 - a14 ) < 1e-08 )) );
			}
			
			//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv42 =  ! (__temp_stmt43) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt3 = ( __temp_stmt4 || __temp_boolv42 );
		//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv44 = false;
		//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt3) ) 
		{
			//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt45 = false;
			//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a15 = haxe.lang.Runtime.getField_f(a, "m43", true);
				//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b15 = haxe.lang.Runtime.getField_f(b, "m43", true);
				//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt45 = ( (( a15 > b15 )) ? (( ( a15 - b15 ) < 1e-08 )) : (( ( b15 - a15 ) < 1e-08 )) );
			}
			
			//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv44 =  ! (__temp_stmt45) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt2 = ( __temp_stmt3 || __temp_boolv44 );
		//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_boolv46 = false;
		//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if ( ! (__temp_stmt2) ) 
		{
			//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_stmt47 = false;
			//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			{
				//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double a16 = haxe.lang.Runtime.getField_f(a, "m44", true);
				//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				double b16 = haxe.lang.Runtime.getField_f(b, "m44", true);
				//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				__temp_stmt47 = ( (( a16 > b16 )) ? (( ( a16 - b16 ) < 1e-08 )) : (( ( b16 - a16 ) < 1e-08 )) );
			}
			
			//line 417 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			__temp_boolv46 =  ! (__temp_stmt47) ;
		}
		
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		boolean __temp_stmt1 = ( __temp_stmt2 || __temp_boolv46 );
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (__temp_stmt1) 
		{
			//line 419 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			success = false;
		}
		
		//line 422 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return success;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return new haxe.at.dotpoint.math.vector.Matrix44(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (arr.__get(0)) ));
	}
	
	
	public double m11;
	
	public double m12;
	
	public double m13;
	
	public double m14;
	
	public double m21;
	
	public double m22;
	
	public double m23;
	
	public double m24;
	
	public double m31;
	
	public double m32;
	
	public double m33;
	
	public double m34;
	
	public double m41;
	
	public double m42;
	
	public double m43;
	
	public double m44;
	
	public void set44(haxe.at.dotpoint.math.vector.IMatrix44 matrix)
	{
		//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m11 = haxe.lang.Runtime.getField_f(matrix, "m11", true);
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = haxe.lang.Runtime.getField_f(matrix, "m12", true);
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = haxe.lang.Runtime.getField_f(matrix, "m13", true);
		//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = haxe.lang.Runtime.getField_f(matrix, "m14", true);
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = haxe.lang.Runtime.getField_f(matrix, "m21", true);
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m22 = haxe.lang.Runtime.getField_f(matrix, "m22", true);
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = haxe.lang.Runtime.getField_f(matrix, "m23", true);
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = haxe.lang.Runtime.getField_f(matrix, "m24", true);
		//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = haxe.lang.Runtime.getField_f(matrix, "m31", true);
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = haxe.lang.Runtime.getField_f(matrix, "m32", true);
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m33 = haxe.lang.Runtime.getField_f(matrix, "m33", true);
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = haxe.lang.Runtime.getField_f(matrix, "m34", true);
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = haxe.lang.Runtime.getField_f(matrix, "m41", true);
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = haxe.lang.Runtime.getField_f(matrix, "m42", true);
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = haxe.lang.Runtime.getField_f(matrix, "m43", true);
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m44 = haxe.lang.Runtime.getField_f(matrix, "m44", true);
	}
	
	
	public void set33(haxe.at.dotpoint.math.vector.IMatrix33 matrix)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m11 = haxe.lang.Runtime.getField_f(matrix, "m11", true);
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = haxe.lang.Runtime.getField_f(matrix, "m12", true);
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = haxe.lang.Runtime.getField_f(matrix, "m13", true);
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = ((double) (0) );
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = haxe.lang.Runtime.getField_f(matrix, "m21", true);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m22 = haxe.lang.Runtime.getField_f(matrix, "m22", true);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = haxe.lang.Runtime.getField_f(matrix, "m23", true);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = ((double) (0) );
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = haxe.lang.Runtime.getField_f(matrix, "m31", true);
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = haxe.lang.Runtime.getField_f(matrix, "m32", true);
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m33 = haxe.lang.Runtime.getField_f(matrix, "m33", true);
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = ((double) (0) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = ((double) (0) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = ((double) (0) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = ((double) (0) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m44 = ((double) (1) );
	}
	
	
	public haxe.root.Array<java.lang.Object> getArray(haxe.root.Array<java.lang.Object> output)
	{
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( output == null )) 
		{
			//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			output = new haxe.root.Array<java.lang.Object>();
		}
		
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(0, this.m11);
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(1, this.m21);
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(2, this.m31);
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(3, this.m41);
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(4, this.m12);
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(5, this.m22);
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(6, this.m32);
		//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(7, this.m42);
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(8, this.m13);
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(9, this.m23);
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(10, this.m33);
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(11, this.m43);
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(12, this.m14);
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(13, this.m24);
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(14, this.m34);
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		output.__set(15, this.m44);
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return output;
	}
	
	
	public void setArray(haxe.root.Array<java.lang.Object> input)
	{
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m11 = ((double) (haxe.lang.Runtime.toDouble(input.__get(0))) );
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = ((double) (haxe.lang.Runtime.toDouble(input.__get(1))) );
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = ((double) (haxe.lang.Runtime.toDouble(input.__get(2))) );
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = ((double) (haxe.lang.Runtime.toDouble(input.__get(3))) );
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = ((double) (haxe.lang.Runtime.toDouble(input.__get(4))) );
		//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m22 = ((double) (haxe.lang.Runtime.toDouble(input.__get(5))) );
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = ((double) (haxe.lang.Runtime.toDouble(input.__get(6))) );
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = ((double) (haxe.lang.Runtime.toDouble(input.__get(7))) );
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = ((double) (haxe.lang.Runtime.toDouble(input.__get(8))) );
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = ((double) (haxe.lang.Runtime.toDouble(input.__get(9))) );
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m33 = ((double) (haxe.lang.Runtime.toDouble(input.__get(10))) );
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = ((double) (haxe.lang.Runtime.toDouble(input.__get(11))) );
		//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = ((double) (haxe.lang.Runtime.toDouble(input.__get(12))) );
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = ((double) (haxe.lang.Runtime.toDouble(input.__get(13))) );
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = ((double) (haxe.lang.Runtime.toDouble(input.__get(14))) );
		//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m44 = ((double) (haxe.lang.Runtime.toDouble(input.__get(15))) );
	}
	
	
	public void toIdentity()
	{
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m11 = ((double) (1) );
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = ((double) (0) );
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = ((double) (0) );
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = ((double) (0) );
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = ((double) (0) );
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m22 = ((double) (1) );
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = ((double) (0) );
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = ((double) (0) );
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = ((double) (0) );
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = ((double) (0) );
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m33 = ((double) (1) );
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = ((double) (0) );
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = ((double) (0) );
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = ((double) (0) );
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = ((double) (0) );
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m44 = ((double) (1) );
	}
	
	
	public void transpose()
	{
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double t = 0.0;
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m21;
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = this.m12;
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = t;
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m31;
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = this.m13;
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = t;
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m32;
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = this.m23;
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = t;
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m41;
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = this.m14;
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = t;
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m42;
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = this.m24;
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = t;
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		t = this.m43;
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = this.m34;
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = t;
	}
	
	
	public double determinant()
	{
		//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ( ( ( ( ( ( (( ( this.m11 * this.m22 ) - ( this.m21 * this.m12 ) )) * (( ( this.m33 * this.m44 ) - ( this.m43 * this.m34 ) )) ) - ( (( ( this.m11 * this.m32 ) - ( this.m31 * this.m12 ) )) * (( ( this.m23 * this.m44 ) - ( this.m43 * this.m24 ) )) ) ) + ( (( ( this.m11 * this.m42 ) - ( this.m41 * this.m12 ) )) * (( ( this.m23 * this.m34 ) - ( this.m33 * this.m24 ) )) ) ) + ( (( ( this.m21 * this.m32 ) - ( this.m31 * this.m22 ) )) * (( ( this.m13 * this.m44 ) - ( this.m43 * this.m14 ) )) ) ) - ( (( ( this.m21 * this.m42 ) - ( this.m41 * this.m22 ) )) * (( ( this.m13 * this.m34 ) - ( this.m33 * this.m14 ) )) ) ) + ( (( ( this.m31 * this.m42 ) - ( this.m41 * this.m32 ) )) * (( ( this.m13 * this.m24 ) - ( this.m23 * this.m14 ) )) ) );
	}
	
	
	public void inverse()
	{
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double d = this.determinant();
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		if (( java.lang.Math.abs(d) < 1e-08 )) 
		{
			//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			return ;
		}
		
		//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		d = ( 1 / d );
		//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m11 = this.m11;
		//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m21 = this.m21;
		//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m31 = this.m31;
		//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m41 = this.m41;
		//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m12 = this.m12;
		//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m22 = this.m22;
		//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m32 = this.m32;
		//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m42 = this.m42;
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m13 = this.m13;
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m23 = this.m23;
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m33 = this.m33;
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m43 = this.m43;
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m14 = this.m14;
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m24 = this.m24;
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m34 = this.m34;
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		double m44 = this.m44;
		//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m11 = ( d * (( ( ( m22 * (( ( m33 * m44 ) - ( m43 * m34 ) )) ) - ( m32 * (( ( m23 * m44 ) - ( m43 * m24 ) )) ) ) + ( m42 * (( ( m23 * m34 ) - ( m33 * m24 ) )) ) )) );
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m12 = (  - (d)  * (( ( ( m12 * (( ( m33 * m44 ) - ( m43 * m34 ) )) ) - ( m32 * (( ( m13 * m44 ) - ( m43 * m14 ) )) ) ) + ( m42 * (( ( m13 * m34 ) - ( m33 * m14 ) )) ) )) );
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m13 = ( d * (( ( ( m12 * (( ( m23 * m44 ) - ( m43 * m24 ) )) ) - ( m22 * (( ( m13 * m44 ) - ( m43 * m14 ) )) ) ) + ( m42 * (( ( m13 * m24 ) - ( m23 * m14 ) )) ) )) );
		//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m14 = (  - (d)  * (( ( ( m12 * (( ( m23 * m34 ) - ( m33 * m24 ) )) ) - ( m22 * (( ( m13 * m34 ) - ( m33 * m14 ) )) ) ) + ( m32 * (( ( m13 * m24 ) - ( m23 * m14 ) )) ) )) );
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m21 = (  - (d)  * (( ( ( m21 * (( ( m33 * m44 ) - ( m43 * m34 ) )) ) - ( m31 * (( ( m23 * m44 ) - ( m43 * m24 ) )) ) ) + ( m41 * (( ( m23 * m34 ) - ( m33 * m24 ) )) ) )) );
		//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m22 = ( d * (( ( ( m11 * (( ( m33 * m44 ) - ( m43 * m34 ) )) ) - ( m31 * (( ( m13 * m44 ) - ( m43 * m14 ) )) ) ) + ( m41 * (( ( m13 * m34 ) - ( m33 * m14 ) )) ) )) );
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m23 = (  - (d)  * (( ( ( m11 * (( ( m23 * m44 ) - ( m43 * m24 ) )) ) - ( m21 * (( ( m13 * m44 ) - ( m43 * m14 ) )) ) ) + ( m41 * (( ( m13 * m24 ) - ( m23 * m14 ) )) ) )) );
		//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m24 = ( d * (( ( ( m11 * (( ( m23 * m34 ) - ( m33 * m24 ) )) ) - ( m21 * (( ( m13 * m34 ) - ( m33 * m14 ) )) ) ) + ( m31 * (( ( m13 * m24 ) - ( m23 * m14 ) )) ) )) );
		//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m31 = ( d * (( ( ( m21 * (( ( m32 * m44 ) - ( m42 * m34 ) )) ) - ( m31 * (( ( m22 * m44 ) - ( m42 * m24 ) )) ) ) + ( m41 * (( ( m22 * m34 ) - ( m32 * m24 ) )) ) )) );
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m32 = (  - (d)  * (( ( ( m11 * (( ( m32 * m44 ) - ( m42 * m34 ) )) ) - ( m31 * (( ( m12 * m44 ) - ( m42 * m14 ) )) ) ) + ( m41 * (( ( m12 * m34 ) - ( m32 * m14 ) )) ) )) );
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m33 = ( d * (( ( ( m11 * (( ( m22 * m44 ) - ( m42 * m24 ) )) ) - ( m21 * (( ( m12 * m44 ) - ( m42 * m14 ) )) ) ) + ( m41 * (( ( m12 * m24 ) - ( m22 * m14 ) )) ) )) );
		//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m34 = (  - (d)  * (( ( ( m11 * (( ( m22 * m34 ) - ( m32 * m24 ) )) ) - ( m21 * (( ( m12 * m34 ) - ( m32 * m14 ) )) ) ) + ( m31 * (( ( m12 * m24 ) - ( m22 * m14 ) )) ) )) );
		//line 217 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m41 = (  - (d)  * (( ( ( m21 * (( ( m32 * m43 ) - ( m42 * m33 ) )) ) - ( m31 * (( ( m22 * m43 ) - ( m42 * m23 ) )) ) ) + ( m41 * (( ( m22 * m33 ) - ( m32 * m23 ) )) ) )) );
		//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m42 = ( d * (( ( ( m11 * (( ( m32 * m43 ) - ( m42 * m33 ) )) ) - ( m31 * (( ( m12 * m43 ) - ( m42 * m13 ) )) ) ) + ( m41 * (( ( m12 * m33 ) - ( m32 * m13 ) )) ) )) );
		//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m43 = (  - (d)  * (( ( ( m11 * (( ( m22 * m43 ) - ( m42 * m23 ) )) ) - ( m21 * (( ( m12 * m43 ) - ( m42 * m13 ) )) ) ) + ( m41 * (( ( m12 * m23 ) - ( m22 * m13 ) )) ) )) );
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		this.m44 = ( d * (( ( ( m11 * (( ( m22 * m33 ) - ( m32 * m23 ) )) ) - ( m21 * (( ( m12 * m33 ) - ( m32 * m13 ) )) ) ) + ( m31 * (( ( m12 * m23 ) - ( m22 * m13 ) )) ) )) );
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 431 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.root.Array<java.lang.Object> array = this.getArray(null);
		//line 433 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.root.Array<java.lang.Object> r1 = ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (array.splice(0, 4)) )) );
		//line 434 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.root.Array<java.lang.Object> r2 = ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (array.splice(0, 4)) )) );
		//line 435 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.root.Array<java.lang.Object> r3 = ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (array.splice(0, 4)) )) );
		//line 436 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		haxe.root.Array<java.lang.Object> r4 = ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (array.splice(0, 4)) )) );
		//line 438 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return ( ( ( ( ( ( ( ( "[" + r1.toString() ) + ";" ) + r2.toString() ) + ";" ) + r3.toString() ) + ";" ) + r4.toString() ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			switch (field.hashCode())
			{
				case 106413:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m44 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m11")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m11 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106412:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m43")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m43 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m12")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m12 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106411:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m42")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m42 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m13")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m13 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106410:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m41")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m41 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106320:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m14")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m14 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106382:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m34")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m34 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m21")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m21 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106381:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m33 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m22")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m22 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m32")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m32 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m23")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m23 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m31")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m31 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106351:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m24")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m24 = ((double) (value) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			switch (field.hashCode())
			{
				case 106413:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m44 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m11")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m11 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106412:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m43")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m43 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m12")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m12 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106411:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m42")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m42 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m13")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m13 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106410:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m41")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m41 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106320:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m14")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m14 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106382:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m34")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m34 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m21")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m21 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106381:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m33 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m22")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m22 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m32")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m32 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m23")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m23 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m31")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m31 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106351:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m24")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.m24 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return value;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m11")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m11;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1959910192:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("inverse")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "inverse")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m12")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m12;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 61485653:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("determinant")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "determinant")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m13")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m13;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1052964665:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("transpose")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transpose")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106320:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m14")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m14;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("toIdentity")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toIdentity")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m21")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m21;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1387803415:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("setArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setArray")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m22")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m22;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1948915875:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("getArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getArray")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m23")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m23;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 109326914:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("set33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set33")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106351:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m24")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m24;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 109326946:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("set44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set44")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m31")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m31;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106413:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m44;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m32")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m32;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106412:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m43")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m43;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106381:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m33;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106411:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m42")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m42;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106382:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m34")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m34;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106410:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m41")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m41;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			switch (field.hashCode())
			{
				case 106413:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m44;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m11")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m11;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106412:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m43")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m43;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m12")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m12;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106411:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m42")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m42;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m13")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m13;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106410:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m41")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m41;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106320:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m14")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m14;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106382:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m34")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m34;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m21")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m21;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106381:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m33;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m22")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m22;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m32")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m32;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m23")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m23;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m31")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m31;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 106351:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("m24")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.m24;
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.toString();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 109326946:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("set44")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.set44(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1959910192:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("inverse")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.inverse();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 109326914:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("set33")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.set33(((haxe.at.dotpoint.math.vector.IMatrix33) (dynargs.__get(0)) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 61485653:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("determinant")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.determinant();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1948915875:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("getArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						return this.getArray(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1052964665:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("transpose")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.transpose();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case 1387803415:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("setArray")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.setArray(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					if (field.equals("toIdentity")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
						this.toIdentity();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m44");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m43");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m42");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m41");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m34");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m33");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m32");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m31");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m24");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m23");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m22");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m21");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m14");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m13");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m12");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		baseArr.push("m11");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix44.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


