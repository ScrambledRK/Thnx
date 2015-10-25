package haxe.thnx.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TilesetRequest extends haxe.at.dotpoint.loader.DataRequest
{
	public TilesetRequest(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TilesetRequest(haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		haxe.thnx.loader.TilesetRequest.__hx_ctor_haxe_thnx_loader_TilesetRequest(this, request);
	}
	
	
	public static void __hx_ctor_haxe_thnx_loader_TilesetRequest(haxe.thnx.loader.TilesetRequest __temp_me115, haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		haxe.at.dotpoint.loader.DataRequest.__hx_ctor_haxe_at_dotpoint_loader_DataRequest(__temp_me115, request, null);
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		__temp_me115.loader = haxe.at.dotpoint.loader.format.StringFormat.get_instance().createLoader(null);
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		__temp_me115.parser = ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new haxe.thnx.loader.TilesetParser()) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		return new haxe.thnx.loader.TilesetRequest(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetRequest.hx"
		return new haxe.thnx.loader.TilesetRequest(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (arr.__get(0)) ));
	}
	
	
}


