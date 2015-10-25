package haxe.thnx.model.tileset;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Tile extends haxe.lang.HxObject
{
	public Tile(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Tile(haxe.thnx.model.enums.TileType type)
	{
		//line 21 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		haxe.thnx.model.tileset.Tile.__hx_ctor_haxe_thnx_model_tileset_Tile(this, type);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_tileset_Tile(haxe.thnx.model.tileset.Tile __temp_me127, haxe.thnx.model.enums.TileType type)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		__temp_me127.type = type;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		return new haxe.thnx.model.tileset.Tile(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		return new haxe.thnx.model.tileset.Tile(((haxe.thnx.model.enums.TileType) (arr.__get(0)) ));
	}
	
	
	public haxe.thnx.model.enums.TileType type;
	
	public boolean isWalkable()
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		return ( this.type != haxe.thnx.model.enums.TileType.WALL );
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					if (field.equals("type")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						this.type = ((haxe.thnx.model.enums.TileType) (value) );
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						return value;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			switch (field.hashCode())
			{
				case -469974547:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					if (field.equals("isWalkable")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isWalkable")) );
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					break;
				}
				
				
				case 3575610:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					if (field.equals("type")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						return this.type;
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			switch (field.hashCode())
			{
				case -469974547:
				{
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					if (field.equals("isWalkable")) 
					{
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						__temp_executeDef1 = false;
						//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
						return this.isWalkable();
					}
					
					//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
					break;
				}
				
				
			}
			
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		baseArr.push("type");
		//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
		{
			//line 9 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\tileset\\Tile.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


