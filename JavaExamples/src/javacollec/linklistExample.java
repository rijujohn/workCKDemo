package javacollec;

import java.util.LinkedList;
import java.util.Comparator;

public class linklistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> dfg = new LinkedList<String>();
		
		dfg.add("ahrnfy");
		dfg.add("chrnfy2");
		dfg.add("bhrnfy3");
		dfg.add("ahrnfy4");
		
		System.out.println(dfg.toString());
		dfg.addFirst("pen");
		dfg.sort(Comparator.reverseOrder());
		dfg.removeFirst();
		dfg.sort(Comparator.naturalOrder());
		dfg.removeFirst();
		System.out.println(dfg.toString());
		System.out.println("item at location 0 "+dfg.get(0));

	}

}
