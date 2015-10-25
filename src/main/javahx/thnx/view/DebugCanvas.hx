package javahx.thnx.view;

import haxe.at.dotpoint.math.color.ColorUtil;
import haxe.at.dotpoint.math.geom.IRectangle;
import haxe.at.dotpoint.math.vector.IVector2;
import haxe.at.dotpoint.math.vector.Vector2;
import haxe.at.dotpoint.math.vector.Vector3;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.javax.swing.ImageIcon;
import java.javax.swing.JLabel;
import java.javax.swing.JLayeredPane;
import java.javax.swing.JPanel;
import java.NativeArray;

/**
 * ...
 * @author RK
 */
class DebugCanvas extends JPanel
{

	/**
	 *
	 */
	private var layer:JLayeredPane;

	/**
	 *
	 */
	private var canvas:Graphics2D;

	/**
	 *
	 */
	private var scaleFactor:IVector2;

	/**
	 *
	 */
	public var offset:IVector2;

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
	 * @param	dimension
	 * @param	scaling
	 */
	public function initialize( dimension:IVector2, ?scaling:IVector2, ?offset:IVector2 ):Void
	{
		if( scaling == null )
			scaling = new Vector2( 10, 10 );

		if( offset == null )
			offset = new Vector2( scaling.x, scaling.y );

		this.scaleFactor = scaling;
		this.offset = offset;

		var w:Int = Std.int( dimension.x );
		var h:Int = Std.int( dimension.y );

		// -------------- //
		// canvas:

		var canvas_img:BufferedImage = new BufferedImage( w, h, BufferedImage.TYPE_INT_ARGB );
		var canvas_jla:JLabel = new JLabel( new ImageIcon( canvas_img ) );
			canvas_jla.setBounds( 0, 0, w, h );

		this.canvas = cast canvas_img.getGraphics();

		// --------------- //
		// layer:

		this.setOpaque( false );
		this.add( canvas_jla );
	}

	// ************************************************************************ //
	// IDebugCanvas
	// ************************************************************************ //

	/**
	 *
	 */
	public function clear():Void
	{
		this.canvas.setBackground( new Color(255, 255, 255, 0) );
		this.canvas.clearRect( 0, 0, this.getWidth(), this.getHeight() );

		this.repaint();
	}

	/**
	 *
	 * @param	rect
	 * @param	color
	 * @param	thickness
	 * @param	alpha
	 */
	public function drawRectangle( rect:IRectangle, ?color:Int = 0, ?thickness:Int = 1, ?alpha:Float = 0.8 ):Void
	{
		this.canvas.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

		var cv:Vector3 = ColorUtil.toVector( color );
			cv.w = alpha;

		this.canvas.setStroke( new BasicStroke( thickness * 0.7, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER ) );
		this.canvas.setColor( new Color( cv.x, cv.y, cv.z, 1 ) );

		var x:Int = Std.int( rect.min.x  * this.scaleFactor.x + this.offset.x );
		var y:Int = Std.int( rect.min.y  * this.scaleFactor.y + this.offset.y );
		var w:Int = Std.int( rect.width  * this.scaleFactor.x );
		var h:Int = Std.int( rect.height * this.scaleFactor.y );

		this.canvas.drawRect( x, y, w, h );

		this.canvas.setColor( new Color( cv.x, cv.y, cv.z, cv.w ) );
		this.canvas.fillRect( x, y, w, h );

		//this.repaint();
	}

	/**
	 *
	 * @param	value
	 * @param	position
	 * @param	size
	 * @param	color
	 */
	public function drawLabel( value:String, position:IVector2, ?size:Int = 25, ?color:Int ):Void
	{
		this.canvas.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

		var cv:Vector3 = ColorUtil.toVector( color );
			cv.w = 1;

		var x:Int = Std.int( position.x * this.scaleFactor.x - 10 + this.offset.x );
		var y:Int = Std.int( position.y * this.scaleFactor.y + 5  + this.offset.y );

		this.canvas.setColor( new Color( cv.x, cv.y, cv.z, cv.w ) );
		this.canvas.drawString( value, x, y );

		//this.repaint();
	}

	/**
	 *
	 * @param	a
	 * @param	b
	 * @param	color
	 * @param	thickness
	 * @param	alpha
	 */
	public function drawLine(a:IVector2, b:IVector2, ?color:Int, ?thickness:Int, ?alpha:Float):Void
	{
		this.canvas.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

		var cv:Vector3 = ColorUtil.toVector( color );
			cv.w = alpha;

		this.canvas.setStroke( new BasicStroke( thickness * 0.7, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER ) );
		this.canvas.setColor( new Color( cv.x, cv.y, cv.z, cv.w ) );

		// ----------------- //

		var ax:Float = Std.int( a.x * this.scaleFactor.x + this.offset.x );
		var ay:Float = Std.int( a.y * this.scaleFactor.y + this.offset.y );
		var bx:Float = Std.int( b.x * this.scaleFactor.x + this.offset.x );
		var by:Float = Std.int( b.y * this.scaleFactor.y + this.offset.y );

		// ----------------- //

		var dx:Float = bx - ax;
		var dy:Float = by - ay;
		var dd:Float = Math.sqrt( dx * dx + dy * dy );

		var xm:Float = dd - thickness * 2;
		var xn:Float = dd - thickness * 2;

		var ym:Float =  thickness * 2;
		var yn:Float = -thickness * 2;

		var sin:Float = dy / dd;
		var cos:Float = dx / dd;

		// ----------------- //

		var x0:Float = xm * cos - ym * sin + ax;
		var y0:Float = xm * sin + ym * cos + ay;

		var x1:Float = xn * cos - yn * sin + ax;
		var y1:Float = xn * sin + yn * cos + ay;

		var xpoints:NativeArray<Int> = NativeArray.make( Std.int(bx), Std.int(x0), Std.int(x1) );
		var ypoints:NativeArray<Int> = NativeArray.make( Std.int(by), Std.int(y0), Std.int(y1) );

		// ----------------- //

		this.canvas.drawLine( Std.int(ax),  Std.int(ay),  Std.int(bx),  Std.int(by) );
		this.canvas.fillPolygon( xpoints, ypoints, 3 );

		//this.repaint();
	}

}