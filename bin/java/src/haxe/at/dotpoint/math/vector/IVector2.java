package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IVector2 extends haxe.lang.IHxObject
{
	double get_x();
	
	double set_x(double value);
	
	double get_y();
	
	double set_y(double value);
	
	void normalize();
	
	double length();
	
}


