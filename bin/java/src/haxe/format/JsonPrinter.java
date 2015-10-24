package haxe.format;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class JsonPrinter extends haxe.lang.HxObject
{
	public JsonPrinter(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public JsonPrinter(haxe.lang.Function replacer, java.lang.String space)
	{
		//line 54 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		haxe.format.JsonPrinter.__hx_ctor_haxe_format_JsonPrinter(this, replacer, space);
	}
	
	
	public static void __hx_ctor_haxe_format_JsonPrinter(haxe.format.JsonPrinter __temp_me106, haxe.lang.Function replacer, java.lang.String space)
	{
		//line 55 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		__temp_me106.replacer = replacer;
		//line 56 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		__temp_me106.indent = space;
		//line 57 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		__temp_me106.pretty = ( space != null );
		//line 58 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		__temp_me106.nind = 0;
		//line 65 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		__temp_me106.buf = new haxe.root.StringBuf();
	}
	
	
	public static java.lang.String print(java.lang.Object o, haxe.lang.Function replacer, java.lang.String space)
	{
		//line 43 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		haxe.format.JsonPrinter printer = new haxe.format.JsonPrinter(replacer, space);
		//line 44 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		printer.write("", o);
		//line 45 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		return printer.buf.toString();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		return new haxe.format.JsonPrinter(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		return new haxe.format.JsonPrinter(((haxe.lang.Function) (arr.__get(0)) ), haxe.lang.Runtime.toString(arr.__get(1)));
	}
	
	
	public haxe.root.StringBuf buf;
	
	public haxe.lang.Function replacer;
	
	public java.lang.String indent;
	
	public boolean pretty;
	
	public int nind;
	
	public void write(java.lang.Object k, java.lang.Object v)
	{
		//line 78 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		if (( this.replacer != null )) 
		{
			//line 78 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			v = ((java.lang.Object) (this.replacer.__hx_invoke2_o(0.0, k, 0.0, v)) );
		}
		
		//line 79 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 79 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			haxe.root.ValueType _g = haxe.root.Type.typeof(v);
			//line 79 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (_g.index)
			{
				case 8:
				{
					//line 81 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\"???\"");
					//line 81 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 4:
				{
					//line 83 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.fieldsString(v, haxe.root.Reflect.fields(v));
					//line 83 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 1:
				{
					//line 85 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.String v1 = haxe.lang.Runtime.toString(v);
					//line 85 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add(v1);
					//line 85 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 2:
				{
					//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.String v2 = null;
					//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (haxe.lang.Runtime.isFinite(((double) (haxe.lang.Runtime.toDouble(v)) ))) 
					{
						//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						v2 = haxe.lang.Runtime.toString(v);
					}
					else
					{
						//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						v2 = "null";
					}
					
					//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add(v2);
					//line 87 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 5:
				{
					//line 89 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\"<fun>\"");
					//line 89 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 6:
				{
					//line 79 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.Class c = ((java.lang.Class) (_g.params[0]) );
					//line 91 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (java.lang.String.class) ) )) 
					{
						//line 92 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.quote(haxe.lang.Runtime.toString(v));
					}
					else
					{
						//line 93 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.root.Array.class) ) )) 
						{
							//line 94 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							haxe.root.Array v3 = ((haxe.root.Array) (v) );
							//line 95 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							this.buf.addChar(91);
							//line 97 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							int len = v3.length;
							//line 98 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							int last = ( len - 1 );
							//line 99 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							{
								//line 99 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								int _g1 = 0;
								//line 99 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								while (( _g1 < len ))
								{
									//line 99 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									int i = _g1++;
									//line 101 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									if (( i > 0 )) 
									{
										//line 101 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										this.buf.addChar(44);
									}
									else
									{
										//line 101 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										this.nind++;
									}
									
									//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									if (this.pretty) 
									{
										//line 102 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										this.buf.addChar(10);
									}
									
									//line 103 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									if (this.pretty) 
									{
										//line 103 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										java.lang.String v4 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
										//line 103 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										this.buf.add(v4);
									}
									
									//line 104 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									this.write(i, v3.__get(i));
									//line 105 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									if (( i == last )) 
									{
										//line 107 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										this.nind--;
										//line 108 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										if (this.pretty) 
										{
											//line 108 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
											this.buf.addChar(10);
										}
										
										//line 109 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										if (this.pretty) 
										{
											//line 109 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
											java.lang.String v5 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
											//line 109 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
											this.buf.add(v5);
										}
										
									}
									
								}
								
							}
							
							//line 112 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							this.buf.addChar(93);
						}
						else
						{
							//line 113 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
							if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.ds.StringMap.class) ) )) 
							{
								//line 114 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								haxe.ds.StringMap v6 = ((haxe.ds.StringMap) (v) );
								//line 115 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								java.lang.Object o = new haxe.lang.DynamicObject(new java.lang.String[]{}, new java.lang.Object[]{}, new java.lang.String[]{}, new double[]{});
								//line 116 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								{
									//line 116 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									java.lang.Object __temp_iterator1 = v6.keys();
									//line 116 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator1, "hasNext", null)))
									{
										//line 116 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										java.lang.String k1 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(__temp_iterator1, "next", null));
										//line 117 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
										haxe.root.Reflect.setField(o, k1, v6.get(k1));
									}
									
								}
								
								//line 118 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								this.fieldsString(o, haxe.root.Reflect.fields(o));
							}
							else
							{
								//line 119 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
								if (( ((java.lang.Object) (c) ) == ((java.lang.Object) (haxe.root.Date.class) ) )) 
								{
									//line 120 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									haxe.root.Date v7 = ((haxe.root.Date) (v) );
									//line 121 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									this.quote(v7.toString());
								}
								else
								{
									//line 126 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
									this.fieldsString(v, haxe.root.Reflect.fields(v));
								}
								
							}
							
						}
						
					}
					
					//line 90 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 7:
				{
					//line 129 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.Object i1 = haxe.root.Type.enumIndex(v);
					//line 130 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					{
						//line 130 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						java.lang.String v8 = haxe.lang.Runtime.toString(i1);
						//line 130 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.buf.add(v8);
					}
					
					//line 128 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 3:
				{
					//line 132 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.String v9 = haxe.lang.Runtime.toString(v);
					//line 132 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add(v9);
					//line 132 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 0:
				{
					//line 134 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("null");
					//line 134 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
		}
		
	}
	
	
	public void fieldsString(java.lang.Object v, haxe.root.Array<java.lang.String> fields)
	{
		//line 166 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		this.buf.addChar(123);
		//line 167 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		int len = fields.length;
		//line 168 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		int last = ( len - 1 );
		//line 169 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		boolean first = true;
		//line 170 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 170 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			int _g = 0;
			//line 170 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			while (( _g < len ))
			{
				//line 170 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				int i = _g++;
				//line 171 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				java.lang.String f = fields.__get(i);
				//line 172 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				java.lang.Object value = haxe.root.Reflect.field(v, f);
				//line 173 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (haxe.root.Reflect.isFunction(value)) 
				{
					//line 173 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					continue;
				}
				
				//line 174 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (first) 
				{
					//line 174 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.nind++;
					//line 174 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					first = false;
				}
				else
				{
					//line 174 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.addChar(44);
				}
				
				//line 175 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 175 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.addChar(10);
				}
				
				//line 176 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 176 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					java.lang.String v1 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
					//line 176 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add(v1);
				}
				
				//line 177 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				this.quote(f);
				//line 178 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				this.buf.addChar(58);
				//line 179 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (this.pretty) 
				{
					//line 179 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.addChar(32);
				}
				
				//line 180 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				this.write(f, value);
				//line 181 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (( i == last )) 
				{
					//line 183 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.nind--;
					//line 184 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (this.pretty) 
					{
						//line 184 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.buf.addChar(10);
					}
					
					//line 185 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (this.pretty) 
					{
						//line 185 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						java.lang.String v2 = haxe.root.StringTools.lpad("", this.indent, ( this.nind * this.indent.length() ));
						//line 185 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.buf.add(v2);
					}
					
				}
				
			}
			
		}
		
		//line 188 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		this.buf.addChar(125);
	}
	
	
	public void quote(java.lang.String s)
	{
		//line 198 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		this.buf.addChar(34);
		//line 199 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		int i = 0;
		//line 200 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		while (true)
		{
			//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			int c = 0;
			//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			{
				//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				int index = i++;
				//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				if (( index < s.length() )) 
				{
					//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					c = ((int) (s.charAt(index)) );
				}
				else
				{
					//line 201 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					c = -1;
				}
				
			}
			
			//line 202 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (( c == -1 )) 
			{
				//line 202 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				break;
			}
			
			//line 203 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (c)
			{
				case 34:
				{
					//line 204 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\\"");
					//line 204 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 92:
				{
					//line 205 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\\\");
					//line 205 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 10:
				{
					//line 206 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\n");
					//line 206 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 13:
				{
					//line 207 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\r");
					//line 207 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 9:
				{
					//line 208 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\t");
					//line 208 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 8:
				{
					//line 209 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\b");
					//line 209 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 12:
				{
					//line 210 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.add("\\f");
					//line 210 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				default:
				{
					//line 215 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					this.buf.addChar(c);
					//line 215 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
			}
			
		}
		
		//line 219 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		this.buf.addChar(34);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (field.hashCode())
			{
				case 3381425:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("nind")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.nind = ((int) (value) );
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (field.hashCode())
			{
				case 3381425:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("nind")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.nind = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 97907:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("buf")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.buf = ((haxe.root.StringBuf) (value) );
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -980096906:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("pretty")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.pretty = haxe.lang.Runtime.toBool(value);
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -430332866:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("replacer")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.replacer = ((haxe.lang.Function) (value) );
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -1184239444:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("indent")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.indent = haxe.lang.Runtime.toString(value);
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return value;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (field.hashCode())
			{
				case 107953788:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("quote")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "quote")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 97907:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("buf")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return this.buf;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -66446294:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("fieldsString")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "fieldsString")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -430332866:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("replacer")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return this.replacer;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("write")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "write")) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -1184239444:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("indent")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return this.indent;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 3381425:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("nind")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return this.nind;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -980096906:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("pretty")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return this.pretty;
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (field.hashCode())
			{
				case 3381425:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("nind")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						return ((double) (this.nind) );
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			switch (field.hashCode())
			{
				case 107953788:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("quote")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.quote(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("write")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.write(dynargs.__get(0), dynargs.__get(1));
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
				case -66446294:
				{
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					if (field.equals("fieldsString")) 
					{
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
						this.fieldsString(dynargs.__get(0), ((haxe.root.Array<java.lang.String>) (dynargs.__get(1)) ));
					}
					
					//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		baseArr.push("nind");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		baseArr.push("pretty");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		baseArr.push("indent");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		baseArr.push("replacer");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		baseArr.push("buf");
		//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
		{
			//line 30 "C:\\Apps\\Haxe\\haxe\\std\\haxe\\format\\JsonPrinter.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


