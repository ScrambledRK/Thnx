package haxe.loader;

import haxe.at.dotpoint.loader.DataRequest;
import haxe.at.dotpoint.loader.format.StringFormat;
import haxe.at.dotpoint.loader.URLRequest;

/**
 *
 */
class WorldRequest extends DataRequest
{
	public function new( request:URLRequest )
	{
		super( request );

		this.loader = StringFormat.instance.createLoader( null );
		this.parser = new WorldParser();
	}
}