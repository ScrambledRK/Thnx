package haxe.at.dotpoint.core.lazy;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LazyComponent_setDefaultOnValidate_97__Fun extends haxe.lang.Function
{
	public LazyComponent_setDefaultOnValidate_97__Fun(haxe.at.dotpoint.core.lazy.LazyComponent _g)
	{
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		super(0, 0);
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this._g = _g;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this._g.allowDispatchUpdate = true;
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this._g.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		return null;
	}
	
	
	public haxe.at.dotpoint.core.lazy.LazyComponent _g;
	
}


