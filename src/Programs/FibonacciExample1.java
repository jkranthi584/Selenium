package Programs;

import java.util.Scanner;

public class FibonacciExample1 {
	public static void main(String[] args) {
		
		
		/*int count =7;
		int num1=0, num2=1;
		System.out.println("Fibonacci Series of "+count+" numbers");
		
		int i=1;
		while(i<=count){
			
			System.out.print(num1+" ");
			
			   int sumofprevtwo = num1 + num2;
			     num1 = num2;
			     num2=sumofprevtwo;
			     i++;
			     }*/
		
		
		int count, num1=0,num2=1;
		
		         /*  System.out.println("How many nuumber you want insequence");
		           Scanner user = new Scanner(System.in);
		           
		           count =user.nextInt();
		       	System.out.println("Fibonacci Series of "+count+" numbers");
				*/
		         //  int i=1;
		          /* while(i<=count){
		        	   System.out.print(num1+" ");
		        	   int sumofPrevTwo = num1 + num2;
		        	    num1 = num2;
		        	    num2 = sumofPrevTwo;
		        	    i++;
		           }*/
		           /*
		           for(i=1; i<=count; i++){
		        	   
		        	   System.out.print(num1+" ");
		        	   
		        	   int sumofprevtwo = num1 + num2;
		        	    num1=num2;
		        	    num2=sumofprevtwo;
		        	    
		           }*/
		            
		        /*   System.out.println("enter to find out is numeber a prfct not ");
				    Scanner u = new Scanner(System.in);
			      */
		             
		          for(int i=8; i>0; i--) {
		        	  for(int j=1;j<i; j++)
		        		  System.out.print(j+" ");
		        	  System.out.println();
		          }
		          for(int i=1; i<8; i++) {
		        	 for(int j=i; j<=i; j++)
		        		 System.out.print(j);
		        	 System.out.println();
		          }
		}
		
	}


