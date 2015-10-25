package haxe.at.dotpoint.spatial.transform;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TransformationMatrix extends haxe.at.dotpoint.math.vector.Matrix44
{
	public TransformationMatrix(haxe.lang.EmptyObject empty)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TransformationMatrix(haxe.at.dotpoint.math.vector.IMatrix44 m)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.at.dotpoint.spatial.transform.TransformationMatrix.__hx_ctor_haxe_at_dotpoint_spatial_transform_TransformationMatrix(this, m);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_spatial_transform_TransformationMatrix(haxe.at.dotpoint.spatial.transform.TransformationMatrix __temp_me105, haxe.at.dotpoint.math.vector.IMatrix44 m)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.at.dotpoint.math.vector.Matrix44.__hx_ctor_haxe_at_dotpoint_math_vector_Matrix44(__temp_me105, m);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (arr.__get(0)) ));
	}
	
	
	public void setComponents(haxe.at.dotpoint.math.vector.IQuaternion rotation, haxe.at.dotpoint.math.vector.IVector3 scale, haxe.at.dotpoint.math.vector.IVector3 position)
	{
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.setRotation(rotation);
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.setPosition(position);
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.setScale(scale);
	}
	
	
	public <T> T getPosition(java.lang.Object output)
	{
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		if (( output == null )) 
		{
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{this.m41}));
		//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{this.m42}));
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{this.m43}));
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return ((T) (output) );
	}
	
	
	public void setPosition(haxe.at.dotpoint.math.vector.IVector3 input)
	{
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.m41 = input.get_x();
		//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.m42 = input.get_y();
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		this.m43 = input.get_z();
	}
	
	
	public <T> T getScale(java.lang.Object output)
	{
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		if (( output == null )) 
		{
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null)) );
		}
		
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_x", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.sqrt(( ( ( this.m11 * this.m11 ) + ( this.m12 * this.m12 ) ) + ( this.m13 * this.m13 ) ))}));
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_y", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.sqrt(( ( ( this.m21 * this.m21 ) + ( this.m22 * this.m22 ) ) + ( this.m23 * this.m23 ) ))}));
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.lang.Runtime.callField(output, "set_z", new haxe.root.Array(new java.lang.Object[]{java.lang.Math.sqrt(( ( ( this.m31 * this.m31 ) + ( this.m32 * this.m32 ) ) + ( this.m33 * this.m33 ) ))}));
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return ((T) (output) );
	}
	
	
	public void setScale(haxe.at.dotpoint.math.vector.IVector3 input)
	{
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		if (( ( ( input.get_x() != 1 ) || ( input.get_y() != 1 ) ) || ( input.get_z() != 1 ) )) 
		{
			//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			haxe.at.dotpoint.math.vector.Matrix44 scale = new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			scale.m11 = input.get_x();
			//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			scale.m22 = input.get_y();
			//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			scale.m33 = input.get_z();
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			haxe.at.dotpoint.math.vector.Matrix44.multiply(this, scale, this);
		}
		
	}
	
	
	public <T> T getRotation(java.lang.Object output)
	{
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		if (( output == null )) 
		{
			//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			output = ((java.lang.Object) (new haxe.at.dotpoint.math.vector.Quaternion(null, null, null, null)) );
		}
		
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return ((T) (haxe.at.dotpoint.math.vector.Quaternion.setMatrix(this, output)) );
	}
	
	
	public void setRotation(haxe.at.dotpoint.math.vector.IQuaternion input)
	{
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		haxe.at.dotpoint.math.vector.Quaternion.toMatrix(input, this);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			switch (field.hashCode())
			{
				case 1949019648:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setRotation")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setRotation")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 28936472:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setComponents")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setComponents")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 2037599476:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getRotation")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getRotation")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case -1469262177:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getPosition")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPosition")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 1403963912:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setScale")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setScale")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case -1557842005:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setPosition")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPosition")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 1965076372:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getScale")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getScale")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			switch (field.hashCode())
			{
				case 1949019648:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setRotation")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						this.setRotation(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 28936472:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setComponents")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						this.setComponents(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(1)) ), ((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(2)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 2037599476:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getRotation")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((java.lang.Object) (this.getRotation(dynargs.__get(0))) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case -1469262177:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getPosition")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((java.lang.Object) (this.getPosition(dynargs.__get(0))) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 1403963912:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setScale")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						this.setScale(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case -1557842005:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("setPosition")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						this.setPosition(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
				case 1965076372:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					if (field.equals("getScale")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
						return ((java.lang.Object) (this.getScale(dynargs.__get(0))) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\TransformationMatrix.hx"
		return null;
	}
	
	
}


