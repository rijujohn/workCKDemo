package javacollec;

import java.util.LinkedList;
import java.util.ListIterator;

public class listiteratorexample {

	public static void main(String[] args){
	
	LinkedList<String> cvb = new LinkedList<String>();
    cvb.add("dep");
    cvb.add("dep1");
    cvb.add("dep2");
    cvb.add("dep3");
    cvb.add("dep4");
    cvb.add("dep5");
	
	
	ListIterator<String> SD = cvb.listIterator();
	while(SD.hasNext())
	{
		System.out.println(SD.next());
		
	}

	while(SD.hasPrevious())
	{
		System.out.println(SD.previous());
		
	}
	
	
	
	
	
	}
}
