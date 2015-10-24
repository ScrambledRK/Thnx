package haxe.model.components;
import haxe.at.dotpoint.core.entity.Component;
import haxe.at.dotpoint.math.Axis.AxisOrientation;
import haxe.at.dotpoint.math.MathUtil;
import haxe.at.dotpoint.math.vector.IQuaternion;
import haxe.at.dotpoint.math.vector.IVector3;
import haxe.at.dotpoint.math.vector.Quaternion;
import haxe.at.dotpoint.math.vector.Vector3;
import haxe.model.entities.TankEntity;

/**
 * ...
 * @author RK
 */
class TankCannon extends Component<TankEntity>
{

	/**
	 *
	 */
	public var rotation:Quaternion;

	/**
	 *
	 */
	public var isShooting:Bool;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{
		super();

		this.rotation = new Quaternion();
		this.isShooting = false;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	degree
	 */
	public function setRotation( degree:Float ):Void
	{
		Quaternion.setAxisAngle( AxisOrientation.UP, degree * MathUtil.DEG_RAD, this.rotation );
	}

	/**
	 * @param	source
	 * @param	destination
	 * @return
	 */
	public function aim( target:IVector3, ?output:IQuaternion ):IQuaternion
	{
		if( output == null )
			output = this.rotation;

		// --------------- //

		var source:IVector3 = this.entity.transform.position;

		var direction:Vector3 = Vector3.subtract( target, source );
			direction.normalize();

		var dot:Float = Vector3.dot( new Vector3( 0, 0, 1 ), direction );

		// --------------- //

		if( Math.abs( dot + 1 ) < MathUtil.ZERO_TOLERANCE )
		{
			output.x = 0;
			output.y = 1;
			output.z = 0;
			output.w = 3.1415926535897932;

			return output;
		}

		if( Math.abs( dot - 1 ) < MathUtil.ZERO_TOLERANCE )
		{
			output.x = 0;
			output.y = 0;
			output.z = 0;
			output.w = 1;

			return output;
		}

		// --------------- //

		var radian:Float = Math.acos( dot );

		var axis:Vector3 = Vector3.cross( new Vector3( 0, 0, 1 ), direction );
			axis.normalize();

		return Quaternion.setAxisAngle( axis, radian, output );
	}
}