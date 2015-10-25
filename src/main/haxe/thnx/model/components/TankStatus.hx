package haxe.thnx.model.components;
import haxe.at.dotpoint.core.entity.Component;
import haxe.thnx.model.entities.TankEntity;
import haxe.thnx.model.enums.Alliance;
import haxe.thnx.model.enums.TeamColor;
import javahx.thnx.ThnxMain;

/**
 * ...
 * @author RK
 */
class TankStatus extends Component<TankEntity>
{

	/**
	 *
	 */
	public var health:Float;
	public var shield:Float;

	// ------------- //

	//
	public var alliance(get, null):Alliance;

	//
	public var team:TeamColor;

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	/**
	 *
	 * @param	alliance
	 * @param	team
	 */
	public function new( ?health:Float = 10 )
	{
		super();

		this.health = health;
		this.shield = 0;
	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @return
	 */
	public function isAlive():Bool
	{
		return this.health > 0;
	}

	/**
	 *
	 * @return
	 */
	private function get_alliance():Alliance
	{
		var player:TankEntity = ThnxMain.instance.lobby.player.getTank();

		if( player != null )
		{
			if( this.team == player.status.team )
				return Alliance.ALLY;
		}

		return Alliance.ENEMY;
	}

}