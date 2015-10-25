package haxe.thnx.socket.response;

import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.EntityFactory;
import haxe.thnx.model.user.User;
import haxe.thnx.socket.response.SocketResponse;
import javahx.thnx.ThnxMain;

//
class UserAdd extends SocketResponse
{
	//
	public function new() {	super( "user.add" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		ThnxMain.instance.lobby.addUser( new User( data.id, data.name ) );
	}
}

//
class UserRemove extends SocketResponse
{
	//
	public function new() {	super( "user.remove" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		ThnxMain.instance.lobby.removeUser( data.id );
	}
}

//
class UserSync extends SocketResponse
{
	//
	public function new() {	super( "user.sync" ); }

	//
	public override function execute( data:Dynamic ):Void
	{
		var list:Array<Dynamic> = cast data;

		for( user in list )
			ThnxMain.instance.lobby.addUser( new User( user.id, user.name ) );
	}
}
