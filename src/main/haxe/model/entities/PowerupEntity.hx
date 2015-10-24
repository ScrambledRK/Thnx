package haxe.model.entities;

import haxe.model.entities.WorldEntity;
import haxe.model.enums.PowerupType;

/**
 * ...
 * @author RK
 */
class PowerupEntity extends WorldEntity
{

	/**
	 *
	 */
	public var type:PowerupType;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 * @param	type
	 * @param	stamp
	 */
	public function new( ID:Int, type:PowerupType )
	{
		super( ID );
		this.type = type;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //
}