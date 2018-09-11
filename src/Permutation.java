import java.util.Arrays;
import java.util.LinkedList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String g ="God";
       permutation("",g);
       System.out.println(factorial(5));
       
       LinkedList<Integer> list = new LinkedList<Integer>();
         for(int i=5; i>0; i--)
        	 list.add(i);
         System.out.println(list.toString());
       Object[] a = list.toArray();
        Arrays.sort(a);
        
        for(Object b:a)
        	System.out.print(b+" ");
	}
	public static void permutation(String perm,String word) {
		   
			   if(word.isEmpty())
				   System.err.println("r: "+perm+word);
			   else {
			  
				   for (int i = 0; i< word.length(); i++) {
		                permutation(perm.concat(Character.toString(word.charAt(i))), word.substring(0, i) 
		                                        + word.substring(i + 1, word.length()));
		            }
				  // permutation(perm +word.charAt(i), word.substring(0, i)+word.substring(i+1,word.length()));
		   }
			   
	}
	 public static Integer factorial(int number) {
		 if(number ==1)
			 return 1;
		 else
			return number*factorial(number-1);
	 }
       
}
