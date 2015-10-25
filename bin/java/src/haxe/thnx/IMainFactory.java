package haxe.thnx;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IMainFactory extends haxe.lang.IHxObject
{
	haxe.thnx.view.IViewController createViewController();
	
	haxe.thnx.socket.IClientSocket createClientSocket(java.lang.String host, int port);
	
}


