package haxe.thnx.model;
import haxe.at.dotpoint.logger.Log;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.user.User;
import javahx.thnx.ThnxMain;

/**
 * ...
 * @author RK
 */
class Lobby
{

	/**
	 *
	 */
	public var users:Array<User>;

	/**
	 *
	 */
	public var player:User;

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
		this.users = new Array<User>();
	}

	// ------------------------------------------------------------------------ //
	// ------------------------------------------------------------------------ //
	// User:

	/**
	 *
	 * @param	user
	 */
	public function addUser( user:User ):Void
	{
		if( this.getUserByID( user.ID ) != null )
			return;

		// ---------------------- //

		this.users.push( user );

		if( this.player == null )
			this.player = user;
	}


	/**
	 *
	 * @param	user
	 */
	public function removeUser( userID:String ):Void
	{
		var user:User = this.getUserByID( userID );

		if( user == null )
			return;

		// ---------------------- //

		this.users.remove( user );
	}

	/**
	 *
	 * @return
	 */
	public function getUserByID( userID:String ):User
	{
		for( user in this.users )
		{
			if( user.ID == userID )
				return user;
		}

		return null;
	}
}