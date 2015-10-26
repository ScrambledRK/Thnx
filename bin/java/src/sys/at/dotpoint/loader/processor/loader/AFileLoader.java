package sys.at.dotpoint.loader.processor.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AFileLoader extends haxe.at.dotpoint.loader.processor.ADataProcessor
{
	public AFileLoader(haxe.lang.EmptyObject empty)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public AFileLoader(java.lang.Object readInterval, java.lang.Object readLength)
	{
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		sys.at.dotpoint.loader.processor.loader.AFileLoader.__hx_ctor_sys_at_dotpoint_loader_processor_loader_AFileLoader(this, readInterval, readLength);
	}
	
	
	public static void __hx_ctor_sys_at_dotpoint_loader_processor_loader_AFileLoader(sys.at.dotpoint.loader.processor.loader.AFileLoader __temp_me156, java.lang.Object readInterval, java.lang.Object readLength)
	{
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		int __temp_readLength155 = ( (haxe.lang.Runtime.eq(readLength, null)) ? (256) : (((int) (haxe.lang.Runtime.toInt(readLength)) )) );
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		int __temp_readInterval154 = ( (haxe.lang.Runtime.eq(readInterval, null)) ? (20) : (((int) (haxe.lang.Runtime.toInt(readInterval)) )) );
		//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me156, null);
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		__temp_me156.readInterval = __temp_readInterval154;
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		__temp_me156.readLength = __temp_readLength155;
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		__temp_me156.readPosition = 0;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.AFileLoader(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		return new sys.at.dotpoint.loader.processor.loader.AFileLoader(arr.__get(0), arr.__get(1));
	}
	
	
	public sys.io.FileInput file;
	
	public haxe.io.Bytes bytes;
	
	public haxe.Timer timer;
	
	public int readInterval;
	
	public int readLength;
	
	public int readPosition;
	
	public void start(haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		try 
		{
			//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			this.file = sys.io.File.read(request.url, null);
			//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			this.bytes = haxe.io.Bytes.alloc(((int) (haxe.lang.Runtime.getField_f(sys.FileSystem.stat(request.url), "size", true)) ));
		}
		catch (java.lang.Throwable __temp_catchallException1)
		{
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			java.lang.Object __temp_catchall2 = __temp_catchallException1;
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			{
				//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				java.lang.Object error = __temp_catchall2;
				//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				this.onError(new haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent("Unknown Error", haxe.root.Std.string(error)));
			}
			
		}
		
		
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.timer = new haxe.Timer(((int) (this.readInterval) ));
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.timer.run = ((haxe.lang.Function) (new haxe.lang.Closure(this, "read")) );
	}
	
	
	public void read()
	{
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		double startTime = haxe.Timer.stamp();
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		int p = this.readPosition;
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		int l = this.readLength;
		//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		while (true)
		{
			//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (( ( p + l ) > this.bytes.length )) 
			{
				//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				l = ( this.bytes.length - p );
			}
			
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (( l > 0 )) 
			{
				//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				try 
				{
					//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					haxe.io.Bytes line = this.file.read(l);
					//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					this.bytes.blit(p, line, 0, l);
					//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					p += l;
				}
				catch (java.lang.Throwable __temp_catchallException1)
				{
					//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					haxe.lang.Exceptions.setException(__temp_catchallException1);
					//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					java.lang.Object __temp_catchall2 = __temp_catchallException1;
					//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
					{
						//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
					}
					
					//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					{
						//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						java.lang.Object error = __temp_catchall2;
						//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.onError(new haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent("Unknown Error", haxe.at.dotpoint.core.StringTool.dumpObject(error)));
					}
					
				}
				
				
			}
			
			//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (( ( this.file._eof || ( p > this.bytes.length ) ) || ( l <= 0 ) )) 
			{
				//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				this.onComplete(null);
				//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				break;
			}
			
			//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (( ( haxe.Timer.stamp() - startTime ) > ( ((double) ((( this.readInterval - 1 ))) ) / 1000 ) )) 
			{
				//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				haxe.at.dotpoint.loader.event.ProgressEvent progress = new haxe.at.dotpoint.loader.event.ProgressEvent(haxe.lang.Runtime.toString(haxe.at.dotpoint.loader.event.ProgressEvent.PROGRESS));
				//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				progress.bytesLoaded = ((double) (p) );
				//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				progress.bytesTotal = ((double) (this.bytes.length) );
				//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				this.dispatch(progress);
				//line 145 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				break;
			}
			
		}
		
		//line 149 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.readPosition = p;
	}
	
	
	@Override public void close()
	{
		//line 157 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.file.close();
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.file = null;
		//line 161 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.timer.stop();
		//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.timer = null;
		//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.bytes = null;
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		this.readPosition = 0;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			switch (field.hashCode())
			{
				case -699244321:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readPosition")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readPosition = ((int) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -876630917:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readInterval")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readInterval = ((int) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -714573796:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readLength")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readLength = ((int) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			switch (field.hashCode())
			{
				case -699244321:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readPosition")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readPosition = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 3143036:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("file")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.file = ((sys.io.FileInput) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -714573796:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readLength")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readLength = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 94224491:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("bytes")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.bytes = ((haxe.io.Bytes) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -876630917:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readInterval")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.readInterval = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 110364485:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("timer")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.timer = ((haxe.Timer) (value) );
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return value;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			switch (field.hashCode())
			{
				case 94756344:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("close")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 3143036:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("file")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.file;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 3496342:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("read")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "read")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 94224491:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("bytes")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.bytes;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("start")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 110364485:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("timer")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.timer;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -699244321:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readPosition")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.readPosition;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -876630917:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readInterval")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.readInterval;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -714573796:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readLength")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return this.readLength;
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			switch (field.hashCode())
			{
				case -699244321:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readPosition")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((double) (this.readPosition) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -876630917:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readInterval")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((double) (this.readInterval) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case -714573796:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("readLength")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return ((double) (this.readLength) );
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			boolean __temp_executeDef1 = true;
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			switch (field.hashCode())
			{
				case 94756344:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("close")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("start")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.start(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (dynargs.__get(0)) ));
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
				case 3496342:
				{
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					if (field.equals("read")) 
					{
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						__temp_executeDef1 = false;
						//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
						this.read();
					}
					
					//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
					break;
				}
				
				
			}
			
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			if (__temp_executeDef1) 
			{
				//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("readPosition");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("readLength");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("readInterval");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("timer");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("bytes");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		baseArr.push("file");
		//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
		{
			//line 19 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\sys\\at\\dotpoint\\loader\\processor\\loader\\AFileLoader.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


