package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IMainFactory extends haxe.lang.IHxObject
{
	haxe.view.IViewController createViewController();
	
	haxe.socket.IClientSocket createClientSocket(java.lang.String host, int port);
	
}


