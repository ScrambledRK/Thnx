package haxe.at.dotpoint.loader.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IDataFormat extends haxe.lang.IHxObject
{
	boolean isFormat(haxe.at.dotpoint.loader.DataRequest request);
	
	haxe.at.dotpoint.loader.processor.IDataProcessor createLoader(haxe.at.dotpoint.loader.DataRequest request);
	
	haxe.at.dotpoint.loader.processor.IDataProcessor createParser(haxe.at.dotpoint.loader.DataRequest request);
	
}


