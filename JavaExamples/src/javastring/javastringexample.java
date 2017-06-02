package javastring;

import java.util.Arrays;

import com.sun.jna.platform.win32.WinDef.CHAR;

public class javastringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hj = new String();
		hj = "How are you";
		
		String hj2 = new String();
		hj2 = "Man";
		
		StringBuilder SB = new StringBuilder("Able was I ere I saw Elba.");
		System.out.println(SB.length());
		System.out.println(SB.charAt(3));
		
		System.out.println(SB.substring(3,6));
		
		System.out.println(hj.concat(hj2));
		
		
		
		String hjm = "How ARE you How";
//		String hjm2 = "How ARE you now";
		
		if (hjm.contains("Howe"))
			{
			System.out.println("Yes");
			}
		System.out.println(hjm.substring(2,8));
		//System.out.println(hjm.join("", "df"));
		
		String hjg = hjm.replace("How", "now");
		String hjgk = hjg.toUpperCase();
		
		String m = 60 + 60 + "Riju" + 78;
		
		
		System.out.println(hjg);
		System.out.println(hjgk);
		System.out.println(m);
		System.out.println(hjgk.startsWith("hOW"));
		
		 hjm = "s";
		if (hjm.isEmpty())
		{
		System.out.println("Yes");
		}
		
		String gh = "aellodb";
		String ghm = "Hello";		
		
		System.out.println(gh.compareTo(ghm));
		System.out.println(gh.endsWith("db"));
		
		String name = "sdgfd";
		String hvj = String.format("sdf %s", name);
		String hvj2 = String.format("sdf %f", 123.78);
		String hvj3 = String.format("sdf %d", 123);
		System.out.println(hvj);
		System.out.println(hvj2);
		System.out.println(hvj3);
		
		String s1="sad42453";  
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
		System.out.println(barr[i]);  
		}  
		
		System.out.println(barr.toString());
		
		
		
		
		String s = "sdfdsfddfasdwfs";
		char [] ch = new char[10];
		s.getChars(2, 10, ch, 0);
		
		System.out.println(ch);
		
		String hasj = String.join("44", "sdf","wekcom","gole");
		
		System.out.println(hasj);
		
		
		System.out.println(s.lastIndexOf('s'));
		
		
		
		String S1 = "bdac";
		char[] cv = S1.toCharArray();
		Arrays.sort(cv);
		String sorted = new String(cv);
		System.out.println(sorted);
		
		
	}

}
