package javaclass;



class df{  
 int speedlimit=90;  
}  
class Honda3 extends df{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  df obj=new Honda3();  
  System.out.println(obj.speedlimit);//90  
}  
}
