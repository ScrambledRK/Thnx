package haxe.at.dotpoint.core.datastructure.graph.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeNodeDispatcher extends haxe.at.dotpoint.core.dispatcher.event.EventDispatcher
{
	public TreeNodeDispatcher(haxe.lang.EmptyObject empty)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TreeNodeDispatcher(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeDispatcher.__hx_ctor_haxe_at_dotpoint_core_datastructure_graph_event_TreeNodeDispatcher(this, proxy);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_datastructure_graph_event_TreeNodeDispatcher(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeDispatcher __temp_me23, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher proxy)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		haxe.at.dotpoint.core.dispatcher.event.EventDispatcher.__hx_ctor_haxe_at_dotpoint_core_dispatcher_event_EventDispatcher(__temp_me23, proxy);
		//line 31 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		if (( proxy instanceof haxe.at.dotpoint.core.datastructure.graph.TreeNode )) 
		{
			//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			__temp_me23.node = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity>) (proxy) );
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeDispatcher(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeDispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (arr.__get(0)) ));
	}
	
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity> node;
	
	@Override public boolean dispatch(haxe.at.dotpoint.core.dispatcher.event.Event value)
	{
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		if (( ( this.node != null ) && ( value instanceof haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent ) )) 
		{
			//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent event = ((haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent) (value) );
			//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			if (( event.bubbleToLeaf || event.bubbleToRoot )) 
			{
				//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				return this.bubbleEvent(event);
			}
			
		}
		
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		return super.dispatch(value);
	}
	
	
	public boolean bubbleEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent event)
	{
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		if (( event.bubblePhase == null )) 
		{
			//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			event.bubblePhase = haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase.AT_TARGET;
		}
		
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		boolean success = super.dispatch(event);
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase _g = event.bubblePhase;
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			switch (_g)
			{
				case AT_TARGET:
				{
					//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (event.bubbleToRoot) 
					{
						//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						this.bubbleToRoot(event);
					}
					else
					{
						//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						this.bubbleToLeaf(event);
					}
					
					//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case TO_ROOT:
				{
					//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					this.bubbleToRoot(event);
					//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case TO_LEAF:
				{
					//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					this.bubbleToLeaf(event);
					//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
			}
			
		}
		
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		return success;
	}
	
	
	public void bubbleToRoot(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent event)
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		event.bubblePhase = haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase.TO_ROOT;
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		if (( this.node.get_parent() != null )) 
		{
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			this.node.get_parent().dispatch(event);
		}
		else
		{
			//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			if (event.bubbleToLeaf) 
			{
				//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				this.bubbleToLeaf(event);
			}
			
		}
		
	}
	
	
	public void bubbleToLeaf(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent event)
	{
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity> current = this.node;
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		if (( event.bubblePhase != haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase.TO_LEAF )) 
		{
			//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			event.bubblePhase = haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase.TO_LEAF;
			//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			current = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity>) (event.get_target()) );
		}
		
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			int _g = 0;
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity>> _g1 = current.get_children();
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			while (( _g < _g1.length ))
			{
				//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity> child = _g1.__get(_g);
				//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				 ++ _g;
				//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				child.dispatch(event);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			switch (field.hashCode())
			{
				case 3386882:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("node")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						this.node = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<haxe.at.dotpoint.core.entity.IEntity>) (value) );
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return value;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			switch (field.hashCode())
			{
				case -1941801947:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleToLeaf")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bubbleToLeaf")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case 3386882:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("node")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return this.node;
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case -1941613143:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleToRoot")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bubbleToRoot")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case 284771450:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "dispatch")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case 755025262:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleEvent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "bubbleEvent")) );
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			switch (field.hashCode())
			{
				case 284771450:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("dispatch")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case 755025262:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleEvent")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						return this.bubbleEvent(((haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case -1941801947:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleToLeaf")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						this.bubbleToLeaf(((haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
				case -1941613143:
				{
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					if (field.equals("bubbleToRoot")) 
					{
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						__temp_executeDef1 = false;
						//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
						this.bubbleToRoot(((haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent) (dynargs.__get(0)) ));
					}
					
					//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
					break;
				}
				
				
			}
			
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		baseArr.push("node");
		//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
		{
			//line 15 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeDispatcher.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


