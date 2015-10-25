package haxe.thnx.view;

import haxe.at.dotpoint.math.vector.IVector2;

/**
 *
 */
interface IViewController
{

	/**
	 *
	 * @param	onComplete
	 */
	public function initialize( dimension:IVector2, ?scaling:IVector2 ):Void;

	/**
	 *
	 */
	public function update():Void;

}