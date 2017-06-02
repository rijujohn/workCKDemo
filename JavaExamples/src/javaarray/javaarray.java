
package javaarray;

class javaarray{  
public static final void main(String args[]){  
  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
 int le =  arr.length;
//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
  

int arb[][] = new int [3][3] ;
int crb[][] = new int [3][3] ;

System.arraycopy(arr, 0, arb, 0, 3);

for(int i=0;i<3;i++){  
	 for(int j=0;j<3;j++){  
	   System.out.print(arb[i][j]+" ");  
	 } 
	 System.out.println();

}	 
//adding 2 matrixs
	 
	 for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   crb[i][j] = arb[i][j]+arr[i][j];
		   System.out.print(crb[i][j]+" ");  
		 }  

		 System.out.println();
} 


}}
