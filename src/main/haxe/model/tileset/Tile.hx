package haxe.model.tileset;
import haxe.at.dotpoint.math.geom.Rectangle;
import haxe.model.enums.TileType;

/**
 * ...
 * @author RK
 */
class Tile
{

	/**
	 *
	 */
	public var type(default, null):TileType;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( type:TileType )
	{
		this.type = type;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function isWalkable():Bool
	{
		return this.type != TileType.WALL;
	}
}