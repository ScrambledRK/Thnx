package haxe.at.dotpoint.math.geom;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface ICube extends haxe.lang.IHxObject
{
	haxe.at.dotpoint.math.vector.IVector3 get_pivot();
	
	haxe.at.dotpoint.math.vector.IVector3 set_pivot(haxe.at.dotpoint.math.vector.IVector3 value);
	
	haxe.at.dotpoint.math.vector.IVector3 get_min();
	
	haxe.at.dotpoint.math.vector.IVector3 get_max();
	
	double get_width();
	
	double set_width(double value);
	
	double get_height();
	
	double set_height(double value);
	
	double get_length();
	
	double set_length(double value);
	
	void setEmpty();
	
	boolean isEmpty();
	
	void setDimensions(double w, double h, double l, haxe.at.dotpoint.math.vector.IVector3 pivot);
	
	void setExtensions(haxe.at.dotpoint.math.vector.IVector3 min, haxe.at.dotpoint.math.vector.IVector3 max, haxe.at.dotpoint.math.vector.IVector3 pivot);
	
}


