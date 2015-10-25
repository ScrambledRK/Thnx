package haxe.thnx.socket;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public interface IClientSocket extends haxe.lang.IHxObject
{
	void requestMove(double x, double y);
	
	void requestShoot(boolean isShooting);
	
	void requestTarget(double degree);
	
	void sendRequest(java.lang.String name, java.lang.Object data);
	
	void start();
	
}


