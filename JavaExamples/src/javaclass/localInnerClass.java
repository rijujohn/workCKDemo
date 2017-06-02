package javaclass;
//local inner class , the  inner class is defined in the method of the
//main class
public class localInnerClass {

	void eat()
	{
		System.out.println("going to eat today from main method");
		
		class eater
		{
			void eating()
			{System.out.println("going to eating today from the local inner"); }
			
		}
		eater et = new eater();
		et.eating();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		localInnerClass obh = new localInnerClass();
		obh.eat();
		
	}

}
