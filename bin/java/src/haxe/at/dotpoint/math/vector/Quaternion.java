package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Quaternion extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IQuaternion
{
	public Quaternion(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Quaternion(java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.at.dotpoint.math.vector.Quaternion.__hx_ctor_haxe_at_dotpoint_math_vector_Quaternion(this, x, y, z, w);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_vector_Quaternion(haxe.at.dotpoint.math.vector.Quaternion __temp_me94, java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double __temp_w93 = ( (haxe.lang.Runtime.eq(w, null)) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(w)) )) );
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double __temp_z92 = ( (haxe.lang.Runtime.eq(z, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(z)) )) );
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double __temp_y91 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double __temp_x90 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		__temp_me94.x = __temp_x90;
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		__temp_me94.y = __temp_y91;
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		__temp_me94.z = __temp_z92;
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		__temp_me94.w = __temp_w93;
	}
	
	
	public static <T> T getAxis(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.Axis axis, java.lang.Object output)
	{
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		switch (axis)
		{
			case X:
			{
				//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTy = ( 2.0 * a.get_y() );
				//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTz = ( 2.0 * a.get_z() );
				//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwy = ( fTy * a.get_w() );
				//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwz = ( fTz * a.get_w() );
				//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxy = ( fTy * a.get_x() );
				//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxz = ( fTz * a.get_x() );
				//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTyy = ( fTy * a.get_y() );
				//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTzz = ( fTz * a.get_z() );
				//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( 1 - (( fTyy + fTzz )) )}));
				//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( fTxy - fTwz )}));
				//line 234 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( fTxz + fTwy )}));
				//line 221 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				break;
			}
			
			
			case Y:
			{
				//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTx = ( 2.0 * a.get_x() );
				//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTy1 = ( 2.0 * a.get_y() );
				//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTz1 = ( 2.0 * a.get_z() );
				//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwx = ( fTx * a.get_w() );
				//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwz1 = ( fTz1 * a.get_w() );
				//line 245 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxx = ( fTx * a.get_x() );
				//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxy1 = ( fTy1 * a.get_x() );
				//line 247 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTyz = ( fTz1 * a.get_y() );
				//line 248 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTzz1 = ( fTz1 * a.get_z() );
				//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( fTxy1 + fTwz1 )}));
				//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( 1 - (( fTxx + fTzz1 )) )}));
				//line 252 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( fTyz - fTwx )}));
				//line 238 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				break;
			}
			
			
			case Z:
			{
				//line 257 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTx1 = ( 2.0 * a.get_x() );
				//line 258 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTy2 = ( 2.0 * a.get_y() );
				//line 259 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTz2 = ( 2.0 * a.get_z() );
				//line 261 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwx1 = ( fTx1 * a.get_w() );
				//line 262 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTwy1 = ( fTy2 * a.get_w() );
				//line 263 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxx1 = ( fTx1 * a.get_x() );
				//line 264 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTxz1 = ( fTz2 * a.get_x() );
				//line 265 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTyy1 = ( fTy2 * a.get_y() );
				//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double fTyz1 = ( fTz2 * a.get_y() );
				//line 268 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( fTxz1 - fTwy1 )}));
				//line 269 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( fTyz1 + fTwx1 )}));
				//line 270 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( 1 - (( fTxx1 + fTyy1 )) )}));
				//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				break;
			}
			
			
		}
		
		//line 274 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T multiplyVector(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.vector.IVector3 b, java.lang.Object output)
	{
		//line 282 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 283 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 287 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTx = ( 2.0 * a.get_x() );
		//line 288 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTy = ( 2.0 * a.get_y() );
		//line 289 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTz = ( 2.0 * a.get_z() );
		//line 291 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTxx = ( fTx * a.get_x() );
		//line 292 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTyy = ( fTy * a.get_y() );
		//line 293 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTzz = ( fTz * a.get_z() );
		//line 295 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTyx = ( fTy * a.get_x() );
		//line 296 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTzx = ( fTz * a.get_x() );
		//line 297 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTzy = ( fTz * a.get_y() );
		//line 299 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTxw = ( fTx * a.get_w() );
		//line 300 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTyw = ( fTy * a.get_w() );
		//line 301 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double fTzw = ( fTz * a.get_w() );
		//line 305 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( (( 1.0 - (( fTyy + fTzz )) )) * b.get_x() ) + ( (( fTyx - fTzw )) * b.get_y() ) ) + ( (( fTzx + fTyw )) * b.get_z() ) )}));
		//line 306 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( (( fTyx + fTzw )) * b.get_x() ) + ( (( 1.0 - (( fTxx + fTzz )) )) * b.get_y() ) ) + ( (( fTzy - fTxw )) * b.get_z() ) )}));
		//line 307 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( (( fTzx - fTzz )) * b.get_x() ) + ( (( fTzy + fTxw )) * b.get_y() ) ) + ( (( 1.0 - (( fTxx + fTyy )) )) * b.get_z() ) )}));
		//line 309 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T add(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.vector.IQuaternion b, java.lang.Object output)
	{
		//line 326 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 327 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 329 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() + b.get_x() )}));
		//line 330 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() + b.get_y() )}));
		//line 331 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() + b.get_z() )}));
		//line 332 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( a.get_w() + b.get_w() )}));
		//line 334 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T subtract(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.vector.IQuaternion b, java.lang.Object output)
	{
		//line 347 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 348 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 350 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() - b.get_x() )}));
		//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() - b.get_y() )}));
		//line 352 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() - b.get_z() )}));
		//line 353 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( a.get_w() - b.get_w() )}));
		//line 355 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T scale(haxe.at.dotpoint.math.vector.IQuaternion a, double scalar, java.lang.Object output)
	{
		//line 368 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 369 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 371 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() * scalar )}));
		//line 372 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() * scalar )}));
		//line 373 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( a.get_z() * scalar )}));
		//line 374 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( a.get_w() * scalar )}));
		//line 376 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T multiply(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.vector.IQuaternion b, java.lang.Object output)
	{
		//line 390 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 391 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		else
		{
			//line 393 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (haxe.lang.Runtime.eq(output, a)) 
			{
				//line 393 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				a = new haxe.at.dotpoint.math.vector.Quaternion(a.get_x(), a.get_y(), a.get_z(), a.get_w());
			}
			else
			{
				//line 394 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				if (haxe.lang.Runtime.eq(output, b)) 
				{
					//line 394 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					b = new haxe.at.dotpoint.math.vector.Quaternion(b.get_x(), b.get_y(), b.get_z(), b.get_w());
				}
				
			}
			
		}
		
		//line 398 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( ( a.get_w() * b.get_x() ) + ( a.get_x() * b.get_w() ) ) + ( a.get_y() * b.get_z() ) ) - ( a.get_z() * b.get_y() ) )}));
		//line 399 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( ( a.get_w() * b.get_y() ) - ( a.get_x() * b.get_z() ) ) + ( a.get_y() * b.get_w() ) ) + ( a.get_z() * b.get_x() ) )}));
		//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( ( a.get_w() * b.get_z() ) + ( a.get_x() * b.get_y() ) ) - ( a.get_y() * b.get_x() ) ) + ( a.get_z() * b.get_w() ) )}));
		//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( ( a.get_w() * b.get_w() ) - ( a.get_x() * b.get_x() ) ) - ( a.get_y() * b.get_y() ) ) - ( a.get_z() * b.get_z() ) )}));
		//line 403 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static double dot(haxe.at.dotpoint.math.vector.Quaternion a, haxe.at.dotpoint.math.vector.Quaternion b)
	{
		//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ( ( ( ( a.x * b.x ) + ( a.y * b.y ) ) + ( a.z * b.z ) ) + ( a.w * b.w ) );
	}
	
	
	public static <T> T setAxisAngle(haxe.at.dotpoint.math.vector.IVector3 axis, double radians, java.lang.Object output)
	{
		//line 432 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 433 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 437 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		radians = ( radians * 0.5 );
		//line 439 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double sin_a = ( java.lang.Math.sin(radians) / axis.length() );
		//line 440 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double cos_a = java.lang.Math.cos(radians);
		//line 442 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( axis.get_x() * sin_a )}));
		//line 443 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( axis.get_y() * sin_a )}));
		//line 444 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( axis.get_z() * sin_a )}));
		//line 445 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{cos_a}));
		//line 447 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T setEuler(haxe.at.dotpoint.math.vector.IVector3 euler, java.lang.Object output, haxe.at.dotpoint.math.vector.EulerRotation order)
	{
		//line 467 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 468 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 470 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( order == null )) 
		{
			//line 471 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			order = haxe.at.dotpoint.math.vector.EulerRotation.YXZ;
		}
		
		//line 475 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double s1 = java.lang.Math.sin(( euler.get_x() * 0.5 ));
		//line 476 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double c1 = java.lang.Math.cos(( euler.get_x() * 0.5 ));
		//line 477 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double s2 = java.lang.Math.sin(( euler.get_y() * 0.5 ));
		//line 478 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double c2 = java.lang.Math.cos(( euler.get_y() * 0.5 ));
		//line 479 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double s3 = java.lang.Math.sin(( euler.get_z() * 0.5 ));
		//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double c3 = java.lang.Math.cos(( euler.get_z() * 0.5 ));
		//line 482 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( order != null )) 
		{
			//line 482 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (order)
			{
				case YXZ:
				{
					//line 486 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) + ( ( c1 * s2 ) * s3 ) )}));
					//line 487 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) - ( ( s1 * c2 ) * s3 ) )}));
					//line 488 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) - ( ( s1 * s2 ) * c3 ) )}));
					//line 489 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) + ( ( s1 * s2 ) * s3 ) )}));
					//line 485 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case XYZ:
				{
					//line 494 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) + ( ( c1 * s2 ) * s3 ) )}));
					//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) - ( ( s1 * c2 ) * s3 ) )}));
					//line 496 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) + ( ( s1 * s2 ) * c3 ) )}));
					//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) - ( ( s1 * s2 ) * s3 ) )}));
					//line 493 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case ZXY:
				{
					//line 502 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) - ( ( c1 * s2 ) * s3 ) )}));
					//line 503 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) + ( ( s1 * c2 ) * s3 ) )}));
					//line 504 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) + ( ( s1 * s2 ) * c3 ) )}));
					//line 505 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) - ( ( s1 * s2 ) * s3 ) )}));
					//line 501 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case ZYX:
				{
					//line 510 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) - ( ( c1 * s2 ) * s3 ) )}));
					//line 511 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) + ( ( s1 * c2 ) * s3 ) )}));
					//line 512 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) - ( ( s1 * s2 ) * c3 ) )}));
					//line 513 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) + ( ( s1 * s2 ) * s3 ) )}));
					//line 509 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case YZX:
				{
					//line 518 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) + ( ( c1 * s2 ) * s3 ) )}));
					//line 519 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) + ( ( s1 * c2 ) * s3 ) )}));
					//line 520 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) - ( ( s1 * s2 ) * c3 ) )}));
					//line 521 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) - ( ( s1 * s2 ) * s3 ) )}));
					//line 517 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case XZY:
				{
					//line 526 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( ( ( s1 * c2 ) * c3 ) - ( ( c1 * s2 ) * s3 ) )}));
					//line 527 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * s2 ) * c3 ) - ( ( s1 * c2 ) * s3 ) )}));
					//line 528 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * s3 ) + ( ( s1 * s2 ) * c3 ) )}));
					//line 529 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( ( ( c1 * c2 ) * c3 ) + ( ( s1 * s2 ) * s3 ) )}));
					//line 525 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 533 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T toEuler(haxe.at.dotpoint.math.vector.IQuaternion input, java.lang.Object output)
	{
		//line 546 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 547 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 551 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double test = ( ( input.get_x() * input.get_y() ) + ( input.get_z() * input.get_w() ) );
		//line 553 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( test > 0.499 )) 
		{
			//line 555 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( 2 * java.lang.Math.atan2(input.get_x(), input.get_w()) )}));
			//line 556 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( java.lang.Math.PI / 2 )}));
			//line 557 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{0}));
		}
		
		//line 559 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( test < -0.499 )) 
		{
			//line 561 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( -2 * java.lang.Math.atan2(input.get_x(), input.get_w()) )}));
			//line 562 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{(  - (java.lang.Math.PI)  / 2 )}));
			//line 563 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{0}));
		}
		else
		{
			//line 567 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double sqx = ( input.get_x() * input.get_x() );
			//line 568 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double sqy = ( input.get_y() * input.get_y() );
			//line 569 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double sqz = ( input.get_z() * input.get_z() );
			//line 571 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.atan2(( ( ( 2 * input.get_y() ) * input.get_w() ) - ( ( 2 * input.get_x() ) * input.get_z() ) ), ( ( 1 - ( 2 * sqy ) ) - ( 2 * sqz ) ))}));
			//line 572 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.atan2(( ( ( 2 * input.get_x() ) * input.get_w() ) - ( ( 2 * input.get_y() ) * input.get_z() ) ), ( ( 1 - ( 2 * sqx ) ) - ( 2 * sqz ) ))}));
			//line 573 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.asin(( 2 * test ))}));
		}
		
		//line 576 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T toMatrix(haxe.at.dotpoint.math.vector.IQuaternion input, java.lang.Object output)
	{
		//line 594 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 595 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Matrix33(((haxe.at.dotpoint.math.vector.IMatrix33) (null) ))) );
		}
		
		//line 597 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		input = new haxe.at.dotpoint.math.vector.Quaternion(input.get_x(), input.get_y(), input.get_z(), input.get_w());
		//line 598 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		input.normalize();
		//line 602 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double xs = ( input.get_x() + input.get_x() );
		//line 603 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double ys = ( input.get_y() + input.get_y() );
		//line 604 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double zs = ( input.get_z() + input.get_z() );
		//line 606 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double wx = ( input.get_w() * xs );
		//line 607 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double wy = ( input.get_w() * ys );
		//line 608 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double wz = ( input.get_w() * zs );
		//line 610 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double xx = ( input.get_x() * xs );
		//line 611 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double xy = ( input.get_x() * ys );
		//line 612 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double xz = ( input.get_x() * zs );
		//line 614 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double yy = ( input.get_y() * ys );
		//line 615 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double yz = ( input.get_y() * zs );
		//line 617 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double zz = ( input.get_z() * zs );
		//line 621 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m11", ( 1 - (( yy + zz )) ));
		//line 622 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m21", ( xy - wz ));
		//line 623 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m31", ( xz + wy ));
		//line 625 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m12", ( xy + wz ));
		//line 626 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m22", ( 1 - (( xx + zz )) ));
		//line 627 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m32", ( yz - wx ));
		//line 629 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m13", ( xz - wy ));
		//line 630 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m23", ( yz + wx ));
		//line 631 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.setField_f(output, "m33", ( 1 - (( xx + yy )) ));
		//line 633 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T setMatrix(haxe.at.dotpoint.math.vector.IMatrix33 input, java.lang.Object output)
	{
		//line 646 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 647 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 651 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double t = ( ( haxe.lang.Runtime.getField_f(input, "m11", true) + haxe.lang.Runtime.getField_f(input, "m22", true) ) + haxe.lang.Runtime.getField_f(input, "m33", true) );
		//line 653 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( t >= 0 )) 
		{
			//line 655 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double s = java.lang.Math.sqrt(( t + 1 ));
			//line 657 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( 0.5 * s )}));
			//line 659 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			s = ( 0.5 / s );
			//line 661 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m32", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m23", true)) ) )) * s )}));
			//line 662 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m13", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m31", true)) ) )) * s )}));
			//line 663 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m21", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m12", true)) ) )) * s )}));
		}
		else
		{
			//line 665 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (( ( haxe.lang.Runtime.compare(haxe.lang.Runtime.getField_f(input, "m11", true), haxe.lang.Runtime.getField_f(input, "m22", true)) > 0 ) && ( haxe.lang.Runtime.compare(haxe.lang.Runtime.getField_f(input, "m11", true), haxe.lang.Runtime.getField_f(input, "m33", true)) > 0 ) )) 
			{
				//line 667 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				double s1 = java.lang.Math.sqrt(( ((double) (( ((double) (( 1.0 + haxe.lang.Runtime.getField_f(input, "m11", true) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m22", true)) ) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m33", true)) ) ));
				//line 669 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( s1 * 0.5 )}));
				//line 671 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				s1 = ( 0.5 / s1 );
				//line 673 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m21", true) + haxe.lang.Runtime.getField_f(input, "m12", true) )) * s1 )}));
				//line 674 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m31", true) + haxe.lang.Runtime.getField_f(input, "m13", true) )) * s1 )}));
				//line 675 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m32", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m23", true)) ) )) * s1 )}));
			}
			else
			{
				//line 677 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				if (( haxe.lang.Runtime.compare(haxe.lang.Runtime.getField_f(input, "m22", true), haxe.lang.Runtime.getField_f(input, "m33", true)) > 0 )) 
				{
					//line 679 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					double s2 = java.lang.Math.sqrt(( ((double) (( ((double) (( 1.0 + haxe.lang.Runtime.getField_f(input, "m22", true) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m33", true)) ) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m11", true)) ) ));
					//line 681 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( s2 * 0.5 )}));
					//line 683 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					s2 = ( 0.5 / s2 );
					//line 685 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m12", true) + haxe.lang.Runtime.getField_f(input, "m21", true) )) * s2 )}));
					//line 686 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m32", true) + haxe.lang.Runtime.getField_f(input, "m23", true) )) * s2 )}));
					//line 687 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m13", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m31", true)) ) )) * s2 )}));
				}
				else
				{
					//line 691 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					double s3 = java.lang.Math.sqrt(( ((double) (( ((double) (( 1.0 + haxe.lang.Runtime.getField_f(input, "m33", true) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m11", true)) ) )) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m22", true)) ) ));
					//line 693 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( s3 * 0.5 )}));
					//line 695 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					s3 = ( 0.5 / s3 );
					//line 697 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m13", true) + haxe.lang.Runtime.getField_f(input, "m31", true) )) * s3 )}));
					//line 698 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( (( haxe.lang.Runtime.getField_f(input, "m23", true) + haxe.lang.Runtime.getField_f(input, "m32", true) )) * s3 )}));
					//line 699 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{( (( ((double) (haxe.lang.Runtime.getField_f(input, "m21", true)) ) - ((double) (haxe.lang.Runtime.getField_f(input, "m12", true)) ) )) * s3 )}));
				}
				
			}
			
		}
		
		//line 704 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public static boolean isEqual(haxe.at.dotpoint.math.vector.IQuaternion a, haxe.at.dotpoint.math.vector.IQuaternion b)
	{
		//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		boolean __temp_stmt1 = false;
		//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double a1 = a.get_x();
			//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double b1 = b.get_x();
			//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			__temp_stmt1 = ( (( a1 > b1 )) ? (( ( a1 - b1 ) < 1e-08 )) : (( ( b1 - a1 ) < 1e-08 )) );
		}
		
		//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 754 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return false;
		}
		
		//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		boolean __temp_stmt2 = false;
		//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double a2 = a.get_y();
			//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double b2 = b.get_y();
			//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			__temp_stmt2 = ( (( a2 > b2 )) ? (( ( a2 - b2 ) < 1e-08 )) : (( ( b2 - a2 ) < 1e-08 )) );
		}
		
		//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if ( ! (__temp_stmt2) ) 
		{
			//line 755 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return false;
		}
		
		//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		boolean __temp_stmt3 = false;
		//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double a3 = a.get_z();
			//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double b3 = b.get_z();
			//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			__temp_stmt3 = ( (( a3 > b3 )) ? (( ( a3 - b3 ) < 1e-08 )) : (( ( b3 - a3 ) < 1e-08 )) );
		}
		
		//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if ( ! (__temp_stmt3) ) 
		{
			//line 756 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return false;
		}
		
		//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		boolean __temp_stmt4 = false;
		//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double a4 = a.get_w();
			//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			double b4 = b.get_w();
			//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			__temp_stmt4 = ( (( a4 > b4 )) ? (( ( a4 - b4 ) < 1e-08 )) : (( ( b4 - a4 ) < 1e-08 )) );
		}
		
		//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if ( ! (__temp_stmt4) ) 
		{
			//line 757 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return false;
		}
		
		//line 759 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return new haxe.at.dotpoint.math.vector.Quaternion(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return new haxe.at.dotpoint.math.vector.Quaternion(arr.__get(0), arr.__get(1), arr.__get(2), arr.__get(3));
	}
	
	
	public double x;
	
	public double y;
	
	public double z;
	
	public double w;
	
	public <T> T clone(java.lang.Object output)
	{
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( output == null )) 
		{
			//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{this.x}));
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{this.y}));
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{this.z}));
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		haxe.lang.Runtime.callField(output, "set_w", new haxe.root.Array(new java.lang.Object[]{this.w}));
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ((T) (output) );
	}
	
	
	public final double get_x()
	{
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.x;
	}
	
	
	public final double set_x(double value)
	{
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.x = value;
	}
	
	
	public final double get_y()
	{
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.y;
	}
	
	
	public final double set_y(double value)
	{
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.y = value;
	}
	
	
	public final double get_z()
	{
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.z;
	}
	
	
	public final double set_z(double value)
	{
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.z = value;
	}
	
	
	public final double get_w()
	{
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.w;
	}
	
	
	public final double set_w(double value)
	{
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return this.w = value;
	}
	
	
	public void toIdentity()
	{
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.x = ((double) (0) );
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.y = ((double) (0) );
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.z = ((double) (0) );
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.w = ((double) (1) );
	}
	
	
	public void conjugate()
	{
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.x =  - (this.x) ;
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.y =  - (this.y) ;
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.z =  - (this.z) ;
	}
	
	
	public void invert()
	{
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double l = ( ( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ) + ( this.w * this.w ) );
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( l == 0 )) 
		{
			//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return ;
		}
		
		//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double k = ( 1. / l );
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		this.conjugate();
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g = this;
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g.x = ( _g.x * k );
		}
		
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g1 = this;
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g1.y = ( _g1.y * k );
		}
		
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g2 = this;
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g2.z = ( _g2.z * k );
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g3 = this;
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g3.w = ( _g3.w * k );
		}
		
	}
	
	
	public void normalize()
	{
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double l = java.lang.Math.sqrt(( ( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ) + ( this.w * this.w ) ));
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		if (( l == 0 )) 
		{
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			this.toIdentity();
			//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			return ;
		}
		
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		double k = ( 1. / l );
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g = this;
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g.x = ( _g.x * k );
		}
		
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g1 = this;
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g1.y = ( _g1.y * k );
		}
		
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g2 = this;
			//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g2.z = ( _g2.z * k );
		}
		
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _g3 = this;
			//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			_g3.w = ( _g3.w * k );
		}
		
	}
	
	
	public final double length()
	{
		//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return java.lang.Math.sqrt(( ( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ) + ( this.w * this.w ) ));
	}
	
	
	public final double lengthSq()
	{
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ( ( ( ( this.x * this.x ) + ( this.y * this.y ) ) + ( this.z * this.z ) ) + ( this.w * this.w ) );
	}
	
	
	public double getYaw(haxe.at.dotpoint.math.vector.IQuaternion q)
	{
		//line 718 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return java.lang.Math.asin(( -2. * (( ( q.get_x() * q.get_z() ) - ( q.get_y() * q.get_w() ) )) ));
	}
	
	
	public double getPitch(haxe.at.dotpoint.math.vector.IQuaternion q)
	{
		//line 728 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return java.lang.Math.atan2(( 2. * (( ( q.get_y() * q.get_z() ) + ( q.get_x() * q.get_w() ) )) ), ( ( ( ( q.get_w() * q.get_w() ) - ( q.get_x() * q.get_x() ) ) - ( q.get_y() * q.get_y() ) ) + ( q.get_z() * q.get_z() ) ));
	}
	
	
	public double getRoll(haxe.at.dotpoint.math.vector.IQuaternion q)
	{
		//line 738 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return java.lang.Math.atan2(( 2. * (( ( q.get_x() * q.get_y() ) + ( q.get_z() * q.get_w() ) )) ), ( ( ( ( q.get_w() * q.get_w() ) + ( q.get_x() * q.get_x() ) ) - ( q.get_y() * q.get_y() ) ) - ( q.get_z() * q.get_z() ) ));
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 768 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return ( ( ( ( ( ( ( ( "[Quaternion;" + haxe.lang.Runtime.toString(this.x) ) + ", " ) + haxe.lang.Runtime.toString(this.y) ) + ", " ) + haxe.lang.Runtime.toString(this.z) ) + ", " ) + haxe.lang.Runtime.toString(this.w) ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_w(value);
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.w = ((double) (value) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_x(value);
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.x = ((double) (value) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_z(value);
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.z = ((double) (value) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_y(value);
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.y = ((double) (value) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_w(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.w = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_z(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.z = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return value;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("toString")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_x();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.x;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -75175693:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getRoll")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRoll")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_y();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.y;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 1962502538:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getPitch")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPitch")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_z();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.z;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1249344711:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getYaw")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getYaw")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 119:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_w();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.w;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("lengthSq")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lengthSq")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("clone")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("length")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("normalize")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1183703082:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("invert")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invert")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -678849384:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("conjugate")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "conjugate")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("toIdentity")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toIdentity")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_z")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_w")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_z")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_w")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_w();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.w;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_x();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.x;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_z();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.z;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						if (handleProperties) 
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.get_y();
						}
						else
						{
							//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
							return this.y;
						}
						
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("toString")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.toString();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("clone")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return ((java.lang.Object) (this.clone(dynargs.__get(0))) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -75175693:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getRoll")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.getRoll(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.get_x();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 1962502538:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getPitch")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.getPitch(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_x")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1249344711:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("getYaw")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.getYaw(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.get_y();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("lengthSq")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.lengthSq();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_y")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("length")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.length();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.get_z();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("normalize")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						this.normalize();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_z")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.set_z(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -1183703082:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("invert")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						this.invert();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("get_w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.get_w();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -678849384:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("conjugate")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						this.conjugate();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("set_w")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						return this.set_w(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					if (field.equals("toIdentity")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
						this.toIdentity();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		baseArr.push("w");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		baseArr.push("z");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		baseArr.push("y");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		baseArr.push("x");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Quaternion.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


