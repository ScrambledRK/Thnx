package haxe.at.dotpoint.spatial.boundings;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IBoundings extends haxe.lang.IHxObject
{
	haxe.at.dotpoint.spatial.boundings.AABB getBounds(haxe.at.dotpoint.math.geom.Space space);
	
	haxe.at.dotpoint.math.geom.Cube getChildrenBounds(haxe.at.dotpoint.math.geom.Cube output, haxe.at.dotpoint.math.geom.Space space);
	
}


