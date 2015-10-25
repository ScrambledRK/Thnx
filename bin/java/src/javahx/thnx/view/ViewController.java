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
		//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		javahx.thnx.view.ViewController.__hx_ctor_javahx_thnx_view_ViewController(this);
	}
	
	
	public static void __hx_ctor_javahx_thnx_view_ViewController(javahx.thnx.view.ViewController __temp_me154)
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		__temp_me154.isBackgroundRefresh = true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return new javahx.thnx.view.ViewController(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return new javahx.thnx.view.ViewController();
	}
	
	
	public javax.swing.JFrame jframe;
	
	public javax.swing.JLayeredPane jlayer;
	
	public javahx.thnx.view.DebugCanvas canvas_background;
	
	public javahx.thnx.view.DebugCanvas canvas_foreground;
	
	public boolean isBackgroundRefresh;
	
	public void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.setupJFrame(dimension);
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.setupCanvas(dimension, scaling);
		//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setVisible(haxe.lang.Runtime.toBool(true));
	}
	
	
	public void setupJFrame(haxe.at.dotpoint.math.vector.IVector2 dimension)
	{
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int w = 0;
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int __temp_stmt1 = 0;
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			__temp_stmt1 = ((int) (x) );
		}
		
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		w = ( __temp_stmt1 + 20 );
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int h = 0;
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		java.lang.System.setProperty(haxe.lang.Runtime.toString("sun.java2d.opengl"), haxe.lang.Runtime.toString("true"));
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe = new javax.swing.JFrame(haxe.lang.Runtime.toString("Thnx:AI"));
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setSize(((int) (w) ), ((int) (h) ));
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setDefaultCloseOperation(((int) (javax.swing.JFrame.EXIT_ON_CLOSE) ));
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setBackground(((java.awt.Color) (java.awt.Color.WHITE) ));
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setLocationRelativeTo(((java.awt.Component) (null) ));
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.setLayout(((java.awt.LayoutManager) (null) ));
	}
	
	
	public void setupCanvas(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int w = 0;
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			w = ((int) (x) );
		}
		
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		int h = 0;
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background = new javahx.thnx.view.DebugCanvas();
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.initialize(dimension, scaling);
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_background.setLocation(((int) (0) ), ((int) (0) ));
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground = new javahx.thnx.view.DebugCanvas();
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.initialize(dimension, scaling);
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.setLocation(((int) (0) ), ((int) (0) ));
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer = new javax.swing.JLayeredPane();
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setPreferredSize(((java.awt.Dimension) (new java.awt.Dimension(w, h)) ));
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayout(((java.awt.LayoutManager) (null) ));
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_background) ), ((int) (0) ));
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_foreground) ), ((int) (1) ));
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_background) ));
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_foreground) ));
		//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.jframe.getContentPane().add(((java.awt.Component) (this.jlayer) ));
	}
	
	
	public void update()
	{
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		if (this.isBackgroundRefresh) 
		{
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.canvas_background.clear();
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.drawBackground();
			//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.canvas_background.repaint();
			//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			this.isBackgroundRefresh = false;
		}
		
		//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.clear();
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.drawForeground();
		//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		this.canvas_foreground.repaint();
	}
	
	
	public void drawBackground()
	{
		//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		haxe.thnx.model.World world = javahx.thnx.ThnxMain.instance.world;
		//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g1 = 0;
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g = world.tileset.dimension;
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g1 < _g ))
			{
				//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int y = _g1++;
				//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					int _g3 = 0;
					//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					int _g2 = world.tileset.dimension;
					//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					while (( _g3 < _g2 ))
					{
						//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						int x = _g3++;
						//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						haxe.thnx.model.tileset.Tile tile = world.tileset.getTile(x, y);
						//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
						//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.get_min().set_x(((double) (x) ));
						//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.get_min().set_y(((double) (y) ));
						//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.set_width(((double) (1) ));
						//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						rect.set_height(((double) (1) ));
						//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						if ( ! (tile.isWalkable()) ) 
						{
							//line 175 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							this.canvas_background.drawRectangle(rect, 2960685, null, null);
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public void drawForeground()
	{
		//line 185 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		haxe.thnx.model.World world = javahx.thnx.ThnxMain.instance.world;
		//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g = 0;
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			haxe.root.Array<haxe.thnx.model.entities.PowerupEntity> _g1 = world.powerups;
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g < _g1.length ))
			{
				//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.thnx.model.entities.PowerupEntity powerup = _g1.__get(_g);
				//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				 ++ _g;
				//line 192 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int color = 16720105;
				//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					haxe.thnx.model.enums.PowerupType _g2 = powerup.type;
					//line 194 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					switch (_g2)
					{
						case REPAIR:
						{
							//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 5562412;
							//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case DAMAGE:
						{
							//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 12657683;
							//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case SHIELD:
						{
							//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color = 1926840;
							//line 198 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 201 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds = powerup.boundings.localSpace;
				//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 204 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_min().set_x(bounds.get_min().get_x());
				//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_min().set_y(bounds.get_min().get_y());
				//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_max().set_x(bounds.get_max().get_x());
				//line 207 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect.get_max().set_y(bounds.get_max().get_y());
				//line 209 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect, color, 1, 0.5);
			}
			
		}
		
		//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g3 = 0;
			//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			haxe.root.Array<haxe.thnx.model.entities.TankEntity> _g11 = world.tanks;
			//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g3 < _g11.length ))
			{
				//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.thnx.model.entities.TankEntity tank = _g11.__get(_g3);
				//line 215 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				 ++ _g3;
				//line 217 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				if ( ! (tank.status.isAlive()) ) 
				{
					//line 218 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					continue;
				}
				
				//line 222 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				int color1 = 16720105;
				//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				{
					//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					haxe.thnx.model.enums.TeamColor _g21 = tank.status.team;
					//line 224 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					switch (_g21)
					{
						case BLUE:
						{
							//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 721111;
							//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case GREEN:
						{
							//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 2525212;
							//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case ORANGE:
						{
							//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 15368482;
							//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
						case RED:
						{
							//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							color1 = 15801146;
							//line 229 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				if (( tank.getUser() == javahx.thnx.ThnxMain.instance.lobby.player )) 
				{
					//line 233 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					color1 = 16744703;
				}
				
				//line 237 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds1 = tank.boundings.localSpace;
				//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect1 = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_min().set_x(bounds1.get_min().get_x());
				//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_min().set_y(bounds1.get_min().get_y());
				//line 242 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_max().set_x(bounds1.get_max().get_x());
				//line 243 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				rect1.get_max().set_y(bounds1.get_max().get_y());
				//line 245 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect1, color1, 2, 0.9);
			}
			
		}
		
		//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			int _g4 = 0;
			//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			haxe.root.Array<haxe.thnx.model.entities.BulletEntity> _g12 = world.bullets;
			//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			while (( _g4 < _g12.length ))
			{
				//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.thnx.model.entities.BulletEntity bullet = _g12.__get(_g4);
				//line 251 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				 ++ _g4;
				//line 253 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.vector.IVector2 a = bullet.transform.get_position();
				//line 254 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.vector.IVector2 b = bullet.target;
				//line 256 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				this.canvas_foreground.drawLine(a, b, 13812045, 2, 0.8);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case -1713491517:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.isBackgroundRefresh = haxe.lang.Runtime.toBool(value);
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.jframe = ((javax.swing.JFrame) (value) );
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.canvas_foreground = ((javahx.thnx.view.DebugCanvas) (value) );
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.jlayer = ((javax.swing.JLayeredPane) (value) );
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.canvas_background = ((javahx.thnx.view.DebugCanvas) (value) );
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return value;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawForeground")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.jframe;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawBackground")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.jlayer;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.canvas_background;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupCanvas")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.canvas_foreground;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupJFrame")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1713491517:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return this.isBackgroundRefresh;
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.drawForeground();
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.initialize(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.drawBackground();
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.setupJFrame(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ));
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.update();
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
						this.setupCanvas(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("isBackgroundRefresh");
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("canvas_foreground");
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("canvas_background");
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("jlayer");
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		baseArr.push("jframe");
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
		{
			//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\thnx\\view\\ViewController.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


