package haxe.thnx.model.tileset;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Tileset extends haxe.lang.HxObject
{
	public Tileset(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Tileset(haxe.root.Array<haxe.thnx.model.tileset.Tile> tiles, int dimension)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		haxe.thnx.model.tileset.Tileset.__hx_ctor_haxe_thnx_model_tileset_Tileset(this, tiles, dimension);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_tileset_Tileset(haxe.thnx.model.tileset.Tileset __temp_me125, haxe.root.Array<haxe.thnx.model.tileset.Tile> tiles, int dimension)
	{
		//line 26 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		__temp_me125.tiles = tiles;
		//line 27 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		__temp_me125.dimension = dimension;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		return new haxe.thnx.model.tileset.Tileset(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		return new haxe.thnx.model.tileset.Tileset(((haxe.root.Array<haxe.thnx.model.tileset.Tile>) (arr.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ));
	}
	
	
	public haxe.root.Array<haxe.thnx.model.tileset.Tile> tiles;
	
	public int dimension;
	
	public haxe.thnx.model.tileset.Tile getTile(int x, int y)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		if (( ( x < 0 ) || ( x > this.dimension ) )) 
		{
			//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			throw haxe.lang.HaxeException.wrap(( "x-tile coordinate out of bounds: " + x ));
		}
		
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		if (( ( y < 0 ) || ( y > this.dimension ) )) 
		{
			//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			throw haxe.lang.HaxeException.wrap(( "y-tile coordinate out of bounds: " + y ));
		}
		
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		return this.tiles.__get(( ( y * this.dimension ) + x ));
	}
	
	
	public final int getTileIndex(int x, int y)
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		return ( ( y * this.dimension ) + x );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			switch (field.hashCode())
			{
				case -1095013018:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("dimension")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						this.dimension = ((int) (value) );
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			switch (field.hashCode())
			{
				case -1095013018:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("dimension")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						this.dimension = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
				case 110363525:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("tiles")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						this.tiles = ((haxe.root.Array<haxe.thnx.model.tileset.Tile>) (value) );
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return value;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			switch (field.hashCode())
			{
				case -880946162:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("getTileIndex")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTileIndex")) );
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
				case 110363525:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("tiles")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return this.tiles;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
				case -75121884:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("getTile")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getTile")) );
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
				case -1095013018:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("dimension")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return this.dimension;
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			switch (field.hashCode())
			{
				case -1095013018:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("dimension")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return ((double) (this.dimension) );
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			boolean __temp_executeDef1 = true;
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			switch (field.hashCode())
			{
				case -880946162:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("getTileIndex")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return this.getTileIndex(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
				case -75121884:
				{
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					if (field.equals("getTile")) 
					{
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						__temp_executeDef1 = false;
						//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
						return this.getTile(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
					break;
				}
				
				
			}
			
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			if (__temp_executeDef1) 
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		baseArr.push("dimension");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		baseArr.push("tiles");
		//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
		{
			//line 7 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tileset.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


