package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IMatrix33 extends haxe.lang.IHxObject
{
	void toIdentity();
	
	void transpose();
	
	double determinant();
	
	void set33(haxe.at.dotpoint.math.vector.IMatrix33 m);
	
	haxe.root.Array<java.lang.Object> getArray(haxe.root.Array<java.lang.Object> output);
	
	void setArray(haxe.root.Array<java.lang.Object> input);
	
}


