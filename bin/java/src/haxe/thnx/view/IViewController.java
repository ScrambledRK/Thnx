package haxe.thnx.view;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IViewController extends haxe.lang.IHxObject
{
	void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling);
	
	void update();
	
}


