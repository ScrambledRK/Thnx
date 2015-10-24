package haxe.socket.response;

import haxe.model.entities.BulletEntity;
import haxe.model.EntityFactory;
import javahx.ThnxMain;

//
class TankNew extends SocketResponse
{
	//
	public function new() {	super( "tank.new" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		ThnxMain.instance.world.addTank( EntityFactory.createTank( data ) );
	}
}

//
class TankRemove extends SocketResponse
{
	//
	public function new() {	super( "tank.delete" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		ThnxMain.instance.world.removeTank( data.id );

		// --------- //

		var bullets:Array<BulletEntity> = ThnxMain.instance.world.getBulletsByTankID( data.id );

		for( bullet in bullets )
			ThnxMain.instance.world.removeBullet( bullet.ID );
	}
}