package haxe.at.dotpoint.math.geom;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IRectangle extends haxe.lang.IHxObject
{
	haxe.at.dotpoint.math.vector.IVector2 get_pivot();
	
	haxe.at.dotpoint.math.vector.IVector2 set_pivot(haxe.at.dotpoint.math.vector.IVector2 value);
	
	haxe.at.dotpoint.math.vector.IVector2 get_min();
	
	haxe.at.dotpoint.math.vector.IVector2 get_max();
	
	double get_width();
	
	double set_width(double value);
	
	double get_height();
	
	double set_height(double value);
	
	void setEmpty();
	
	boolean isEmpty();
	
	void setDimensions(double w, double h, haxe.at.dotpoint.math.vector.IVector2 p);
	
	void setExtensions(haxe.at.dotpoint.math.vector.IVector2 min, haxe.at.dotpoint.math.vector.IVector2 max, haxe.at.dotpoint.math.vector.IVector2 p);
	
}


