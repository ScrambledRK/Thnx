package javahx.view;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ViewController extends haxe.lang.HxObject implements haxe.view.IViewController
{
	public ViewController(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ViewController()
	{
		//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		javahx.view.ViewController.__hx_ctor_javahx_view_ViewController(this);
	}
	
	
	public static void __hx_ctor_javahx_view_ViewController(javahx.view.ViewController __temp_me155)
	{
		//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		__temp_me155.isBackgroundRefresh = true;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		return new javahx.view.ViewController(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		return new javahx.view.ViewController();
	}
	
	
	public javax.swing.JFrame jframe;
	
	public javax.swing.JLayeredPane jlayer;
	
	public javahx.view.DebugCanvas canvas_background;
	
	public javahx.view.DebugCanvas canvas_foreground;
	
	public boolean isBackgroundRefresh;
	
	public void initialize(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.setupJFrame(dimension);
		//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.setupCanvas(dimension, scaling);
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setVisible(haxe.lang.Runtime.toBool(true));
	}
	
	
	public void setupJFrame(haxe.at.dotpoint.math.vector.IVector2 dimension)
	{
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		int w = 0;
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		int __temp_stmt1 = 0;
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			__temp_stmt1 = ((int) (x) );
		}
		
		//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		w = ( __temp_stmt1 + 20 );
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		int h = 0;
		//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		java.lang.System.setProperty(haxe.lang.Runtime.toString("sun.java2d.opengl"), haxe.lang.Runtime.toString("true"));
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe = new javax.swing.JFrame(haxe.lang.Runtime.toString("Thnx:AI"));
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setSize(((int) (w) ), ((int) (h) ));
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setDefaultCloseOperation(((int) (javax.swing.JFrame.EXIT_ON_CLOSE) ));
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setBackground(((java.awt.Color) (java.awt.Color.WHITE) ));
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setLocationRelativeTo(((java.awt.Component) (null) ));
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.setLayout(((java.awt.LayoutManager) (null) ));
	}
	
	
	public void setupCanvas(haxe.at.dotpoint.math.vector.IVector2 dimension, haxe.at.dotpoint.math.vector.IVector2 scaling)
	{
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		int w = 0;
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			double x = dimension.get_x();
			//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			w = ((int) (x) );
		}
		
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		int h = 0;
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			double x1 = dimension.get_y();
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			h = ((int) (x1) );
		}
		
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_background = new javahx.view.DebugCanvas();
		//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_background.initialize(dimension, scaling);
		//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_background.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_background.setLocation(((int) (0) ), ((int) (0) ));
		//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground = new javahx.view.DebugCanvas();
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground.initialize(dimension, scaling);
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground.setLocation(((int) (0) ), ((int) (0) ));
		//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer = new javax.swing.JLayeredPane();
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.setPreferredSize(((java.awt.Dimension) (new java.awt.Dimension(w, h)) ));
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.setBounds(((int) (0) ), ((int) (0) ), ((int) (w) ), ((int) (h) ));
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.setLayout(((java.awt.LayoutManager) (null) ));
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_background) ), ((int) (0) ));
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.setLayer(((java.awt.Component) (this.canvas_foreground) ), ((int) (1) ));
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_background) ));
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jlayer.add(((java.awt.Component) (this.canvas_foreground) ));
		//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.jframe.getContentPane().add(((java.awt.Component) (this.jlayer) ));
	}
	
	
	public void update()
	{
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		if (this.isBackgroundRefresh) 
		{
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			this.canvas_background.clear();
			//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			this.drawBackground();
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			this.canvas_background.repaint();
			//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			this.isBackgroundRefresh = false;
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground.clear();
		//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.drawForeground();
		//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		this.canvas_foreground.repaint();
	}
	
	
	public void drawBackground()
	{
		//line 159 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		haxe.model.World world = javahx.ThnxMain.instance.world;
		//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			int _g1 = 0;
			//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			int _g = world.tileset.dimension;
			//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			while (( _g1 < _g ))
			{
				//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				int y = _g1++;
				//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				{
					//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					int _g3 = 0;
					//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					int _g2 = world.tileset.dimension;
					//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					while (( _g3 < _g2 ))
					{
						//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						int x = _g3++;
						//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						haxe.model.tileset.Tile tile = world.tileset.getTile(x, y);
						//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
						//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						rect.get_min().set_x(((double) (x) ));
						//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						rect.get_min().set_y(((double) (y) ));
						//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						rect.set_width(((double) (1) ));
						//line 171 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						rect.set_height(((double) (1) ));
						//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						if ( ! (tile.isWalkable()) ) 
						{
							//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							this.canvas_background.drawRectangle(rect, 2960685, null, null);
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
	
	public void drawForeground()
	{
		//line 184 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		haxe.model.World world = javahx.ThnxMain.instance.world;
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			int _g = 0;
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			haxe.root.Array<haxe.model.entities.PowerupEntity> _g1 = world.powerups;
			//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			while (( _g < _g1.length ))
			{
				//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.model.entities.PowerupEntity powerup = _g1.__get(_g);
				//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				 ++ _g;
				//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				int color = 16720105;
				//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				{
					//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					haxe.model.enums.PowerupType _g2 = powerup.type;
					//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					switch (_g2)
					{
						case REPAIR:
						{
							//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color = 5562412;
							//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
						case DAMAGE:
						{
							//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color = 12657683;
							//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
						case SHIELD:
						{
							//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color = 1926840;
							//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 200 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds = powerup.boundings.localSpace;
				//line 202 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 203 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect.get_min().set_x(bounds.get_min().get_x());
				//line 204 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect.get_min().set_y(bounds.get_min().get_y());
				//line 205 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect.get_max().set_x(bounds.get_max().get_x());
				//line 206 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect.get_max().set_y(bounds.get_max().get_y());
				//line 208 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect, color, 1, 0.5);
			}
			
		}
		
		//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			int _g3 = 0;
			//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			haxe.root.Array<haxe.model.entities.TankEntity> _g11 = world.tanks;
			//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			while (( _g3 < _g11.length ))
			{
				//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.model.entities.TankEntity tank = _g11.__get(_g3);
				//line 214 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				 ++ _g3;
				//line 216 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				if ( ! (tank.status.isAlive()) ) 
				{
					//line 217 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					continue;
				}
				
				//line 221 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				int color1 = 16720105;
				//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				{
					//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					haxe.model.enums.TeamColor _g21 = tank.status.team;
					//line 223 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					switch (_g21)
					{
						case BLUE:
						{
							//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color1 = 721111;
							//line 225 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
						case GREEN:
						{
							//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color1 = 2525212;
							//line 226 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
						case ORANGE:
						{
							//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color1 = 15368482;
							//line 227 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
						case RED:
						{
							//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							color1 = 15801146;
							//line 228 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
							break;
						}
						
						
					}
					
				}
				
				//line 231 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				if (( tank.getUser() == javahx.ThnxMain.instance.lobby.player )) 
				{
					//line 232 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					color1 = 16744703;
				}
				
				//line 236 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.ICube bounds1 = tank.boundings.localSpace;
				//line 238 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.geom.Rectangle rect1 = new haxe.at.dotpoint.math.geom.Rectangle(((haxe.at.dotpoint.math.vector.IVector2) (null) ));
				//line 239 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect1.get_min().set_x(bounds1.get_min().get_x());
				//line 240 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect1.get_min().set_y(bounds1.get_min().get_y());
				//line 241 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect1.get_max().set_x(bounds1.get_max().get_x());
				//line 242 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				rect1.get_max().set_y(bounds1.get_max().get_y());
				//line 244 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				this.canvas_foreground.drawRectangle(rect1, color1, 2, 0.9);
			}
			
		}
		
		//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			int _g4 = 0;
			//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			haxe.root.Array<haxe.model.entities.BulletEntity> _g12 = world.bullets;
			//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			while (( _g4 < _g12.length ))
			{
				//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.model.entities.BulletEntity bullet = _g12.__get(_g4);
				//line 250 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				 ++ _g4;
				//line 252 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.vector.IVector2 a = bullet.transform.get_position();
				//line 253 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				haxe.at.dotpoint.math.vector.IVector2 b = bullet.target;
				//line 255 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				this.canvas_foreground.drawLine(a, b, 13812045, 2, 0.8);
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case -1713491517:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.isBackgroundRefresh = haxe.lang.Runtime.toBool(value);
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.jframe = ((javax.swing.JFrame) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.canvas_foreground = ((javahx.view.DebugCanvas) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.jlayer = ((javax.swing.JLayeredPane) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.canvas_background = ((javahx.view.DebugCanvas) (value) );
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return value;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawForeground")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1162585277:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("jframe")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return this.jframe;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "drawBackground")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1157527769:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("jlayer")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return this.jlayer;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "update")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case 677506677:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("canvas_background")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return this.canvas_background;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupCanvas")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -300809590:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("canvas_foreground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return this.canvas_foreground;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setupJFrame")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1713491517:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("isBackgroundRefresh")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return this.isBackgroundRefresh;
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			boolean __temp_executeDef1 = true;
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			switch (field.hashCode())
			{
				case 2125770151:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("drawForeground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.drawForeground();
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("initialize")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.initialize(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1190880878:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("drawBackground")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.drawBackground();
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1817051136:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("setupJFrame")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.setupJFrame(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -838846263:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("update")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.update();
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
				case -1992619467:
				{
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					if (field.equals("setupCanvas")) 
					{
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						__temp_executeDef1 = false;
						//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
						this.setupCanvas(((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.vector.IVector2) (dynargs.__get(1)) ));
					}
					
					//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
					break;
				}
				
				
			}
			
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			if (__temp_executeDef1) 
			{
				//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		baseArr.push("isBackgroundRefresh");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		baseArr.push("canvas_foreground");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		baseArr.push("canvas_background");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		baseArr.push("jlayer");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		baseArr.push("jframe");
		//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
		{
			//line 22 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\javahx\\view\\ViewController.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


