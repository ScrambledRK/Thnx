package haxe.at.dotpoint.logger.logger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface ILogger extends haxe.lang.IHxObject
{
	void log(haxe.at.dotpoint.logger.LogType type, java.lang.Object msg, java.lang.Object info);
	
}


