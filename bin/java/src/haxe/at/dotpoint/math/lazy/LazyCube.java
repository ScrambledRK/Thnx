package haxe.at.dotpoint.math.lazy;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LazyCube extends haxe.lang.HxObject implements haxe.at.dotpoint.math.geom.ICube
{
	public LazyCube(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LazyCube(haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		haxe.at.dotpoint.math.lazy.LazyCube.__hx_ctor_haxe_at_dotpoint_math_lazy_LazyCube(this, pivot);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_lazy_LazyCube(haxe.at.dotpoint.math.lazy.LazyCube __temp_me77, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		__temp_me77.value = new haxe.at.dotpoint.math.geom.Cube(((haxe.at.dotpoint.math.vector.IVector3) (pivot) ));
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		__temp_me77.lazy = new haxe.at.dotpoint.core.lazy.LazyComponent(null, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return new haxe.at.dotpoint.math.lazy.LazyCube(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return new haxe.at.dotpoint.math.lazy.LazyCube(((haxe.at.dotpoint.math.vector.IVector3) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.math.geom.Cube value;
	
	public haxe.at.dotpoint.core.lazy.LazyComponent lazy;
	
	
	
	public haxe.at.dotpoint.math.vector.IVector3 min;
	
	public haxe.at.dotpoint.math.vector.IVector3 max;
	
	
	
	
	
	
	
	public void setEmpty()
	{
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.setEmpty();
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public boolean isEmpty()
	{
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.isEmpty();
	}
	
	
	public void setDimensions(double w, double h, double l, haxe.at.dotpoint.math.vector.IVector3 p)
	{
		//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if (( p == null )) 
		{
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			p = this.value.get_pivot();
		}
		
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_boolv5 = false;
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			double a = this.get_width();
			//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			__temp_boolv5 = ( (( a > w )) ? (( ( a - w ) < 1e-08 )) : (( ( w - a ) < 1e-08 )) );
		}
		
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_boolv4 = false;
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_boolv3 = false;
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_boolv2 = false;
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if (__temp_boolv5) 
		{
			//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				double a1 = this.get_height();
				//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				__temp_boolv4 = ( (( a1 > h )) ? (( ( a1 - h ) < 1e-08 )) : (( ( h - a1 ) < 1e-08 )) );
			}
			
			//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_boolv4) 
			{
				//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				{
					//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					double a2 = this.get_length();
					//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					__temp_boolv3 = ( (( a2 > l )) ? (( ( a2 - l ) < 1e-08 )) : (( ( l - a2 ) < 1e-08 )) );
				}
				
				//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (__temp_boolv3) 
				{
					//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					__temp_boolv2 = haxe.at.dotpoint.math.vector.Vector3.isEqual(this.get_pivot(), p);
				}
				
			}
			
		}
		
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_stmt1 = ( ( ( __temp_boolv5 && __temp_boolv4 ) && __temp_boolv3 ) && __temp_boolv2 );
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if (__temp_stmt1) 
		{
			//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			return ;
		}
		
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.set_pivot(p);
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.set_width(w);
		//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.set_height(h);
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.set_length(l);
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public void setExtensions(haxe.at.dotpoint.math.vector.IVector3 min, haxe.at.dotpoint.math.vector.IVector3 max, haxe.at.dotpoint.math.vector.IVector3 p)
	{
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if (( p == null )) 
		{
			//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			p = this.value.get_pivot();
		}
		
		//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if (( ( haxe.at.dotpoint.math.vector.Vector3.isEqual(this.get_min(), min) && haxe.at.dotpoint.math.vector.Vector3.isEqual(this.get_max(), max) ) && haxe.at.dotpoint.math.vector.Vector3.isEqual(this.get_pivot(), p) )) 
		{
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			return ;
		}
		
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.set_pivot(p);
		//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_min().set_x(min.get_x());
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_min().set_y(min.get_y());
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_min().set_z(min.get_z());
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_max().set_x(max.get_x());
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_max().set_y(max.get_y());
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		this.value.get_max().set_z(max.get_z());
		//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_pivot()
	{
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 192 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_pivot();
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_pivot(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (haxe.at.dotpoint.math.vector.Vector3.isEqual(this.value.get_pivot(), value)) ) 
		{
			//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.set_pivot(value);
			//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	public double get_width()
	{
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_width();
	}
	
	
	public double set_width(double value)
	{
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_stmt1 = false;
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			double a = this.value.get_width();
			//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.set_width(value);
			//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	public double get_height()
	{
		//line 234 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 234 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 234 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 234 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 235 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_height();
	}
	
	
	public double set_height(double value)
	{
		//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_stmt1 = false;
		//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			double a = this.value.get_height();
			//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 242 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.set_height(value);
			//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	public double get_length()
	{
		//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_length();
	}
	
	
	public double set_length(double value)
	{
		//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		boolean __temp_stmt1 = false;
		//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			double a = this.value.get_length();
			//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			__temp_stmt1 = ( (( a > value )) ? (( ( a - value ) < 1e-08 )) : (( ( value - a ) < 1e-08 )) );
		}
		
		//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (__temp_stmt1) ) 
		{
			//line 262 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.set_length(value);
			//line 263 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 263 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 263 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 263 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_min()
	{
		//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 278 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_min();
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_min(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 283 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (haxe.at.dotpoint.math.vector.Vector3.isEqual(this.value.get_min(), value)) ) 
		{
			//line 285 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.min = value;
			//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 289 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_max()
	{
		//line 297 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 297 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 297 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (( _this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 297 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				_this.onValidate.__hx_invoke0_o();
			}
			
		}
		
		//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return this.value.get_max();
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_max(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 303 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		if ( ! (haxe.at.dotpoint.math.vector.Vector3.isEqual(this.value.get_max(), value)) ) 
		{
			//line 305 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			this.value.max = value;
			//line 306 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			{
				//line 306 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
				//line 306 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				if (_this.allowDispatchUpdate) 
				{
					//line 306 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					_this.onUpdate.__hx_invoke0_o();
				}
				
			}
			
		}
		
		//line 309 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return value;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return ( ( ( ( ( ( ( ( "{x:" + haxe.lang.Runtime.toString(this.get_min().get_x()) ) + " y:" ) + haxe.lang.Runtime.toString(this.get_min().get_y()) ) + " w:" ) + haxe.lang.Runtime.toString(this.get_width()) ) + " h:" ) + haxe.lang.Runtime.toString(this.get_height()) ) + "}" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_length(value);
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_width(value);
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_height(value);
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_length(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("value")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.value = ((haxe.at.dotpoint.math.geom.Cube) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_height(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("lazy")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.lazy = ((haxe.at.dotpoint.core.lazy.LazyComponent) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_width(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 106679362:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.set_pivot(((haxe.at.dotpoint.math.vector.IVector3) (value) ));
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 107876:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.max = ((haxe.at.dotpoint.math.vector.IVector3) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 108114:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.min = ((haxe.at.dotpoint.math.vector.IVector3) (value) );
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("toString")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 111972721:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("value")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.value;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1985318919:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_max")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("lazy")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.lazy;
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -74790661:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_max")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 106679362:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_pivot();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1985319157:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_min")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 108114:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						if (handleProperties) 
						{
							//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
							return this.get_min();
						}
						else
						{
							//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
							return this.min;
						}
						
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -74790423:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_min")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 107876:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						if (handleProperties) 
						{
							//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
							return this.get_max();
						}
						else
						{
							//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
							return this.max;
						}
						
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_length")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_width();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_length")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_height();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1498513500:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_height")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_length();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 859648560:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_height")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1391347211:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setEmpty")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setEmpty")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 935459753:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_width")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 2058039875:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("isEmpty")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isEmpty")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1150076829:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_width")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 890717647:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setDimensions")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDimensions")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 929012261:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_pivot")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1333038570:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setExtensions")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setExtensions")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1143629337:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_pivot")) );
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_length();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_width();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_height();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("toString")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.toString();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1391347211:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setEmpty")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.setEmpty();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1985318919:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_max(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 2058039875:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("isEmpty")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.isEmpty();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -74790661:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_max")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_max();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 890717647:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setDimensions")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.setDimensions(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(3)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1985319157:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_min(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1333038570:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("setExtensions")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						this.setExtensions(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(1)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(2)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -74790423:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_min")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_min();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1143629337:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_pivot();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_length(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 929012261:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_pivot")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_pivot(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_length")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_length();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 1150076829:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_width();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case -1498513500:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_height(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 935459753:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("set_width")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.set_width(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
				case 859648560:
				{
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					if (field.equals("get_height")) 
					{
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						__temp_executeDef1 = false;
						//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
						return this.get_height();
					}
					
					//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
					break;
				}
				
				
			}
			
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("length");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("height");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("width");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("max");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("min");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("pivot");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("lazy");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		baseArr.push("value");
		//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
		{
			//line 18 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\lazy\\LazyCube.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


