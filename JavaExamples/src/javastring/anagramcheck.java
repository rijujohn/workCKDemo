package javastring;

import java.util.Arrays;

public class anagramcheck {
	public static void main(String[] args) {	
	
	String gh = new String();
	String gh2 = new String();
	
	gh = "gsdf";
	gh2 = "gdfs";
	
	//char[] charArray = string.t
	
			 char[] charArray = gh.toCharArray();
			 Arrays.sort(charArray);
			 System.out.println(charArray);
			 
			 
			 char[] charArray2 = gh2.toCharArray();
			 Arrays.sort(charArray2);
			 System.out.println(charArray2);
			 
			 String ghh = new String(charArray);
				String ghh2 = new String(charArray2);
			 
			 
			 
			 
			 
			if (ghh.equals(ghh2))
				{
				System.out.println("It is anagram");
				}
				else
				{		
				System.out.println("It is not anagram");
				}
			 
	}
}
