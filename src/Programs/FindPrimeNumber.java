package Programs;

import java.util.Scanner;

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
			if(temp==0){
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime) System.out.println("number "+num+" is a prime number");
		else System.out.println(num+"is not a prime number");
		
	}

}
