package javastring;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		String gh = "sd12fsd1";
		char[] fj = gh.toCharArray();
	     Arrays.sort(fj);
		for (int i = 0;i<10;i++)
		{	
		 boolean dh =  Character.isDigit(fj[i]);
		  
			System.out.println(dh);
		}		
		
	}

}
