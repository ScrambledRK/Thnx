package haxe.socket;

import haxe.socket.response.SocketResponse;
import haxe.socket.response.UpdateResponse.Init;
import haxe.socket.response.UpdateResponse.Update;
import haxe.socket.response.LobbyResponse.UserAdd;
import haxe.socket.response.LobbyResponse.UserRemove;
import haxe.socket.response.LobbyResponse.UserSync;
import haxe.socket.response.TankResponse.TankNew;
import haxe.socket.response.TankResponse.TankRemove;

/**
 * ...
 * @author RK
 */
class ResponseList
{

	//
	public static var instance:ResponseList = new ResponseList();

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	private function new()
	{

	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function getResponseList():Array<SocketResponse>
	{
		var list:Array<SocketResponse> = new Array<SocketResponse>();

		// ------------------------- //

		list.push( new Update() 		);
		list.push( new UserAdd() 		);
		list.push( new UserRemove() 	);
		list.push( new UserSync() 		);
		list.push( new TankNew() 		);
		list.push( new TankRemove()		);
		list.push( new Init() 			);

		// ------------------------- //

		return list;
	}
}