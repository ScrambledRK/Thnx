package javahx.thnx.view;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ViewController extends haxe.lang.HxObject implements haxe.thnx.view.IViewController
{
	public ViewController(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ViewController()
	{
		//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		javahx.thnx.view.ViewController.__hx_ctor_javahx_thnx_view_ViewController(this);
	}
	
	
	public static void __hx_ctor_javahx_thnx_view_ViewController(javahx.thnx.view.ViewController __temp_me153)
	{
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		__temp_me153.isBackgroundRefresh = true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return new javahx.thnx.view.ViewController(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return new javahx.thnx.view.ViewController();
	}
	
	
	public javax.swing.JFrame jframe;
	
	public javax.swing.JLayeredPane jlayer;
	
	public javahx.thnx.view.DebugCanvas canvas_background;
	
	public javahx.thnx.view.DebugCanvas canvas_foreground;
	
	public boolean isBackgroundRefresh;
	
	public void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		if (( scaling == null )) 
		{
			//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			scaling = new haxe.at.dotpoint.math.vector.Vector2(10, 10);
		}
		
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.setupJFrame(dimension);
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.setupCanvas(dimension, scaling);
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setVisible(haxe.lang.Runtime.toBool(true));
	}
	
	
	public void setupJFrame(haxe.at.dotpoint.math.vector.IVector2 dimension)
	{
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int w = 0;
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			w = ((int) (x) );
		}
		
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int h = 0;
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		java.lang.System.setProperty(haxe.lang.Runtime.toString("sun.java2d.opengl"), haxe.lang.Runtime.toString("true"));
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe = new javax.swing.JFrame(haxe.lang.Runtime.toString("Thnx:AI"));
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setSize(((int) (w) ), ((int) (h) ));
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setDefaultCloseOperation(((int) (javax.swing.JFrame.EXIT_ON_CLOSE) ));
		//line 94 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setBackground(((java.awt.Color) (java.awt.Color.WHITE) ));
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setLocationRelativeTo(((java.awt.Component) (null) ));
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setLayout(((java.awt.LayoutManager) (null) ));
	}
	
	
	public void setupCanvas(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int w = 0;
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			w = ((int) (x) );
		}
		
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int h = 0;
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background = new javahx.thnx.view.DebugCanvas();
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.initialize(dimension, scaling, new haxe.at.dotpoint.math.vector.Vector2(null, null));
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.setLocation(((int) (5) ), ((int) (0) ));
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground = new javahx.thnx.view.DebugCanvas();
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.initialize(dimension, scaling, null);
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.setLocation(((int) (5) ), ((int) (0) ));
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer = new javax.swing.JLayeredPane();
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setPreferredSize(((java.awt.Dimension) (new java.awt.Dimension(w, h)) ));
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayout(((java.awt.LayoutManager) (null) ));
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_background) ), ((int) (0) ));
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_foreground) ), ((int) (1) ));
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_background) ));
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_foreground) ));
		//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.getContentPane().add(((java.awt.Component) (this.jlayer) ));
	}
	
	
	public void update()
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		if (this.isBackgroundRefresh) 
		{
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.canvas_background.clear();
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.drawBackground();
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.canvas_background.repaint();
			//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.isBackgroundRefresh = false;
		}
		
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.clear();
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.drawForeground();
		//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.repaint();
	}
	
	
	public void drawBackground()
	{
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		haxe.thnx.model.World world = javahx.thnx.ThnxMain.instance.world;
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g1 = 0;
			//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g = world.tileset.dimension;
			//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g1 < _g ))
			{
				//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int y = _g1++;
				//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					int _g3 = 0;
					//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					int _g2 = world.tileset.dimension;
					//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					while (( _g3 < _g2 ))
					{
						//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						int x = _g3++;
						//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						haxe.thnx.model.tileset.Tile tile = world.tileset.getTile(x, y);
						//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
						//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.get_min().set_x(((double) (x) ));
						//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.get_min().set_y(((double) (y) ));
						//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.set_width(((double) (1) ));
						//line 176 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.set_height(((double) (1) ));
						//line 178 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						if ( ! (tile.isWalkable()) ) 
						{
							//line 179 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							this.canvas_background.drawRectangle(rect, 2960685, null, null);
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public void drawForeground()
	{
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		haxe.thnx.model.World world = javahx.thnx.ThnxMain.instance.world;
		//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g = 0;
			//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			haxe.root.Array<haxe.thnx.model.entities.PowerupEntity> _g1 = world.powerups;
			//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g < _g1.length ))
			{
				//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.thnx.model.entities.PowerupEntity powerup = _g1.__get(_g);
				//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				 ++ _g;
				//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int color = 16720105;
				//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					haxe.thnx.model.enums.PowerupType _g2 = powerup.type;
					//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					switch (_g2)
					{
						case REPAIR:
						{
							//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 5562412;
							//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case DAMAGE:
						{
							//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 12657683;
							//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case SHIELD:
						{
							//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 1926840;
							//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds = powerup.boundings.localSpace;
				//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_min().set_x(bounds.get_min().get_x());
				//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_min().set_y(bounds.get_min().get_y());
				//line 210 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_max().set_x(bounds.get_max().get_x());
				//line 211 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_max().set_y(bounds.get_max().get_y());
				//line 213 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect, color, 1, 0.5);
			}
			
		}
		
		//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g3 = 0;
			//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			haxe.root.Array<haxe.thnx.model.entities.TankEntity> _g11 = world.tanks;
			//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g3 < _g11.length ))
			{
				//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.thnx.model.entities.TankEntity tank = _g11.__get(_g3);
				//line 219 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				 ++ _g3;
				//line 221 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				if ( ! (tank.status.isAlive()) ) 
				{
					//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					continue;
				}
				
				//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int color1 = 16720105;
				//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					haxe.thnx.model.enums.TeamColor _g21 = tank.status.team;
					//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					switch (_g21)
					{
						case BLUE:
						{
							//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 721111;
							//line 230 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case GREEN:
						{
							//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 2525212;
							//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case ORANGE:
						{
							//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 15368482;
							//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case RED:
						{
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 15801146;
							//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				if (( tank.getUser() == javahx.thnx.ThnxMain.instance.lobby.player )) 
				{
					//line 237 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					color1 = 16744703;
				}
				
				//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds1 = tank.boundings.localSpace;
				//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect1 = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_min().set_x(bounds1.get_min().get_x());
				//line 245 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_min().set_y(bounds1.get_min().get_y());
				//line 246 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_max().set_x(bounds1.get_max().get_x());
				//line 247 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_max().set_y(bounds1.get_max().get_y());
				//line 249 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect1, color1, 2, 0.9);
			}
			
		}
		
		//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return ;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case -1713491517:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.isBackgroundRefresh = haxe.lang.Runtime.toBool(value);
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.jframe = ((javax.swing.JFrame) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.canvas_foreground = ((javahx.thnx.view.DebugCanvas) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.jlayer = ((javax.swing.JLayeredPane) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.canvas_background = ((javahx.thnx.view.DebugCanvas) (value) );
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawForeground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.jframe;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawBackground")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.jlayer;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.canvas_background;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupCanvas")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.canvas_foreground;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupJFrame")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1713491517:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.isBackgroundRefresh;
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.drawForeground();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.initialize(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.drawBackground();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.setupJFrame(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.update();
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.setupCanvas(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("isBackgroundRefresh");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("canvas_foreground");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("canvas_background");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("jlayer");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("jframe");
		//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 24 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


