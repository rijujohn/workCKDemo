package javaclass;

public class ClassImplementaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		immutableClass cl1 = new immutableClass("12134","RijuJohn");
		
		System.out.println(cl1);
		
	
		
		//cl1.EmployeePan = "dsf";
		System.out.println(cl1.getpan());
	//	System.out.println(cb.getpan());
		
		classcounter cv = new classcounter();
		
		classcounter cv2 = new classcounter();		
				
		int val = staticmethod.calcube(2); 
		System.out.println(val);
		
		Rectangle rec1 = new Rectangle();
		rec1.setBreadth(12);
		rec1.setlength(14);
		
	//	Rectangle.classcounts();
      System.out.println(rec1.calculateArea());
		
	}

}
