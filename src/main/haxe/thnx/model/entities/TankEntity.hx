package haxe.thnx.model.entities;

import haxe.thnx.model.components.PowerupEffect;
import haxe.thnx.model.components.TankCannon;
import haxe.thnx.model.components.TankStatus;
import haxe.thnx.model.enums.Alliance;
import haxe.thnx.model.enums.TeamColor;
import haxe.at.dotpoint.core.entity.Component;
import haxe.thnx.model.user.User;
import javahx.thnx.ThnxMain;

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

