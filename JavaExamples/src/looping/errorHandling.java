package looping;

public class errorHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			try{
				System.out.println("Going to divide");
				int i = 30/0;
				System.out.println("Divition has been done");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("The division exception happened");
			}
		        try{
		        	int[] df = new int[4];
		        	df[4] = 7;
		        	//String gh = null;
		        	
		        //	System.out.println(gh);
	        	
		        }
	            catch(NullPointerException ax)
		        {
	            	System.out.println("Array out bound exception happened");
		        }
			
		}
		catch (Exception ee)
		{System.out.println("Everything hadled");}
	
	}

}
