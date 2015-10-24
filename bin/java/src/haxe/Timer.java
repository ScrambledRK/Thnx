package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Timer extends haxe.lang.HxObject
{
	public Timer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Timer(int time_ms)
	{
		//line 59 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		haxe.Timer.__hx_ctor_haxe_Timer(this, time_ms);
	}
	
	
	public static void __hx_ctor_haxe_Timer(haxe.Timer __temp_me12, int time_ms)
	{
		//line 108 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		__temp_me12.run = ( (( haxe.Timer___hx_ctor_haxe_Timer_108__Fun.__hx_current != null )) ? (haxe.Timer___hx_ctor_haxe_Timer_108__Fun.__hx_current) : (haxe.Timer___hx_ctor_haxe_Timer_108__Fun.__hx_current = ((haxe.Timer___hx_ctor_haxe_Timer_108__Fun) (new haxe.Timer___hx_ctor_haxe_Timer_108__Fun()) )) );
		//line 67 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		__temp_me12.timer = new java.util.Timer();
		//line 68 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		__temp_me12.timer.scheduleAtFixedRate(((java.util.TimerTask) (__temp_me12.task = new haxe._Timer.TimerTask(__temp_me12)) ), ((long) (time_ms) ), ((long) (time_ms) ));
	}
	
	
	public static double stamp()
	{
		//line 166 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		return haxe.root.Sys.time();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		return new haxe.Timer(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		return new haxe.Timer(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public java.util.Timer timer;
	
	public java.util.TimerTask task;
	
	public void stop()
	{
		//line 91 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		this.timer.cancel();
		//line 92 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		this.timer = null;
		//line 93 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		this.task = null;
	}
	
	
	public haxe.lang.Function run;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("run")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						this.run = ((haxe.lang.Function) (value) );
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return value;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
				case 110364485:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("timer")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						this.timer = ((java.util.Timer) (value) );
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return value;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
				case 3552645:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("task")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						this.task = ((java.util.TimerTask) (value) );
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return value;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
			}
			
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			switch (field.hashCode())
			{
				case 113291:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("run")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return this.run;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
				case 110364485:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("timer")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return this.timer;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("stop")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
				case 3552645:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("task")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						return this.task;
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
			}
			
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			switch (field.hashCode())
			{
				case 3540994:
				{
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					if (field.equals("stop")) 
					{
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						__temp_executeDef1 = false;
						//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
						this.stop();
					}
					
					//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
					break;
				}
				
				
			}
			
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("run");
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("task");
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		baseArr.push("timer");
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
		{
			//line 38 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\Timer.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


