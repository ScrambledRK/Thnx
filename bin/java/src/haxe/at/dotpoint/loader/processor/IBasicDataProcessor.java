package haxe.at.dotpoint.loader.processor;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IBasicDataProcessor<TInput> extends haxe.lang.IHxObject, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher
{
	void start(TInput request);
	
	void stop();
	
}


