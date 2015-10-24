package haxe.model.entities;
import haxe.at.dotpoint.math.vector.Vector2;

/**
 * ...
 * @author RK
 */
class BulletEntity extends WorldEntity
{

	/**
	 * tank that fired the shot
	 */
	public var tankID:Int;

	/**
	 * where the bullet is heading to
	 */
	public var target:Vector2;

	/**
	 * speed the bullet is flying
	 */
	public var speed:Float;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( ID:Int )
	{
		super( ID );

		this.target = new Vector2();
		this.speed  = 0;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //
}