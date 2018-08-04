package Programs;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to find out is prime or not");
		Scanner user = new Scanner(System.in);
         
		int n; int status =1; int num=3;
	  n=user.nextInt();
	  if(n>=1){
		  System.out.println("First "+n+" prime numbers are: ");
		  // 2 is a known prime numbers so starts printing number from there
		  System.out.println(2);
	  }
	  
	  for(int i=2; i<=n;){
		   for(int j=2; j<=Math.sqrt(num); j++){
			   
			   if(num%j==0)
			   {
				   status=0;
				   break;
			   }
		   }
	     if(status!=0){
	    	 System.out.println("Print out the num: "+num);
	    	 i++;
	     }
	       status =1; num++;
	     
	  }
		
	}

}
