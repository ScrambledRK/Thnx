package haxe.at.dotpoint.core.datastructure.graph;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeNode<T> extends haxe.at.dotpoint.core.entity.Component<T>
{
	public TreeNode(haxe.lang.EmptyObject empty)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public TreeNode(java.lang.Object isRootNode)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode.__hx_ctor_haxe_at_dotpoint_core_datastructure_graph_TreeNode(this, isRootNode);
	}
	
	
	public static <T_c> void __hx_ctor_haxe_at_dotpoint_core_datastructure_graph_TreeNode(haxe.at.dotpoint.core.datastructure.graph.TreeNode<T_c> __temp_me21, java.lang.Object isRootNode)
	{
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		boolean __temp_isRootNode20 = ( (haxe.lang.Runtime.eq(isRootNode, null)) ? (false) : (haxe.lang.Runtime.toBool(isRootNode)) );
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		haxe.at.dotpoint.core.entity.Component.__hx_ctor_haxe_at_dotpoint_core_entity_Component(__temp_me21);
		//line 38 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		__temp_me21.children = new haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<T_c>>();
		//line 39 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		__temp_me21.set_dispatcher(new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeDispatcher(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (__temp_me21) )));
		//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		if (__temp_isRootNode20) 
		{
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			__temp_me21.root = __temp_me21;
		}
		
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.TreeNode<java.lang.Object>(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.TreeNode<java.lang.Object>(((java.lang.Object) (arr.__get(0)) ));
	}
	
	
	public haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>> children;
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> parent;
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> root;
	
	public haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>> get_children()
	{
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return this.children;
	}
	
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> get_parent()
	{
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return this.parent;
	}
	
	
	public void setParent(haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> value)
	{
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		this.parent = value;
	}
	
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> get_root()
	{
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return this.root;
	}
	
	
	public void setRoot(haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> value)
	{
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> previous = this.get_root();
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> current = value;
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		this.root = current;
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		if (( ( previous == null ) && ( current != null ) )) 
		{
			//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			this.dispatch(new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_ROOT, true, false));
		}
		else
		{
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			if (( ( previous != null ) && ( current == null ) )) 
			{
				//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				this.dispatch(new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_ROOT, true, false));
			}
			
		}
		
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		{
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			int _g = 0;
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>> _g1 = this.get_children();
			//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			while (( _g < _g1.length ))
			{
				//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> child = _g1.__get(_g);
				//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				 ++ _g;
				//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				child.setRoot(this.get_root());
			}
			
		}
		
	}
	
	
	public void addChildNode(haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> child)
	{
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		if (( child == null )) 
		{
			//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			throw haxe.lang.HaxeException.wrap("cannot add null-child");
		}
		
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		if (( child.get_parent() != null )) 
		{
			//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			child.get_parent().removeChildNode(child);
		}
		
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		this.get_children().push(child);
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		child.setParent(this);
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		child.setRoot(this.get_root());
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		child.dispatch(new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_NODE, true, false));
	}
	
	
	public boolean removeChildNode(haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> child)
	{
		//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		boolean success = this.get_children().remove(child);
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		if (success) 
		{
			//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			child.dispatch(new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE, true, false));
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			child.setParent(null);
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			child.setRoot(null);
		}
		
		//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return success;
	}
	
	
	public haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> traverseToRoot()
	{
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		haxe.at.dotpoint.core.datastructure.graph.TreeNode<T> node = this;
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		while (( node.get_parent() != null ))
		{
			//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			node = node.get_parent();
		}
		
		//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return node;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("root")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.root = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("children")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.children = ((haxe.root.Array<haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("parent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.parent = ((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (value) );
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return value;
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			switch (field.hashCode())
			{
				case -1600380401:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("traverseToRoot")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "traverseToRoot")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("children")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.get_children();
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.children;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 2016257306:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("removeChildNode")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeChildNode")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("parent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.get_parent();
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.parent;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -233245283:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("addChildNode")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addChildNode")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 3506402:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("root")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						if (handleProperties) 
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.get_root();
						}
						else
						{
							//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
							return this.root;
						}
						
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1984933988:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("setRoot")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setRoot")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -263528248:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_children")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_children")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1976619051:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_root")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_root")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1085254067:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_parent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "get_parent")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 485973932:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("setParent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setParent")) );
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			switch (field.hashCode())
			{
				case -1600380401:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("traverseToRoot")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return this.traverseToRoot();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -263528248:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_children")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return this.get_children();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 2016257306:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("removeChildNode")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return this.removeChildNode(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1085254067:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_parent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return this.get_parent();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case -233245283:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("addChildNode")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.addChildNode(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 485973932:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("setParent")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.setParent(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1984933988:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("setRoot")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						this.setRoot(((haxe.at.dotpoint.core.datastructure.graph.TreeNode<T>) (dynargs.__get(0)) ));
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
				case 1976619051:
				{
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					if (field.equals("get_root")) 
					{
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						__temp_executeDef1 = false;
						//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
						return this.get_root();
					}
					
					//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
					break;
				}
				
				
			}
			
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		baseArr.push("root");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		baseArr.push("parent");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		baseArr.push("children");
		//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
		{
			//line 12 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\TreeNode.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


