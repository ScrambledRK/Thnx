package haxe.thnx.model.tileset;

/**
 * ...
 * @author RK
 */
class Tileset
{

	/**
	 * actual tiles composing the tileset
	 */
	private var tiles:Array<Tile>;

	/**
	 * width/height (always square tileset)
	 */
	public var dimension(default,null):Int;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( tiles:Array<Tile>, dimension:Int )
	{
		this.tiles 		= tiles;
		this.dimension 	= dimension;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 */
	public function getTileByCoordinates( x:Float, y:Float ):Tile
	{
		return this.getTile( Math.floor( x ) + 1, Math.floor( y ) + 1 );
	}

	/**
	 *
	 * @param	x in tile-coordinates
	 * @param	y in tile-coordinates
	 * @return	tile on that position
	 */
	public function getTile( x:Int, y:Int ):Tile
	{
		if( x < 0 || x > this.dimension )	throw "x-tile coordinate out of bounds: " + x;
		if( y < 0 || y > this.dimension )	throw "y-tile coordinate out of bounds: " + y;

		return this.tiles[ this.getTileIndex( x, y ) ];
	}

	/**
	 * @param	x in tile-coordinates
	 * @param	y in tile-coordinates
	 * @return	index of the tile in tiles:Array<Tile>
	 */
	inline private function getTileIndex( x:Int, y:Int ):Int
	{
		return y * this.dimension + x;
	}
}