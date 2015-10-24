package haxe.at.dotpoint.math.lazy;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LazyQuaternion extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IQuaternion
{
	public LazyQuaternion(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LazyQuaternion(java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		haxe.at.dotpoint.math.lazy.LazyQuaternion.__hx_ctor_haxe_at_dotpoint_math_lazy_LazyQuaternion(this, x, y, z, w);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_lazy_LazyQuaternion(haxe.at.dotpoint.math.lazy.LazyQuaternion __temp_me80, java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		double __temp_w79 = ( (haxe.lang.Runtime.eq(w, null)) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(w)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		double __temp_z78 = ( (haxe.lang.Runtime.eq(z, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(z)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		double __temp_y77 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		double __temp_x76 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		__temp_me80.value = new haxe.at.dotpoint.math.vector.Quaternion(__temp_x76, __temp_y77, __temp_z78, __temp_w79);
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		__temp_me80.lazy = new haxe.at.dotpoint.core.lazy.LazyComponent(null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return new haxe.at.dotpoint.math.lazy.LazyQuaternion(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return new haxe.at.dotpoint.math.lazy.LazyQuaternion(arr.__get(0), arr.__get(1), arr.__get(2), arr.__get(3));
	}
	
	
	public haxe.at.dotpoint.math.vector.Quaternion value;
	
	public haxe.at.dotpoint.core.lazy.LazyComponent lazy;
	
	
	
	
	
	
	
	
	
	public void set(double x, double y, double z, double w)
	{
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_boolv5 = false;
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			double a = this.get_x();
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			__temp_boolv5 = ( (( a > x )) ? (( ( a - x ) < 1e-08 )) : (( ( x - a ) < 1e-08 )) );
		}
		
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_boolv4 = false;
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_boolv3 = false;
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_boolv2 = false;
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if (__temp_boolv5) 
		{
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			{
				//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				double a1 = this.get_y();
				//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				__temp_boolv4 = ( (( a1 > y )) ? (( ( a1 - y ) < 1e-08 )) : (( ( y - a1 ) < 1e-08 )) );
			}
			
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_boolv4) 
			{
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				{
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					double a2 = this.get_z();
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					__temp_boolv3 = ( (( a2 > z )) ? (( ( a2 - z ) < 1e-08 )) : (( ( z - a2 ) < 1e-08 )) );
				}
				
				//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				if (__temp_boolv3) 
				{
					//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					{
						//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						double a3 = this.get_w();
						//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_boolv2 = ( (( a3 > w )) ? (( ( a3 - w ) < 1e-08 )) : (( ( w - a3 ) < 1e-08 )) );
					}
					
				}
				
			}
			
		}
		
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_stmt1 = ( ( ( __temp_boolv5 && __temp_boolv4 ) && __temp_boolv3 ) && __temp_boolv2 );
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if (__temp_stmt1) 
		{
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			return ;
		}
		
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		this.set_x(x);
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		this.set_y(y);
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		this.set_z(z);
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		this.set_w(w);
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public double get_x()
	{
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return this.value.x;
	}
	
	
	public double set_x(double value)
	{
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_stmt1 = false;
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			double a = this.value.x;
			//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			this.value.x = value;
			//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			{
				//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return value;
	}
	
	
	public double get_y()
	{
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return this.value.y;
	}
	
	
	public double set_y(double value)
	{
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_stmt1 = false;
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			double a = this.value.y;
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			this.value.y = value;
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			{
				//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return value;
	}
	
	
	public double get_z()
	{
		//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return this.value.z;
	}
	
	
	public double set_z(double value)
	{
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_stmt1 = false;
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			double a = this.value.z;
			//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			this.value.z = value;
			//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			{
				//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return value;
	}
	
	
	public double get_w()
	{
		//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return this.value.w;
	}
	
	
	public double set_w(double value)
	{
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		boolean __temp_stmt1 = false;
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			double a = this.value.w;
			//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			this.value.w = value;
			//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			{
				//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 178 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return value;
	}
	
	
	public void normalize()
	{
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		this.value.normalize();
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this1 = this.lazy;
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (_this1.allowDispatchUpdate) 
			{
				//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this1.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public double length()
	{
		//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			haxe.at.dotpoint.math.vector.Quaternion _this1 = this.value;
			//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			return java.lang.Math.sqrt(( ( ( ( _this1.x * _this1.x ) + ( _this1.y * _this1.y ) ) + ( _this1.z * _this1.z ) ) + ( _this1.w * _this1.w ) ));
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return ( ( ( ( ( ( ( ( "[LazyQuaternion;" + haxe.lang.Runtime.toString(this.get_x()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_y()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_z()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_w()) ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_w(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_x(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_z(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_y(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_w(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("value")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.value = ((haxe.at.dotpoint.math.vector.Quaternion) (value) );
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_z(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("lazy")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.lazy = ((haxe.at.dotpoint.core.lazy.LazyComponent) (value) );
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("toString")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("value")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("length")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("lazy")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.lazy;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("normalize")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_w")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_w")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_z")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_z")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("toString")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.toString();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.set(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(3))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("length")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.length();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("normalize")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						this.normalize();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.set_w(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("set_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.set_z(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					if (field.equals("get_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("w");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("z");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("y");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("x");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("lazy");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		baseArr.push("value");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyQuaternion.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


