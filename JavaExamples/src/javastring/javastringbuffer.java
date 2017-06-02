package javastring;

public class javastringbuffer {

	public static void main(String[] args)
	{
	StringBuffer gh = new StringBuffer();
	StringBuffer hj = new StringBuffer(5);
	
	hj.append("sdfsadf");
	hj.append("121sdfsadf");
	System.out.println(hj);
	
	hj.deleteCharAt(1);
	System.out.println(hj);
	
	hj.insert(2, "Riju");
	System.out.println(hj);
	
	hj.replace(2, 4, "BijuJohn");
	
	System.out.println(hj);
	
      hj.reverse();
	
	System.out.println(hj);
	System.out.println(hj.capacity());
	System.out.println(hj.length());
	hj.ensureCapacity(100);
	
	System.out.println(hj.capacity());
	System.out.println(hj.length());
	
	
	}
}
