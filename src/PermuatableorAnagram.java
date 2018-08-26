import java.lang.reflect.Array;
import java.util.Arrays;

public class PermuatableorAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //compare two string
		
		String s1 ="ywxko"; String s2="xykoi";
		 char[] str1 =   s1.toCharArray();
	           char[] str2 = s2.toCharArray();
	           
	           if(str1.length != str2.length) 
	        	     System.out.println("strings are not equal");
	           else { 
	        	   Arrays.sort(str1);
	                Arrays.sort(str2);
		         if (Arrays.equals(str1, str2))
		        	 System.out.println("strings are equal");
		         else
		        	 System.out.println("string is not anagram");
	           }
	           //sorting the characters
	           char[] ab="ldjfldjfdjfdljfeorueou".toCharArray();
	           Arrays.sort(ab);
	            for(char a:ab)
	            	System.out.print(a);
	        		   
	        
	}

}
