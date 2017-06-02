package javacollec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.namespace.QName;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> LW =  new ArrayList<String>();
		LW.add("rAVI");
		LW.add("vijay");
		LW.add("HENRY");

		ArrayList<Double> LWD =  new ArrayList<Double>();
		LWD.add(1.09);
		LWD.add(1.55);
		LWD.add(1299.55);
		System.out.println(LWD.get(1)+LWD.get(2));
		
		//if generics is not specified , we can add anything , not recommended
		
		ArrayList LWM =  new ArrayList<String>();
		LWM.add("RIJU");
		LWM.add(1);
		LWM.add(true);
		LWM.add(1.008);
		
		System.out.println(LWM.toString());
		
		LW.remove(1);
		System.out.println(LW.toString());
		LW.add("vijay");
		System.out.println(LW.toString());
		
		LW.add("TIGER");
		
		Iterator itr = LW.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		LW.add("hen");
		for (String i:LW)
		{
			System.out.println(i);
		}
		
		
		
		ArrayList<String> bn = new ArrayList<String>();
		bn.add("tWER");
		bn.add("pen");
		bn.add(0,"paper");
		
		//LW.addAll(bn);
        
		
			
		//QName
		
		System.out.println(bn.toString());
		
		//LW.removeAll(bn);
		System.out.println(LW.toString());
		
		
	}

}
