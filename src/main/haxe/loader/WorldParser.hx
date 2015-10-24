package haxe.loader;

import haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent;
import haxe.at.dotpoint.loader.processor.ADataProcessor;
import haxe.at.dotpoint.loader.processor.IDataProcessor;
import haxe.at.dotpoint.logger.Log;
import haxe.at.dotpoint.math.Axis.AxisRelative;
import haxe.at.dotpoint.math.geom.Rectangle;
import haxe.at.dotpoint.math.MathUtil;
import haxe.at.dotpoint.math.vector.Vector2;
import haxe.model.entities.PowerupEntity;
import haxe.model.EntityFactory;
import haxe.model.enums.PowerupType;
import haxe.model.tileset.Tile;
import haxe.model.tileset.Tileset;
import haxe.model.enums.TileType;
import haxe.model.World;

/**
 *
 */
class WorldParser extends ADataProcessor implements IDataProcessor<String,World>
{

	/**
	 *
	 */
	public var result(default, null):World;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{
		super();
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	input
	 */
	public function start( input:String ):Void
	{
		var json:Dynamic = this.parseJSON( input );

		if( json == null )
			throw "invalid json format";

		// --------------- //

		var walls:Array<Array<Rectangle>> = this.parseWallBoundings( json );

		this.result = new World();
		this.result.tileset = this.parseTileset( walls );

		// --------------- //

		this.setStatus( StatusEvent.STARTED );
		this.setStatus( StatusEvent.COMPLETE );
	}

	/**
	 *
	 * @param	input
	 * @return
	 */
	private function parseJSON( input:String ):Dynamic
	{
		try
		{
			return Json.parse( input );
		}
		catch( error:Dynamic )
		{
			Log.error( error );
		}

		return null;
	}

	// ************************************************************************ //
	// Tileset
	// ************************************************************************ //

	/**
	 * actually create the Tileset
	 */
	private function parseTileset( walls:Array<Array<Rectangle>> ):Tileset
	{
		var tiles:Array<Tile> = new Array<Tile>();

		for( y in 0...walls.length )
		{
			var ylist:Array<Rectangle> = walls[y];

			for( x in 0...walls.length )
			{
				var rectangle:Rectangle = null;

				for( block in ylist )
				{
					if( MathUtil.isEqual( block.min.x, x ) )
					{
						rectangle = block;
						break;
					}
				}

				if( rectangle != null )
				{
					tiles.push( new Tile( TileType.WALL ) );
				}
				else
				{
					tiles.push( new Tile( TileType.EMPTY ) );
				}
			}
		}

		return new Tileset( tiles, walls.length );
	}

	/**
	 * y, x sorted list of wall blocks
	 */
	private function parseWallBoundings( json:Dynamic ):Array<Array<Rectangle>>
	{
		var level:Array<Dynamic> = cast json.walls;

		// -------------------------- //
		// sort n' parse blocks:

		var rectangles:Array<Array<Rectangle>> = new Array<Array<Rectangle>>();

		for( block in level )
		{
			var data:Array<Float> = cast block;

			var w:Int = Std.int( data[2] );
			var h:Int = Std.int( data[3] );

			var block:Rectangle = new Rectangle();
				block.min.x = data[0] - w * 0.5;
				block.min.y = data[1] - h * 0.5;
				block.max.x = data[0] + w * 0.5;
				block.max.y = data[1] + h * 0.5;

			var anchor:Vector2 = block.getPoint( AxisRelative.TOP_LEFT );

			for( x in 0...w )
			{
				for( y in 0...h )
				{
					var rect:Rectangle = new Rectangle( AxisRelative.CENTER );
						rect.min.x = anchor.x + x;
						rect.min.y = anchor.y + y;
						rect.max.x = rect.min.x + 1;
						rect.max.y = rect.min.y + 1;

					// -------------- //

					var target_list:Array<Rectangle> = null;

					for( ylist in rectangles )
					{
						if( ylist.length < 0 )
							continue;

						// ----------- //

						var c_center:Vector2 = ylist[0].getPoint( new Vector2( 0, 0 ) );
						var r_center:Vector2 = rect.getPoint( new Vector2( 0, 0 ) );

						if( MathUtil.isEqual( c_center.y, r_center.y ) )
						{
							target_list = ylist;
							break;
						}
					}

					if( target_list == null )
						rectangles[ rectangles.length ] = target_list = new Array<Rectangle>();

					target_list.push( rect );
				}
			}
		}

		this.sortRectangles( rectangles );

		// -------------------------- //

		return rectangles;
	}

	/**
	 *
	 */
	private function sortRectangles( list:Array<Array<Rectangle>> ):Void
	{
		var center:Vector2 = new Vector2();

		//
		function sortYAxis( alist:Array<Rectangle>, blist:Array<Rectangle> ):Int
		{
			var a:Vector2 = alist[0].getPoint( center );
			var b:Vector2 = blist[0].getPoint( center );

			return Math.round( a.y - b.y );
		}

		//
		function sortXAxis( arect:Rectangle, brect:Rectangle ):Int
		{
			var a:Vector2 = arect.getPoint( center );
			var b:Vector2 = brect.getPoint( center );

			return Math.round( a.x - b.x );
		}

		// ------------------ //

		list.sort( sortYAxis );

		for( xaxis in list )
			xaxis.sort( sortXAxis );
	}

}