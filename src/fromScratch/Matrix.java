package fromScratch;

import java.util.Scanner;

public class Matrix {
	   public static void addMatrix() {
		   
	   }
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the numbers of rows and coloumns");
		 int row,col,sum=0;
		   int m=  input.nextInt();
		   int n=input.nextInt();
		   int [][] firstArray = new int[m][n];
		    System.out.println("enter no of elements for the first arrray");
		        for(row=0; row<m; row++) {
		        	for(col=0; col<n; col++)
		        		firstArray[row][col] = input.nextInt();
		        }
		        	System.out.println("Enter no of rows and columns");
		        	
		        	   int p=input.nextInt();
		        	   int q = input.nextInt();
		        	   
		        	   if(n!=p)
		        		   System.out.println("Enter matrix cannot be multiplied");
		        	   else {
		        		   System.out.println("enter no of elements for the second arrray");
		        	        int secondArray[][] = new int[p][q];
		        	          for(row=0; row<p; row++) {
		        		  for(col=0; col<q; col++)
		        			  secondArray[row][col] = input.nextInt();
		        		 
		        	  }
		        	  int multiplyMatrix[][] = new int[m][q];
		        	  
		        	    for(row=0; row<m; row++) {
		        	    	for(col=0; col<q; col++) {
		        	    		for(int iterator=0; iterator<n; iterator++)
		        	    			sum += firstArray[row][iterator] *secondArray[iterator][col];
		        	    		
		        	    		      multiplyMatrix[row][col]=sum;
		        	    		      sum=0;
		        	    		      
		        	    	}
		        	    }
		        	    System.out.println("Resulted matrix :");
		        	    
		        	    for(row=0; row<m; row++) {
		        	    	
		        	    	for(col=0; col<q; col++)
		        	    		System.out.print(multiplyMatrix[row][col]+"\t");
		        	    	System.out.println();
		        	    }
		        	    
		        	   }
		        
		    	     }
		    	     
		    	 }	 

