
public class GenericMethod2 {
// bounded type parameter  means if its extends the Number class then it wil only acepts instance of numberor its sub
	//subclasses.
	public static <T extends Comparable<T>>T  max(T x,T y, T z){
	   T max  = x;
	   //both are same compare to returns 0, it returns a positive number if first one is greater to the second
	     if(y.compareTo(max)>0)
	    	 max =y;
	     if(z.compareTo(max)>0)
	    	 max=z;
	     
	     return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int m=   max(2,4,5);
            System.out.printf("maximum of %s,%s and %s is %s ",3,4,5,m);
            String max = max("apple","Goa","Chico");
            System.out.printf("\n Maximum of %s,%s  and %s is %s ","apple"," goa","chico",max);
	}

}
