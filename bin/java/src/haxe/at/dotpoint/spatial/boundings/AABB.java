package haxe.at.dotpoint.spatial.boundings;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AABB extends haxe.at.dotpoint.math.lazy.LazyCube
{
	public AABB(haxe.lang.EmptyObject empty)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public AABB(haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.spatial.boundings.AABB.__hx_ctor_haxe_at_dotpoint_spatial_boundings_AABB(this, pivot);
	}
	
	
	public static void __hx_ctor_haxe_at_dotpoint_spatial_boundings_AABB(haxe.at.dotpoint.spatial.boundings.AABB __temp_me99, haxe.at.dotpoint.math.vector.IVector3 pivot)
	{
		//line 23 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.lazy.LazyCube.__hx_ctor_haxe_at_dotpoint_math_lazy_LazyCube(__temp_me99, pivot);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		return new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		return new haxe.at.dotpoint.spatial.boundings.AABB(((haxe.at.dotpoint.math.vector.IVector3) (arr.__get(0)) ));
	}
	
	
	public void applyTransform(haxe.at.dotpoint.spatial.transform.ITransform transform, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 35 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		if ( ! (transform.hasRotation(space)) ) 
		{
			//line 37 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			this.applyOrthogonalTransform(transform, space);
		}
		else
		{
			//line 41 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			this.applyRotationTransform(transform, space);
		}
		
	}
	
	
	public void applyOrthogonalTransform(haxe.at.dotpoint.spatial.transform.ITransform transform, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 min = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 max = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 matrix = transform.getMatrix(null, space);
		//line 57 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(this.value.get_min(), matrix, min);
		//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(this.value.get_max(), matrix, max);
		//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_min().set_x(java.lang.Math.min(min.x, max.x));
		//line 63 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_min().set_y(java.lang.Math.min(min.y, max.y));
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_min().set_z(java.lang.Math.min(min.z, max.z));
		//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_max().set_x(java.lang.Math.max(min.x, max.x));
		//line 67 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_max().set_y(java.lang.Math.max(min.y, max.y));
		//line 68 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.get_max().set_z(java.lang.Math.max(min.z, max.z));
	}
	
	
	public void applyRotationTransform(haxe.at.dotpoint.spatial.transform.ITransform transform, haxe.at.dotpoint.math.geom.Space space)
	{
		//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 min = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 77 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 max = new haxe.at.dotpoint.math.vector.Vector3(null, null, null, null);
		//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 tlf = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_LEFT_FRONT, null)) );
		//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 trf = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_RIGHT_FRONT, null)) );
		//line 83 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 blf = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.BOTTOM_LEFT_FRONT, null)) );
		//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 brf = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.BOTTOM_RIGHT_FRONT, null)) );
		//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 tlb = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_LEFT_BACK, null)) );
		//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 trb = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.TOP_RIGHT_BACK, null)) );
		//line 88 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 blb = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.BOTTOM_LEFT_BACK, null)) );
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3 brb = ((haxe.at.dotpoint.math.vector.Vector3) (this.value.getPoint(haxe.at.dotpoint.math.AxisRelative.BOTTOM_RIGHT_BACK, null)) );
		//line 93 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.IMatrix44 matrix = transform.getMatrix(null, space);
		//line 95 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(tlf, matrix, tlf);
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(trf, matrix, trf);
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(blf, matrix, blf);
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(brf, matrix, brf);
		//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(tlb, matrix, tlb);
		//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(trb, matrix, trb);
		//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(blb, matrix, blb);
		//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		haxe.at.dotpoint.math.vector.Vector3.multiplyMatrix(brb, matrix, brb);
		//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value = java.lang.Math.min(tlf.x, java.lang.Math.min(trf.x, java.lang.Math.min(blf.x, brf.x)));
			//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.x = value;
		}
		
		//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value1 = java.lang.Math.min(min.x, java.lang.Math.min(tlb.x, java.lang.Math.min(trb.x, java.lang.Math.min(blb.x, brb.x))));
			//line 108 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.x = value1;
		}
		
		//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value2 = java.lang.Math.min(tlf.y, java.lang.Math.min(trf.y, java.lang.Math.min(blf.y, brf.y)));
			//line 110 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.y = value2;
		}
		
		//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value3 = java.lang.Math.min(min.y, java.lang.Math.min(tlb.y, java.lang.Math.min(trb.y, java.lang.Math.min(blb.y, brb.y))));
			//line 111 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.y = value3;
		}
		
		//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value4 = java.lang.Math.min(tlf.z, java.lang.Math.min(trf.z, java.lang.Math.min(blf.z, brf.z)));
			//line 113 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.z = value4;
		}
		
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value5 = java.lang.Math.min(min.z, java.lang.Math.min(tlb.z, java.lang.Math.min(trb.z, java.lang.Math.min(blb.z, brb.z))));
			//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			min.z = value5;
		}
		
		//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value6 = java.lang.Math.max(tlf.x, java.lang.Math.max(trf.x, java.lang.Math.max(blf.x, brf.x)));
			//line 118 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.x = value6;
		}
		
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value7 = java.lang.Math.max(max.x, java.lang.Math.max(tlb.x, java.lang.Math.max(trb.x, java.lang.Math.max(blb.x, brb.x))));
			//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.x = value7;
		}
		
		//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value8 = java.lang.Math.max(tlf.y, java.lang.Math.max(trf.y, java.lang.Math.max(blf.y, brf.y)));
			//line 121 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.y = value8;
		}
		
		//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value9 = java.lang.Math.max(max.y, java.lang.Math.max(tlb.y, java.lang.Math.max(trb.y, java.lang.Math.max(blb.y, brb.y))));
			//line 122 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.y = value9;
		}
		
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value10 = java.lang.Math.max(tlf.z, java.lang.Math.max(trf.z, java.lang.Math.max(blf.z, brf.z)));
			//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.z = value10;
		}
		
		//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			double value11 = java.lang.Math.max(max.z, java.lang.Math.max(tlb.z, java.lang.Math.max(trb.z, java.lang.Math.max(blb.z, brb.z))));
			//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			max.z = value11;
		}
		
		//line 129 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		this.value.setExtensions(min, max, null);
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			switch (field.hashCode())
			{
				case -394506304:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyRotationTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "applyRotationTransform")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
				case 1232536478:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "applyTransform")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
				case -1997577563:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyOrthogonalTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "applyOrthogonalTransform")) );
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		{
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			boolean __temp_executeDef1 = true;
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			switch (field.hashCode())
			{
				case -394506304:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyRotationTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						this.applyRotationTransform(((haxe.at.dotpoint.spatial.transform.ITransform) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
				case 1232536478:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						this.applyTransform(((haxe.at.dotpoint.spatial.transform.ITransform) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
				case -1997577563:
				{
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					if (field.equals("applyOrthogonalTransform")) 
					{
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						__temp_executeDef1 = false;
						//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
						this.applyOrthogonalTransform(((haxe.at.dotpoint.spatial.transform.ITransform) (dynargs.__get(0)) ), ((haxe.at.dotpoint.math.geom.Space) (dynargs.__get(1)) ));
					}
					
					//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
					break;
				}
				
				
			}
			
			//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
			if (__temp_executeDef1) 
			{
				//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 14 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\at\\dotpoint\\spatial\\boundings\\AABB.hx"
		return null;
	}
	
	
}


