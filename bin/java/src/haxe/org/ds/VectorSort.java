package haxe.org.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VectorSort extends haxe.lang.HxObject
{
	public VectorSort(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public VectorSort()
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.__hx_ctor_haxe_org_ds_VectorSort(this);
	}
	
	
	public static void __hx_ctor_haxe_org_ds_VectorSort(haxe.org.ds.VectorSort __temp_me112)
	{
	}
	
	
	public static <T> void sort(T[] a, haxe.lang.Function cmp)
	{
		//line 45 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.rec(a, cmp, 0, ((T[]) (a) ).length);
	}
	
	
	public static <T> void rec(T[] a, haxe.lang.Function cmp, int from, int to)
	{
		//line 49 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int middle = ( ( from + to ) >> 1 );
		//line 50 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		if (( ( to - from ) < 12 )) 
		{
			//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			if (( to <= from )) 
			{
				//line 51 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				return ;
			}
			
			//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			{
				//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				int _g = ( from + 1 );
				//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				while (( _g < to ))
				{
					//line 52 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
					int i = _g++;
					//line 53 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
					int j = i;
					//line 54 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
					while (( j > from ))
					{
						//line 55 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
						if (( ((int) (cmp.__hx_invoke2_f(0.0, ((T) (((T[]) (a) )[j]) ), 0.0, ((T) (((T[]) (a) )[( j - 1 )]) ))) ) < 0 )) 
						{
							//line 56 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
							haxe.org.ds.VectorSort.swap(a, ( j - 1 ), j);
						}
						else
						{
							//line 58 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
							break;
						}
						
						//line 59 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
						j--;
					}
					
				}
				
			}
			
			//line 62 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			return ;
		}
		
		//line 64 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.rec(a, cmp, from, middle);
		//line 65 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.rec(a, cmp, middle, to);
		//line 66 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.doMerge(a, cmp, from, middle, to, ( middle - from ), ( to - middle ));
	}
	
	
	public static <T> void doMerge(T[] a, haxe.lang.Function cmp, int from, int pivot, int to, int len1, int len2)
	{
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int first_cut = 0;
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int second_cut = 0;
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int len11 = 0;
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int len22 = 0;
		//line 70 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int new_mid = 0;
		//line 71 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		if (( ( len1 == 0 ) || ( len2 == 0 ) )) 
		{
			//line 72 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			return ;
		}
		
		//line 73 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		if (( ( len1 + len2 ) == 2 )) 
		{
			//line 74 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			if (( ((int) (cmp.__hx_invoke2_f(0.0, ((T) (((T[]) (a) )[pivot]) ), 0.0, ((T) (((T[]) (a) )[from]) ))) ) < 0 )) 
			{
				//line 75 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				haxe.org.ds.VectorSort.swap(a, pivot, from);
			}
			
			//line 76 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			return ;
		}
		
		//line 78 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		if (( len1 > len2 )) 
		{
			//line 79 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			len11 = ( len1 >> 1 );
			//line 80 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			first_cut = ( from + len11 );
			//line 81 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			second_cut = ((int) (haxe.org.ds.VectorSort.lower(a, cmp, pivot, to, first_cut)) );
			//line 82 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			len22 = ( second_cut - pivot );
		}
		else
		{
			//line 84 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			len22 = ( len2 >> 1 );
			//line 85 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			second_cut = ( pivot + len22 );
			//line 86 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			first_cut = ((int) (haxe.org.ds.VectorSort.upper(a, cmp, from, pivot, second_cut)) );
			//line 87 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			len11 = ( first_cut - from );
		}
		
		//line 89 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.rotate(a, cmp, first_cut, pivot, second_cut);
		//line 90 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		new_mid = ( first_cut + len22 );
		//line 91 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.doMerge(a, cmp, from, first_cut, new_mid, len11, len22);
		//line 92 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		haxe.org.ds.VectorSort.doMerge(a, cmp, new_mid, second_cut, to, ( len1 - len11 ), ( len2 - len22 ));
	}
	
	
	public static <T> void rotate(T[] a, haxe.lang.Function cmp, int from, int mid, int to)
	{
		//line 96 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int n = 0;
		//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		if (( ( from == mid ) || ( mid == to ) )) 
		{
			//line 97 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			return ;
		}
		
		//line 98 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		n = haxe.org.ds.VectorSort.gcd(( to - from ), ( mid - from ));
		//line 99 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		while (( n-- != 0 ))
		{
			//line 100 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			T val = ((T) (((T[]) (a) )[( from + n )]) );
			//line 101 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			int shift = ( mid - from );
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			int p1 = ( from + n );
			//line 102 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			int p2 = ( ( from + n ) + shift );
			//line 103 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			while (( p2 != ( from + n ) ))
			{
				//line 104 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				((T[]) (a) )[p1] = ((T) (((T[]) (a) )[p2]) );
				//line 105 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				p1 = p2;
				//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				if (( ( to - p2 ) > shift )) 
				{
					//line 106 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
					p2 += shift;
				}
				else
				{
					//line 107 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
					p2 = ( from + (( shift - (( to - p2 )) )) );
				}
				
			}
			
			//line 109 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			((T[]) (a) )[p1] = val;
		}
		
	}
	
	
	public static int gcd(int m, int n)
	{
		//line 114 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		while (( n != 0 ))
		{
			//line 115 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			int t = ( m % n );
			//line 116 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			m = n;
			//line 117 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			n = t;
		}
		
		//line 119 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return m;
	}
	
	
	public static <T> int upper(T[] a, haxe.lang.Function cmp, int from, int to, int val)
	{
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int len = ( to - from );
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int half = 0;
		//line 123 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int mid = 0;
		//line 124 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		while (( len > 0 ))
		{
			//line 125 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			half = ( len >> 1 );
			//line 126 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			mid = ( from + half );
			//line 127 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			if (( ((int) (cmp.__hx_invoke2_f(0.0, ((T) (((T[]) (a) )[val]) ), 0.0, ((T) (((T[]) (a) )[mid]) ))) ) < 0 )) 
			{
				//line 128 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				len = half;
			}
			else
			{
				//line 130 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				from = ( mid + 1 );
				//line 131 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				len = ( ( len - half ) - 1 );
			}
			
		}
		
		//line 134 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return from;
	}
	
	
	public static <T> int lower(T[] a, haxe.lang.Function cmp, int from, int to, int val)
	{
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int len = ( to - from );
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int half = 0;
		//line 138 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		int mid = 0;
		//line 139 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		while (( len > 0 ))
		{
			//line 140 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			half = ( len >> 1 );
			//line 141 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			mid = ( from + half );
			//line 142 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
			if (( ((int) (cmp.__hx_invoke2_f(0.0, ((T) (((T[]) (a) )[mid]) ), 0.0, ((T) (((T[]) (a) )[val]) ))) ) < 0 )) 
			{
				//line 143 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				from = ( mid + 1 );
				//line 144 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				len = ( ( len - half ) - 1 );
			}
			else
			{
				//line 146 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
				len = half;
			}
			
		}
		
		//line 148 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return from;
	}
	
	
	public static <T> void swap(T[] a, int i, int j)
	{
		//line 152 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		T tmp = ((T) (((T[]) (a) )[i]) );
		//line 153 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		((T[]) (a) )[i] = ((T) (((T[]) (a) )[j]) );
		//line 154 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		((T[]) (a) )[j] = tmp;
	}
	
	
	public static <T> int compare(T[] a, haxe.lang.Function cmp, int i, int j)
	{
		//line 158 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return ((int) (cmp.__hx_invoke2_f(0.0, ((T) (((T[]) (a) )[i]) ), 0.0, ((T) (((T[]) (a) )[j]) ))) );
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return new haxe.org.ds.VectorSort(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 32 "D:\\Projects\\Arbeit\\Greentube\\Hackathon\\Thnx\\lib\\dotCore\\src\\main\\haxe\\org\\ds\\VectorSort.hx"
		return new haxe.org.ds.VectorSort();
	}
	
	
}


