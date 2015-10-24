package haxe.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WorldRequest extends haxe.at.dotpoint.loader.DataRequest
{
	public WorldRequest(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public WorldRequest(haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		haxe.loader.WorldRequest.__hx_ctor_haxe_loader_WorldRequest(this, request);
	}
	
	
	public static void __hx_ctor_haxe_loader_WorldRequest(haxe.loader.WorldRequest __temp_me111, haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		haxe.at.dotpoint.loader.DataRequest.__hx_ctor_haxe_at_dotpoint_loader_DataRequest(__temp_me111, request, null);
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		__temp_me111.loader = haxe.at.dotpoint.loader.format.StringFormat.get_instance().createLoader(null);
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		__temp_me111.parser = ((haxe.at.dotpoint.loader.processor.IDataProcessor) (new haxe.loader.WorldParser()) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		return new haxe.loader.WorldRequest(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\loader\\WorldRequest.hx"
		return new haxe.loader.WorldRequest(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (arr.__get(0)) ));
	}
	
	
}


