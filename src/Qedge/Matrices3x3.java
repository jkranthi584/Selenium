package Qedge;

import java.util.Scanner;

public class Matrices3x3 {
public static void main(String[] args) {
	
	int i,j,k,r,c,ro,co,sum=0;
	
	System.out.println("Enter no of rows and columns");
	Scanner input= new Scanner(System.in);
	
     r=input.nextInt();
     c=input.nextInt();
    
     int first[][] = new int[r][c];
     System.out.println("Enter no of elements for FirstMatrix");
     for(i=0; i<r; i++)
    	 
      for(j=0; j<c; j++)
    	  first[i][j]=input.nextInt();
     System.out.println("Enter no of rows and column");
    
     ro=input.nextInt();
     co=input.nextInt(); 
   
     if(c!=ro)
    	 System.out.println("Enter Matrix caanot be multiplied");
     else{
    	
     int second[][] = new int[ro][co];
     int multiply[][] = new int[r][co];
     
	 System.out.println("Enter no of elements for second Matrix");
     for(i=0; i<ro; i++)
    	 for(j=0; j<co; j++)
    	second[i][j]=	 input.nextInt();
     
        for(i=0; i<r;i++){
        	
        	for(j=0; j<co; j++){
        		
              for(k=0; k<c; k++){
            	  
            	  sum=sum + first[i][k] * second[k][j];
            	  
              }
              multiply[i][j] = sum;
              sum= 0;
              
                 
        	}
        }
    
        System.out.println("Multiplication of the Entered Matrix");
        
        for(i=0; i<r; i++){
        	
        	for(j=0; j<co; j++){
        		
        	System.out.print(+multiply[i][j]+"\t");
        	}
        	System.out.println("\n");
        }
       
     
     }    
}
}
