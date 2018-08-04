package Programs;

import java.util.Scanner;

public class ArraySum {
	
	
	public static void main(String[] args) {
		int sum=0;
		
		/*int arr[] = {8,9,7,6,5,3,3,2};
		
		for(int i=0; i<arr.length; i++){
			
			sum = sum+ arr[i];
		}
		
		System.out.println("the sum of array is "+sum);*/
		
		
		System.out.println("enter number of Array");
		Scanner user= new Scanner(System.in)
;
		
		   int m = user.nextInt();
		   
		  
		   int arr[] = new int[m];
		   
		   System.out.println("Enter number of elements for the array");
		   
		   for(int i=0; i<m; i++)
		    arr[i]=user.nextInt();
		  
		    
		  /* for(int i=0; i<arr.length; i++)*/
		  /* int i=0;
		   while(i<arr.length){
			   
			   sum = sum + arr[i];
			i++;   
		   }*/
		   for(int crap: arr)
			   sum = sum + crap;
		   
		   System.out.println("the sum of the array is: "+sum);
		   
		}

}
