package haxe.thnx.socket.response;
import haxe.thnx.model.entities.PowerupEntity;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.EntityFactory;
import haxe.thnx.model.user.User;
import javahx.thnx.ThnxMain;

//
class Init extends SocketResponse
{
	//
	public function new() {	super( "init" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		ThnxMain.instance.world.reset();
		ThnxMain.instance.lobby.reset();

		ThnxMain.instance.lobby.addUser( new User( data.id ) );
	}
}

//
class Update extends SocketResponse
{
	//
	public function new() {	super( "update" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		if( data.tanks != null )
			this.updateTanks( cast data.tanks );

		if( data.pickable != null )
			this.addPickups( cast data.pickable );

		if( data.pickableDelete != null )
			this.removePickups( cast data.pickableDelete );

		if( data.bullets != null )
			this.addBullets( cast data.bullets );

		if( data.bulletsDelete != null )
			this.removeBullets( cast data.bulletsDelete );
	}

	/**
		"id": 3736,
		"x": 0.75,
		"y": 0.75,
		"a": 250,
		"dead": true,
		"killer": null
	 */
	private function updateTanks( list:Array<Dynamic> ):Void
	{
		for( data in list )
		{
			var tank:TankEntity = ThnxMain.instance.world.getTankByID( data.id );

			if( tank == null )
				continue;

			// ------------ //

			tank.cannon.setRotation( data.a );
			tank.x = data.x;
			tank.y = data.y;

			if( data.hp != null ) tank.status.health = data.hp;
			if( data.sp != null ) tank.status.shield = data.sp;

			if( data.dead != null )
			{
				tank.status.health = -1;
				tank.status.shield = -1;
			}
		}
	}

	//
	private function addPickups( list:Array<Dynamic> ):Void
	{
		for( data in list )
			ThnxMain.instance.world.addPowerup( EntityFactory.createPowerup( data ) );
	}

	//
	private function removePickups( list:Array<Dynamic> ):Void
	{
		for( data in list )
			ThnxMain.instance.world.removePowerup( data.id );
	}

	//
	private function addBullets( list:Array<Dynamic> ):Void
	{
		for( data in list )
			ThnxMain.instance.world.addBullet( EntityFactory.createBullet( data ) );
	}

	//
	private function removeBullets( list:Array<Dynamic> ):Void
	{
		for( data in list )
			ThnxMain.instance.world.removeBullet( data.id );	// TODO: bullet impact coordinates
	}
}