package haxe.at.dotpoint.spatial.transform;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Transform<TEntity> extends haxe.at.dotpoint.core.entity.Component<TEntity> implements haxe.at.dotpoint.spatial.transform.ITransform
{
	public Transform(haxe.lang.EmptyObject empty)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Transform()
	{
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.spatial.transform.Transform.__hx_ctor_haxe_at_dotpoint_spatial_transform_Transform(this);
	}
	
	
	public static <TEntity_c> void __hx_ctor_haxe_at_dotpoint_spatial_transform_Transform(haxe.at.dotpoint.spatial.transform.Transform<TEntity_c> __temp_me102)
	{
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.core.entity.Component.__hx_ctor_haxe_at_dotpoint_core_entity_Component(__temp_me102);
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.m_position = new haxe.at.dotpoint.math.lazy.LazyVector3(0, 0, 0, null);
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.m_rotation = new haxe.at.dotpoint.math.lazy.LazyQuaternion(0, 0, 0, null);
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.m_scale = new haxe.at.dotpoint.math.lazy.LazyVector3(1, 1, 1, null);
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.localMatrix = new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.worldMatrix = new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		__temp_me102.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return new haxe.at.dotpoint.spatial.transform.Transform<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return new haxe.at.dotpoint.spatial.transform.Transform<java.lang.Object>();
	}
	
	
	public haxe.at.dotpoint.math.lazy.LazyVector3 m_position;
	
	public haxe.at.dotpoint.math.lazy.LazyQuaternion m_rotation;
	
	public haxe.at.dotpoint.math.lazy.LazyVector3 m_scale;
	
	public haxe.at.dotpoint.spatial.transform.TransformationMatrix localMatrix;
	
	public haxe.at.dotpoint.spatial.transform.TransformationMatrix worldMatrix;
	
	public haxe.at.dotpoint.core.lazy.LazyStatus statusLocalMatrix;
	
	public haxe.at.dotpoint.core.lazy.LazyStatus statusWorldMatrix;
	
	@Override public void onEntityAdded()
	{
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.assertRequiredComponents(new haxe.root.Array<java.lang.Class>(new java.lang.Class[]{haxe.at.dotpoint.core.datastructure.graph.TreeNode.class}));
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateComponent")) );
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLP")) );
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateComponent")) );
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLR")) );
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateComponent")) );
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLS")) );
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).addListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
	}
	
	
	@Override public void onEntityRemoved()
	{
		//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.onUpdate = null;
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.onValidate = null;
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.onUpdate = null;
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.onValidate = null;
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.onUpdate = null;
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.onValidate = null;
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).removeListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
	}
	
	
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_position()
	{
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_position;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_position(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.set(value.get_x(), value.get_y(), value.get_z(), value.get_w());
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_position;
	}
	
	
	
	
	public haxe.at.dotpoint.math.vector.IQuaternion get_rotation()
	{
		//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_rotation;
	}
	
	
	public haxe.at.dotpoint.math.vector.IQuaternion set_rotation(haxe.at.dotpoint.math.vector.IQuaternion value)
	{
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.set(value.get_x(), value.get_y(), value.get_z(), value.get_w());
		//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_rotation;
	}
	
	
	
	
	public haxe.at.dotpoint.math.vector.IVector3 get_scale()
	{
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_scale;
	}
	
	
	public haxe.at.dotpoint.math.vector.IVector3 set_scale(haxe.at.dotpoint.math.vector.IVector3 value)
	{
		//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.set(value.get_x(), value.get_y(), value.get_z(), value.get_w());
		//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.m_scale;
	}
	
	
	public void setMatrix(haxe.at.dotpoint.math.vector.IMatrix44 value, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space != null )) 
		{
			//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			switch (space)
			{
				case WORLD:
				{
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.worldMatrix.set44(value);
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.localMatrix.set44(this.calculateLocalMatrix());
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.allowDispatchUpdate = false;
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.allowDispatchUpdate = false;
						//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.allowDispatchUpdate = false;
					}
					
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.invalidateChildren();
					//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				default:
				{
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.localMatrix.set44(value);
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.allowDispatchUpdate = false;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.allowDispatchUpdate = false;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.allowDispatchUpdate = false;
					}
					
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
					{
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
						//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.invalidateChildren();
					}
					
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
					//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
			}
			
		}
		else
		{
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.localMatrix.set44(value);
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			{
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_position.lazy.allowDispatchUpdate = false;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_rotation.lazy.allowDispatchUpdate = false;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_scale.lazy.allowDispatchUpdate = false;
			}
			
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
			{
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.invalidateChildren();
			}
			
			//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
		}
		
	}
	
	
	public haxe.at.dotpoint.math.vector.IMatrix44 getMatrix(haxe.at.dotpoint.math.vector.IMatrix44 output, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( output == null )) 
		{
			//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			output = new haxe.at.dotpoint.math.vector.Matrix44(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
		}
		
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space != null )) 
		{
			//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			switch (space)
			{
				case WORLD:
				{
					//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					haxe.at.dotpoint.spatial.transform.TransformationMatrix __temp_stmt3 = null;
					//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
						{
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							haxe.at.dotpoint.math.vector.IMatrix44 wm = null;
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							{
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
								{
									//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
									this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
									//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
									this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
									//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
									{
										//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
										this.m_position.lazy.allowDispatchUpdate = true;
										//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
										this.m_rotation.lazy.allowDispatchUpdate = true;
										//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
										this.m_scale.lazy.allowDispatchUpdate = true;
									}
									
								}
								
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								wm = this.localMatrix;
							}
							
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							haxe.at.dotpoint.math.vector.IMatrix44 pm = this.getParentWorldMatrix();
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							if (( pm != null )) 
							{
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								wm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm, wm, null)) );
							}
							
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							this.worldMatrix.set44(wm);
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							{
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_position.lazy.allowDispatchUpdate = true;
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_rotation.lazy.allowDispatchUpdate = true;
								//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_scale.lazy.allowDispatchUpdate = true;
							}
							
						}
						
						//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_stmt3 = this.worldMatrix;
					}
					
					//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					output.set44(__temp_stmt3);
					//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				default:
				{
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					haxe.at.dotpoint.spatial.transform.TransformationMatrix __temp_stmt2 = null;
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
						{
							//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
							//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
							//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							{
								//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_position.lazy.allowDispatchUpdate = true;
								//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_rotation.lazy.allowDispatchUpdate = true;
								//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
								this.m_scale.lazy.allowDispatchUpdate = true;
							}
							
						}
						
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_stmt2 = this.localMatrix;
					}
					
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					output.set44(__temp_stmt2);
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
			}
			
		}
		else
		{
			//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.at.dotpoint.spatial.transform.TransformationMatrix __temp_stmt1 = null;
			//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			{
				//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
				{
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
					//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.allowDispatchUpdate = true;
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.allowDispatchUpdate = true;
						//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.allowDispatchUpdate = true;
					}
					
				}
				
				//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				__temp_stmt1 = this.localMatrix;
			}
			
			//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			output.set44(__temp_stmt1);
		}
		
		//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return output;
	}
	
	
	public final void setLocalMatrix(haxe.at.dotpoint.math.vector.IMatrix44 value)
	{
		//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.set44(value);
		//line 253 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.allowDispatchUpdate = false;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.allowDispatchUpdate = false;
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.allowDispatchUpdate = false;
		}
		
		//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
			//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.invalidateChildren();
		}
		
		//line 258 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
	}
	
	
	public final haxe.at.dotpoint.spatial.transform.TransformationMatrix getLocalMatrix()
	{
		//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
		{
			//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
			//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
			//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			{
				//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_position.lazy.allowDispatchUpdate = true;
				//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_rotation.lazy.allowDispatchUpdate = true;
				//line 267 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_scale.lazy.allowDispatchUpdate = true;
			}
			
		}
		
		//line 269 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.localMatrix;
	}
	
	
	public final void validateLocalMatrix()
	{
		//line 277 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
		//line 279 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 280 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 280 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.allowDispatchUpdate = true;
			//line 280 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.allowDispatchUpdate = true;
			//line 280 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.allowDispatchUpdate = true;
		}
		
	}
	
	
	public final void setWorldMatrix(haxe.at.dotpoint.math.vector.IMatrix44 value)
	{
		//line 292 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.worldMatrix.set44(value);
		//line 293 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.set44(this.calculateLocalMatrix());
		//line 295 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 296 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.allowDispatchUpdate = false;
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.allowDispatchUpdate = false;
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.allowDispatchUpdate = false;
		}
		
		//line 300 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
		//line 301 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
		//line 303 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.invalidateChildren();
	}
	
	
	public final haxe.at.dotpoint.spatial.transform.TransformationMatrix getWorldMatrix()
	{
		//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
		{
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.at.dotpoint.math.vector.IMatrix44 wm = null;
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			{
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
				{
					//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
					//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
					//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					{
						//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position.lazy.allowDispatchUpdate = true;
						//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation.lazy.allowDispatchUpdate = true;
						//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale.lazy.allowDispatchUpdate = true;
					}
					
				}
				
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				wm = this.localMatrix;
			}
			
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.at.dotpoint.math.vector.IMatrix44 pm = this.getParentWorldMatrix();
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (( pm != null )) 
			{
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				wm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm, wm, null)) );
			}
			
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.worldMatrix.set44(wm);
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
			//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			{
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_position.lazy.allowDispatchUpdate = true;
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_rotation.lazy.allowDispatchUpdate = true;
				//line 312 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.m_scale.lazy.allowDispatchUpdate = true;
			}
			
		}
		
		//line 314 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return this.worldMatrix;
	}
	
	
	public final void validateWorldMatrix()
	{
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 wm = null;
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.localMatrix.setComponents(this.m_rotation, this.m_scale, this.m_position);
				//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
				//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				{
					//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.m_position.lazy.allowDispatchUpdate = true;
					//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.m_rotation.lazy.allowDispatchUpdate = true;
					//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					this.m_scale.lazy.allowDispatchUpdate = true;
				}
				
			}
			
			//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			wm = this.localMatrix;
		}
		
		//line 323 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 pm = this.getParentWorldMatrix();
		//line 325 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( pm != null )) 
		{
			//line 326 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			wm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm, wm, null)) );
		}
		
		//line 330 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.worldMatrix.set44(wm);
		//line 332 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 333 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 333 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_position.lazy.allowDispatchUpdate = true;
			//line 333 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_rotation.lazy.allowDispatchUpdate = true;
			//line 333 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.m_scale.lazy.allowDispatchUpdate = true;
		}
		
	}
	
	
	public haxe.at.dotpoint.math.vector.IMatrix44 calculateLocalMatrix()
	{
		//line 344 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 lm = this.worldMatrix;
		//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 pm = null;
		//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( ( ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent() != null ) && ( ! (( ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent().get_entity() == null )) ) )) 
		{
			//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.at.dotpoint.spatial.transform.Transform<TEntity> _this = ((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent().get_entity(), "transform", true)) );
			//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (( _this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.math.vector.IMatrix44 wm = null;
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				{
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (( _this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
					{
						//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						_this.localMatrix.setComponents(_this.m_rotation, _this.m_scale, _this.m_position);
						//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						_this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
						//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						{
							//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_position.lazy.allowDispatchUpdate = true;
							//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_rotation.lazy.allowDispatchUpdate = true;
							//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_scale.lazy.allowDispatchUpdate = true;
						}
						
					}
					
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					wm = _this.localMatrix;
				}
				
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.math.vector.IMatrix44 pm1 = _this.getParentWorldMatrix();
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				if (( pm1 != null )) 
				{
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					wm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm1, wm, null)) );
				}
				
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				_this.worldMatrix.set44(wm);
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				_this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
				//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				{
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_position.lazy.allowDispatchUpdate = true;
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_rotation.lazy.allowDispatchUpdate = true;
					//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_scale.lazy.allowDispatchUpdate = true;
				}
				
			}
			
			//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			pm = _this.worldMatrix;
		}
		else
		{
			//line 345 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			pm = null;
		}
		
		//line 347 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( pm != null )) 
		{
			//line 349 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			pm.inverse();
			//line 350 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			lm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm, lm, null)) );
		}
		
		//line 353 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return lm;
	}
	
	
	public final haxe.at.dotpoint.math.vector.IMatrix44 getParentWorldMatrix()
	{
		//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( ( ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent() != null ) && ( ! (( ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent().get_entity() == null )) ) )) 
		{
			//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.at.dotpoint.spatial.transform.Transform<TEntity> _this = ((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).get_parent().get_entity(), "transform", true)) );
			//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (( _this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
			{
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.math.vector.IMatrix44 wm = null;
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				{
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (( _this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.INVALID )) 
					{
						//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						_this.localMatrix.setComponents(_this.m_rotation, _this.m_scale, _this.m_position);
						//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						_this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
						//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						{
							//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_position.lazy.allowDispatchUpdate = true;
							//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_rotation.lazy.allowDispatchUpdate = true;
							//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
							_this.m_scale.lazy.allowDispatchUpdate = true;
						}
						
					}
					
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					wm = _this.localMatrix;
				}
				
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.math.vector.IMatrix44 pm = _this.getParentWorldMatrix();
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				if (( pm != null )) 
				{
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					wm = ((haxe.at.dotpoint.math.vector.IMatrix44) (haxe.at.dotpoint.math.vector.Matrix44.multiply(pm, wm, null)) );
				}
				
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				_this.worldMatrix.set44(wm);
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				_this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
				//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				{
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_position.lazy.allowDispatchUpdate = true;
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_rotation.lazy.allowDispatchUpdate = true;
					//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					_this.m_scale.lazy.allowDispatchUpdate = true;
				}
				
			}
			
			//line 362 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return _this.worldMatrix;
		}
		
		//line 364 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return null;
	}
	
	
	public final void onUpdateComponent()
	{
		//line 376 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.allowDispatchUpdate = false;
		//line 377 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.allowDispatchUpdate = false;
		//line 378 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.allowDispatchUpdate = false;
		//line 380 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 380 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 380 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
		}
		
		//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
			//line 381 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.invalidateChildren();
		}
		
	}
	
	
	public final void resetComponentUpdate()
	{
		//line 389 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.allowDispatchUpdate = true;
		//line 390 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.allowDispatchUpdate = true;
		//line 391 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.allowDispatchUpdate = true;
	}
	
	
	public final void validateLP()
	{
		//line 402 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.getPosition(this.m_position.value);
		//line 403 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public final void validateLS()
	{
		//line 411 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.getScale(this.m_scale.value);
		//line 412 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public final void validateLR()
	{
		//line 420 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.localMatrix.getRotation(this.m_rotation.value);
		//line 421 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public final void invalidateComponents()
	{
		//line 433 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
		//line 434 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
		//line 435 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
		//line 437 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_position.lazy.allowDispatchUpdate = false;
		//line 438 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_rotation.lazy.allowDispatchUpdate = false;
		//line 439 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.m_scale.lazy.allowDispatchUpdate = false;
	}
	
	
	public final void invalidateLocalMatrix()
	{
		//line 447 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusLocalMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 449 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusLocalMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 450 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
		}
		
	}
	
	
	public final void invalidateWorldMatrix()
	{
		//line 459 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 461 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 462 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
			//line 464 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.invalidateChildren();
		}
		
	}
	
	
	public void invalidateChildren()
	{
		//line 473 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.get_entity() == null )) 
		{
			//line 474 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return ;
		}
		
		//line 478 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity> tree = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) );
		//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			int _g = 0;
			//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>> _g1 = tree.get_children();
			//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			while (( _g < _g1.length ))
			{
				//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity> child = _g1.__get(_g);
				//line 480 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				 ++ _g;
				//line 482 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				haxe.at.dotpoint.spatial.transform.Transform<TEntity> transform = ((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(child.get_entity(), "transform", true)) );
				//line 483 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				transform.invalidateWorldMatrix();
			}
			
		}
		
	}
	
	
	public void onSpatialTreeChanged(haxe.at.dotpoint.core.dispatcher.event.Event event)
	{
		//line 492 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( event.get_target() != ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ) )) 
		{
			//line 493 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return ;
		}
		
		//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( this.statusWorldMatrix == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.statusWorldMatrix = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
			//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			this.invalidateChildren();
		}
		
	}
	
	
	public final void dispatchLocalChange()
	{
		//line 507 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
	}
	
	
	public final void dispatchWorldChange()
	{
		//line 515 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
	}
	
	
	public boolean hasRotation(haxe.at.dotpoint.math.geom.Space space)
	{
		//line 527 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space == null )) 
		{
			//line 528 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			space = haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		
		//line 530 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IQuaternion m_rotation = null;
		//line 530 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
		{
			//line 530 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			m_rotation = this.m_rotation;
		}
		else
		{
			//line 530 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			m_rotation = ((haxe.at.dotpoint.math.vector.IQuaternion) (this.worldMatrix.getRotation(null)) );
		}
		
		//line 532 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_rotation.get_x() != 0 )) 
		{
			//line 532 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 533 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_rotation.get_y() != 0 )) 
		{
			//line 533 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 534 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_rotation.get_z() != 0 )) 
		{
			//line 534 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 535 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_rotation.get_w() != 1 )) 
		{
			//line 535 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 537 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return false;
	}
	
	
	public boolean hasScaling(haxe.at.dotpoint.math.geom.Space space)
	{
		//line 545 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space == null )) 
		{
			//line 546 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			space = haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		
		//line 548 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		haxe.at.dotpoint.math.vector.IVector3 m_scale = null;
		//line 548 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( space == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
		{
			//line 548 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			m_scale = this.m_scale;
		}
		else
		{
			//line 548 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			m_scale = ((haxe.at.dotpoint.math.vector.IVector3) (this.worldMatrix.getScale(null)) );
		}
		
		//line 550 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_scale.get_x() != 1 )) 
		{
			//line 550 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 551 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_scale.get_y() != 1 )) 
		{
			//line 551 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 552 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		if (( m_scale.get_z() != 1 )) 
		{
			//line 552 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			return true;
		}
		
		//line 554 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return false;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			switch (field.hashCode())
			{
				case 109250890:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.set_scale(((haxe.at.dotpoint.math.vector.IVector3) (value) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 893187259:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_position = ((haxe.at.dotpoint.math.lazy.LazyVector3) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -40300674:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.set_rotation(((haxe.at.dotpoint.math.vector.IQuaternion) (value) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 105081616:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_rotation = ((haxe.at.dotpoint.math.lazy.LazyQuaternion) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 747804969:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.set_position(((haxe.at.dotpoint.math.vector.IVector3) (value) ));
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 782673656:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.m_scale = ((haxe.at.dotpoint.math.lazy.LazyVector3) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -542902623:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("statusWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.statusWorldMatrix = ((haxe.at.dotpoint.core.lazy.LazyStatus) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1227876108:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("localMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.localMatrix = ((haxe.at.dotpoint.spatial.transform.TransformationMatrix) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -95243334:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("statusLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.statusLocalMatrix = ((haxe.at.dotpoint.core.lazy.LazyStatus) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 780216819:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("worldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.worldMatrix = ((haxe.at.dotpoint.spatial.transform.TransformationMatrix) (value) );
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return value;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			switch (field.hashCode())
			{
				case -351682675:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("hasScaling")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasScaling")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 893187259:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.m_position;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1460810696:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("hasRotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasRotation")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 105081616:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.m_rotation;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 623991048:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("dispatchWorldChange")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchWorldChange")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 782673656:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("m_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.m_scale;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1071650337:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("dispatchLocalChange")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchLocalChange")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1227876108:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("localMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.localMatrix;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -199685679:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onSpatialTreeChanged")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 780216819:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("worldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.worldMatrix;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1855555674:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateChildren")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateChildren")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -95243334:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("statusLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.statusLocalMatrix;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -474800712:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateWorldMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -542902623:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("statusWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.statusWorldMatrix;
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -27141423:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateLocalMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1732610942:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onEntityAdded")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onEntityAdded")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1042120015:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateComponents")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateComponents")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 831724382:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onEntityRemoved")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onEntityRemoved")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567844:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLR")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLR")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 747804969:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_position();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567843:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLS")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLS")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1175249934:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_position")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567846:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLP")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLP")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_position")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 943342295:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("resetComponentUpdate")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resetComponentUpdate")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -40300674:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_rotation();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1622071723:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onUpdateComponent")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateComponent")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1963355577:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_rotation")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1061739981:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getParentWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getParentWorldMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -414362949:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_rotation")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -21721146:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("calculateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "calculateLocalMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 109250890:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_scale();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 829181693:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateWorldMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1146200865:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_scale")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 139948221:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getWorldMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 931583789:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_scale")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1631787983:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setWorldMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 400158403:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1276840982:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLocalMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 614775479:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 587607510:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getLocalMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1184128694:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setLocalMatrix")) );
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			int __temp_hash2 = field.hashCode();
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			switch (__temp_hash2)
			{
				case 831724382:
				case 1732610942:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (( (( ( __temp_hash2 == 831724382 ) && field.equals("onEntityRemoved") )) || field.equals("onEntityAdded") )) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1175249934:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_position();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -351682675:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("hasScaling")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.hasScaling(((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 373742694:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_position")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.set_position(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1460810696:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("hasRotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.hasRotation(((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1963355577:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_rotation();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 623991048:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("dispatchWorldChange")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.dispatchWorldChange();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -414362949:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_rotation")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.set_rotation(((haxe.at.dotpoint.math.vector.IQuaternion) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1071650337:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("dispatchLocalChange")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.dispatchLocalChange();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1146200865:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("get_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.get_scale();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -199685679:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onSpatialTreeChanged")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.onSpatialTreeChanged(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 931583789:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("set_scale")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.set_scale(((haxe.at.dotpoint.math.vector.IVector3) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1855555674:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateChildren")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.invalidateChildren();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 400158403:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.setMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -474800712:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.invalidateWorldMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 614775479:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.getMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -27141423:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.invalidateLocalMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1184128694:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.setLocalMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1042120015:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("invalidateComponents")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.invalidateComponents();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 587607510:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.getLocalMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567844:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLR")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.validateLR();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 1276840982:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.validateLocalMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567843:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLS")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.validateLS();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1631787983:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("setWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.setWorldMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ));
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -43567846:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateLP")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.validateLP();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 139948221:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.getWorldMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 943342295:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("resetComponentUpdate")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.resetComponentUpdate();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case 829181693:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("validateWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.validateWorldMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1622071723:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("onUpdateComponent")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						this.onUpdateComponent();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -21721146:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("calculateLocalMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.calculateLocalMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
				case -1061739981:
				{
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					if (field.equals("getParentWorldMatrix")) 
					{
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						__temp_executeDef1 = false;
						//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
						return this.getParentWorldMatrix();
					}
					
					//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
					break;
				}
				
				
			}
			
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("scale");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("rotation");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("position");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("statusWorldMatrix");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("statusLocalMatrix");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("worldMatrix");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("localMatrix");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("m_scale");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("m_rotation");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		baseArr.push("m_position");
		//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
		{
			//line 28 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\transform\\Transform.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


