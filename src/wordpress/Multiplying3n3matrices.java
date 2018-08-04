package wordpress;

import java.util.Scanner;

public class Multiplying3n3matrices {
	
	public static void main(String[] args) {
		
		int i,j,r,r2,c,c2,sum=0,k;
		
		System.out.println("enter no of row and columns");
		
		Scanner input = new Scanner(System.in);
		r=input.nextInt();
		c=input.nextInt();
		
		 System.out.println("Enter no of elements for the first Matrix");
		 
		    int first[][]= new int[r][c];
		    
		    for(i=0; i<r; i++)
		      for(j=0; j<c; j++)
		    	  first[i][j]=input.nextInt();
		    
		    System.out.println("Enter no of row and columns for the second Matrix");
		    r2=input.nextInt();
		    c2=input.nextInt();
		    if(c!=r2){
		    	System.out.println("Entered numbers cannot be multiplied");
		    }
		    else{
		    	
		    	System.out.println("Enter no of elements for the second Matrix");
		    	int second[][] = new int[r2][c2];
		    	int multiply[][]= new int[r][c2];
		    	for(i=0; i<r2; i++)
		    		for(j=0; j<c2; j++)
		    			second[i][j]=input.nextInt();
		    			for(i=0; i<r; i++){
		    				for(j=0; j<c2; j++){
		    					for(k=0; k<c; k++){
		    					
		    					sum= sum+ first[i][k] * second[k][j];
		    				}
		    					multiply[i][j]=sum;
		    					sum=0;
		    			}//multiply second for loop
		    				
		    				
		    	
		    }//multiply first for loop
	
		    System.out.println("printing out entered Matrices");
		    
		    for(i=0; i<r; i++){
		    	
		    	for(j=0;j<c2; j++)
		    		
		    		System.out.print(multiply[i][j]+"\t");
		    	 System.out.println("\n");
		    	
		    }
		 }//else 

     }
}