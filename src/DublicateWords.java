import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DublicateWords {

	public static void main(String[] args) {
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
	           
	}

}
