package haxe.at.dotpoint.math;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Trigonometry extends haxe.lang.HxObject
{
	public Trigonometry(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Trigonometry()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.Trigonometry.__hx_ctor_haxe_at_dotpoint_math_Trigonometry(this);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_math_Trigonometry(haxe.at.dotpoint.math.Trigonometry __temp_me67)
	{
	}
	
	
	public static <T> T project(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b, java.lang.Object output)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( output == null )) 
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double l = ( ( ( a.get_x() * a.get_x() ) + ( a.get_y() * a.get_y() ) ) + ( a.get_z() * a.get_z() ) );
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( l == 0 )) 
		{
			//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			throw haxe.lang.HaxeException.wrap("undefined result");
		}
		
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double d = haxe.at.dotpoint.math.vector.Vector3.dot(a, b);
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double div = ( d / l );
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return ((T) (haxe.at.dotpoint.math.vector.Vector3.scale(a, div, output)) );
	}
	
	
	public static void orthoNormalize(haxe.root.Array<haxe.at.dotpoint.math.vector.IVector3> vectors)
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		int _g1 = 0;
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		int _g = vectors.length;
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		while (( _g1 < _g ))
		{
			//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			int i = _g1++;
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			haxe.at.dotpoint.math.vector.Vector3 sum = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
			//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			{
				//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				int _g2 = 0;
				//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				while (( _g2 < i ))
				{
					//line 44 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					int j = _g2++;
					//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					haxe.at.dotpoint.math.vector.Vector3 projected = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.Trigonometry.project(vectors.__get(i), vectors.__get(j), null)) );
					//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					haxe.at.dotpoint.math.vector.Vector3.add(sum, projected, sum);
				}
				
			}
			
			//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			((haxe.at.dotpoint.math.vector.IVector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(vectors.__get(i), sum, vectors.__get(i))) ).normalize();
		}
		
	}
	
	
	public static double getRadianAngle(haxe.at.dotpoint.math.vector.IVector3 a, haxe.at.dotpoint.math.vector.IVector3 b, haxe.at.dotpoint.math.vector.IVector3 n)
	{
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 fc = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.cross(a, b, null)) );
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double fd = haxe.at.dotpoint.math.vector.Vector3.dot(a, b);
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double angle = java.lang.Math.atan2(java.lang.Math.sqrt(( ( ( fc.x * fc.x ) + ( fc.y * fc.y ) ) + ( fc.z * fc.z ) )), fd);
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( n != null )) 
		{
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			double value = haxe.at.dotpoint.math.vector.Vector3.dot(n, fc);
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			if (( value < 0 )) 
			{
				//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				angle *= ((double) (-1) );
			}
			else
			{
				//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				if (( value > 0 )) 
				{
					//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					angle *= ((double) (1) );
				}
				else
				{
					//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					angle *= ((double) (0) );
				}
				
			}
			
		}
		
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return angle;
	}
	
	
	public static haxe.at.dotpoint.math.vector.Vector3 calculatetNormal(haxe.at.dotpoint.math.vector.IVector3 v1, haxe.at.dotpoint.math.vector.IVector3 v2, haxe.at.dotpoint.math.vector.IVector3 v3)
	{
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 sub1 = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(v2, v1, null)) );
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 sub2 = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(v3, v1, null)) );
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 cross = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.cross(sub1, sub2, null)) );
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		cross.normalize();
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return cross;
	}
	
	
	public static double calculatetArea(haxe.at.dotpoint.math.vector.IVector3 v1, haxe.at.dotpoint.math.vector.IVector3 v2, haxe.at.dotpoint.math.vector.IVector3 v3)
	{
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 sub1 = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(v2, v1, null)) );
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 sub2 = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(v3, v1, null)) );
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector3 cross = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.cross(sub1, sub2, null)) );
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return ( java.lang.Math.sqrt(( ( ( cross.x * cross.x ) + ( cross.y * cross.y ) ) + ( cross.z * cross.z ) )) * 0.5 );
	}
	
	
	public static double calculateDistanceVector2(haxe.at.dotpoint.math.vector.IVector2 v1, haxe.at.dotpoint.math.vector.IVector2 v2, haxe.at.dotpoint.math.DistanceMethod mode)
	{
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( mode == null )) 
		{
			//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			mode = haxe.at.dotpoint.math.DistanceMethod.EULER;
		}
		
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double x = java.lang.Math.abs(( v1.get_x() - v2.get_x() ));
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double y = java.lang.Math.abs(( v1.get_y() - v2.get_y() ));
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( mode != null )) 
		{
			//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			switch (mode)
			{
				case EULER:
				{
					//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					return java.lang.Math.sqrt(( ( x * x ) + ( y * y ) ));
				}
				
				
				case MANHATTEN:
				{
					//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					return ( x + y );
				}
				
				
			}
			
		}
		
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return ((double) (-1) );
	}
	
	
	public static double calculateDistanceRectangle(haxe.at.dotpoint.math.geom.Rectangle r1, haxe.at.dotpoint.math.geom.Rectangle r2, haxe.at.dotpoint.math.DistanceMethod mode)
	{
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( mode == null )) 
		{
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			mode = haxe.at.dotpoint.math.DistanceMethod.EULER;
		}
		
		//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector2[] closest = haxe.at.dotpoint.math.Trigonometry.calculateClosestRectangleVertices(r1, r2, mode);
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( closest == null )) 
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			return ((double) (0) );
		}
		
		//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return haxe.at.dotpoint.math.Trigonometry.calculateDistanceVector2(((haxe.at.dotpoint.math.vector.Vector2) (((haxe.at.dotpoint.math.vector.Vector2[]) (closest) )[0]) ), ((haxe.at.dotpoint.math.vector.Vector2) (((haxe.at.dotpoint.math.vector.Vector2[]) (closest) )[1]) ), mode);
	}
	
	
	public static haxe.at.dotpoint.math.vector.Vector2[] calculateClosestRectangleVertices(haxe.at.dotpoint.math.geom.Rectangle r1, haxe.at.dotpoint.math.geom.Rectangle r2, haxe.at.dotpoint.math.DistanceMethod mode)
	{
		//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (haxe.at.dotpoint.math.geom.Rectangle.isRectangleIntersect(r1, r2, false)) 
		{
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			return null;
		}
		
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( mode == null )) 
		{
			//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			mode = haxe.at.dotpoint.math.DistanceMethod.EULER;
		}
		
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector2 a = new haxe.at.dotpoint.math.vector.Vector2(null, null);
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector2 b = new haxe.at.dotpoint.math.vector.Vector2(null, null);
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double min_x = java.lang.Math.max(r1.get_min().get_x(), r2.get_min().get_x());
		//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double max_x = java.lang.Math.min(r1.get_max().get_x(), r2.get_max().get_x());
		//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double min_y = java.lang.Math.max(r1.get_min().get_y(), r2.get_min().get_y());
		//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double max_y = java.lang.Math.min(r1.get_max().get_y(), r2.get_max().get_y());
		//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double span_x = ( max_x - min_x );
		//line 178 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		double span_y = ( max_y - min_y );
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		if (( span_x > 0 )) 
		{
			//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			if (( r2.get_min().get_y() >= r1.get_max().get_y() )) 
			{
				//line 184 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				a.set_y(r1.get_max().get_y());
				//line 185 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				b.set_y(r2.get_min().get_y());
			}
			else
			{
				//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				a.set_y(r1.get_min().get_y());
				//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				b.set_y(r2.get_max().get_y());
			}
			
			//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			a.set_x(b.set_x(( min_x + ( span_x * 0.5 ) )));
		}
		else
		{
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
			if (( span_y > 0 )) 
			{
				//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				if (( r2.get_min().get_x() >= r1.get_max().get_x() )) 
				{
					//line 199 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					a.set_x(r1.get_max().get_x());
					//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					b.set_x(r2.get_min().get_x());
				}
				else
				{
					//line 204 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					a.set_x(r1.get_min().get_x());
					//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					b.set_x(r2.get_max().get_x());
				}
				
				//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				a.set_y(b.set_y(( min_y + ( span_y * 0.5 ) )));
			}
			else
			{
				//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				double c_distance_min = 3.4028234663852886e+38;
				//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				haxe.at.dotpoint.math.vector.Vector2 c1_min = new haxe.at.dotpoint.math.vector.Vector2(null, null);
				//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				haxe.at.dotpoint.math.vector.Vector2 c2_min = new haxe.at.dotpoint.math.vector.Vector2(null, null);
				//line 217 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				haxe.at.dotpoint.math.vector.Vector2 c1r = new haxe.at.dotpoint.math.vector.Vector2(0, 0);
				//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				haxe.at.dotpoint.math.vector.Vector2 c2r = new haxe.at.dotpoint.math.vector.Vector2(1, 1);
				//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				{
					//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					int _g = 0;
					//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
					while (( _g < 4 ))
					{
						//line 220 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						int j = _g++;
						//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						if (( ( j % 2 ) == 0 )) 
						{
							//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c1r.set_x(( (( c1r.get_x() + 1 )) % 2 ));
							//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c1r.set_y(( (( c1r.get_y() + 1 )) % 2 ));
							//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c2r.set_x(( (( c2r.get_x() + 1 )) % 2 ));
							//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c2r.set_y(( (( c2r.get_y() + 1 )) % 2 ));
						}
						
						//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						if (( ( j % 2 ) == 1 )) 
						{
							//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c1r.set_y(( (( c1r.get_y() + 1 )) % 2 ));
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c2r.set_y(( (( c2r.get_y() + 1 )) % 2 ));
						}
						
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						a = ((haxe.at.dotpoint.math.vector.Vector2) (r1.getPoint(c1r, a)) );
						//line 237 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						b = ((haxe.at.dotpoint.math.vector.Vector2) (r2.getPoint(c2r, b)) );
						//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						double distance = haxe.at.dotpoint.math.Trigonometry.calculateDistanceVector2(a, b, mode);
						//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
						if (( distance < c_distance_min )) 
						{
							//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c_distance_min = distance;
							//line 245 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c1_min = ((haxe.at.dotpoint.math.vector.Vector2) (a.clone(c1_min)) );
							//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
							c2_min = ((haxe.at.dotpoint.math.vector.Vector2) (b.clone(c2_min)) );
						}
						
					}
					
				}
				
				//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				a = c1_min;
				//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
				b = c2_min;
			}
			
		}
		
		//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		haxe.at.dotpoint.math.vector.Vector2[] result = ((haxe.at.dotpoint.math.vector.Vector2[]) (new haxe.at.dotpoint.math.vector.Vector2[2]) );
		//line 257 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		((haxe.at.dotpoint.math.vector.Vector2[]) (result) )[0] = a;
		//line 258 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		((haxe.at.dotpoint.math.vector.Vector2[]) (result) )[1] = b;
		//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return result;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return new haxe.at.dotpoint.math.Trigonometry(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\math\\Trigonometry.hx"
		return new haxe.at.dotpoint.math.Trigonometry();
	}
	
	
}


