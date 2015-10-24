package haxe._Timer;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TimerTask extends java.util.TimerTask
{
	public TimerTask(haxe.Timer timer)
	{
		//line 179 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		super();
		//line 180 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		this.timer = timer;
	}
	
	
	public haxe.Timer timer;
	
	@Override public void run()
	{
		//line 184 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		this.timer.run.__hx_invoke0_o();
	}
	
	
}


