package looping;

public class Testwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean  i = true;
		while(i)
		{
			System.out.println("How is the life");
			
		i = false;
		}
		
	
		int maxRange = 21;
		if (maxRange % 2 == 0 )
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime");
		}
				
		
		
		
		
		String dfg = "";
		
		Integer palui = 12321;
		String hj = Integer.toString(palui);
		int remNo = palui;
		for (int fi = 0 ;fi<hj.length();fi++)
		{int back = remNo%10;
		 dfg = dfg+back;
		 remNo = remNo/10;
		System.out.println(dfg);
		
		}
		int dfgh = Integer.parseInt(dfg);
		if (palui == dfgh)
		{
			System.out.println("Yes");
		}
		
		////Factorial
		int h = 20;
		int f = 21;
		int c = (h>f)?h:f;
		System.out.println(c);
		
	}
	


	
	

}
