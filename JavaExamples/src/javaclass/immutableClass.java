package javaclass;

public final class immutableClass {

	final String EmployeePan;
	String EmployeeName;
	
	
	public immutableClass(String EmployeePan,String EmployeeName )
	{
		this.EmployeePan = EmployeePan;
		this.EmployeeName = EmployeeName;
		
	}
	
	public String getpan()
	{
		return EmployeePan;
		
	}
	
//	public String toString()
//	{
//		 return EmployeePan + EmployeeName;
//		
//	}
	

	
}
