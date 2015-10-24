package haxe.at.dotpoint.loader;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DataRequest extends haxe.at.dotpoint.loader.processor.ADataProcessor implements haxe.at.dotpoint.loader.processor.IDataRequest<haxe.at.dotpoint.loader._URLRequest.DotURLRequest, java.lang.Object>
{
	public DataRequest(haxe.lang.EmptyObject empty)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public DataRequest(haxe.at.dotpoint.loader._URLRequest.DotURLRequest request, haxe.at.dotpoint.loader.format.IDataFormat format)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		haxe.at.dotpoint.loader.DataRequest.__hx_ctor_haxe_at_dotpoint_loader_DataRequest(this, request, format);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_DataRequest(haxe.at.dotpoint.loader.DataRequest __temp_me39, haxe.at.dotpoint.loader._URLRequest.DotURLRequest request, haxe.at.dotpoint.loader.format.IDataFormat format)
	{
		//line 33 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(__temp_me39, null);
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		__temp_me39.request = request;
		//line 36 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		__temp_me39.format = format;
	}
	
	
	public static haxe.at.dotpoint.loader.DataRequest createFromURL(java.lang.String url, haxe.at.dotpoint.loader.format.IDataFormat format)
	{
		//line 46 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		return new haxe.at.dotpoint.loader.DataRequest(new haxe.at.dotpoint.loader._URLRequest.DotURLRequest(haxe.lang.Runtime.toString(url)), format);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		return new haxe.at.dotpoint.loader.DataRequest(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		return new haxe.at.dotpoint.loader.DataRequest(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (arr.__get(0)) ), ((haxe.at.dotpoint.loader.format.IDataFormat) (arr.__get(1)) ));
	}
	
	
	public haxe.at.dotpoint.loader._URLRequest.DotURLRequest request;
	
	public haxe.at.dotpoint.loader.format.IDataFormat format;
	
	public haxe.at.dotpoint.loader.processor.IDataProcessor loader;
	
	public haxe.at.dotpoint.loader.processor.IDataProcessor parser;
	
	public java.lang.Object result;
	
	public void load(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error)
	{
		//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.addStatusListener(complete, progress, error);
		//line 60 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.start(null);
	}
	
	
	@Override public void close()
	{
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( haxe.lang.Runtime.toBool(( this.loader != null )) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this.loader, "isProcessing", true)) )) 
		{
			//line 69 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.loader.stop();
		}
		
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( haxe.lang.Runtime.toBool(( this.parser != null )) && haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this.parser, "isProcessing", true)) )) 
		{
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.parser.stop();
		}
		
		//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.loader = null;
		//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.parser = null;
	}
	
	
	public void start(haxe.at.dotpoint.loader._URLRequest.DotURLRequest request)
	{
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( request != null )) 
		{
			//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.request = request;
		}
		
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.setRequirements();
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.setStatus(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.STARTED);
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.loader.addStatusListener(((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onProgress")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) ));
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		this.loader.start(this.request);
	}
	
	
	@Override public void onComplete(java.lang.Object event)
	{
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this.loader, "isComplete", true)) && haxe.lang.Runtime.toBool(( ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.getField(this.parser, "isComplete", true))) )) )) 
		{
			//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.loader.removeStatusListener(((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onProgress")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) ));
			//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.parser.addStatusListener(((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onProgress")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) ));
			//line 112 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.parser.start(haxe.lang.Runtime.getField(this.loader, "result", true));
		}
		else
		{
			//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.parser.removeStatusListener(((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onProgress")) ), ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) ));
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.result = haxe.lang.Runtime.getField(this.parser, "result", true);
			//line 120 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			super.onComplete(null);
		}
		
	}
	
	
	public void onProgress(haxe.at.dotpoint.loader.event.ProgressEvent event)
	{
		//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (this.hasListener(event.get_type())) 
		{
			//line 132 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			haxe.at.dotpoint.loader.event.ProgressEvent total = new haxe.at.dotpoint.loader.event.ProgressEvent(haxe.lang.Runtime.toString(event.get_type()));
			//line 133 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			total.bytesLoaded = event.bytesLoaded;
			//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			total.bytesTotal = event.bytesLoaded;
			//line 136 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.dispatch(total);
		}
		
	}
	
	
	@Override public void onError(haxe.at.dotpoint.core.dispatcher.event.Event event)
	{
		//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( ( event != null ) && this.hasListener(event.get_type()) )) 
		{
			//line 147 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.dispatch(event);
		}
		
	}
	
	
	public void setRequirements()
	{
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( ( this.format == null ) && (( ( this.loader == null ) || ( this.parser == null ) )) )) 
		{
			//line 160 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.format = haxe.at.dotpoint.loader.DataHelper.get_instance().guessFormat(this);
			//line 162 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (( this.format == null )) 
			{
				//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				throw haxe.lang.HaxeException.wrap(( ( "cannot guess DataRequest format from (" + this.request.url ) + ")" ));
			}
			
		}
		
		//line 166 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( this.loader == null )) 
		{
			//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.loader = this.format.createLoader(this);
		}
		
		//line 169 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( this.parser == null )) 
		{
			//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			this.parser = this.format.createParser(this);
		}
		
		//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( ( this.loader == null ) || ( this.parser == null ) )) 
		{
			//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			throw haxe.lang.HaxeException.wrap(( "cannot guess loader/parser for DataRequest format: " + haxe.root.Std.string(this.format) ));
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		java.lang.String url = null;
		//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		if (( this.request != null )) 
		{
			//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			url = this.request.url;
		}
		else
		{
			//line 182 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			url = "null";
		}
		
		//line 183 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		return ( ( "[DataRequest;" + url ) + "]" );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("result")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.result = ((java.lang.Object) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("result")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.result = ((java.lang.Object) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 1095692943:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("request")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.request = ((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -995410913:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("parser")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.parser = ((haxe.at.dotpoint.loader.processor.IDataProcessor) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -1268779017:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("format")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.format = ((haxe.at.dotpoint.loader.format.IDataFormat) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -1097519085:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("loader")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.loader = ((haxe.at.dotpoint.loader.processor.IDataProcessor) (value) );
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return value;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("toString")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 1095692943:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("request")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return this.request;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 917387794:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("setRequirements")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setRequirements")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -1268779017:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("format")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return this.format;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -1349867671:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("onError")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onError")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -1097519085:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("loader")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return this.loader;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 1768875308:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("onProgress")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onProgress")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -995410913:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("parser")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return this.parser;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -2124458952:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("onComplete")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onComplete")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case -934426595:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("result")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return this.result;
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("start")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 3327206:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("load")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "load")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 94756344:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("close")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "close")) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			switch (field.hashCode())
			{
				case -934426595:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("result")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.result)) );
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			int __temp_hash2 = field.hashCode();
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			boolean __temp_executeDef1 = true;
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			switch (__temp_hash2)
			{
				case -1776922004:
				case -1349867671:
				case -2124458952:
				case 94756344:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (( (( ( __temp_hash2 == -1776922004 ) && field.equals("toString") )) || ( (( ( __temp_hash2 == -1349867671 ) && field.equals("onError") )) || ( (( ( __temp_hash2 == -2124458952 ) && field.equals("onComplete") )) || field.equals("close") ) ) )) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 3327206:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("load")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.load(((haxe.lang.Function) (dynargs.__get(0)) ), ((haxe.lang.Function) (dynargs.__get(1)) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 917387794:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("setRequirements")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.setRequirements();
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 109757538:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("start")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.start(((haxe.at.dotpoint.loader._URLRequest.DotURLRequest) (dynargs.__get(0)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
				case 1768875308:
				{
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					if (field.equals("onProgress")) 
					{
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						__temp_executeDef1 = false;
						//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
						this.onProgress(((haxe.at.dotpoint.loader.event.ProgressEvent) (dynargs.__get(0)) ));
					}
					
					//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
					break;
				}
				
				
			}
			
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			if (__temp_executeDef1) 
			{
				//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		baseArr.push("result");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		baseArr.push("parser");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		baseArr.push("loader");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		baseArr.push("format");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		baseArr.push("request");
		//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
		{
			//line 16 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\DataRequest.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


