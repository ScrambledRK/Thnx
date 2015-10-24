package haxe.at.dotpoint.core.dispatcher;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IDispatcher<TData, TListener> extends haxe.lang.IHxObject
{
	boolean dispatch(TData event);
	
	void addListener(TListener type, haxe.lang.Function call);
	
	void removeListener(TListener type, haxe.lang.Function call);
	
	boolean hasListener(TListener type);
	
	void clearListeners();
	
}


