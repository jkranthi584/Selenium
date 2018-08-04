package Programs;

import java.util.Scanner;

public class Averagecalc {
   
	
	public static void main(String args[]) {
	       
	double total =0;    
		
	Scanner user = new Scanner(System.in);
	
	System.out.println("Enter how many digits you want an average of");
	 int numcount = user.nextInt();
	 
	  double arr[] = new double[numcount];
	  for(int i=0; i<arr.length; i++){
		  
		  System.out.println("Enter the Elements one by one "+(i + 1)+" :");
		  arr[i]= user.nextDouble();
	  }
	    user.close();
	    for(int i=0; i<arr.length; i++){
	    	
	    	total = total + arr[i];
	    	
	    }
	     double avg = total/arr.length;
	     
	     System.out.format("the average of numbers is %.3f", avg);
	
	}
}
