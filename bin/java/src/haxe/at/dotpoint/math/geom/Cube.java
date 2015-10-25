package haxe.at.dotpoint.math.geom;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Cube extends haxe.lang.HxObject implements haxe.at.dotpoint.math.geom.ICube
{
	public Cube(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Cube(haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.geom.Cube.__hx_ctor_haxe_at_dotpoint_math_geom_Cube(this, pivot);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_geom_Cube(haxe.at.dotpoint.math.geom.Cube __temp_me72, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		__temp_me72.set_pivot(( (( pivot != null )) ? (pivot) : (((haxe.at.dotpoint.math.vector.IVector3) (haxe.at.dotpoint.math.AxisRelative.TOP_LEFT_FRONT) )) ));
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		__temp_me72.min = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		__temp_me72.max = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		__temp_me72.setEmpty();
	}
	
	
	public static boolean isCubeInside(haxe.at.dotpoint.math.geom.ICube cube, haxe.at.dotpoint.math.geom.ICube other, java.lang.Object equal)
	{
		//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		java.lang.Object __temp_equal70 = ( (haxe.lang.Runtime.eq(equal, null)) ? (((java.lang.Object) (false) )) : (equal) );
		//line 346 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( cube.isEmpty() || other.isEmpty() )) 
		{
			//line 347 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			return false;
		}
		
		//line 349 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( haxe.at.dotpoint.math.geom.Cube.isVector3Inside(cube, other.get_min(), __temp_equal70) && haxe.at.dotpoint.math.geom.Cube.isVector3Inside(cube, other.get_max(), __temp_equal70) );
	}
	
	
	public static boolean isVector3Inside(haxe.at.dotpoint.math.geom.ICube cube, haxe.at.dotpoint.math.vector.IVector3 point, java.lang.Object equal)
	{
		//line 365 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		java.lang.Object __temp_equal71 = ( (haxe.lang.Runtime.eq(equal, null)) ? (((java.lang.Object) (false) )) : (equal) );
		//line 366 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (cube.isEmpty()) 
		{
			//line 367 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			return false;
		}
		
		//line 369 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (haxe.lang.Runtime.toBool((__temp_equal71))) 
		{
			//line 371 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() <= cube.get_min().get_x() )) 
			{
				//line 372 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 374 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() <= cube.get_min().get_y() )) 
			{
				//line 375 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 377 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() <= cube.get_min().get_z() )) 
			{
				//line 378 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 380 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() >= cube.get_max().get_x() )) 
			{
				//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 383 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() >= cube.get_max().get_y() )) 
			{
				//line 384 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 386 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() >= cube.get_max().get_z() )) 
			{
				//line 387 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
		}
		else
		{
			//line 391 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() < cube.get_min().get_x() )) 
			{
				//line 392 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 394 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() < cube.get_min().get_y() )) 
			{
				//line 395 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 397 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() < cube.get_min().get_z() )) 
			{
				//line 398 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 400 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() > cube.get_max().get_x() )) 
			{
				//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 403 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() > cube.get_max().get_y() )) 
			{
				//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
			//line 406 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() > cube.get_max().get_z() )) 
			{
				//line 407 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return false;
			}
			
		}
		
		//line 410 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return true;
	}
	
	
	public static void insertCube(haxe.at.dotpoint.math.geom.ICube cube, haxe.at.dotpoint.math.geom.ICube other)
	{
		//line 431 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (other.isEmpty()) 
		{
			//line 432 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			return ;
		}
		
		//line 434 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.geom.Cube.insertVector3(cube, other.get_min());
		//line 435 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.geom.Cube.insertVector3(cube, other.get_max());
	}
	
	
	public static void insertVector3(haxe.at.dotpoint.math.geom.ICube cube, haxe.at.dotpoint.math.vector.IVector3 point)
	{
		//line 451 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (cube.isEmpty()) 
		{
			//line 453 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_min().set_x(point.get_x());
			//line 454 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_min().set_y(point.get_y());
			//line 455 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_min().set_z(point.get_z());
			//line 457 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_max().set_x(point.get_x());
			//line 458 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_max().set_y(point.get_y());
			//line 459 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			cube.get_max().set_z(point.get_z());
		}
		else
		{
			//line 463 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() < cube.get_min().get_x() )) 
			{
				//line 464 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_min().set_x(point.get_x());
			}
			
			//line 466 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() < cube.get_min().get_y() )) 
			{
				//line 467 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_min().set_y(point.get_y());
			}
			
			//line 469 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() < cube.get_min().get_z() )) 
			{
				//line 470 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_min().set_z(point.get_z());
			}
			
			//line 472 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_x() > cube.get_max().get_x() )) 
			{
				//line 473 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_max().set_x(point.get_x());
			}
			
			//line 475 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_y() > cube.get_max().get_y() )) 
			{
				//line 476 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_max().set_y(point.get_y());
			}
			
			//line 478 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (( point.get_z() > cube.get_max().get_z() )) 
			{
				//line 479 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				cube.get_max().set_z(point.get_z());
			}
			
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return new haxe.at.dotpoint.math.geom.Cube(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return new haxe.at.dotpoint.math.geom.Cube(((haxe.at.dotpoint.math.vector.IVector3) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 pivot;
	
	public haxe.at.dotpoint.math.vector.IVector3 min;
	
	public haxe.at.dotpoint.math.vector.IVector3 max;
	
	
	
	
	
	
	
	public haxe.at.dotpoint.math.geom.Cube clone(haxe.at.dotpoint.math.geom.Cube output)
	{
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( output == null )) 
		{
			//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			output = new haxe.at.dotpoint.math.geom.Cube(((haxe.at.dotpoint.math.vector.IVector3) (null) ));
		}
		
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_pivot().set_x(this.get_pivot().get_x());
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_pivot().set_y(this.get_pivot().get_y());
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_pivot().set_z(this.get_pivot().get_z());
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_min().set_x(this.get_min().get_x());
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_min().set_y(this.get_min().get_y());
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_min().set_z(this.get_min().get_z());
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_max().set_x(this.get_max().get_x());
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_max().set_y(this.get_max().get_y());
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		output.get_max().set_z(this.get_max().get_z());
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return output;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_min()
	{
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return this.min;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_max()
	{
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return this.max;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_pivot()
	{
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return this.pivot;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_pivot(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return this.pivot = value;
	}
	
	
	public double get_width()
	{
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( this.get_max().get_x() - this.get_min().get_x() );
	}
	
	
	public double set_width(double value)
	{
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( value < 0 )) 
		{
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			throw haxe.lang.HaxeException.wrap(( ( "dimension must be positive but " + haxe.lang.Runtime.toString(value) ) + " given" ));
		}
		
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (this.isEmpty()) 
		{
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			this.setZero();
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.vector.IVector3 center = ((haxe.at.dotpoint.math.vector.IVector3) (this.getPivot(null)) );
		//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_x(( center.get_x() - ( value * this.get_pivot().get_x() ) ));
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_x(( center.get_x() + ( value * (( 1 - this.get_pivot().get_x() )) ) ));
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return value;
	}
	
	
	public double get_height()
	{
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( this.get_max().get_y() - this.get_min().get_y() );
	}
	
	
	public double set_height(double value)
	{
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( value < 0 )) 
		{
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			throw haxe.lang.HaxeException.wrap(( ( "dimension must be positive but " + haxe.lang.Runtime.toString(value) ) + " given" ));
		}
		
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (this.isEmpty()) 
		{
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			this.setZero();
		}
		
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.vector.IVector3 center = ((haxe.at.dotpoint.math.vector.IVector3) (this.getPivot(null)) );
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_y(( center.get_y() - ( value * this.get_pivot().get_y() ) ));
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_y(( center.get_y() + ( value * (( 1 - this.get_pivot().get_y() )) ) ));
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return value;
	}
	
	
	public double get_length()
	{
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( this.get_max().get_z() - this.get_min().get_z() );
	}
	
	
	public double set_length(double value)
	{
		//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( value < 0 )) 
		{
			//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			throw haxe.lang.HaxeException.wrap(( ( "dimension must be positive but " + haxe.lang.Runtime.toString(value) ) + " given" ));
		}
		
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (this.isEmpty()) 
		{
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			this.setZero();
		}
		
		//line 192 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.at.dotpoint.math.vector.IVector3 center = ((haxe.at.dotpoint.math.vector.IVector3) (this.getPivot(null)) );
		//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_z(( center.get_z() - ( value * this.get_pivot().get_z() ) ));
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_z(( center.get_z() + ( value * (( 1 - this.get_pivot().get_z() )) ) ));
		//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return value;
	}
	
	
	public void setZero()
	{
		//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_x(((double) (0) ));
		//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_y(((double) (0) ));
		//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_z(((double) (0) ));
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_x(((double) (0) ));
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_y(((double) (0) ));
		//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_z(((double) (0) ));
	}
	
	
	public void setEmpty()
	{
		//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_x(((double) (1) ));
		//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_y(((double) (1) ));
		//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_min().set_z(((double) (1) ));
		//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_x(((double) (-1) ));
		//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_y(((double) (-1) ));
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.get_max().set_z(((double) (-1) ));
	}
	
	
	public boolean isEmpty()
	{
		//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( ( ( this.get_width() < 0 ) || ( this.get_height() < 0 ) ) || ( this.get_length() < 0 ) );
	}
	
	
	public void setDimensions(double w, double h, double l, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 261 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( pivot != null )) 
		{
			//line 262 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			this.set_pivot(pivot);
		}
		
		//line 264 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.set_width(w);
		//line 265 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.set_height(h);
		//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.set_length(l);
	}
	
	
	public void setExtensions(haxe.at.dotpoint.math.vector.IVector3 min, haxe.at.dotpoint.math.vector.IVector3 max, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 282 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( pivot != null )) 
		{
			//line 283 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			this.set_pivot(pivot);
		}
		
		//line 285 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( ( ( min.get_x() > max.get_x() ) || ( min.get_y() > max.get_y() ) ) || ( min.get_z() > max.get_z() ) )) 
		{
			//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			throw haxe.lang.HaxeException.wrap(( ( ( "dimensions must be positive but max extend " + haxe.root.Std.string(max) ) + " is smaller than min " ) + haxe.root.Std.string(min) ));
		}
		
		//line 288 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.min = min;
		//line 289 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		this.max = max;
	}
	
	
	public <T> T getPivot(java.lang.Object output)
	{
		//line 302 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ((T) (this.getPoint(this.get_pivot(), output)) );
	}
	
	
	public <T> T getPoint(haxe.at.dotpoint.math.vector.IVector3 point, java.lang.Object output)
	{
		//line 318 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		if (( output == null )) 
		{
			//line 319 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 321 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{( this.get_min().get_x() + ( this.get_width() * point.get_x() ) )}));
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{( this.get_min().get_y() + ( this.get_height() * point.get_y() ) )}));
		//line 323 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{( this.get_min().get_z() + ( this.get_length() * point.get_z() ) )}));
		//line 325 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ((T) (output) );
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 493 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return ( ( ( ( ( ( ( ( ( ( ( ( "{x:" + haxe.lang.Runtime.toString(this.get_min().get_x()) ) + " y:" ) + haxe.lang.Runtime.toString(this.get_min().get_y()) ) + " z:" ) + haxe.lang.Runtime.toString(this.get_min().get_z()) ) + " w:" ) + haxe.lang.Runtime.toString(this.get_width()) ) + " h:" ) + haxe.lang.Runtime.toString(this.get_height()) ) + " l:" ) + haxe.lang.Runtime.toString(this.get_length()) ) + "}" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_length(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_width(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_height(value);
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_length(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 106679362:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						if (handleProperties) 
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							this.set_pivot(((haxe.at.dotpoint.math.vector.IVector3) (value) ));
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return value;
						}
						else
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							this.pivot = ((haxe.at.dotpoint.math.vector.IVector3) (value) );
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return value;
						}
						
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_height(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 108114:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("min")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.min = ((haxe.at.dotpoint.math.vector.IVector3) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.set_width(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 107876:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("max")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.max = ((haxe.at.dotpoint.math.vector.IVector3) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("toString")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 106679362:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						if (handleProperties) 
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.get_pivot();
						}
						else
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.pivot;
						}
						
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1962671066:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("getPoint")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPoint")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 108114:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("min")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						if (handleProperties) 
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.get_min();
						}
						else
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.min;
						}
						
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1962504844:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("getPivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPivot")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 107876:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("max")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						if (handleProperties) 
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.get_max();
						}
						else
						{
							//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
							return this.max;
						}
						
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1333038570:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setExtensions")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setExtensions")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_width();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 890717647:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setDimensions")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDimensions")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_height();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 2058039875:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("isEmpty")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isEmpty")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1106363674:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_length();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1391347211:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setEmpty")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setEmpty")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("clone")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1985162794:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setZero")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setZero")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -74790423:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_min")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_min")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_length")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -74790661:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_max")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_max")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_length")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1143629337:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_pivot")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1498513500:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_height")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 929012261:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_pivot")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 859648560:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_height")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1150076829:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_width")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 935459753:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_width")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			switch (field.hashCode())
			{
				case -1106363674:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_length();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_width();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_height();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("toString")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.toString();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 94756189:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("clone")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.clone(((haxe.at.dotpoint.math.geom.Cube) (dynargs.__get(0)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1962671066:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("getPoint")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((java.lang.Object) (this.getPoint(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ), dynargs.__get(1))) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -74790423:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_min")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_min();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1962504844:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("getPivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return ((java.lang.Object) (this.getPivot(dynargs.__get(0))) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -74790661:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_max")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_max();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1333038570:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setExtensions")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.setExtensions(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(1)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(2)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1143629337:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_pivot();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 890717647:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setDimensions")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.setDimensions(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(1))) ), ((double) (haxe.lang.Runtime.toDouble(dynargs.__get(2))) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(3)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 929012261:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_pivot")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.set_pivot(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 2058039875:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("isEmpty")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.isEmpty();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1150076829:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_width();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1391347211:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setEmpty")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.setEmpty();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 935459753:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_width")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.set_width(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 1985162794:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("setZero")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						this.setZero();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 859648560:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_height();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1383847581:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.set_length(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case -1498513500:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("set_height")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.set_height(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
				case 974314479:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					if (field.equals("get_length")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
						return this.get_length();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("length");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("height");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("width");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("max");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("min");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		baseArr.push("pivot");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\geom\\Cube.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


