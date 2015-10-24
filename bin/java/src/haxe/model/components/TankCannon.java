package haxe.model.components;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TankCannon extends haxe.at.dotpoint.core.entity.Component<haxe.model.entities.TankEntity>
{
	public TankCannon(haxe.lang.EmptyObject empty)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TankCannon()
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.model.components.TankCannon.__hx_ctor_haxe_model_components_TankCannon(this);
	}
	
	
	public static void __hx_ctor_haxe_model_components_TankCannon(haxe.model.components.TankCannon __temp_me116)
	{
		//line 34 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.at.dotpoint.core.entity.Component.__hx_ctor_haxe_at_dotpoint_core_entity_Component(__temp_me116);
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		__temp_me116.rotation = new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null);
		//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		__temp_me116.isShooting = false;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		return new haxe.model.components.TankCannon(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		return new haxe.model.components.TankCannon();
	}
	
	
	public haxe.at.dotpoint.math.vector.Quaternion rotation;
	
	public boolean isShooting;
	
	public void setRotation(double degree)
	{
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.at.dotpoint.math.vector.Quaternion.setAxisAngle(haxe.at.dotpoint.math.AxisOrientation.UP, ( degree * 0.017453292519943295 ), this.rotation);
	}
	
	
	public haxe.at.dotpoint.math.vector.IQuaternion aim(haxe.at.dotpoint.math.vector.IVector3 target, haxe.at.dotpoint.math.vector.IQuaternion output)
	{
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		if (( output == null )) 
		{
			//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output = this.rotation;
		}
		
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.at.dotpoint.math.vector.IVector3 source = this.get_entity().transform.get_position();
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.at.dotpoint.math.vector.Vector3 direction = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.subtract(target, source, null)) );
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		direction.normalize();
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		double dot = haxe.at.dotpoint.math.vector.Vector3.dot(new haxe.at.dotpoint.math.vector.Vector3(0, 0, 1, null), direction);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		if (( java.lang.Math.abs(( dot + 1 )) < 1e-08 )) 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_x(((double) (0) ));
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_y(((double) (1) ));
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_z(((double) (0) ));
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_w(3.1415926535897932);
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			return output;
		}
		
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		if (( java.lang.Math.abs(( dot - 1 )) < 1e-08 )) 
		{
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_x(((double) (0) ));
			//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_y(((double) (0) ));
			//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_z(((double) (0) ));
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			output.set_w(((double) (1) ));
			//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			return output;
		}
		
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		double radian = java.lang.Math.acos(dot);
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		haxe.at.dotpoint.math.vector.Vector3 axis = ((haxe.at.dotpoint.math.vector.Vector3) (haxe.at.dotpoint.math.vector.Vector3.cross(new haxe.at.dotpoint.math.vector.Vector3(0, 0, 1, null), direction, null)) );
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		axis.normalize();
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		return ((haxe.at.dotpoint.math.vector.IQuaternion) (haxe.at.dotpoint.math.vector.Quaternion.setAxisAngle(axis, radian, output)) );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			switch (field.hashCode())
			{
				case -1138535763:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("isShooting")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						this.isShooting = haxe.lang.Runtime.toBool(value);
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
				case -40300674:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("rotation")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						this.rotation = ((haxe.at.dotpoint.math.vector.Quaternion) (value) );
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			switch (field.hashCode())
			{
				case 96581:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("aim")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "aim")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
				case -40300674:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("rotation")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return this.rotation;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
				case 1949019648:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("setRotation")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setRotation")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
				case -1138535763:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("isShooting")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return this.isShooting;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			switch (field.hashCode())
			{
				case 96581:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("aim")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						return this.aim(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(1)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
				case 1949019648:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					if (field.equals("setRotation")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
						this.setRotation(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		baseArr.push("isShooting");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		baseArr.push("rotation");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\model\\components\\TankCannon.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


