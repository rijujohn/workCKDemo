package javaclass;

public class Rectangle {
	
	int length;
	int breadth;
	static int classcounts;
	
	public void setlength(int len)
	{
		this.length = len;
	}
	
	public void setBreadth(int breadth)
	{
		this.breadth = breadth;
	}

	public int calculateArea()
	{
		return length * breadth; 
	}
	
	public Rectangle()
	{
		classcounts = classcounts++;
	}
	
	
	
}
