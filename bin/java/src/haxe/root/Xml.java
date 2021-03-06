package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Xml extends haxe.lang.HxObject
{
	static
	{
		//line 35 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.Element = ((int) (0) );
		//line 36 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.PCData = ((int) (1) );
		//line 37 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.CData = ((int) (2) );
		//line 38 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.Comment = ((int) (3) );
		//line 39 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.DocType = ((int) (4) );
		//line 40 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.ProcessingInstruction = ((int) (5) );
		//line 41 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.Document = ((int) (6) );
	}
	
	public Xml(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Xml(int nodeType)
	{
		//line 316 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml.__hx_ctor__Xml(this, nodeType);
	}
	
	
	public static void __hx_ctor__Xml(haxe.root.Xml __temp_me9, int nodeType)
	{
		//line 317 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		__temp_me9.nodeType = nodeType;
		//line 318 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		__temp_me9.children = new haxe.root.Array<haxe.root.Xml>(new haxe.root.Xml[]{});
		//line 319 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		__temp_me9.attributeMap = new haxe.ds.StringMap<java.lang.String>();
	}
	
	
	public static int Element;
	
	public static int PCData;
	
	public static int CData;
	
	public static int Comment;
	
	public static int DocType;
	
	public static int ProcessingInstruction;
	
	public static int Document;
	
	public static haxe.root.Xml parse(java.lang.String str)
	{
		//line 44 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return haxe.xml.Parser.parse(str, null);
	}
	
	
	public static haxe.root.Xml createElement(java.lang.String name)
	{
		//line 105 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.Element) ));
		//line 106 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 106 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( xml.nodeType != haxe.root.Xml.Element )) 
			{
				//line 106 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element but found " + xml.nodeType ));
			}
			
			//line 106 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeName = name;
		}
		
		//line 107 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createPCData(java.lang.String data)
	{
		//line 114 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.PCData) ));
		//line 115 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 115 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( ( xml.nodeType == haxe.root.Xml.Document ) || ( xml.nodeType == haxe.root.Xml.Element ) )) 
			{
				//line 115 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, unexpected " + xml.nodeType ));
			}
			
			//line 115 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeValue = data;
		}
		
		//line 116 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createCData(java.lang.String data)
	{
		//line 123 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.CData) ));
		//line 124 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 124 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( ( xml.nodeType == haxe.root.Xml.Document ) || ( xml.nodeType == haxe.root.Xml.Element ) )) 
			{
				//line 124 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, unexpected " + xml.nodeType ));
			}
			
			//line 124 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeValue = data;
		}
		
		//line 125 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createComment(java.lang.String data)
	{
		//line 132 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.Comment) ));
		//line 133 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 133 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( ( xml.nodeType == haxe.root.Xml.Document ) || ( xml.nodeType == haxe.root.Xml.Element ) )) 
			{
				//line 133 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, unexpected " + xml.nodeType ));
			}
			
			//line 133 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeValue = data;
		}
		
		//line 134 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createDocType(java.lang.String data)
	{
		//line 141 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.DocType) ));
		//line 142 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 142 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( ( xml.nodeType == haxe.root.Xml.Document ) || ( xml.nodeType == haxe.root.Xml.Element ) )) 
			{
				//line 142 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, unexpected " + xml.nodeType ));
			}
			
			//line 142 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeValue = data;
		}
		
		//line 143 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createProcessingInstruction(java.lang.String data)
	{
		//line 150 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		haxe.root.Xml xml = new haxe.root.Xml(((int) (haxe.root.Xml.ProcessingInstruction) ));
		//line 151 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 151 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (( ( xml.nodeType == haxe.root.Xml.Document ) || ( xml.nodeType == haxe.root.Xml.Element ) )) 
			{
				//line 151 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw haxe.lang.HaxeException.wrap(( "Bad node type, unexpected " + xml.nodeType ));
			}
			
			//line 151 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			xml.nodeValue = data;
		}
		
		//line 152 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return xml;
	}
	
	
	public static haxe.root.Xml createDocument()
	{
		//line 159 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return new haxe.root.Xml(((int) (haxe.root.Xml.Document) ));
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return new haxe.root.Xml(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return new haxe.root.Xml(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ));
	}
	
	
	public int nodeType;
	
	public java.lang.String nodeName;
	
	public java.lang.String nodeValue;
	
	public haxe.root.Xml parent;
	
	public haxe.root.Array<haxe.root.Xml> children;
	
	public haxe.ds.StringMap<java.lang.String> attributeMap;
	
	public void set(java.lang.String att, java.lang.String value)
	{
		//line 178 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (( this.nodeType != haxe.root.Xml.Element )) 
		{
			//line 179 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element but found " + this.nodeType ));
		}
		
		//line 181 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		this.attributeMap.set(att, value);
	}
	
	
	public boolean exists(java.lang.String att)
	{
		//line 200 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (( this.nodeType != haxe.root.Xml.Element )) 
		{
			//line 201 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element but found " + this.nodeType ));
		}
		
		//line 203 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return this.attributeMap.exists(att);
	}
	
	
	public void addChild(haxe.root.Xml x)
	{
		//line 273 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (( ( this.nodeType != haxe.root.Xml.Document ) && ( this.nodeType != haxe.root.Xml.Element ) )) 
		{
			//line 273 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element or Document but found " + this.nodeType ));
		}
		
		//line 274 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (( x.parent != null )) 
		{
			//line 275 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			x.parent.removeChild(x);
		}
		
		//line 277 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		this.children.push(x);
		//line 278 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		x.parent = this;
	}
	
	
	public boolean removeChild(haxe.root.Xml x)
	{
		//line 286 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (( ( this.nodeType != haxe.root.Xml.Document ) && ( this.nodeType != haxe.root.Xml.Element ) )) 
		{
			//line 286 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			throw haxe.lang.HaxeException.wrap(( "Bad node type, expected Element or Document but found " + this.nodeType ));
		}
		
		//line 287 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		if (this.children.remove(x)) 
		{
			//line 288 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			x.parent = null;
			//line 289 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			return true;
		}
		
		//line 291 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return false;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			switch (field.hashCode())
			{
				case 1123082332:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeType")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.nodeType = ((int) (value) );
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
			}
			
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			switch (field.hashCode())
			{
				case -1016582880:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("attributeMap")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.attributeMap = ((haxe.ds.StringMap<java.lang.String>) (value) );
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1123082332:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeType")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.nodeType = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("children")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.children = ((haxe.root.Array<haxe.root.Xml>) (value) );
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1122880429:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeName")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.nodeName = haxe.lang.Runtime.toString(value);
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("parent")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.parent = ((haxe.root.Xml) (value) );
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 456942735:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeValue")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.nodeValue = haxe.lang.Runtime.toString(value);
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return value;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
			}
			
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			switch (field.hashCode())
			{
				case -319766792:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("removeChild")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeChild")) );
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1123082332:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeType")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.nodeType;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -1262040837:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("addChild")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addChild")) );
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1122880429:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeName")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.nodeName;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("exists")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "exists")) );
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 456942735:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeValue")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.nodeValue;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("set")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set")) );
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("parent")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.parent;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -1016582880:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("attributeMap")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.attributeMap;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("children")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.children;
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
			}
			
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			switch (field.hashCode())
			{
				case 1123082332:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("nodeType")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return ((double) (this.nodeType) );
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
			}
			
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			boolean __temp_executeDef1 = true;
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			switch (field.hashCode())
			{
				case -319766792:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("removeChild")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.removeChild(((haxe.root.Xml) (dynargs.__get(0)) ));
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case 113762:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("set")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.set(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -1262040837:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("addChild")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						this.addChild(((haxe.root.Xml) (dynargs.__get(0)) ));
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
				case -1289358244:
				{
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					if (field.equals("exists")) 
					{
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						__temp_executeDef1 = false;
						//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
						return this.exists(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
					break;
				}
				
				
			}
			
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			if (__temp_executeDef1) 
			{
				//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("attributeMap");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("children");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("parent");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("nodeValue");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("nodeName");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		baseArr.push("nodeType");
		//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
		{
			//line 33 "C:\\Apps\\Haxe\\haxe\\std\\Xml.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


