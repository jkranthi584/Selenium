package Qedge;

import java.util.Scanner;

public class MatricesCrap {
public static void main(String[] args) {
	
	int i,j,k,m,n,p,q,sum=0;
	System.out.println("Enter no of row and col");
 Scanner input = new Scanner(System.in);
 m=input.nextInt();
 n=input.nextInt();
 int first[][] = new int[m][n];
    System.out.println("Enter no of elements ");
	for(i=0; i<m; i++)
		for(j=0; j<n; j++)
			first[i][j]=input.nextInt();
	         
	        
	System.out.println("Enter no. of rows and column for second matrix");
	 p=input.nextInt();
	 q=input.nextInt();
	         if(n!=p)
	        	 System.out.println("Matrices entered cannot be multiplied");
	         else{
	        	 System.out.println("enter no of element for the 2nd Matrix");
	        	 int second[][] = new int[p][q];
	        	 int multiply[][] = new int[m][q];
	        	 
	        	 for(i=0; i<p; i++)
	        		  for(j=0; j<q; j++)
	        			  
	        			  second[i][j]=input.nextInt();
	        	     for(i=0; i<m; i++){
	        	    	 for(j=0; j<q; j++){
	        	    		 
	        	    		 for(k=0; k<p;k++){
	        	    			 
	        	    			 sum = sum + first[i][k] * second [k][j];
	        	    		 }
	        	    		 multiply[i][j]=sum;
	        	    		 sum=0;
	        	    	 }
	        	    	
	         }
	        	     System.out.println("product of Entered Matrices: ");
	        	     for(i=0; i<m; i++){
	        	    	 
	        	    	 for(j=0; j<q; j++){
	        	    		 System.out.print(multiply[i][j]+"  \t");
	        	    	 }
	        	    	 System.out.println("\n");
	        	     }
	           
     }
}
}
