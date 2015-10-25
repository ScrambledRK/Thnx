package haxe.thnx.model.components;

import haxe.at.dotpoint.core.entity.Component;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.enums.TeamColor;

/**
 * ...
 * @author RK
 */
class TankStatus extends Component<TankEntity>
{

	/**
	 *
	 */
	public var health:Float;
	public var shield:Float;

	// ------------- //

	//
	public var team:TeamColor;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 * @param	alliance
	 * @param	team
	 */
	public function new( ?health:Float = 10 )
	{
		super();

		this.health = health;
		this.shield = 0;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function isAlive():Bool
	{
		return this.health > 0;
	}

}