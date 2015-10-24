package haxe.at.dotpoint.loader.processor;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IDataRequest<TInput, TOutput> extends haxe.lang.IHxObject, haxe.at.dotpoint.loader.processor.IDataProcessor<TInput, TOutput>
{
	void load(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error);
	
}


