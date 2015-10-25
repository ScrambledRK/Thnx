package haxe.at.dotpoint.spatial.boundings;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Boundings<TEntity> extends haxe.at.dotpoint.core.entity.Component<TEntity> implements haxe.at.dotpoint.spatial.boundings.IBoundings
{
	public Boundings(haxe.lang.EmptyObject empty)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Boundings(haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy policy, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.boundings.Boundings.__hx_ctor_haxe_at_dotpoint_spatial_boundings_Boundings(this, policy, pivot);
	}
	
	
	public static <TEntity_c> void __hx_ctor_haxe_at_dotpoint_spatial_boundings_Boundings(haxe.at.dotpoint.spatial.boundings.Boundings<TEntity_c> __temp_me102, haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy policy, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.core.entity.Component.__hx_ctor_haxe_at_dotpoint_core_entity_Component(__temp_me102);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( policy == null )) 
		{
			//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			policy = haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_TRANSFORM;
		}
		
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.changePolicy = policy;
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.measureChildren = true;
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.modelSpace = new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (pivot) ));
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.localSpace = new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (pivot) ));
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.worldSpace = new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (pivot) ));
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.statusLocalTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		__temp_me102.statusWorldTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return new haxe.at.dotpoint.spatial.boundings.Boundings<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return new haxe.at.dotpoint.spatial.boundings.Boundings<java.lang.Object>(((haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy) (arr.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector3) (arr.__get(1)) ));
	}
	
	
	public haxe.at.dotpoint.spatial.boundings.AABB modelSpace;
	
	public haxe.at.dotpoint.spatial.boundings.AABB localSpace;
	
	public haxe.at.dotpoint.spatial.boundings.AABB worldSpace;
	
	public haxe.at.dotpoint.core.lazy.LazyStatus statusLocalTransform;
	
	public haxe.at.dotpoint.core.lazy.LazyStatus statusWorldTransform;
	
	public haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy changePolicy;
	
	public boolean measureChildren;
	
	@Override public void onEntityAdded()
	{
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.assertRequiredComponents(new haxe.root.Array<java.lang.Class>(new java.lang.Class[]{haxe.at.dotpoint.core.datastructure.graph.TreeNode.class, haxe.at.dotpoint.spatial.transform.Transform.class}));
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateModel")) );
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateModelBounds")) );
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateLocal")) );
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLocalBounds")) );
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.onUpdate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateWorld")) );
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.onValidate = ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateWorldBounds")) );
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).addListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).addListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).addListener(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onTransformChanged")) ));
	}
	
	
	@Override public void onEntityRemoved()
	{
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.onUpdate = null;
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.onValidate = null;
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.onUpdate = null;
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.onValidate = null;
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.onUpdate = null;
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.onValidate = null;
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).removeListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ).removeListener(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) ));
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).removeListener(haxe.at.dotpoint.spatial.event.SpatialEvent.TRANSFORM_CHANGED, ((haxe.lang.Function) (new haxe.lang.Closure(this, "onTransformChanged")) ));
	}
	
	
	public haxe.at.dotpoint.spatial.boundings.AABB getBounds(haxe.at.dotpoint.math.geom.Space space)
	{
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( space == null )) 
		{
			//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			space = haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		
		//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( space != null )) 
		{
			//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			switch (space)
			{
				case LOCAL:
				{
					//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					return this.localSpace;
				}
				
				
				case WORLD:
				{
					//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					return this.worldSpace;
				}
				
				
				case MODEL:
				{
					//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					return this.modelSpace;
				}
				
				
			}
			
		}
		
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return null;
	}
	
	
	public void onTransformChanged(haxe.at.dotpoint.core.dispatcher.event.Event value)
	{
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.event.SpatialEvent event = ((haxe.at.dotpoint.spatial.event.SpatialEvent) (value) );
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			haxe.at.dotpoint.math.geom.Space _g = event.space;
			//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			switch (_g)
			{
				case LOCAL:
				{
					//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (( this.statusLocalTransform == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
					{
						//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateLocalBounds();
					}
					
					//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case WORLD:
				{
					//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (( this.statusWorldTransform == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
					{
						//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateWorldBounds();
					}
					
					//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				default:
				{
					//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					return ;
				}
				
			}
			
		}
		
	}
	
	
	public void onSpatialTreeChanged(haxe.at.dotpoint.core.dispatcher.event.Event value)
	{
		//line 212 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( value.get_target() != ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) ) )) 
		{
			//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return ;
		}
		
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.invalidateParents();
	}
	
	
	public final void onUpdateModel()
	{
		//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.allowDispatchUpdate = false;
		//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.changePolicy == haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_MODELBOUNDS )) 
		{
			//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.measureChildren = false;
		}
		
		//line 235 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.invalidateLocalBounds();
		//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.invalidateWorldBounds();
		//line 238 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.MODEL));
	}
	
	
	public final void onUpdateLocal()
	{
		//line 249 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.changePolicy == haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_TRANSFORM )) 
		{
			//line 253 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.updateTransformScale();
			//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateLocalBounds();
			//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateWorldBounds();
		}
		else
		{
			//line 260 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.measureChildren = false;
			//line 262 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.localSpace.lazy.allowDispatchUpdate = false;
			//line 264 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateWorldBounds();
			//line 265 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateModelBounds();
			//line 266 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateParents();
			//line 268 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
		}
		
	}
	
	
	public final void onUpdateWorld()
	{
		//line 280 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		//line 282 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.changePolicy == haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy.CHANGE_TRANSFORM )) 
		{
			//line 284 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.updateTransformScale();
			//line 286 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateLocalBounds();
			//line 287 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateWorldBounds();
		}
		else
		{
			//line 291 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.measureChildren = false;
			//line 293 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.worldSpace.lazy.allowDispatchUpdate = false;
			//line 295 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateLocalBounds();
			//line 296 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateModelBounds();
			//line 298 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
		}
		
	}
	
	
	public final void validateModelBounds()
	{
		//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.math.geom.Space __temp_stmt1 = null;
		//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.localSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			__temp_stmt1 = haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		else
		{
			//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (( this.worldSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
			{
				//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				__temp_stmt1 = haxe.at.dotpoint.math.geom.Space.WORLD;
			}
			else
			{
				//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				throw haxe.lang.HaxeException.wrap("local space and world space invalid - this should never happen");
			}
			
		}
		
		//line 311 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.calculateModelBounds(this.modelSpace, __temp_stmt1);
		//line 313 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 313 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.modelSpace.lazy.allowDispatchUpdate = true;
			//line 313 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.localSpace.lazy.allowDispatchUpdate = true;
			//line 313 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.worldSpace.lazy.allowDispatchUpdate = true;
		}
		
		//line 314 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public final void validateLocalBounds()
	{
		//line 322 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.calculateTransformBounds(this.localSpace, haxe.at.dotpoint.math.geom.Space.LOCAL);
		//line 324 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 324 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.modelSpace.lazy.allowDispatchUpdate = true;
			//line 324 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.localSpace.lazy.allowDispatchUpdate = true;
			//line 324 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.worldSpace.lazy.allowDispatchUpdate = true;
		}
		
		//line 325 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public final void validateWorldBounds()
	{
		//line 333 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.calculateTransformBounds(this.worldSpace, haxe.at.dotpoint.math.geom.Space.WORLD);
		//line 335 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 335 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.modelSpace.lazy.allowDispatchUpdate = true;
			//line 335 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.localSpace.lazy.allowDispatchUpdate = true;
			//line 335 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.worldSpace.lazy.allowDispatchUpdate = true;
		}
		
		//line 336 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
	}
	
	
	public void updateTransformScale()
	{
		//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.math.geom.Space validSpace = null;
		//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.localSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			validSpace = haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		else
		{
			//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (( this.worldSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
			{
				//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				validSpace = haxe.at.dotpoint.math.geom.Space.WORLD;
			}
			else
			{
				//line 351 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				throw haxe.lang.HaxeException.wrap("local space and world space invalid - this should never happen");
			}
			
		}
		
		//line 355 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.boundings.AABB validBounds = this.getBounds(validSpace);
		//line 356 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.boundings.AABB modelBounds = this.calculateTransformBounds(null, validSpace);
		//line 358 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (modelBounds.isEmpty()) 
		{
			//line 359 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return ;
		}
		
		//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.transform.TransformationMatrix matrix = null;
		//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			haxe.at.dotpoint.spatial.transform.TransformationMatrix matrix1 = new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
			//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).getMatrix(matrix1, validSpace);
			//line 361 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			matrix = matrix1;
		}
		
		//line 365 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.math.vector.IVector3 current = ((haxe.at.dotpoint.math.vector.IVector3) (matrix.getScale(null)) );
		//line 366 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.math.vector.IVector3 factor = new haxe.at.dotpoint.math.vector.Vector3(1, 1, 1, null);
		//line 368 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( ( modelBounds.get_width() > 0 ) && ( validBounds.get_width() > 0 ) )) 
		{
			//line 368 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			factor.set_x(( validBounds.get_width() / modelBounds.get_width() ));
		}
		
		//line 369 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( ( modelBounds.get_height() > 0 ) && ( validBounds.get_height() > 0 ) )) 
		{
			//line 369 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			factor.set_y(( validBounds.get_height() / modelBounds.get_height() ));
		}
		
		//line 370 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( ( modelBounds.get_length() > 0 ) && ( validBounds.get_length() > 0 ) )) 
		{
			//line 370 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			factor.set_z(( validBounds.get_length() / modelBounds.get_length() ));
		}
		
		//line 372 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( ( ( factor.get_x() == 1 ) && ( factor.get_y() == 1 ) ) && ( factor.get_z() == 1 ) )) 
		{
			//line 373 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return ;
		}
		
		//line 375 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		matrix.setScale(factor);
		//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (( validSpace == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
			{
				//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				this.statusLocalTransform = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			}
			else
			{
				//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				this.statusWorldTransform = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			}
			
			//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).setMatrix(matrix, validSpace);
			//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (( validSpace == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
			{
				//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				this.statusLocalTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
			}
			else
			{
				//line 379 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				this.statusWorldTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
			}
			
		}
		
	}
	
	
	public final void resetBoundsUpdate()
	{
		//line 387 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.modelSpace.lazy.allowDispatchUpdate = true;
		//line 388 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.localSpace.lazy.allowDispatchUpdate = true;
		//line 389 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.worldSpace.lazy.allowDispatchUpdate = true;
	}
	
	
	public void invalidateModelBounds()
	{
		//line 401 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.modelSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 403 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.modelSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 404 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.MODEL));
		}
		
	}
	
	
	public void invalidateLocalBounds()
	{
		//line 413 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.localSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 415 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.localSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 416 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
			//line 418 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.invalidateParents();
		}
		
	}
	
	
	public void invalidateWorldBounds()
	{
		//line 427 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.worldSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 429 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.worldSpace.lazy.status = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
			//line 430 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
		}
		
	}
	
	
	public void invalidateParents()
	{
		//line 440 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity> tree = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) );
		//line 442 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( ( tree.get_parent() == null ) || ( tree.get_parent().get_entity() == null ) )) 
		{
			//line 443 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return ;
		}
		
		//line 445 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.boundings.Boundings<TEntity> boundings = ((haxe.at.dotpoint.spatial.boundings.Boundings<TEntity>) (haxe.lang.Runtime.getField(tree.get_parent().get_entity(), "boundings", true)) );
		//line 446 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		boundings.invalidateLocalBounds();
		//line 447 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		boundings.invalidateWorldBounds();
	}
	
	
	public final void dispatchModelChange()
	{
		//line 459 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.MODEL));
	}
	
	
	public final void dispatchLocalChange()
	{
		//line 467 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.LOCAL));
	}
	
	
	public final void dispatchWorldChange()
	{
		//line 475 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		this.dispatch(haxe.at.dotpoint.spatial.event.SpatialEvent.getInstance(haxe.at.dotpoint.spatial.event.SpatialEvent.BOUNDINGS_CHANGED, haxe.at.dotpoint.math.geom.Space.WORLD));
	}
	
	
	public haxe.at.dotpoint.math.geom.Cube getChildrenBounds(haxe.at.dotpoint.math.geom.Cube output, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 490 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( output == null )) 
		{
			//line 491 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			output = new haxe.at.dotpoint.math.geom.Cube(((haxe.at.dotpoint.math.vector.IVector3) (null) ));
		}
		
		//line 495 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity> tree = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>) (haxe.lang.Runtime.callField(this.get_entity(), "getSpatialNode", null)) );
		//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			int _g = 0;
			//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity>> _g1 = tree.get_children();
			//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			while (( _g < _g1.length ))
			{
				//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				haxe.at.dotpoint.core.datastructure.graph.TreeNode<TEntity> child = _g1.__get(_g);
				//line 497 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				 ++ _g;
				//line 499 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				haxe.at.dotpoint.math.geom.Cube.insertCube(output, ((haxe.at.dotpoint.spatial.boundings.Boundings<TEntity>) (haxe.lang.Runtime.getField(child.get_entity(), "boundings", true)) ).getBounds(space));
			}
			
		}
		
		//line 504 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return output;
	}
	
	
	public haxe.at.dotpoint.spatial.boundings.AABB calculateModelBounds(haxe.at.dotpoint.spatial.boundings.AABB output, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 514 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( output == null )) 
		{
			//line 515 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			output = new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (null) ));
		}
		
		//line 519 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.math.geom.Cube bounds = this.getBounds(space).value;
		//line 521 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (bounds.isEmpty()) 
		{
			//line 522 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return output;
		}
		
		//line 524 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.transform.TransformationMatrix matrix = null;
		//line 524 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 524 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			haxe.at.dotpoint.spatial.transform.TransformationMatrix matrix1 = new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
			//line 524 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).getMatrix(matrix1, space);
			//line 524 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			matrix = matrix1;
		}
		
		//line 525 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		matrix.inverse();
		//line 529 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.transform.Transform<TEntity> inverse = new haxe.at.dotpoint.spatial.transform.Transform<TEntity>();
		//line 530 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		inverse.setMatrix(matrix, haxe.at.dotpoint.math.geom.Space.LOCAL);
		//line 532 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		output.value.setExtensions(bounds.get_min(), bounds.get_max(), null);
		//line 533 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		output.applyTransform(inverse, haxe.at.dotpoint.math.geom.Space.LOCAL);
		//line 537 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return output;
	}
	
	
	public haxe.at.dotpoint.spatial.boundings.AABB calculateTransformBounds(haxe.at.dotpoint.spatial.boundings.AABB output, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 547 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( output == null )) 
		{
			//line 548 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			output = new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (null) ));
		}
		
		//line 550 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		output.value.setEmpty();
		//line 554 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (this.measureChildren) 
		{
			//line 555 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.getChildrenBounds(output.value, haxe.at.dotpoint.math.geom.Space.LOCAL);
		}
		
		//line 557 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if ( ! (this.modelSpace.isEmpty()) ) 
		{
			//line 558 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			haxe.at.dotpoint.math.geom.Cube.insertCube(output.value, this.modelSpace.value);
		}
		
		//line 562 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if ( ! (output.value.isEmpty()) ) 
		{
			//line 563 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			output.applyTransform(((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ), space);
		}
		
		//line 565 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return output;
	}
	
	
	public final haxe.at.dotpoint.math.geom.Space getValidSpace()
	{
		//line 576 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.localSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 577 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return haxe.at.dotpoint.math.geom.Space.LOCAL;
		}
		
		//line 579 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( this.worldSpace.lazy.status == haxe.at.dotpoint.core.lazy.LazyStatus.VALID )) 
		{
			//line 580 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			return haxe.at.dotpoint.math.geom.Space.WORLD;
		}
		
		//line 582 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		throw haxe.lang.HaxeException.wrap("local space and world space invalid - this should never happen");
	}
	
	
	public final haxe.at.dotpoint.spatial.transform.TransformationMatrix getTransformMatrix(haxe.at.dotpoint.math.geom.Space space)
	{
		//line 592 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		haxe.at.dotpoint.spatial.transform.TransformationMatrix matrix = new haxe.at.dotpoint.spatial.transform.TransformationMatrix(((haxe.at.dotpoint.math.vector.IMatrix44) (null) ));
		//line 594 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).getMatrix(matrix, space);
		//line 596 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return matrix;
	}
	
	
	public final void silentTransformUpdate(haxe.at.dotpoint.math.vector.IMatrix44 matrix, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 605 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( space == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
		{
			//line 605 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.statusLocalTransform = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
		}
		else
		{
			//line 606 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.statusWorldTransform = haxe.at.dotpoint.core.lazy.LazyStatus.INVALID;
		}
		
		//line 608 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		((haxe.at.dotpoint.spatial.transform.Transform<TEntity>) (haxe.lang.Runtime.getField(this.get_entity(), "transform", true)) ).setMatrix(matrix, space);
		//line 610 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		if (( space == haxe.at.dotpoint.math.geom.Space.LOCAL )) 
		{
			//line 610 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.statusLocalTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		}
		else
		{
			//line 611 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			this.statusWorldTransform = haxe.at.dotpoint.core.lazy.LazyStatus.VALID;
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			switch (field.hashCode())
			{
				case -295818883:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("measureChildren")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.measureChildren = haxe.lang.Runtime.toBool(value);
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 2093848413:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("modelSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.modelSpace = ((haxe.at.dotpoint.spatial.boundings.AABB) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -182968062:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("changePolicy")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.changePolicy = ((haxe.at.dotpoint.spatial.boundings.BoundingChangePolicy) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1292504155:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("localSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.localSpace = ((haxe.at.dotpoint.spatial.boundings.AABB) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1242112140:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("statusWorldTransform")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.statusWorldTransform = ((haxe.at.dotpoint.core.lazy.LazyStatus) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 446779540:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("worldSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.worldSpace = ((haxe.at.dotpoint.spatial.boundings.AABB) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1586536659:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("statusLocalTransform")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.statusLocalTransform = ((haxe.at.dotpoint.core.lazy.LazyStatus) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			switch (field.hashCode())
			{
				case 2058853952:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("silentTransformUpdate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "silentTransformUpdate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 2093848413:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("modelSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.modelSpace;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1317568489:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getTransformMatrix")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTransformMatrix")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1292504155:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("localSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.localSpace;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -354367904:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getValidSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getValidSpace")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 446779540:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("worldSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.worldSpace;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1480837371:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("calculateTransformBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "calculateTransformBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1586536659:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("statusLocalTransform")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.statusLocalTransform;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1251818504:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("calculateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "calculateModelBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1242112140:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("statusWorldTransform")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.statusWorldTransform;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -976203126:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getChildrenBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getChildrenBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -182968062:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("changePolicy")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.changePolicy;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 623991048:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchWorldChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchWorldChange")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -295818883:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("measureChildren")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.measureChildren;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1071650337:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchLocalChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchLocalChange")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1732610942:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onEntityAdded")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onEntityAdded")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 143518559:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchModelChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatchModelChange")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 831724382:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onEntityRemoved")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onEntityRemoved")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -509957298:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateParents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateParents")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 312809899:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -776766292:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateWorldBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateWorldBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -2121739865:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onTransformChanged")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onTransformChanged")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -329107003:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateLocalBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateLocalBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -199685679:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onSpatialTreeChanged")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSpatialTreeChanged")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1257238781:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "invalidateModelBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -111120255:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateModel")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateModel")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1280799437:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("resetBoundsUpdate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resetBoundsUpdate")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -112044861:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateLocal")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateLocal")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 979591783:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("updateTransformScale")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "updateTransformScale")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -101871382:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateWorld")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onUpdateWorld")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 527216113:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateWorldBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateWorldBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 46743624:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateModelBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 974875402:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateLocalBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "validateLocalBounds")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			int __temp_hash2 = field.hashCode();
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			switch (__temp_hash2)
			{
				case 831724382:
				case 1732610942:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (( (( ( __temp_hash2 == 831724382 ) && field.equals("onEntityRemoved") )) || field.equals("onEntityAdded") )) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 312809899:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.getBounds(((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(0)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 2058853952:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("silentTransformUpdate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.silentTransformUpdate(((haxe.at.dotpoint.math.vector.IMatrix44) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -2121739865:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onTransformChanged")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.onTransformChanged(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1317568489:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getTransformMatrix")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.getTransformMatrix(((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(0)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -199685679:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onSpatialTreeChanged")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.onSpatialTreeChanged(((haxe.at.dotpoint.core.dispatcher.event.Event) (dynargs.__get(0)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -354367904:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getValidSpace")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.getValidSpace();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -111120255:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateModel")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.onUpdateModel();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1480837371:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("calculateTransformBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.calculateTransformBounds(((haxe.at.dotpoint.spatial.boundings.AABB) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -112044861:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateLocal")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.onUpdateLocal();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1251818504:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("calculateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.calculateModelBounds(((haxe.at.dotpoint.spatial.boundings.AABB) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -101871382:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("onUpdateWorld")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.onUpdateWorld();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -976203126:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("getChildrenBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						return this.getChildrenBounds(((haxe.at.dotpoint.math.geom.Cube) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 46743624:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.validateModelBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 623991048:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchWorldChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.dispatchWorldChange();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 974875402:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateLocalBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.validateLocalBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1071650337:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchLocalChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.dispatchLocalChange();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 527216113:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("validateWorldBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.validateWorldBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 143518559:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("dispatchModelChange")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.dispatchModelChange();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 979591783:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("updateTransformScale")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.updateTransformScale();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -509957298:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateParents")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateParents();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case 1280799437:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("resetBoundsUpdate")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.resetBoundsUpdate();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -776766292:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateWorldBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateWorldBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -1257238781:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateModelBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateModelBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
				case -329107003:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					if (field.equals("invalidateLocalBounds")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
						this.invalidateLocalBounds();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("measureChildren");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("changePolicy");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("statusWorldTransform");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("statusLocalTransform");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("worldSpace");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("localSpace");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		baseArr.push("modelSpace");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\Boundings.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


