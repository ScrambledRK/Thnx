package haxe.thnx.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TilesetParser extends haxe.at.dotpoint.loader.processor.ADataProcessor implements haxe.at.dotpoint.loader.processor.IDataProcessor<java.lang.String, haxe.thnx.model.tileset.Tileset>
{
	public TilesetParser(haxe.lang.EmptyObject empty)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public TilesetParser()
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.thnx.loader.TilesetParser.__hx_ctor_haxe_thnx_loader_TilesetParser(this);
	}
	
	
	public static void __hx_ctor_haxe_thnx_loader_TilesetParser(haxe.thnx.loader.TilesetParser __temp_me114)
	{
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me114, null);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return new haxe.thnx.loader.TilesetParser(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return new haxe.thnx.loader.TilesetParser();
	}
	
	
	public haxe.thnx.model.tileset.Tileset result;
	
	public void start(java.lang.String input)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		java.lang.Object json = this.parseJSON(input);
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		if (( json == null )) 
		{
			//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			throw haxe.lang.HaxeException.wrap("invalid json format");
		}
		
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.result = this.parseTileset(this.parseWallBoundings(json));
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 61 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE);
	}
	
	
	public java.lang.Object parseJSON(java.lang.String input)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		try 
		{
			//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			return new haxe.format.JsonParser(haxe.lang.Runtime.toString(input)).parseRec();
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			{
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				java.lang.Object error = __temp_catchall2;
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.thnx.loader.TilesetParser", "TilesetParser.hx", "parseJSON"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (77) )) )});
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.at.dotpoint.logger.Log.check();
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				{
					//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					int _g = 0;
					//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
					//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					while (( _g < _g1.length ))
					{
						//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
						//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						 ++ _g;
						//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, error, info);
					}
					
				}
				
				//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				java.lang.Object __temp_expr3 = error;
			}
			
		}
		
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return null;
	}
	
	
	public haxe.thnx.model.tileset.Tileset parseTileset(haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> walls)
	{
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.root.Array<haxe.thnx.model.tileset.Tile> tiles = new haxe.root.Array<haxe.thnx.model.tileset.Tile>();
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			int _g1 = 0;
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			int _g = walls.length;
			//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			while (( _g1 < _g ))
			{
				//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				int y = _g1++;
				//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> ylist = walls.__get(y);
				//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				{
					//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					int _g3 = 0;
					//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					int _g2 = walls.length;
					//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					while (( _g3 < _g2 ))
					{
						//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						int x = _g3++;
						//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						haxe.at.dotpoint.math.geom.Rectangle rectangle = null;
						//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						{
							//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							int _g4 = 0;
							//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							while (( _g4 < ylist.length ))
							{
								//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								haxe.at.dotpoint.math.geom.Rectangle block = ylist.__get(_g4);
								//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								 ++ _g4;
								//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								boolean __temp_stmt1 = false;
								//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								{
									//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									double a = block.get_min().get_x();
									//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									double b = walls.__get(0).__get(x).get_min().get_x();
									//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									__temp_stmt1 = ( (( a > b )) ? (( ( a - b ) < 1e-08 )) : (( ( b - a ) < 1e-08 )) );
								}
								
								//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								if (__temp_stmt1) 
								{
									//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									rectangle = block;
									//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									break;
								}
								
							}
							
						}
						
						//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						if (( rectangle != null )) 
						{
							//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							tiles.push(new haxe.thnx.model.tileset.Tile(((haxe.thnx.model.enums.TileType) (haxe.thnx.model.enums.TileType.WALL) )));
						}
						else
						{
							//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							tiles.push(new haxe.thnx.model.tileset.Tile(((haxe.thnx.model.enums.TileType) (haxe.thnx.model.enums.TileType.EMPTY) )));
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return new haxe.thnx.model.tileset.Tileset(tiles, walls.length);
	}
	
	
	public haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> parseWallBoundings(java.lang.Object json)
	{
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.root.Array level = ((haxe.root.Array) (haxe.lang.Runtime.getField(json, "walls", true)) );
		//line 135 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> rectangles = new haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>();
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			int _g = 0;
			//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			while (( _g < level.length ))
			{
				//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				java.lang.Object block = level.__get(_g);
				//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				 ++ _g;
				//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.root.Array<java.lang.Object> data = ((haxe.root.Array<java.lang.Object>) (block) );
				//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				int w = ((int) (((double) (haxe.lang.Runtime.toDouble(data.__get(2))) )) );
				//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				int h = ((int) (((double) (haxe.lang.Runtime.toDouble(data.__get(3))) )) );
				//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.at.dotpoint.math.geom.Rectangle block1 = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				block1.get_min().set_x(( ((double) (haxe.lang.Runtime.toDouble(data.__get(0))) ) - ( w * 0.5 ) ));
				//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				block1.get_min().set_y(( ((double) (haxe.lang.Runtime.toDouble(data.__get(1))) ) - ( h * 0.5 ) ));
				//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				block1.get_max().set_x(( ((double) (haxe.lang.Runtime.toDouble(data.__get(0))) ) + ( w * 0.5 ) ));
				//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				block1.get_max().set_y(( ((double) (haxe.lang.Runtime.toDouble(data.__get(1))) ) + ( h * 0.5 ) ));
				//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.at.dotpoint.math.vector.Vector2 anchor = ((haxe.at.dotpoint.math.vector.Vector2) (block1.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_LEFT, null)) );
				//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				{
					//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					int _g1 = 0;
					//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					while (( _g1 < w ))
					{
						//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						int x = _g1++;
						//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						{
							//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							int _g2 = 0;
							//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
							while (( _g2 < h ))
							{
								//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								int y = _g2++;
								//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (haxe.at.dotpoint.math.AxisRelative.CENTER) ));
								//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								rect.get_min().set_x(( anchor.get_x() + x ));
								//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								rect.get_min().set_y(( anchor.get_y() + y ));
								//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								rect.get_max().set_x(( rect.get_min().get_x() + 1 ));
								//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								rect.get_max().set_y(( rect.get_min().get_y() + 1 ));
								//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> target_list = null;
								//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								{
									//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									int _g3 = 0;
									//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									while (( _g3 < rectangles.length ))
									{
										//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> ylist = rectangles.__get(_g3);
										//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										 ++ _g3;
										//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										if (( ylist.length < 0 )) 
										{
											//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											continue;
										}
										
										//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										haxe.at.dotpoint.math.vector.Vector2 c_center = ((haxe.at.dotpoint.math.vector.Vector2) (ylist.__get(0).getPoint(new haxe.at.dotpoint.math.vector.Vector2(0, 0), null)) );
										//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										haxe.at.dotpoint.math.vector.Vector2 r_center = ((haxe.at.dotpoint.math.vector.Vector2) (rect.getPoint(new haxe.at.dotpoint.math.vector.Vector2(0, 0), null)) );
										//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										boolean __temp_stmt1 = false;
										//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										{
											//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											double a = c_center.get_y();
											//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											double b = r_center.get_y();
											//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											__temp_stmt1 = ( (( a > b )) ? (( ( a - b ) < 1e-08 )) : (( ( b - a ) < 1e-08 )) );
										}
										
										//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
										if (__temp_stmt1) 
										{
											//line 178 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											target_list = ylist;
											//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
											break;
										}
										
									}
									
								}
								
								//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								if (( target_list == null )) 
								{
									//line 184 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
									rectangles.__set(rectangles.length, target_list = new haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>());
								}
								
								//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
								target_list.push(rect);
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		this.sortRectangles(rectangles);
		//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return rectangles;
	}
	
	
	public void sortRectangles(haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>> list)
	{
		//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.at.dotpoint.math.vector.Vector2 center = new haxe.at.dotpoint.math.vector.Vector2(null, null);
		//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.lang.Function sortYAxis = new haxe.thnx.loader.TilesetParser_sortRectangles_206__Fun(center);
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		haxe.lang.Function sortXAxis = new haxe.thnx.loader.TilesetParser_sortRectangles_215__Fun(center);
		//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		list.sort(sortYAxis);
		//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			int _g = 0;
			//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			while (( _g < list.length ))
			{
				//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle> xaxis = list.__get(_g);
				//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				 ++ _g;
				//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				xaxis.sort(sortXAxis);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("result")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						this.result = ((haxe.thnx.model.tileset.Tileset) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			switch (field.hashCode())
			{
				case 1423959330:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("sortRectangles")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "sortRectangles")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("result")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return this.result;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case -2006191950:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseWallBoundings")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseWallBoundings")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("start")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case 1015210177:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseTileset")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseTileset")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case -1833406949:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseJSON")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "parseJSON")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			switch (field.hashCode())
			{
				case 1423959330:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("sortRectangles")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						this.sortRectangles(((haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>) (dynargs.__get(0)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("start")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						this.start(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case -2006191950:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseWallBoundings")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return this.parseWallBoundings(dynargs.__get(0));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case -1833406949:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseJSON")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return this.parseJSON(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
				case 1015210177:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					if (field.equals("parseTileset")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
						return this.parseTileset(((haxe.root.Array<haxe.root.Array<haxe.at.dotpoint.math.geom.Rectangle>>) (dynargs.__get(0)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		baseArr.push("result");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\loader\\TilesetParser.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


