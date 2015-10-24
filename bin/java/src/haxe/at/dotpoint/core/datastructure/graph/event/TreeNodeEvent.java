package haxe.at.dotpoint.core.datastructure.graph.event;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeNodeEvent extends haxe.at.dotpoint.core.entity.event.EntityEvent
{
	static
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_NODE = "TreeNodeEvent.ADDED_TO_NODE";
		//line 17 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_NODE = "TreeNodeEvent.REMOVED_FROM_NODE";
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.ADDED_TO_ROOT = "TreeNodeEvent.ADDED_TO_ROOT";
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.REMOVED_FROM_ROOT = "TreeNodeEvent.REMOVED_FROM_ROOT";
	}
	
	public TreeNodeEvent(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TreeNodeEvent(java.lang.String type, java.lang.Object bubbleToRoot, java.lang.Object bubbleToLeaf)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent.__hx_ctor_haxe_at_dotpoint_core_datastructure_graph_event_TreeNodeEvent(this, type, bubbleToRoot, bubbleToLeaf);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_core_datastructure_graph_event_TreeNodeEvent(haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent __temp_me28, java.lang.String type, java.lang.Object bubbleToRoot, java.lang.Object bubbleToLeaf)
	{
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		boolean __temp_bubbleToLeaf27 = ( (haxe.lang.Runtime.eq(bubbleToLeaf, null)) ? (false) : (haxe.lang.Runtime.toBool(bubbleToLeaf)) );
		//line 48 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		boolean __temp_bubbleToRoot26 = ( (haxe.lang.Runtime.eq(bubbleToRoot, null)) ? (false) : (haxe.lang.Runtime.toBool(bubbleToRoot)) );
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.entity.event.EntityEvent.__hx_ctor_haxe_at_dotpoint_core_entity_event_EntityEvent(__temp_me28, type);
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		__temp_me28.bubbleToRoot = __temp_bubbleToRoot26;
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		__temp_me28.bubbleToLeaf = __temp_bubbleToLeaf27;
	}
	
	
	public static java.lang.String ADDED_TO_NODE;
	
	public static java.lang.String REMOVED_FROM_NODE;
	
	public static java.lang.String ADDED_TO_ROOT;
	
	public static java.lang.String REMOVED_FROM_ROOT;
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		return new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(haxe.lang.Runtime.toString(arr.__get(0)), arr.__get(1), arr.__get(2));
	}
	
	
	public boolean bubbleToRoot;
	
	public boolean bubbleToLeaf;
	
	public haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase bubblePhase;
	
	@Override public haxe.at.dotpoint.core.dispatcher.event.Event clone(haxe.at.dotpoint.core.dispatcher.event.Event instance)
	{
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		if (( ( instance != null ) &&  ! (( instance instanceof haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent ))  )) 
		{
			//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			throw haxe.lang.HaxeException.wrap("must provide TreeNodeEvent instance for clone");
		}
		
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		if (( instance == null )) 
		{
			//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			instance = new haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent(this.get_type(), null, null);
		}
		
		//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent event = ((haxe.at.dotpoint.core.datastructure.graph.event.TreeNodeEvent) (super.clone(instance)) );
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		event.bubbleToRoot = this.bubbleToRoot;
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		event.bubbleToLeaf = this.bubbleToLeaf;
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		return event;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			switch (field.hashCode())
			{
				case 764763215:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubblePhase")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						this.bubblePhase = ((haxe.at.dotpoint.core.datastructure.graph.event.EventBubblePhase) (value) );
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
				case -1941613143:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubbleToRoot")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						this.bubbleToRoot = haxe.lang.Runtime.toBool(value);
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
				case -1941801947:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubbleToLeaf")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						this.bubbleToLeaf = haxe.lang.Runtime.toBool(value);
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			switch (field.hashCode())
			{
				case 94756189:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("clone")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "clone")) );
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
				case -1941613143:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubbleToRoot")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return this.bubbleToRoot;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
				case 764763215:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubblePhase")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return this.bubblePhase;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
				case -1941801947:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					if (field.equals("bubbleToLeaf")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
						return this.bubbleToLeaf;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		baseArr.push("bubblePhase");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		baseArr.push("bubbleToLeaf");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		baseArr.push("bubbleToRoot");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\core\\datastructure\\graph\\event\\TreeNodeEvent.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


