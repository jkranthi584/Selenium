package Qedge;

import java.util.Scanner;

public class Multiplyint_Matrices1 {
	
	public static void main(String[] args) {
		
		int r,c,r2,c2,i,j,sum=0, k;
		System.out.println("Enter the no of rows and column");
		Scanner input = new Scanner(System.in);
		 r=input.nextInt();
		 c=      input.nextInt();
		 int first[][] = new int[r][c];
		 System.out.println("Enter the number of Elements");
		 for(i=0; i<r; i++)
			 for(j=0; j<c; j++)
				 
		       first[i][j]=input.nextInt();
		 
		 System.out.println("Enter the no of rows and columns");
		 
	        r2=input.nextInt();
	        c2=input.nextInt();
	        if(c!=r2)
	        System.out.println("Entered Matrices cannot be multiplied");
	        else{
	        	System.out.println("Enter no of elements for second Matrix");
	        	int second[][] = new int[r2][c2]
;
	               int multiply[][] = new int[r][c2];
	              // System.out.println("Enter no of elements for second Matrix");
	               
	               for(i=0; i<r2; i++)
	            	   for(j=0; j<c2; j++)
	            		 second[i][j] = input.nextInt();
	                   for(i=0; i<r;i++){
	                	   for(j=0;j<c2; j++){
	                		   
	                		   for(k=0; k<c; k++){
	                			   
	                			   sum= sum + first[i][k] * second[k][j];
	                		   }
	                		   multiply[i][j]=sum;
	                		   sum=0;
	                		   
	                	   }
	                   } 
	                	   
	                	  System.out.println("Multiplication of Entered Matrices: ");
	                   
	                      for(i=0; i<r; i++){
	                    	  
	                    	  for(j=0; j<c2; j++){
	                    		  
	                    		  System.out.print(multiply[i][j]+" \t");
	                    	  }
	                    	  System.out.println("\n");
	                    	  
	                      }
	                   
	               
	               
	        }
	}

}
