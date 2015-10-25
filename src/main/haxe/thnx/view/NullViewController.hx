package haxe.thnx.view;

import haxe.at.dotpoint.math.vector.IVector2;
import haxe.thnx.view.IViewController;

/**
 * ...
 * @author RK
 */
class NullViewController implements IViewController
{

	// ************************************************************************ //
	// Constructor
	// ************************************************************************ //

	public function new()
	{

	}

	// ************************************************************************ //
	// Methods
	// ************************************************************************ //

	/**
	 *
	 * @param	onComplete
	 */
	public function initialize( dimension:IVector2, ?scaling:IVector2 ):Void
	{
		return;
	}

	/**
	 *
	 */
	public function update():Void
	{
		return;
	}
}