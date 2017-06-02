package looping;

import java.io.IOException;

public class exceptionProp {
		  void m() throws IOException{  
		    throw new java.io.IOException("device error");//checked exception  
		    
		    
		  }  
		  void n() throws IOException{ 
			  try{  
		    m();  
			  }catch(Exception e){System.out.println("exception handeled");}
		  }  
		  void p() throws IOException{  
		  // try{  
		    n();  
		//   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
	
	
public static void main(String[] args) throws IOException 
{
	exceptionProp obj=new exceptionProp();  
	   obj.p();  
	   System.out.println("normal flow");  
	
	}

}
