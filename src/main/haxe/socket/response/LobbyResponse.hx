package haxe.socket.response;

import haxe.model.entities.TankEntity;
import haxe.model.EntityFactory;
import haxe.model.user.User;
import haxe.socket.response.SocketResponse;
import javahx.ThnxMain;

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
