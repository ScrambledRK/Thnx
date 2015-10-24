package haxe.model.user;
import haxe.model.entities.TankEntity;
import javahx.ThnxMain;

/**
 * ...
 * @author RK
 */
class User
{

	/**
	 *
	 */
	public var ID:String;

	/**
	 *
	 */
	public var name:String;

	/**
	 *
	 */
	public var score:Int;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new( ID:String, ?name:String )
	{
		this.ID = ID;
		this.name = name;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function getTank():TankEntity
	{
		return ThnxMain.instance.world.getTankByUserID( this.ID );
	}
}