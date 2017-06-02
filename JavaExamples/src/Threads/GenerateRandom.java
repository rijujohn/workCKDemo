package Threads;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Random fg = new Random();
   for (int i = 0 ;i<10;i++)
   {  
     System.out.println(fg.nextInt(1000));
   }	}

}
