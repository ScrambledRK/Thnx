package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IQuaternion extends haxe.lang.IHxObject
{
	double get_x();
	
	double set_x(double value);
	
	double get_y();
	
	double set_y(double value);
	
	double get_z();
	
	double set_z(double value);
	
	double get_w();
	
	double set_w(double value);
	
	void normalize();
	
	double length();
	
}


