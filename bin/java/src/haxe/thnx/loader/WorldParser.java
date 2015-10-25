package haxe.thnx.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WorldParser extends haxe.at.dotpoint.loader.processor.ADataProcessor implements haxe.at.dotpoint.loader.processor.IDataProcessor<java.lang.String, haxe.thnx.model.World>
{
	public WorldParser(haxe.lang.EmptyObject empty)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public WorldParser()
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.thnx.loader.WorldParser.__hx_ctor_haxe_thnx_loader_WorldParser(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_loader_WorldParser(haxe.thnx.loader.WorldParser __temp_me111)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me111, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return new haxe.thnx.loader.WorldParser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return new haxe.thnx.loader.WorldParser();
	}
	
	
	public haxe.thnx.model.World result;
	
	public void start(java.lang.String input)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		java.lang.Object json = this.parseJSON(input);
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		if (( json == null )) 
		{
			//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			throw haxe.lang.HaxeException.wrap("invalid json format");
		}
		
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> walls = this.parseWallBoundings(json);
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		this.result = new haxe.thnx.model.World();
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		this.result.tileset = this.parseTileset(walls);
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE);
	}
	
	
	public java.lang.Object parseJSON(java.lang.String input)
	{
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		try 
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			return new haxe.format.JsonParser(haxe.lang.Runtime.toString(input)).parseRec();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			{
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				java.lang.Object error = __temp_catchall2;
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.thnx.loader.WorldParser", "WorldParser.hx", "parseJSON"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (80) )) )});
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.at.dotpoint.logger.Log.check();
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				{
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					int _g = 0;
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
					//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					while (( _g < _g1.length ))
					{
						//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
						//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						 ++ _g;
						//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, error, info);
					}
					
				}
				
				//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				java.lang.Object __temp_expr3 = error;
			}
			
		}
		
		
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return null;
	}
	
	
	public haxe.thnx.model.tileset.Tileset parseTileset(haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> walls)
	{
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.root.Array<haxe.thnx.model.tileset.Tile> tiles = new haxe.root.Array<haxe.thnx.model.tileset.Tile>();
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			int _g1 = 0;
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			int _g = walls.length;
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			while (( _g1 < _g ))
			{
				//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				int y = _g1++;
				//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> ylist = walls.__get(y);
				//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				{
					//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					int _g3 = 0;
					//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					int _g2 = walls.length;
					//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					while (( _g3 < _g2 ))
					{
						//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						int x = _g3++;
						//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						haxe.at.dotpoint.math.geom.Rectangle rectangle = null;
						//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						{
							//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							int _g4 = 0;
							//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							while (( _g4 < ylist.length ))
							{
								//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								haxe.at.dotpoint.math.geom.Rectangle block = ylist.__get(_g4);
								//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								 ++ _g4;
								//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								boolean __temp_stmt1 = false;
								//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								{
									//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									double a = block.get_min().get_x();
									//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									__temp_stmt1 = ( (( a > x )) ? (( ( a - x ) < 1e-08 )) : (( ( x - a ) < 1e-08 )) );
								}
								
								//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								if (__temp_stmt1) 
								{
									//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									rectangle = block;
									//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									break;
								}
								
							}
							
						}
						
						//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						if (( rectangle != null )) 
						{
							//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							tiles.push(new haxe.thnx.model.tileset.Tile(((haxe.thnx.model.enums.TileType) (haxe.thnx.model.enums.TileType.WALL) )));
						}
						else
						{
							//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							tiles.push(new haxe.thnx.model.tileset.Tile(((haxe.thnx.model.enums.TileType) (haxe.thnx.model.enums.TileType.EMPTY) )));
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return new haxe.thnx.model.tileset.Tileset(tiles, walls.length);
	}
	
	
	public haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> parseWallBoundings(java.lang.Object json)
	{
		//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.root.Array level = ((haxe.root.Array) (haxe.lang.Runtime.getField(json, "walls", true)) );
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> rectangles = new haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>();
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			int _g = 0;
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			while (( _g < level.length ))
			{
				//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				java.lang.Object block = level.__get(_g);
				//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				 ++ _g;
				//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.root.Array<java.lang.Object> data = ((haxe.root.Array<java.lang.Object>) (block) );
				//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				int w = ((int) (((double) (haxe.lang.Runtime.toDouble(data.__get(2))) )) );
				//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				int h = ((int) (((double) (haxe.lang.Runtime.toDouble(data.__get(3))) )) );
				//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.at.dotpoint.math.geom.Rectangle block1 = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				block1.get_min().set_x(( ((double) (haxe.lang.Runtime.toDouble(data.__get(0))) ) - ( w * 0.5 ) ));
				//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				block1.get_min().set_y(( ((double) (haxe.lang.Runtime.toDouble(data.__get(1))) ) - ( h * 0.5 ) ));
				//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				block1.get_max().set_x(( ((double) (haxe.lang.Runtime.toDouble(data.__get(0))) ) + ( w * 0.5 ) ));
				//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				block1.get_max().set_y(( ((double) (haxe.lang.Runtime.toDouble(data.__get(1))) ) + ( h * 0.5 ) ));
				//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.at.dotpoint.math.vector.Vector2 anchor = ((haxe.at.dotpoint.math.vector.Vector2) (block1.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_LEFT, null)) );
				//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				{
					//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					int _g1 = 0;
					//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					while (( _g1 < w ))
					{
						//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						int x = _g1++;
						//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						{
							//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							int _g2 = 0;
							//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
							while (( _g2 < h ))
							{
								//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								int y = _g2++;
								//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (haxe.at.dotpoint.math.AxisRelative.CENTER) ));
								//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								rect.get_min().set_x(( anchor.get_x() + x ));
								//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								rect.get_min().set_y(( anchor.get_y() + y ));
								//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								rect.get_max().set_x(( rect.get_min().get_x() + 1 ));
								//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								rect.get_max().set_y(( rect.get_min().get_y() + 1 ));
								//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> target_list = null;
								//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								{
									//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									int _g3 = 0;
									//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									while (( _g3 < rectangles.length ))
									{
										//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> ylist = rectangles.__get(_g3);
										//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										 ++ _g3;
										//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										if (( ylist.length < 0 )) 
										{
											//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											continue;
										}
										
										//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										haxe.at.dotpoint.math.vector.Vector2 c_center = ((haxe.at.dotpoint.math.vector.Vector2) (ylist.__get(0).getPoint(new haxe.at.dotpoint.math.vector.Vector2(0, 0), null)) );
										//line 177 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										haxe.at.dotpoint.math.vector.Vector2 r_center = ((haxe.at.dotpoint.math.vector.Vector2) (rect.getPoint(new haxe.at.dotpoint.math.vector.Vector2(0, 0), null)) );
										//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										boolean __temp_stmt1 = false;
										//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										{
											//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											double a = c_center.get_y();
											//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											double b = r_center.get_y();
											//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											__temp_stmt1 = ( (( a > b )) ? (( ( a - b ) < 1e-08 )) : (( ( b - a ) < 1e-08 )) );
										}
										
										//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
										if (__temp_stmt1) 
										{
											//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											target_list = ylist;
											//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
											break;
										}
										
									}
									
								}
								
								//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								if (( target_list == null )) 
								{
									//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
									rectangles.__set(rectangles.length, target_list = new haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>());
								}
								
								//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
								target_list.push(rect);
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		this.sortRectangles(rectangles);
		//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return rectangles;
	}
	
	
	public void sortRectangles(haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> list)
	{
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 center = new haxe.at.dotpoint.math.vector.Vector2(null, null);
		//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.lang.Function sortYAxis = new haxe.thnx.loader.WorldParser_sortRectangles_209__Fun(center);
		//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		haxe.lang.Function sortXAxis = new haxe.thnx.loader.WorldParser_sortRectangles_218__Fun(center);
		//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		list.sort(sortYAxis);
		//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			int _g = 0;
			//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			while (( _g < list.length ))
			{
				//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> xaxis = list.__get(_g);
				//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				 ++ _g;
				//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				xaxis.sort(sortXAxis);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("result")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						this.result = ((haxe.thnx.model.World) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			switch (field.hashCode())
			{
				case 1423959330:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("sortRectangles")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sortRectangles")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("result")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return this.result;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case -2006191950:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseWallBoundings")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseWallBoundings")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("start")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case 1015210177:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseTileset")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseTileset")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case -1833406949:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseJSON")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseJSON")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			switch (field.hashCode())
			{
				case 1423959330:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("sortRectangles")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						this.sortRectangles(((haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>) (dynargs.__get(0)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("start")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						this.start(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case -2006191950:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseWallBoundings")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return this.parseWallBoundings(dynargs.__get(0));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case -1833406949:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseJSON")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return this.parseJSON(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
				case 1015210177:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					if (field.equals("parseTileset")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
						return this.parseTileset(((haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>) (dynargs.__get(0)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		baseArr.push("result");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\WorldParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


