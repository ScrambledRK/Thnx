package haxe.thnx.model;

import haxe.at.dotpoint.math.geom.Rectangle;
import haxe.thnx.model.entities.BulletEntity;
import haxe.thnx.model.entities.PowerupEntity;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.tileset.Tileset;

/**
 *
 */
class World
{

	/**
	 *
	 */
	public var tileset:Tileset;

	/**
	 *
	 */
	public var bounds:Rectangle;

	// ------------ //

	/**
	 *
	 */
	public var tanks:Array<TankEntity>;

	/**
	 *
	 */
	public var powerups:Array<PowerupEntity>;

	/**
	 *
	 */
	public var bullets:Array<BulletEntity>;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{
		this.reset();
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 */
	public function reset():Void
	{
		this.tanks = new Array<TankEntity>();
		this.powerups = new Array<PowerupEntity>();
		this.bullets = new Array<BulletEntity>();
	}

	// ------------------------------------------------------------------------ //
	// ------------------------------------------------------------------------ //
	// Tanks:

	/**
	 *
	 * @param	tank
	 */
	public function addTank( tank:TankEntity ):Void
	{
		if( this.getTankByID( tank.ID ) != null )
			return;

		// ---------------------- //

		this.tanks.push( tank );
	}

	/**
	 *
	 * @param	tank
	 */
	public function removeTank( ID:Int ):Void
	{
		var tank:TankEntity = this.getTankByID( ID );

		if( tank == null )
			return;

		// ---------------------- //

		this.tanks.remove( tank );
	}

	/**
	 *
	 * @param	ID
	 */
	public function getTankByID( ID:Int ):TankEntity
	{
		for( tank in this.tanks )
		{
			if( tank.ID == ID )
				return tank;
		}

		return null;
	}

	/**
	 *
	 * @param	ID
	 */
	public function getTankByUserID( userID:String ):TankEntity
	{
		for( tank in this.tanks )
		{
			if( tank.userID == userID )
				return tank;
		}

		return null;
	}

	// ------------------------------------------------------------------------ //
	// ------------------------------------------------------------------------ //
	// Powerups:

	/**
	 *
	 * @param	tank
	 */
	public function addPowerup( powerup:PowerupEntity ):Void
	{
		if( this.getPowerupByID( powerup.ID ) != null )
			return;

		// ---------------------- //

		this.powerups.push( powerup );
	}

	/**
	 *
	 * @param	tank
	 */
	public function removePowerup( ID:Int ):Void
	{
		var powerup:PowerupEntity = this.getPowerupByID( ID );

		if( powerup == null )
			return;

		// ---------------------- //

		this.powerups.remove( powerup );
	}

	/**
	 *
	 * @param	ID
	 */
	public function getPowerupByID( ID:Int ):PowerupEntity
	{
		for( powerup in this.powerups )
		{
			if( powerup.ID == ID )
				return powerup;
		}

		return null;
	}

	// ------------------------------------------------------------------------ //
	// ------------------------------------------------------------------------ //
	// Bullets:

	/**
	 *
	 * @param	tank
	 */
	public function addBullet( bullet:BulletEntity ):Void
	{
		if( this.getBulletByID( bullet.ID ) != null )
		{
			trace("allready there ... " + bullet.ID );
			return;
		}

		// ---------------------- //

		this.bullets.push( bullet );
	}

	/**
	 *
	 * @param	tank
	 */
	public function removeBullet( ID:Int ):Void
	{
		var bullet:BulletEntity = this.getBulletByID( ID );

		if( bullet == null )
		{
			trace("bullet:" + ID + " not found ... ");
			return;
		}

		// ---------------------- //

		this.bullets.remove( bullet );
	}

	/**
	 *
	 * @param	ID
	 */
	public function getBulletByID( ID:Int ):BulletEntity
	{
		for( bullet in this.bullets )
		{
			if( bullet.ID == ID )
				return bullet;
		}

		return null;
	}

	/**
	 *
	 * @param	ID
	 */
	public function getBulletsByTankID( tankID:Int, ?output:Array<BulletEntity> ):Array<BulletEntity>
	{
		if( output == null )
			output = new Array<BulletEntity>();

		// --------- //

		for( bullet in this.bullets )
		{
			if( bullet.tankID == tankID )
				output.push( bullet );
		}

		return output;
	}

}