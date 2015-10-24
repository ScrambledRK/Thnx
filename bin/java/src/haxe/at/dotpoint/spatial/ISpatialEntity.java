package haxe.at.dotpoint.spatial;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface ISpatialEntity<TNode> extends haxe.lang.IHxObject, haxe.at.dotpoint.core.entity.IEntity
{
	haxe.at.dotpoint.core.datastructure.graph.TreeNode<TNode> getSpatialNode();
	
}


