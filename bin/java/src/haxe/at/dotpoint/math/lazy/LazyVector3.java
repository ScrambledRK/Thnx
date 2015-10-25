package haxe.at.dotpoint.math.lazy;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LazyVector3 extends haxe.lang.HxObject implements haxe.at.dotpoint.math.vector.IVector3
{
	public LazyVector3(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LazyVector3(java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		haxe.at.dotpoint.math.lazy.LazyVector3.__hx_ctor_haxe_at_dotpoint_math_lazy_LazyVector3(this, x, y, z, w);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_lazy_LazyVector3(haxe.at.dotpoint.math.lazy.LazyVector3 __temp_me87, java.lang.Object x, java.lang.Object y, java.lang.Object z, java.lang.Object w)
	{
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		double __temp_w86 = ( (haxe.lang.Runtime.eq(w, null)) ? (((double) (1) )) : (((double) (haxe.lang.Runtime.toDouble(w)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		double __temp_z85 = ( (haxe.lang.Runtime.eq(z, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(z)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		double __temp_y84 = ( (haxe.lang.Runtime.eq(y, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(y)) )) );
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		double __temp_x83 = ( (haxe.lang.Runtime.eq(x, null)) ? (((double) (0) )) : (((double) (haxe.lang.Runtime.toDouble(x)) )) );
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		__temp_me87.value = new haxe.at.dotpoint.math.vector.Vector3(__temp_x83, __temp_y84, __temp_z85, __temp_w86);
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		__temp_me87.lazy = new haxe.at.dotpoint.core.lazy.LazyComponent(null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return new haxe.at.dotpoint.math.lazy.LazyVector3(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return new haxe.at.dotpoint.math.lazy.LazyVector3(arr.__get(0), arr.__get(1), arr.__get(2), arr.__get(3));
	}
	
	
	public haxe.at.dotpoint.math.vector.Vector3 value;
	
	public haxe.at.dotpoint.core.lazy.LazyComponent lazy;
	
	
	
	
	
	
	
	
	
	public void set(double x, double y, double z, java.lang.Object w)
	{
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if (haxe.lang.Runtime.eq(w, null)) 
		{
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			w = this.get_w();
		}
		
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_boolv5 = false;
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double a = this.get_x();
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			__temp_boolv5 = ( (( a > x )) ? (( ( a - x ) < 1e-08 )) : (( ( x - a ) < 1e-08 )) );
		}
		
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_boolv4 = false;
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_boolv3 = false;
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_boolv2 = false;
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if (__temp_boolv5) 
		{
			//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			{
				//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				double a1 = this.get_y();
				//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				__temp_boolv4 = ( (( a1 > y )) ? (( ( a1 - y ) < 1e-08 )) : (( ( y - a1 ) < 1e-08 )) );
			}
			
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_boolv4) 
			{
				//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				{
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					double a2 = this.get_z();
					//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					__temp_boolv3 = ( (( a2 > z )) ? (( ( a2 - z ) < 1e-08 )) : (( ( z - a2 ) < 1e-08 )) );
				}
				
				//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				if (__temp_boolv3) 
				{
					//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					{
						//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						double a3 = this.get_w();
						//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						double b = ((double) (haxe.lang.Runtime.toDouble(w)) );
						//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_boolv2 = ( (( a3 > b )) ? (( ( a3 - b ) < 1e-08 )) : (( ( b - a3 ) < 1e-08 )) );
					}
					
				}
				
			}
			
		}
		
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_stmt1 = ( ( ( __temp_boolv5 && __temp_boolv4 ) && __temp_boolv3 ) && __temp_boolv2 );
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if (__temp_stmt1) 
		{
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			return ;
		}
		
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		this.value.x = x;
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		this.value.y = y;
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		this.value.z = z;
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double value = ((double) (haxe.lang.Runtime.toDouble(w)) );
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			this.value.w = value;
		}
		
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public double get_x()
	{
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return this.value.x;
	}
	
	
	public double set_x(double value)
	{
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_stmt1 = false;
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double a = this.value.x;
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			this.value.x = value;
			//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			{
				//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return value;
	}
	
	
	public double get_y()
	{
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return this.value.y;
	}
	
	
	public double set_y(double value)
	{
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_stmt1 = false;
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double a = this.value.y;
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			this.value.y = value;
			//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			{
				//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return value;
	}
	
	
	public double get_z()
	{
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return this.value.z;
	}
	
	
	public double set_z(double value)
	{
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_stmt1 = false;
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double a = this.value.z;
			//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			this.value.z = value;
			//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			{
				//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return value;
	}
	
	
	public double get_w()
	{
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return this.value.w;
	}
	
	
	public double set_w(double value)
	{
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		boolean __temp_stmt1 = false;
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			double a = this.value.w;
			//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 178 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			this.value.w = value;
			//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			{
				//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return value;
	}
	
	
	public void normalize()
	{
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		this.value.normalize();
		//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this1 = this.lazy;
			//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (_this1.allowDispatchUpdate) 
			{
				//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this1.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public double length()
	{
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			haxe.at.dotpoint.math.vector.Vector3 _this1 = this.value;
			//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			return java.lang.Math.sqrt(( ( ( _this1.x * _this1.x ) + ( _this1.y * _this1.y ) ) + ( _this1.z * _this1.z ) ));
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return ( ( ( ( ( ( ( ( "[LazyVector3;" + haxe.lang.Runtime.toString(this.get_x()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_y()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_z()) ) + ", " ) + haxe.lang.Runtime.toString(this.get_w()) ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_w(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_x(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_z(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_y(value);
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_w(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("value")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.value = ((haxe.at.dotpoint.math.vector.Vector3) (value) );
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_z(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("lazy")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.lazy = ((haxe.at.dotpoint.core.lazy.LazyComponent) (value) );
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("toString")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("value")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.value;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("length")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "length")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("lazy")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.lazy;
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("normalize")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "normalize")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_w")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_w")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_z")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_z")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			switch (field.hashCode())
			{
				case 119:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 120:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 122:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 121:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("toString")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.toString();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.set(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), dynargs.__get(3));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("length")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.length();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_x();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 236609293:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("normalize")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						this.normalize();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_x")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328346:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.set_w(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_y();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246094:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_w")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_w();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_y")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("set_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.set_z(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					if (field.equals("get_z")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
						return this.get_z();
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("w");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("z");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("y");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("x");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("lazy");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		baseArr.push("value");
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyVector3.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


