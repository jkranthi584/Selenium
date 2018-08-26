package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindPrimeNumber {
	
	public static void main(String[] args) {
		int temp;
		boolean isPrime =true;
		
		System.out.println("Enter the number to find out its prime or not");
		Scanner user = new Scanner(System.in);
		
		int num = user.nextInt();
		
		//why i=2,since 2 is a known prime number
		/*int i=2;
		while(i<=num/2){
			
			temp = num%i;
			if(temp==0){
				isPrime=false;
				break;
			}
			i++;
			
		}*/
		for(int i=2; i<=num/2; i++){
			
			temp = num%i;
			if(temp==0) {
			
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime) System.out.println("number "+num+" is a prime number");
		else System.out.println(num+"is not a prime number");
		
	     System.out.println("enter a number for fibonacci");
		 Scanner us = new Scanner (System.in);
		 int num1=0,num2=1;
		  int count = us.nextInt();
		  for(int i=1; i<count; i++ ) {
			  
			  
			  System.out.print(num1+" ");
			  
			
			  int sum = num1 + num2;
			  num1=num2;
			  num2=sum;
		  }
		  
		 String str ="olive";
		 String tempo ="";
		 for(int i=str.length()-1; i>=0; i--) {
			 
			 tempo += str.charAt(i);
		 }
		 if(tempo.equalsIgnoreCase(str))
			 System.out.println("is palindrome");
		 else
			 System.out.println(tempo+" is not palindrome");
		 
		 isPrime=true;
		 //enter a number to find out if its prime or not
		 int len=0;
		 //"memesklpjto"
		  char[] stro = "apdepsofhslijkmwudbz".toCharArray();
		  Map<Character,Integer> maps = new HashMap<Character,Integer>();
		   for(Character ch: stro) {
			   if(!maps.containsKey(ch))
				   maps.put(ch, 1);
			   else {
				   len=  Math.max(len, maps.size());
				      maps.clear();
				   
				    
			   }
		   }
			 
			 System.out.println("Map: "+maps);
			 System.out.println(Math.max(len, maps.size()));
		   
		  /*
		   Set<Character> keys = maps.keySet();
		   for(Character key:keys) {
			   
			   if(maps.get(key)>1)
				   System.out.println("dubplicate key: "+key+" repeated"+maps.get(key)+" times");
			   else
				   System.out.println(key+" is a unique");
		   }*/
		     int number1=1, number2=0;
		     System.out.println("enter to find out is numeber a prime or not ");
		    Scanner u = new Scanner(System.in);
		    
		 boolean   isPri = true;
		    int pcount = u.nextInt();
		    for(int i=2; i<=pcount/2; i++) {
		    	
		    int te = pcount %i;
		     if(te==0)
		     {
		    	 isPri = false;
		    	 break;
		     }
		    
		    if(isPri) System.out.println(pcount+ "its a prime Number");
	     }
		    
		    
		     
	}

}
