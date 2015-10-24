package haxe.at.dotpoint.core.entity;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IComponent<TEntity> extends haxe.lang.IHxObject, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher
{
	TEntity get_entity();
	
	TEntity set_entity(TEntity value);
	
	void destroyComponent();
	
}


