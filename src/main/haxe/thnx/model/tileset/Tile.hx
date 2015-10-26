package haxe.thnx.model.tileset;
import haxe.at.dotpoint.math.geom.Rectangle;
import haxe.at.dotpoint.math.vector.IVector2;
import haxe.thnx.model.enums.TileType;

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

	/**
	 *
	 */
	public var center:IVector2;

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