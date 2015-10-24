package haxe.at.dotpoint.math.vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IMatrix44 extends haxe.lang.IHxObject, haxe.at.dotpoint.math.vector.IMatrix33
{
	void set44(haxe.at.dotpoint.math.vector.IMatrix44 m);
	
	void inverse();
	
}


