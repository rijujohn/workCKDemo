package javaclass;

public class anonyInnerImplementatoion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		anonyInnerClasswithInterface iem = new anonyInnerClasswithInterface() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("I am eating");
			}
			
			@Override
			public void drink() {
				// TODO Auto-generated method stub
				System.out.println("I am drinking");
			}
		};
		
		iem.drink();
		iem.eat();
	}

}
