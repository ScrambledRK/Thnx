package haxe.at.dotpoint.core.lazy;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class LazyComponent extends haxe.lang.HxObject
{
	public LazyComponent(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public LazyComponent(haxe.lang.Function onUpdate, haxe.lang.Function onValidate)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		haxe.at.dotpoint.core.lazy.LazyComponent.__hx_ctor_haxe_at_dotpoint_core_lazy_LazyComponent(this, onUpdate, onValidate);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_lazy_LazyComponent(haxe.at.dotpoint.core.lazy.LazyComponent __temp_me34, haxe.lang.Function onUpdate, haxe.lang.Function onValidate)
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		if (( onUpdate != null )) 
		{
			//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			__temp_me34.onUpdate = onUpdate;
		}
		else
		{
			//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			__temp_me34.setDefaultOnUpdate();
		}
		
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		if (( onValidate != null )) 
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			__temp_me34.onValidate = onValidate;
		}
		else
		{
			//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			__temp_me34.setDefaultOnValidate();
		}
		
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		__temp_me34.allowDispatchUpdate = true;
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		__temp_me34.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		return new haxe.at.dotpoint.core.lazy.LazyComponent(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		return new haxe.at.dotpoint.core.lazy.LazyComponent(((haxe.lang.Function) (arr.__get(0)) ), ((haxe.lang.Function) (arr.__get(1)) ));
	}
	
	
	public haxe.at.dotpoint.core.lazy.LazyStatus status;
	
	public haxe.lang.Function onUpdate;
	
	public haxe.lang.Function onValidate;
	
	public boolean allowDispatchUpdate;
	
	public final void dispatchUpdate()
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		if (this.allowDispatchUpdate) 
		{
			//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			this.onUpdate.__hx_invoke0_o();
		}
		
	}
	
	
	public final void validate()
	{
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		if (( this.status == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
		{
			//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			this.onValidate.__hx_invoke0_o();
		}
		
	}
	
	
	public void invalidate()
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
	}
	
	
	public void setDefaultOnUpdate()
	{
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		haxe.at.dotpoint.core.lazy.LazyComponent _g = this;
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this.onUpdate = new haxe.at.dotpoint.core.lazy.LazyComponent_setDefaultOnUpdate_85__Fun(_g);
	}
	
	
	public void setDefaultOnValidate()
	{
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		haxe.at.dotpoint.core.lazy.LazyComponent _g = this;
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		this.onValidate = new haxe.at.dotpoint.core.lazy.LazyComponent_setDefaultOnValidate_97__Fun(_g);
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		{
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			switch (field.hashCode())
			{
				case -514055796:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("allowDispatchUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.allowDispatchUpdate = haxe.lang.Runtime.toBool(value);
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return value;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -892481550:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("status")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.status = ((haxe.at.dotpoint.core.lazy.LazyStatus) (value) );
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return value;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case 1348680725:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("onValidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.onValidate = ((haxe.lang.Function) (value) );
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return value;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case 1559564168:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("onUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.onUpdate = ((haxe.lang.Function) (value) );
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return value;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
			}
			
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		{
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			switch (field.hashCode())
			{
				case -1848548108:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("setDefaultOnValidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDefaultOnValidate")) );
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -892481550:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("status")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return this.status;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -280632281:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("setDefaultOnUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setDefaultOnUpdate")) );
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case 1559564168:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("onUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return this.onUpdate;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1831849669:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("invalidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidate")) );
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case 1348680725:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("onValidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return this.onValidate;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1421272810:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("validate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validate")) );
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -514055796:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("allowDispatchUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return this.allowDispatchUpdate;
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1491884573:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("dispatchUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchUpdate")) );
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
			}
			
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		{
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			switch (field.hashCode())
			{
				case -1848548108:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("setDefaultOnValidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.setDefaultOnValidate();
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1491884573:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("dispatchUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.dispatchUpdate();
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -280632281:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("setDefaultOnUpdate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.setDefaultOnUpdate();
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1421272810:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("validate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.validate();
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
				case -1831849669:
				{
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					if (field.equals("invalidate")) 
					{
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						__temp_executeDef1 = false;
						//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
						this.invalidate();
					}
					
					//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
					break;
				}
				
				
			}
			
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		baseArr.push("allowDispatchUpdate");
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		baseArr.push("onValidate");
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		baseArr.push("onUpdate");
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		baseArr.push("status");
		//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
		{
			//line 3 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\lazy\\LazyComponent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


