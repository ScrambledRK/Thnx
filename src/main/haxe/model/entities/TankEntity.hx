package haxe.model.entities;

import haxe.model.components.PowerupEffect;
import haxe.model.components.TankCannon;
import haxe.model.components.TankStatus;
import haxe.model.enums.Alliance;
import haxe.model.enums.TeamColor;
import haxe.at.dotpoint.core.entity.Component;
import haxe.model.user.User;
import javahx.ThnxMain;

/**
 * ...
 * @author RK
 */
class TankEntity extends WorldEntity
{

	/**
	 *
	 */
	public var status(default, null):TankStatus;

	/**
	 *
	 */
	public var cannon(default, null):TankCannon;

	/**
	 *
	 */
	public var userID:String;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( ID:Int, userID:String )
	{
		super( ID, 8 );

		this.userID = userID;

		this.status = new TankStatus();
		this.cannon = new TankCannon();

		this.addComponent( this.status );
		this.addComponent( this.cannon );
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function getUser():User
	{
		return ThnxMain.instance.lobby.getUserByID( this.userID );
	}

}

