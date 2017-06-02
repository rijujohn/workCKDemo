package javacollec;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistwithclass {
	
	public static void main(String[] args) {
	
	studentclass st1 = new studentclass(12, "Riju");
	studentclass st2 = new studentclass(14, "Ciju");
	studentclass st3 = new studentclass(15, "Biju");
	
	ArrayList<studentclass> AL = new ArrayList<studentclass>();
    AL.add(st1);
    AL.add(st2);
    AL.add(st3);

    Iterator ITR = AL.iterator();
    
    while (ITR.hasNext())
    {
    	studentclass NM = (studentclass)ITR.next();
    	System.out.println(NM.rollNo +","+ NM.Name);
    	
    }

	
	}

}
