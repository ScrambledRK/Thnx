package haxe.at.dotpoint.spatial.transform;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface ITransform extends haxe.lang.IHxObject
{
	haxe.at.dotpoint.math.vector.IVector3 get_position();
	
	haxe.at.dotpoint.math.vector.IQuaternion get_rotation();
	
	haxe.at.dotpoint.math.vector.IVector3 get_scale();
	
	void setMatrix(haxe.at.dotpoint.math.vector.IMatrix44 value, haxe.at.dotpoint.math.geom.Space space);
	
	haxe.at.dotpoint.math.vector.IMatrix44 getMatrix(haxe.at.dotpoint.math.vector.IMatrix44 output, haxe.at.dotpoint.math.geom.Space space);
	
	boolean hasRotation(haxe.at.dotpoint.math.geom.Space space);
	
	boolean hasScaling(haxe.at.dotpoint.math.geom.Space space);
	
}


