package haxe.thnx.socket;

import haxe.thnx.socket.response.SocketResponse;
import haxe.thnx.socket.response.UpdateResponse.Init;
import haxe.thnx.socket.response.UpdateResponse.Update;
import haxe.thnx.socket.response.LobbyResponse.UserAdd;
import haxe.thnx.socket.response.LobbyResponse.UserRemove;
import haxe.thnx.socket.response.LobbyResponse.UserSync;
import haxe.thnx.socket.response.TankResponse.TankNew;
import haxe.thnx.socket.response.TankResponse.TankRemove;

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