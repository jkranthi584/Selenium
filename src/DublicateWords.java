import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DublicateWords {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter a String to find out its dupblicate");
		Scanner scan = new Scanner(System.in);
		
	       String words=     scan.nextLine();
          Map<String,Integer> map = new HashMap<String,Integer>();
	       //  String words="spider man show man";
	         String wrds[]= words.split(" ");
	      /*  int k=0;
	      for(String wrd: wrds) {
	    	 
	    	  if(wrd.contains("man"))
	    		  k++;
	    		  
	    	  
	      }
	      System.out.println("Man: "+k+" times");*/
	     for(String word: wrds) {
	    	 if(map.containsKey(word))
	    		 map.put(word, map.get(word)+1);
	    	 else
	    		 map.put(word, 1);
	     }
	       Set<String> keys = map.keySet();
	       for(String key:keys) {
	    	   if(map.get(key)>1)
                System.out.println(key+" repeated: "+map.get(key));	    		   
	       }
	       
	       /* *
	        * **
	        * ***
	        * ******
	        * */
	           for(int i=7; i>=0; i--) {
	        	   for(int j=i; j>=0; j--)
	        	   System.out.print("*");
	        	   System.out.println();
	           }
	           
	           int[] arr= {2,3,5,0,6,3,1,0};
	           int startIndex =0;
	           int lastIndex = arr.length-1;
	           int sumRight =0, sumLeft=0;
	           while(true) {
	        	   if(sumLeft>sumRight) 
	        		   sumRight+= arr[lastIndex--];
	        	   else
	        		   sumLeft+=arr[startIndex++];
	        	   
	        	   if(startIndex>lastIndex) {
	        		   if(sumRight==sumLeft)
	        			   break;
	        		   else
	        			   throw new Exception("not a valid arra");
	        	   }
	        	   
	           }
	           System.out.println(lastIndex);
	           
	}

}
