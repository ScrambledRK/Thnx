package haxe.at.dotpoint.display.renderable.bitmap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class BitmapData extends haxe.lang.HxObject
{
	public BitmapData(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public BitmapData(int width, int height, haxe.io.Bytes bytes)
	{
		//line 40 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		haxe.at.dotpoint.display.renderable.bitmap.BitmapData.__hx_ctor_haxe_at_dotpoint_display_renderable_bitmap_BitmapData(this, width, height, bytes);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_display_renderable_bitmap_BitmapData(haxe.at.dotpoint.display.renderable.bitmap.BitmapData __temp_me35, int width, int height, haxe.io.Bytes bytes)
	{
		//line 42 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		__temp_me35.width = width;
		//line 43 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		__temp_me35.height = height;
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( bytes == null )) 
		{
			//line 47 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			__temp_me35.pixels = haxe.io.Bytes.alloc(( ( width * height ) * 4 ));
		}
		else
		{
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			__temp_me35.pixels = bytes;
			//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (( ( ( width * height ) * 4 ) != __temp_me35.pixels.length )) 
			{
				//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				java.lang.Object info = new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"haxe.at.dotpoint.display.renderable.bitmap.BitmapData", "BitmapData.hx", "new"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (54) )) )});
				//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				haxe.at.dotpoint.logger.Log.check();
				//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				{
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					int _g = 0;
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					haxe.root.Array<haxe.at.dotpoint.logger.logger.ILogger> _g1 = haxe.at.dotpoint.logger.Log.loggerList;
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					while (( _g < _g1.length ))
					{
						//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						haxe.at.dotpoint.logger.logger.ILogger logger = _g1.__get(_g);
						//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						 ++ _g;
						//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						haxe.at.dotpoint.logger.Log.delegateLog(logger, haxe.at.dotpoint.logger.LogType.ERROR, "given bitmapdata bytes not the same size as width * height", info);
					}
					
				}
				
				//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				java.lang.String __temp_expr1 = "given bitmapdata bytes not the same size as width * height";
			}
			
		}
		
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		__temp_me35.lazy = new haxe.at.dotpoint.core.lazy.LazyComponent(null, null);
	}
	
	
	public static haxe.at.dotpoint.display.renderable.bitmap.BitmapData blit(haxe.at.dotpoint.display.renderable.bitmap.BitmapData source, haxe.at.dotpoint.display.renderable.bitmap.BitmapData target, haxe.at.dotpoint.math.geom.Rectangle from, haxe.at.dotpoint.math.vector.IVector2 to)
	{
		//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fx = 0;
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fy = 0;
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fw = source.width;
		//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fh = source.height;
		//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int tx = 0;
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int ty = 0;
		//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( from != null )) 
		{
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x = from.get_min().get_x();
				//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				fx = ((int) (x) );
			}
			
			//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x1 = from.get_min().get_y();
				//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				fy = ((int) (x1) );
			}
			
			//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x2 = from.get_width();
				//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				fw = ((int) (x2) );
			}
			
			//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x3 = from.get_height();
				//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				fh = ((int) (x3) );
			}
			
		}
		
		//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( to != null )) 
		{
			//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x4 = to.get_x();
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				tx = ((int) (x4) );
			}
			
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			{
				//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				double x5 = to.get_y();
				//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				ty = ((int) (x5) );
			}
			
		}
		
		//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fmx = ( fx + fw );
		//line 137 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int fmy = ( fy + fh );
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int tmx = ( tx + fw );
		//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		int tmy = ( ty + fh );
		//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( target == null )) 
		{
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			target = new haxe.at.dotpoint.display.renderable.bitmap.BitmapData(tmx, tmy, null);
		}
		
		//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( ( ( ( fmx >= source.width ) || ( fmx < 0 ) ) || ( fmy >= source.height ) ) || ( fmy < 0 ) )) 
		{
			//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			throw haxe.lang.HaxeException.wrap("from, to specifications are outside source bounds");
		}
		
		//line 150 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( ( ( ( tmx >= target.width ) || ( tmx < 0 ) ) || ( tmy >= target.height ) ) || ( tmy < 0 ) )) 
		{
			//line 151 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			throw haxe.lang.HaxeException.wrap("from, to specifications are outside target bounds");
		}
		
		//line 155 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( ( ( ( ( ( fx == 0 ) && ( fy == 0 ) ) && ( tx == 0 ) ) && ( ty == 0 ) ) && ( fw == source.width ) ) && ( fh == source.height ) )) 
		{
			//line 156 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			return haxe.at.dotpoint.display.renderable.bitmap.BitmapData.copy(source, target);
		}
		
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			int _g = 0;
			//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			while (( _g < fh ))
			{
				//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				int y = _g++;
				//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				int tpos = ( (( ( (( ty + y )) * target.width ) + tx )) * 4 );
				//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				int fpos = ( (( ( (( fy + y )) * source.width ) + fx )) * 4 );
				//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				target.pixels.blit(tpos, source.pixels, fpos, fw);
			}
			
		}
		
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = target.lazy;
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return target;
	}
	
	
	public static haxe.at.dotpoint.display.renderable.bitmap.BitmapData copy(haxe.at.dotpoint.display.renderable.bitmap.BitmapData source, haxe.at.dotpoint.display.renderable.bitmap.BitmapData target)
	{
		//line 180 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		if (( target == null )) 
		{
			//line 181 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			target = new haxe.at.dotpoint.display.renderable.bitmap.BitmapData(source.width, source.height, null);
		}
		
		//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		target.pixels.blit(0, source.pixels, 0, source.pixels.length);
		//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = target.lazy;
			//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
		//line 189 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return target;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return new haxe.at.dotpoint.display.renderable.bitmap.BitmapData(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return new haxe.at.dotpoint.display.renderable.bitmap.BitmapData(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(arr.__get(1))) ), ((haxe.io.Bytes) (arr.__get(2)) ));
	}
	
	
	public haxe.io.Bytes pixels;
	
	public int width;
	
	public int height;
	
	public haxe.at.dotpoint.core.lazy.LazyComponent lazy;
	
	public int getPixel(int x, int y)
	{
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return ( this.pixels.b[( (( ( y * this.width ) + x )) * 4 )] & 255 );
	}
	
	
	public void setPixel(int x, int y, int value)
	{
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		this.pixels.b[( (( ( y * this.width ) + x )) * 4 )] = ((byte) (value) );
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			haxe.at.dotpoint.core.lazy.LazyComponent _this = this.lazy;
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (_this.allowDispatchUpdate) 
			{
				//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				_this.onUpdate.__hx_invoke0_o();
			}
			
		}
		
	}
	
	
	public final int getPosition(int x, int y)
	{
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return ( (( ( y * this.width ) + x )) * 4 );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			switch (field.hashCode())
			{
				case -1221029593:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("height")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.height = ((int) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("width")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.width = ((int) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			switch (field.hashCode())
			{
				case 3314548:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("lazy")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.lazy = ((haxe.at.dotpoint.core.lazy.LazyComponent) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case -987857235:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("pixels")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.pixels = ((haxe.io.Bytes) (value) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("height")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.height = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("width")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.width = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return value;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			switch (field.hashCode())
			{
				case -1469262177:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("getPosition")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPosition")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case -987857235:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("pixels")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.pixels;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 1401393988:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("setPixel")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setPixel")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("width")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.width;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 1962506448:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("getPixel")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getPixel")) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case -1221029593:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("height")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.height;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 3314548:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("lazy")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.lazy;
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			switch (field.hashCode())
			{
				case -1221029593:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("height")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return ((double) (this.height) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 113126854:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("width")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return ((double) (this.width) );
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			boolean __temp_executeDef1 = true;
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			switch (field.hashCode())
			{
				case -1469262177:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("getPosition")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.getPosition(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 1962506448:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("getPixel")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						return this.getPixel(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
				case 1401393988:
				{
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					if (field.equals("setPixel")) 
					{
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						__temp_executeDef1 = false;
						//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
						this.setPixel(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
					break;
				}
				
				
			}
			
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			if (__temp_executeDef1) 
			{
				//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		baseArr.push("lazy");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		baseArr.push("height");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		baseArr.push("width");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		baseArr.push("pixels");
		//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
		{
			//line 13 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\display\\renderable\\bitmap\\BitmapData.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


