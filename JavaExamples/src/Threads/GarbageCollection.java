package Threads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class GarbageCollection {
	
	
	
	
	public void finalize(){System.out.println("object is garbage collected");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Reverse String
		String asd = "Riju Samuel";
		String cc2 = "";
		char [] cc = asd.toCharArray();
		for(int i=cc.length - 1;i>-1;i--)
		{
			//cc[i]
			cc2 = cc2 +cc[i];
			
			
		}	
		
//Duplicate Number		
		int[] jk = {1,2,3,4,5,4,7,8,10,7,5,1,0,1};
		LinkedList<Integer> jl = new LinkedList<Integer>();
		LinkedList<Integer> jldu = new LinkedList<Integer>();
		for (int i = 0 ; i<jk.length;i++)
		{
			jl.add(jk[i]);
		
			
		}
		jl.sort(null);
		jl.sort(Comparator.naturalOrder());
		
		for (int i = 0 ; i<jl.size();i++)
		{
			int hj = jl.get(i);
			int hk = jl.get(i); //actual i+1
			
		   Integer gh = Integer.compare(hj, hk);
		    if(gh == 0)
		    {
		    //	System.out.println(hj);
		    	jldu.add(hj);
		    }
		//	System.out.println(gh);
		//	System.out.println(jldu.toString());
		}
		

		
		
		
		
		
		
		//System.out.println(jl.toString());
		ThreadEx1 ghw = new ThreadEx1();
		ThreadEx1 gh1 = new ThreadEx1();
		Thread gk = new Thread();
		ghw = null;
		gh1 = null;
		gk = null;
		System.gc();
		
	}

}
