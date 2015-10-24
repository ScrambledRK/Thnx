package haxe.view;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NullViewController extends haxe.lang.HxObject implements haxe.view.IViewController
{
	public NullViewController(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public NullViewController()
	{
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		haxe.view.NullViewController.__hx_ctor_haxe_view_NullViewController(this);
	}
	
	
	public static void __hx_ctor_haxe_view_NullViewController(haxe.view.NullViewController __temp_me136)
	{
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		return new haxe.view.NullViewController(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		return new haxe.view.NullViewController();
	}
	
	
	public void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		return ;
	}
	
	
	public void update()
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		return ;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			switch (field.hashCode())
			{
				case -838846263:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					if (field.equals("update")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			switch (field.hashCode())
			{
				case -838846263:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					if (field.equals("update")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						this.update();
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
						this.initialize(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\view\\NullViewController.hx"
		return null;
	}
	
	
}


