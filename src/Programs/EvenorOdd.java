package Programs;

import java.util.Scanner;

public class EvenorOdd{
	
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in)
;
		System.out.println("Enter an Integer to check if its odd or even");
		
		int num = user.nextInt();
		
		
		if(num%2==0){
			
			System.out.println("Even number");
		}
		else{
			System.out.println("odd number");
		}
		
	}
}
