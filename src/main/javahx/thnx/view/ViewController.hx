package javahx.thnx.view;

import haxe.at.dotpoint.math.geom.ICube;
import haxe.at.dotpoint.math.geom.Rectangle;
import haxe.at.dotpoint.math.vector.IVector2;
import haxe.thnx.model.enums.PowerupType;
import haxe.thnx.model.enums.TeamColor;
import haxe.thnx.model.tileset.Tile;
import haxe.thnx.model.World;
import haxe.thnx.view.IViewController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.javax.swing.JFrame;
import java.javax.swing.JLayeredPane;
import java.lang.System;
import javahx.thnx.ThnxMain;

/**
 * ...
 * @author RK
 */
class ViewController implements IViewController
{

	/**
	 *
	 */
	private var jframe:JFrame;

	/**
	 *
	 */
	private var jlayer:JLayeredPane;

	/**
	 *
	 */
	private var canvas_background:DebugCanvas;
	private var canvas_foreground:DebugCanvas;

	// ------------- //

	/**
	 *
	 */
	public var isBackgroundRefresh:Bool;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{
		this.isBackgroundRefresh = true;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	dimension
	 * @param	scaling
	 */
	public function initialize( dimension:IVector2, ?scaling:IVector2 ):Void
	{
		this.setupJFrame( dimension );
		this.setupCanvas( dimension, scaling );

		this.jframe.setVisible( true );
	}

	/**
	 *
	 */
	private function setupJFrame( dimension:IVector2 ):Void
	{
		var w:Int = Std.int( dimension.x ) + 20;
		var h:Int = Std.int( dimension.y );

		// ------------- //

		System.setProperty( "sun.java2d.opengl", "true" );

		this.jframe = new JFrame( "Thnx:AI" );
		this.jframe.setSize( w, h );
		this.jframe.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.jframe.setBackground( Color.WHITE );
		this.jframe.setLocationRelativeTo(null);
		this.jframe.setLayout( null );
	}

	/**
	 *
	 */
	private function setupCanvas( dimension:IVector2, ?scaling:IVector2 ):Void
	{
		var w:Int = Std.int( dimension.x );
		var h:Int = Std.int( dimension.y );

		// ------------- //

		this.canvas_background = new DebugCanvas();
		this.canvas_background.initialize( dimension, scaling );
		this.canvas_background.setBounds( 0, 0, w, h );
		this.canvas_background.setLocation( 0, 0 );

		this.canvas_foreground = new DebugCanvas();
		this.canvas_foreground.initialize( dimension, scaling );
		this.canvas_foreground.setBounds( 0, 0, w, h );
		this.canvas_foreground.setLocation( 0, 0 );

		// ------------- //

		this.jlayer = new JLayeredPane();
		this.jlayer.setPreferredSize( new Dimension( w, h ) );
		this.jlayer.setBounds( 0, 0, w, h );
		this.jlayer.setLayout( null );

		this.jlayer.setLayer( this.canvas_background, 0 );
		this.jlayer.setLayer( this.canvas_foreground, 1 );
		this.jlayer.add( this.canvas_background );
		this.jlayer.add( this.canvas_foreground );

		this.jframe.getContentPane().add( this.jlayer );
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 */
	public function update():Void
	{
		if( this.isBackgroundRefresh )
		{
			this.canvas_background.clear();

			this.drawBackground();
			this.canvas_background.repaint();

			this.isBackgroundRefresh = false;
		}

		this.canvas_foreground.clear();

		this.drawForeground();
		this.canvas_foreground.repaint();
	}

	/**
	 *
	 */
	private function drawBackground():Void
	{
		var world:World = ThnxMain.instance.world;

		for( y in 0...world.tileset.dimension )
		{
			for( x in 0...world.tileset.dimension  )
			{
				var tile:Tile = world.tileset.getTile( x, y );

				var rect:Rectangle = new Rectangle();
					rect.min.x  = x;
					rect.min.y  = y;
					rect.width  = 1;
					rect.height = 1;

				if( !tile.isWalkable() )
					this.canvas_background.drawRectangle( rect, 0x2D2D2D );
			}
		}
	}

	/**
	 *
	 */
	private function drawForeground():Void
	{
		var world:World = ThnxMain.instance.world;

		// --------------------------- //
		// powerups:

		for( powerup in world.powerups )
		{
			var color:Int = 0xFF20E9;

			switch( powerup.type )
			{
				case PowerupType.REPAIR: color = 0x54E02C;
				case PowerupType.DAMAGE: color = 0xC12413;
				case PowerupType.SHIELD: color = 0x1D66B8;
			}

			var bounds:ICube = powerup.boundings.localSpace;

			var rect:Rectangle = new Rectangle();
				rect.min.x = bounds.min.x;
				rect.min.y = bounds.min.y;
				rect.max.x = bounds.max.x;
				rect.max.y = bounds.max.y;

			this.canvas_foreground.drawRectangle( rect, color, 1, 0.5 );
		}

		// --------------------------- //
		// tanks:

		for( tank in world.tanks )
		{
			if( !tank.status.isAlive() )
				continue;

			// ----------------------- //

			var color:Int = 0xFF20E9;

			switch( tank.status.team )
			{
				case TeamColor.BLUE: 	color = 0x0B00D7;
				case TeamColor.GREEN: 	color = 0x26881C;
				case TeamColor.ORANGE: 	color = 0xEA8122;
				case TeamColor.RED: 	color = 0xF11B3A;
			}

			if( tank.getUser() == ThnxMain.instance.lobby.player )
				color = 0xFF80FF;

			// ----------------------- //

			var bounds:ICube = tank.boundings.localSpace;

			var rect:Rectangle = new Rectangle();
				rect.min.x = bounds.min.x;
				rect.min.y = bounds.min.y;
				rect.max.x = bounds.max.x;
				rect.max.y = bounds.max.y;

			this.canvas_foreground.drawRectangle( rect, color, 2, 0.9 );
		}

		// --------------------------- //
		// bullets:

		for( bullet in world.bullets )
		{
			var a:IVector2 = bullet.transform.position;
			var b:IVector2 = bullet.target;

			this.canvas_foreground.drawLine( a, b, 0xD2C14D, 2, 0.8 );
		}
	}
}