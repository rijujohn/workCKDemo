package javastring;

public class initialcheck {
public static void main(String[] args) {	
	
	StringBuffer sName = new StringBuffer("riju samuel john");
	StringBuffer sInitialName = new StringBuffer();
	
	for (int i = 0;i<sName.length();i++)
	{
	//	char bn = sName.charAt(i);
		if (Character.isUpperCase(sName.charAt(i)));
		{
			
			sInitialName = sInitialName.append(sName.charAt(i));
			
			
		}
	}
	
	
		System.out.println(sInitialName);
		
		
	}
}
