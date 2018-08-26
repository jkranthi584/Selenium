
public class FindTwoMaxNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={105,9,23,8,7,45,2,88,11,199};
		int firstMax=0;
		int secondMax=0;
		
	/*	for(int num: arr) {
			
			if(firstMax<num) {
				secondMax=firstMax;
				firstMax=num;
				
			}
			else
				if(secondMax<num) 
					secondMax=num;
					
				
		}
		System.out.println("firstMax: "+firstMax);
		System.out.println("SecondMax: "+secondMax);*/
		
		for(int max:arr) {
			if(firstMax<max) {
				secondMax= firstMax;
				firstMax = max;
			}
			else
				if(secondMax<max)
					secondMax=max;
		}
		System.out.printf("Maximun number is %d\n",firstMax);
		System.out.printf("Second Maximum number is %d",secondMax);
	}
}
