package haxe.thnx.model.components;

import haxe.at.dotpoint.core.entity.Component;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.enums.PowerupType;

/**
 * ...
 * @author RK
 */
class PowerupEffect extends Component<TankEntity>
{

	/**
	 *
	 */
	public var type:PowerupType;

	/**
	 *
	 */
	public var stamp:Float;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 */
	public function new( type:PowerupType, ?stamp:Float )
	{
		super();

		if( stamp == null )
			stamp = Timer.stamp();

		this.stamp = stamp;
		this.type = type;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //
}