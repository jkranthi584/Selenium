
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(factorial(5));
	}
        public static Integer factorial(int number) {
        	
        	if(number<=1)
        		return 1;
        	else
        		return number*factorial(number -1);
        }
}
