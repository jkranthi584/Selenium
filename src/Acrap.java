
public class Acrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		boolean isPrime =true;
		
		int num=0;
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



