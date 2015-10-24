package haxe.at.dotpoint.loader.processor;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ADataProcessor extends haxe.at.dotpoint.loader.processor.ABasicDataProcessor
{
	public ADataProcessor(haxe.lang.EmptyObject empty)
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public ADataProcessor(haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target)
	{
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.at.dotpoint.loader.processor.ADataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(this, target);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_loader_processor_ADataProcessor(haxe.at.dotpoint.loader.processor.ADataProcessor __temp_me38, haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher target)
	{
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.at.dotpoint.loader.processor.ABasicDataProcessor.__hx_ctor_haxe_at_dotpoint_loader_processor_ABasicDataProcessor(__temp_me38, target);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return new haxe.at.dotpoint.loader.processor.ADataProcessor(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return new haxe.at.dotpoint.loader.processor.ADataProcessor(((haxe.at.dotpoint.core.dispatcher.event.IEventDispatcher) (arr.__get(0)) ));
	}
	
	
	public void addStatusListener(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error)
	{
		//line 163 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_complete = ((haxe.lang.Function) (complete) );
		//line 164 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_progress = ((haxe.lang.Function) (progress) );
		//line 165 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_error = ((haxe.lang.Function) (error) );
		//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( complete != null )) 
		{
			//line 167 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.addListener(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE, dyn_complete);
		}
		
		//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( progress != null )) 
		{
			//line 168 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.addListener(haxe.at.dotpoint.loader.event.ProgressEvent.PROGRESS, dyn_progress);
		}
		
		//line 170 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( error != null )) 
		{
			//line 172 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.addListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.ERROR, dyn_error);
			//line 173 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.addListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.IO_ERROR, dyn_error);
			//line 174 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.addListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.SECURITY_ERROR, dyn_error);
		}
		
	}
	
	
	public void removeStatusListener(haxe.lang.Function complete, haxe.lang.Function progress, haxe.lang.Function error)
	{
		//line 186 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_complete = ((haxe.lang.Function) (complete) );
		//line 187 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_progress = ((haxe.lang.Function) (progress) );
		//line 188 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		haxe.lang.Function dyn_error = ((haxe.lang.Function) (error) );
		//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( complete != null )) 
		{
			//line 190 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.removeListener(haxe.at.dotpoint.core.dispatcher.event.generic.StatusEvent.COMPLETE, dyn_complete);
		}
		
		//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( progress != null )) 
		{
			//line 191 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.removeListener(haxe.at.dotpoint.loader.event.ProgressEvent.PROGRESS, dyn_progress);
		}
		
		//line 193 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		if (( error != null )) 
		{
			//line 195 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.removeListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.ERROR, dyn_error);
			//line 196 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.removeListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.IO_ERROR, dyn_error);
			//line 197 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			this.removeListener(haxe.at.dotpoint.core.dispatcher.event.generic.ErrorEvent.SECURITY_ERROR, dyn_error);
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef1 = true;
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (field.hashCode())
			{
				case -1485212566:
				{
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("removeStatusListener")) 
					{
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "removeStatusListener")) );
					}
					
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 195755463:
				{
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("addStatusListener")) 
					{
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addStatusListener")) );
					}
					
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef1) 
			{
				//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		{
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			boolean __temp_executeDef1 = true;
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			switch (field.hashCode())
			{
				case -1485212566:
				{
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("removeStatusListener")) 
					{
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.removeStatusListener(((haxe.lang.Function) (dynargs.__get(0)) ), ((haxe.lang.Function) (dynargs.__get(1)) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
				case 195755463:
				{
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					if (field.equals("addStatusListener")) 
					{
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						__temp_executeDef1 = false;
						//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
						this.addStatusListener(((haxe.lang.Function) (dynargs.__get(0)) ), ((haxe.lang.Function) (dynargs.__get(1)) ), ((haxe.lang.Function) (dynargs.__get(2)) ));
					}
					
					//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
					break;
				}
				
				
			}
			
			//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
			if (__temp_executeDef1) 
			{
				//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\loader\\processor\\ADataProcessor.hx"
		return null;
	}
	
	
}


