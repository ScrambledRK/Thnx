package haxe.at.dotpoint.core.entity;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IEntity extends haxe.lang.IHxObject, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher
{
	java.lang.Object getComponentIterator();
	
	<T> java.lang.Object getComponent(java.lang.Class type);
	
	boolean addComponent(haxe.at.dotpoint.core.entity.IComponent component);
	
	boolean removeComponent(haxe.at.dotpoint.core.entity.IComponent component, java.lang.Object destroy);
	
}


