package haxe.thnx.model.entities;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PowerupEntity extends haxe.thnx.model.entities.WorldEntity
{
	public PowerupEntity(haxe.lang.EmptyObject empty)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public PowerupEntity(int ID, haxe.thnx.model.enums.PowerupType type)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		haxe.thnx.model.entities.PowerupEntity.__hx_ctor_haxe_thnx_model_entities_PowerupEntity(this, ID, type);
	}
	
	
	public static void __hx_ctor_haxe_thnx_model_entities_PowerupEntity(haxe.thnx.model.entities.PowerupEntity __temp_me125, int ID, haxe.thnx.model.enums.PowerupType type)
	{
		//line 29 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		haxe.thnx.model.entities.WorldEntity.__hx_ctor_haxe_thnx_model_entities_WorldEntity(__temp_me125, ID, null);
		//line 30 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		__temp_me125.type = type;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		return new haxe.thnx.model.entities.PowerupEntity(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		return new haxe.thnx.model.entities.PowerupEntity(((int) (haxe.lang.Runtime.toInt(arr.__get(0))) ), ((haxe.thnx.model.enums.PowerupType) (arr.__get(1)) ));
	}
	
	
	public haxe.thnx.model.enums.PowerupType type;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
					if (field.equals("type")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
						this.type = ((haxe.thnx.model.enums.PowerupType) (value) );
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
						return value;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			boolean __temp_executeDef1 = true;
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			switch (field.hashCode())
			{
				case 3575610:
				{
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
					if (field.equals("type")) 
					{
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
						__temp_executeDef1 = false;
						//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
						return this.type;
					}
					
					//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
					break;
				}
				
				
			}
			
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			if (__temp_executeDef1) 
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		baseArr.push("type");
		//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
		{
			//line 10 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\src\\main\\haxe\\thnx\\model\\entities\\PowerupEntity.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


