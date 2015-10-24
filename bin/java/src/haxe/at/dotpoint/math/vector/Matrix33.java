package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Matrix33 extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IMatrix33
{
	public Matrix33(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Matrix33(haxe.at.dotpoint.math.vector.IMatrix33 matrix)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		haxe.at.dotpoint.math.vector.Matrix33.__hx_ctor_haxe_at_dotpoint_math_vector_Matrix33(this, matrix);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_vector_Matrix33(haxe.at.dotpoint.math.vector.Matrix33 __temp_me86, haxe.at.dotpoint.math.vector.IMatrix33 matrix)
	{
		//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		if (( matrix != null )) 
		{
			//line 25 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			__temp_me86.set33(matrix);
		}
		else
		{
			//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			__temp_me86.toIdentity();
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		return new haxe.at.dotpoint.math.vector.Matrix33(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		return new haxe.at.dotpoint.math.vector.Matrix33(((haxe.at.dotpoint.math.vector.IMatrix33) (arr.__get(0)) ));
	}
	
	
	public double m11;
	
	public double m12;
	
	public double m13;
	
	public double m21;
	
	public double m22;
	
	public double m23;
	
	public double m31;
	
	public double m32;
	
	public double m33;
	
	public void set33(haxe.at.dotpoint.math.vector.IMatrix33 matrix)
	{
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m11 = haxe.lang.Runtime.getField_f(matrix, "m11", true);
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m12 = haxe.lang.Runtime.getField_f(matrix, "m12", true);
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m13 = haxe.lang.Runtime.getField_f(matrix, "m13", true);
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m21 = haxe.lang.Runtime.getField_f(matrix, "m21", true);
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m22 = haxe.lang.Runtime.getField_f(matrix, "m22", true);
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m23 = haxe.lang.Runtime.getField_f(matrix, "m23", true);
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m31 = haxe.lang.Runtime.getField_f(matrix, "m31", true);
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m32 = haxe.lang.Runtime.getField_f(matrix, "m32", true);
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m33 = haxe.lang.Runtime.getField_f(matrix, "m33", true);
	}
	
	
	public void toIdentity()
	{
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m11 = ((double) (1) );
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m12 = ((double) (0) );
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m13 = ((double) (0) );
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m21 = ((double) (0) );
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m22 = ((double) (1) );
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m23 = ((double) (0) );
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m31 = ((double) (0) );
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m32 = ((double) (0) );
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m33 = ((double) (1) );
	}
	
	
	public void transpose()
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		double t = 0.0;
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		t = this.m21;
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m21 = this.m12;
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m12 = t;
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		t = this.m31;
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m31 = this.m13;
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m13 = t;
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		t = this.m32;
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m32 = this.m23;
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m23 = t;
	}
	
	
	public double determinant()
	{
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		double cf0 = ( ( this.m22 * this.m33 ) - ( this.m23 * this.m32 ) );
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		double cf3 = ( ( this.m13 * this.m32 ) - ( this.m12 * this.m33 ) );
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		double cf6 = ( ( this.m12 * this.m23 ) - ( this.m13 * this.m22 ) );
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		return ( ( ( this.m11 * cf0 ) + ( this.m21 * cf3 ) ) + ( this.m31 * cf6 ) );
	}
	
	
	public haxe.root.Array<java.lang.Object> getArray(haxe.root.Array<java.lang.Object> output)
	{
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		if (( output == null )) 
		{
			//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			output = new haxe.root.Array<java.lang.Object>();
		}
		
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(0, this.m11);
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(1, this.m21);
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(2, this.m31);
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(3, this.m12);
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(4, this.m22);
		//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(5, this.m32);
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(6, this.m13);
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(7, this.m23);
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		output.__set(8, this.m33);
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		return output;
	}
	
	
	public void setArray(haxe.root.Array<java.lang.Object> input)
	{
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m11 = ((double) (haxe.lang.Runtime.toDouble(input.__get(0))) );
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m21 = ((double) (haxe.lang.Runtime.toDouble(input.__get(1))) );
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m31 = ((double) (haxe.lang.Runtime.toDouble(input.__get(2))) );
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m12 = ((double) (haxe.lang.Runtime.toDouble(input.__get(3))) );
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m22 = ((double) (haxe.lang.Runtime.toDouble(input.__get(4))) );
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m32 = ((double) (haxe.lang.Runtime.toDouble(input.__get(5))) );
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m13 = ((double) (haxe.lang.Runtime.toDouble(input.__get(6))) );
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m23 = ((double) (haxe.lang.Runtime.toDouble(input.__get(7))) );
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		this.m33 = ((double) (haxe.lang.Runtime.toDouble(input.__get(8))) );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			switch (field.hashCode())
			{
				case 106381:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m33 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m11")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m11 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m32")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m32 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m12")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m12 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m31")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m31 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m13")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m13 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m23")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m23 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m21")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m21 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m22")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m22 = ((double) (value) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			switch (field.hashCode())
			{
				case 106381:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m33 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m11")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m11 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m32")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m32 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m12")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m12 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m31")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m31 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m13")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m13 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m23")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m23 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m21")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m21 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m22")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.m22 = ((double) (haxe.lang.Runtime.toDouble(value)) );
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return value;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			switch (field.hashCode())
			{
				case 1387803415:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("setArray")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setArray")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m11")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m11;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 1948915875:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("getArray")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getArray")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m12")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m12;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 61485653:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("determinant")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "determinant")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m13")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m13;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 1052964665:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("transpose")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "transpose")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m21")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m21;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("toIdentity")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toIdentity")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m22")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m22;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 109326914:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("set33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set33")) );
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m23")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m23;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106381:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m33;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m31")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m31;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m32")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m32;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			switch (field.hashCode())
			{
				case 106381:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m33;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106317:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m11")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m11;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106380:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m32")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m32;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106318:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m12")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m12;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106379:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m31")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m31;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106319:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m13")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m13;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106350:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m23")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m23;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106348:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m21")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m21;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 106349:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("m22")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.m22;
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			switch (field.hashCode())
			{
				case 1387803415:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("setArray")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.setArray(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 109326914:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("set33")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.set33(((haxe.at.dotpoint.math.vector.IMatrix33) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 1948915875:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("getArray")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.getArray(((haxe.root.Array<java.lang.Object>) (dynargs.__get(0)) ));
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case -155830183:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("toIdentity")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.toIdentity();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 61485653:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("determinant")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						return this.determinant();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
				case 1052964665:
				{
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					if (field.equals("transpose")) 
					{
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						__temp_executeDef1 = false;
						//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
						this.transpose();
					}
					
					//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
					break;
				}
				
				
			}
			
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m33");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m32");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m31");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m23");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m22");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m21");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m13");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m12");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		baseArr.push("m11");
		//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
		{
			//line 6 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Matrix33.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


