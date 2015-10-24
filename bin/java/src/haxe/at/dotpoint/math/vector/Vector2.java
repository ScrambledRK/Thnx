package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Vector2 extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IVector2
{
	public Vector2(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Vector2(java.lang.Object x, java.lang.Object y)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.at.dotpoint.math.vector.Vector2.__hx_ctor_haxe_at_dotpoint_math_vector_Vector2(this, x, y);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_vector_Vector2(haxe.at.dotpoint.math.vector.Vector2 __temp_me95, java.lang.Object x, java.lang.Object y)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		double __temp_y94 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		double __temp_x93 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		__temp_me95.set_x(__temp_x93);
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		__temp_me95.set_y(__temp_y94);
	}
	
	
	public static <T> T add(haxe.at.dotpoint.math.vector.IVector2 a, haxe.at.dotpoint.math.vector.IVector2 b, java.lang.Object output)
	{
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if (( output == null )) 
		{
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector2(null, null)) );
		}
		
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() + b.get_x() )}));
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() + b.get_y() )}));
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T subtract(haxe.at.dotpoint.math.vector.IVector2 a, haxe.at.dotpoint.math.vector.IVector2 b, java.lang.Object output)
	{
		//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if (( output == null )) 
		{
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector2(null, null)) );
		}
		
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() - b.get_x() )}));
		//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() - b.get_y() )}));
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ((T) (output) );
	}
	
	
	public static <T> T scale(haxe.at.dotpoint.math.vector.IVector2 a, double scalar, java.lang.Object output)
	{
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if (( output == null )) 
		{
			//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector2(null, null)) );
		}
		
		//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( a.get_x() * scalar )}));
		//line 184 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( a.get_y() * scalar )}));
		//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ((T) (output) );
	}
	
	
	public static boolean isEqual(haxe.at.dotpoint.math.vector.IVector2 a, haxe.at.dotpoint.math.vector.IVector2 b)
	{
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		boolean __temp_stmt1 = false;
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			double a1 = a.get_x();
			//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			double b1 = b.get_x();
			//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			__temp_stmt1 = ( (( a1 > b1 )) ? (( ( a1 - b1 ) < 1e-08 )) : (( ( b1 - a1 ) < 1e-08 )) );
		}
		
		//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			return false;
		}
		
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		boolean __temp_stmt2 = false;
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			double a2 = a.get_y();
			//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			double b2 = b.get_y();
			//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			__temp_stmt2 = ( (( a2 > b2 )) ? (( ( a2 - b2 ) < 1e-08 )) : (( ( b2 - a2 ) < 1e-08 )) );
		}
		
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if ( ! (__temp_stmt2) ) 
		{
			//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			return false;
		}
		
		//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return new haxe.at.dotpoint.math.vector.Vector2(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return new haxe.at.dotpoint.math.vector.Vector2(arr.__get(0), arr.__get(1));
	}
	
	
	public double x;
	
	public double y;
	
	public <T> T clone(java.lang.Object output)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if (( output == null )) 
		{
			//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector2(null, null)) );
		}
		
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{this.get_x()}));
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{this.get_y()}));
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ((T) (output) );
	}
	
	
	public double get_x()
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return this.x;
	}
	
	
	public double set_x(double value)
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return this.x = value;
	}
	
	
	public double get_y()
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return this.y;
	}
	
	
	public double set_y(double value)
	{
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return this.y = value;
	}
	
	
	public void set(double x, double y)
	{
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		this.set_x(x);
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		this.set_y(y);
	}
	
	
	public void normalize()
	{
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		double l = java.lang.Math.sqrt(( ( this.get_x() * this.get_x() ) + ( this.get_y() * this.get_y() ) ));
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		if (( l == 0 )) 
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			return ;
		}
		
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		double k = ( 1. / l );
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			haxe.at.dotpoint.math.vector.Vector2 _g = this;
			//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			_g.set_x(( _g.get_x() * k ));
		}
		
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			haxe.at.dotpoint.math.vector.Vector2 _g1 = this;
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			_g1.set_y(( _g1.get_y() * k ));
		}
		
	}
	
	
	public final double length()
	{
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return java.lang.Math.sqrt(( ( this.get_x() * this.get_x() ) + ( this.get_y() * this.get_y() ) ));
	}
	
	
	public final double lengthSq()
	{
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ( ( this.get_x() * this.get_x() ) + ( this.get_y() * this.get_y() ) );
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return ( ( ( ( "[Vector2;" + haxe.lang.Runtime.toString(this.get_x()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_y()) ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.set_y(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.y = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.set_x(value);
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.x = ((double) (value) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.y = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							this.x = ((double) (haxe.lang.Runtime.toDouble(value)) );
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return value;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.get_x();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.x;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("lengthSq")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "lengthSq")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.get_y();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.y;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("length")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("clone")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("normalize")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("get_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("get_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			switch (field.hashCode())
			{
				case 121:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.get_y();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.y;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 120:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						if (handleProperties) 
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.get_x();
						}
						else
						{
							//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
							return this.x;
						}
						
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			boolean __temp_executeDef1 = true;
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("toString")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.toString();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("clone")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return ((java.lang.Object) (this.clone(dynargs.__get(0))) );
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 1936401380:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("lengthSq")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.lengthSq();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("get_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.get_x();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("length")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.length();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set_x")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("normalize")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						this.normalize();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("get_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.get_y();
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						this.set(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					if (field.equals("set_y")) 
					{
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						__temp_executeDef1 = false;
						//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
					break;
				}
				
				
			}
			
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			if (__temp_executeDef1) 
			{
				//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		baseArr.push("y");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		baseArr.push("x");
		//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
		{
			//line 8 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\vector\\Vector2.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


