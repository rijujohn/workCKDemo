package javastring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpressions {
	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("s...");
		Matcher m = p.matcher("sfdd");
		boolean b = m.matches();
		
		System.out.println(b);
		
		boolean b2 = Pattern.matches("[.a.]{4}", "faaaag");
		System.out.println(b2);
		
	}
}
