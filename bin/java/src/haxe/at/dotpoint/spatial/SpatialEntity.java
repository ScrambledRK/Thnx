package haxe.at.dotpoint.spatial;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class SpatialEntity extends haxe.at.dotpoint.core.entity.Entity implements haxe.at.dotpoint.spatial.ISpatialEntity<haxe.at.dotpoint.spatial.SpatialEntity>
{
	public SpatialEntity(haxe.lang.EmptyObject empty)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public SpatialEntity(java.lang.Object numComponents, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		haxe.at.dotpoint.spatial.SpatialEntity.__hx_ctor_haxe_at_dotpoint_spatial_SpatialEntity(this, numComponents, pivot);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_spatial_SpatialEntity(haxe.at.dotpoint.spatial.SpatialEntity __temp_me100, java.lang.Object numComponents, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		java.lang.Object __temp_numComponents99 = ( (haxe.lang.Runtime.eq(numComponents, null)) ? (((java.lang.Object) (3) )) : (numComponents) );
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		haxe.at.dotpoint.core.entity.Entity.__hx_ctor_haxe_at_dotpoint_core_entity_Entity(__temp_me100, __temp_numComponents99);
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.transform = new haxe.at.dotpoint.spatial.transform.Transform<haxe.at.dotpoint.spatial.SpatialEntity>();
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.boundings = new haxe.at.dotpoint.spatial.boundings.Boundings<haxe.at.dotpoint.spatial.SpatialEntity>(null, pivot);
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.spatialNode = new haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.spatial.SpatialEntity>(((java.lang.Object) (null) ));
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (__temp_me100.spatialNode) ));
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (__temp_me100.transform) ));
		//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		__temp_me100.addComponent(((haxe.at.dotpoint.core.entity.IComponent) (__temp_me100.boundings) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return new haxe.at.dotpoint.spatial.SpatialEntity(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return new haxe.at.dotpoint.spatial.SpatialEntity(arr.__get(0), ((haxe.at.dotpoint.math.vector.IVector3) (arr.__get(1)) ));
	}
	
	
	public haxe.at.dotpoint.spatial.transform.Transform<haxe.at.dotpoint.spatial.SpatialEntity> transform;
	
	public haxe.at.dotpoint.spatial.boundings.Boundings<haxe.at.dotpoint.spatial.SpatialEntity> boundings;
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.spatial.SpatialEntity> spatialNode;
	
	
	
	
	
	
	
	public final haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.spatial.SpatialEntity> getSpatialNode()
	{
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.spatialNode;
	}
	
	
	public final double get_x()
	{
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().get_x();
	}
	
	
	public final double set_x(double value)
	{
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().set_x(value);
	}
	
	
	public final double get_y()
	{
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().get_y();
	}
	
	
	public final double set_y(double value)
	{
		//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().set_y(value);
	}
	
	
	public final double get_z()
	{
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().get_z();
	}
	
	
	public final double set_z(double value)
	{
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return this.transform.get_position().set_z(value);
	}
	
	
	@Override public boolean removeComponent(haxe.at.dotpoint.core.entity.IComponent component, java.lang.Object destroy)
	{
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		java.lang.Object __temp_destroy98 = ( (haxe.lang.Runtime.eq(destroy, null)) ? (((java.lang.Object) (true) )) : (destroy) );
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		if (( component == this.transform )) 
		{
			//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			throw haxe.lang.HaxeException.wrap("cannot remove Transform Component from SpatialEntity");
		}
		
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		if (( component == this.boundings )) 
		{
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			throw haxe.lang.HaxeException.wrap("cannot remove Boundings Component from SpatialEntity");
		}
		
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		if (( component == this.spatialNode )) 
		{
			//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			throw haxe.lang.HaxeException.wrap("cannot remove TreeNode Component from SpatialEntity");
		}
		
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		return super.removeComponent(component, __temp_destroy98);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_z(value);
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 120:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_x(value);
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 121:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_y(value);
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_z(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 1052666732:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("transform")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.transform = ((haxe.at.dotpoint.spatial.transform.Transform<haxe.at.dotpoint.spatial.SpatialEntity>) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 121:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_y(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case -1149915313:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("boundings")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.boundings = ((haxe.at.dotpoint.spatial.boundings.Boundings<haxe.at.dotpoint.spatial.SpatialEntity>) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 120:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.set_x(((double) (haxe.lang.Runtime.toDouble(value)) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 1625267494:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("spatialNode")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						this.spatialNode = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.spatial.SpatialEntity>) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			switch (field.hashCode())
			{
				case 711694553:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("removeComponent")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeComponent")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 1052666732:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("transform")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.transform;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_z")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case -1149915313:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("boundings")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.boundings;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_z")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 1625267494:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("spatialNode")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.spatialNode;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_y")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 120:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_x();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_y")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 121:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_y();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_x")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 122:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_z();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_x")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 984998896:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("getSpatialNode")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getSpatialNode")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			switch (field.hashCode())
			{
				case 122:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_z();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 120:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_x();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 121:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_y();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			switch (field.hashCode())
			{
				case 711694553:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("removeComponent")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 984998896:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("getSpatialNode")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.getSpatialNode();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328349:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.set_z(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246095:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_x();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246097:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_z")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_z();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328347:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_x")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.set_x(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 109328348:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("set_y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.set_y(((double) (haxe.lang.Runtime.toDouble(dynargs.__get(0))) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
				case 98246096:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					if (field.equals("get_y")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
						return this.get_y();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("z");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("y");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("x");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("spatialNode");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("boundings");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		baseArr.push("transform");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\SpatialEntity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


