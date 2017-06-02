package javacollec;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetwithclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bookclass bg = new bookclass(200, "Old Man", "Hemingway");
		bookclass bg4 = new bookclass(200, "Old Man", "Hemingway");
		bookclass bg2 = new bookclass(200, "Old Man1", "Hemingway1");
		bookclass bg3 = new bookclass(200, "Old Man2", "Hemingway2");
		
		
		HashSet<bookclass> HS = new HashSet<bookclass>();
		
		HS.add(bg);
		HS.add(bg2);
		HS.add(bg3);
		HS.add(bg4);
		
		
		Iterator it = HS.iterator();
		   while (it.hasNext())
		    {
			   bookclass NM = (bookclass)it.next();
		    	System.out.println(NM.Author +","+ NM.BookName+","+NM.noofPages);
		    	
		    }
		
		
		
		System.out.println(HS.toString());
		
		
		
		
		
	}

}
