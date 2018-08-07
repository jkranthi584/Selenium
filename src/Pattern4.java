import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       for(int i=1; i<7; i++) {
    	   for(int j=1; j<i; j++)
    		   System.out.print(j);
    	   System.out.println();
       }
       System.out.println();
       for(int i=7; i>0; i--) {
    	   for(int j=1; j<i; j++)
    		   System.out.print(j);
    	   System.out.println();
       }
        System.out.println();
        System.out.println("enter a number");
       Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<num; i++) {
        	for(int j=num; j>i; j--)
        		System.out.print(j);
        	System.out.println();
        	//System.out.println(i);
        	;
        }
        
        for(int i=2; i<9; i++) {
        	for(int j=8; j>=i; j--)
        		System.out.print(j);
        	    System.out.println();
        }
    
     }
	}



