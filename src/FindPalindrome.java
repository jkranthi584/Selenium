import java.util.ArrayList;
import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* System.out.println("Enter a string to find out ifs its palindrome or not");
		Scanner user = new Scanner(System.in);
		String race =user.nextLine();
		String res="";*/
	/*	
		for(int i=race.length()-1; i>=0; i--) {
 		   res+=race.charAt(i);
 		  
 	   }
 	   if(res.equalsIgnoreCase(race))
 		  System.out.println(res+":  String is palindrome");
 	   else {
 		   System.out.println(res+": is not palindrome will find a palindrome for your string...");
 	     do {
 	    	 for(int i=race.length()-1; i>=0; i--) {
 	    		 
 	    	     race+=race.charAt(i);	 
 	    	 }
 	     }while(!race.equalsIgnoreCase(race));
 	     
 	   System.out.println(race);
	   }*/
		//g ni rts
 /*	String k=  "I Am Not String";
 	char ch[]=   k.toCharArray();
 	char []resAr = new char[ch.length-1];
 	for(int i=0;i <ch.length;i++) {
 	    if(ch[i] == ' ')
        resAr[i]= ' ';
 	}	*/
  
         
	 // int ar[]= {1,2,4,5,6,8,9};
	      //  arryFunc(ar,1);
	        int arr[] = new int[8];
	      //  genArray(arr,5);
	        int n=8;
	        int[] ar={1, 4, 5, 3, 7, 8, 6};
	        int sumOfNumbers = sumOfNumbers(n);
	        int sumOfElements = sumOfElements(ar);
	        int missingNumber = sumOfNumbers - sumOfElements;
	        System.out.println("Missing Number is: "+missingNumber);
	}//1235678
	public static void arryFunc(int[] arr, int num) {
		System.out.println(arr.length);
		         
		ArrayList<Integer> ab = new ArrayList<Integer>();
			 for(int i=0; i<arr.length; i++) {
			   if(i<=arr.length-2 && arr[i]!=num)
				      continue;
			  
             else 
			    if(arr[i]==num)  
			  {
				  System.out.println("number is present "+num);
				  break;
			  }
			    else
			    	if(i==arr.length-1 && arr[i] != num)
				 System.out.println("number is not present");
			    	
		 }
	}	 
			 public static void genArray(int arr[], int num) {
			    
			    for(int i=1; i<arr.length; i++)
			    {
			      	  if(i==num)
			    		arr[i]=arr.length;
			      	  else
			    	    arr[i]=i;
			    
			       System.out.print(arr[i]);
			    }
			 
			 
		}
			 public static int sumOfNumbers(int n) {
				 int sum = (n*(n+1))/2;
				 return sum;
			 }
			 
			 public static int sumOfElements(int[] arr) {
				 int sum=0;
			for(int i=0;i<arr.length;i++)
				sum+= arr[i];
			    return sum;
			 }
	}




