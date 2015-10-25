package haxe.thnx.model;
import haxe.at.dotpoint.math.Axis;
import haxe.at.dotpoint.math.MathUtil;
import haxe.at.dotpoint.math.vector.Quaternion;
import haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy;
import haxe.thnx.model.entities.BulletEntity;
import haxe.thnx.model.entities.PowerupEntity;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.enums.Alliance;
import haxe.thnx.model.enums.PowerupType;
import haxe.thnx.model.enums.TeamColor;
import haxe.thnx.model.user.User;
import javahx.thnx.ThnxMain;

/**
 * ...
 * @author RK
 */
class EntityFactory
{

	/**
	 *
	 * @param	name
	 * @return
	 */
	public static function getPowerupType( name:String ):PowerupType
	{
		switch( name )
		{
			case "repair": return PowerupType.REPAIR;
			case "damage": return PowerupType.DAMAGE;
			case "shield": return PowerupType.SHIELD;
		}

		return null;
	}

	/**
		"id": 10101,
		"t": "damage",
		"r": 0.3,
		"x": 34.5,
		"y": 32.5
	 */
	public static function createPowerup( data:Dynamic ):PowerupEntity
	{
		var entity:PowerupEntity = new PowerupEntity( data.id, EntityFactory.getPowerupType( data.t ) );
			entity.boundings.changePolicy = BoundingChangePolicy.CHANGE_MODELBOUNDS;

		switch( entity.type )
		{
			case PowerupType.SHIELD:
			{
				entity.boundings.modelSpace.width  = 2;
				entity.boundings.modelSpace.height = 2;
				entity.boundings.modelSpace.length = 1;
			}

			default:
			{
				entity.boundings.modelSpace.width  = 1;
				entity.boundings.modelSpace.height = 1;
				entity.boundings.modelSpace.length = 1;
			}
		}

		entity.x = data.x;
		entity.y = data.y;

		return entity;
	}

	/**
	    "id": 3650,
		"team": 1,
		"owner": "196b004e-e6c1-4cf4-9a07-440fcb45485a",
		"pos": [39.5, 5.5],
		"angle": -118,
		"hp": 10,
		"shield": 0,
		"dead": true,
		"score": 0
	 */
	public static function createTank( data:Dynamic ):TankEntity
	{
		var entity:TankEntity = new TankEntity( data.id, data.owner );
			entity.boundings.changePolicy = BoundingChangePolicy.CHANGE_MODELBOUNDS;
			entity.boundings.modelSpace.width  = 0.8;
			entity.boundings.modelSpace.height = 1.2;
			entity.boundings.modelSpace.length = 0.5;

		// x,y
		entity.x = data.pos[0];
		entity.y = data.pos[1];

		// cannon?
		entity.cannon.setRotation( data.angle );

		// -------------- //

		// team:
		entity.status.team = TeamColor.createByIndex( data.team );

		// health:
		entity.status.health = data.hp;
		entity.status.shield = data.shield;

		// user:
		entity.getUser().score = data.score;

		// -------------- //

		return entity;
	}

	/**
		"id": 197961,
		"tank": 4140,
		"x": 37.31,
		"y": 16.94,
		"tx": 46.49,
		"ty": 3.84,
		"sp": 0.7
	 */
	public static function createBullet( data:Dynamic ):BulletEntity
	{
		var entity:BulletEntity = new BulletEntity( data.id );
			entity.tankID = data.tank;

		entity.x = data.x;
		entity.y = data.y;
		entity.target.x = data.tx;
		entity.target.y = data.ty;
		entity.speed = data.sp;

		return entity;
	}
}