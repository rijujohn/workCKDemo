package Threads;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Duplicate Number
		int[] gh = {1,2,3,5,6,9,10};
		for(int i = 0;i<gh.length-1;i++)
		{
			int gj = gh[i];
			int mj = gh[i+1];
			int mjm = gj+1;
			if (mj!= mjm )
			{
				System.out.println("Missing"+ mjm);
				
			}
				//	Math.a
			System.out.println("df"+ gj+1);
		
			
			String fh = "123";
			int im = 30;
			
			int km = im + Integer.parseInt(fh);
			String kmG = String.valueOf(im) + fh;
			System.out.println(km);
			System.out.println(kmG);
			//String.format(l, format, args)
			
			
			String s = "30/11/2012";
			SimpleDateFormat ghp = new SimpleDateFormat("dd/mm/yyyy");
			//String date = ghp.format(new Date());
			Calendar c = Calendar.getInstance();
			c.setTime(new Date());
			c.add(Calendar.DATE, 5);
	//		System.out.println(date);
	}
	}

}
