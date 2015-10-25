package haxe.thnx.model.entities;

import haxe.at.dotpoint.math.Axis.AxisRelative;
import haxe.at.dotpoint.math.vector.Vector2;
import haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy;
import haxe.at.dotpoint.spatial.SpatialEntity;

/**
 * ...
 * @author RK
 */
class WorldEntity extends SpatialEntity
{

	/**
	 *
	 */
	public var ID:Int;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( ID:Int, ?numComponents:Int )
	{
		super( numComponents, AxisRelative.CENTER );
		this.ID = ID;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //
}