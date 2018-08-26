import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Random rnd = new Random();
          for(int i=0; i<5; i++) {
        	 int number = rnd.nextInt(200)+1;
        	 System.out.println(number);
          }
		int[] arr={105,9,23,8,7,45,2,88,11,99};
		
		 for(int i=arr.length-1; i>=0; i--) {
			 if(i!=0)
			 System.out.print(arr[i]+", ");
			 else
				  System.out.println(arr[i]);
		 }
			  System.out.println();
	
			  boolean isPerfect=false;
			 int number =28;int temp=1;
			for(int j=2; j<=number/2; j++)
			{
				if(number % j == 0)
					temp += j;
				if(number==temp)
				{ isPerfect = true;
					break;
				}
				isPerfect = false;
			}
			System.out.println(temp);
		 if(isPerfect)
			 System.out.println("true");
		 else
			 System.out.println("its not a perfect number");
		 
		 
		 for(int i=1; i<10; i++) {
			 
			for(int j=1; j<=i; j++) {
			 
				   System.out.print(i);
			   
			}
			System.out.println();
		 }
		 
	
	}

}
