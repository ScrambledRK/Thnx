package haxe.at.dotpoint.loader.processor;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IDataProcessor<TInput, TOutput> extends haxe.lang.IHxObject, haxe.at.dotpoint.loader.processor.IBasicDataProcessor<TInput>
{
	void addStatusListener(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error);
	
	void removeStatusListener(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error);
	
}


