package haxe.at.dotpoint.core.datastructure;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface ICollection<T> extends haxe.lang.IHxObject
{
	boolean has(T x);
	
	boolean add(T x);
	
	boolean remove(T x);
	
	T get(int index);
	
	void set(int index, T obj);
	
	int indexOf(T obj);
	
	int size();
	
	haxe.root.Array<T> toArray();
	
}


