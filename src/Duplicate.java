import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char[] st = "randomdfegd".toCharArray();
   String man ="superman batman spiderman";
   
   //insertOrder is preseved in linkhashset
         Set<Character> maps = new LinkedHashSet<Character>();
 	     /* Set<Character> map= new HashSet<Character>();
 	      StringBuilder str = new StringBuilder();*/
		  Map<Character,Integer> ma=new LinkedHashMap<Character,Integer>();
 	     /* for(char s:st) {
 	    	  if(!maps.contains(s)) {
 	    	      maps.add(s);
 	    	  //  str.append(s);
 	    	      System.out.print(s);
 	    	  }
 	      }
       */
		  int total=0;
		  for(char s:st) {
 	    	  if(!ma.containsKey(s)) {
 	    		  ma.put(s, 1);
 	    		  System.out.print(s);
 	    		 
 	    		  
 	    	  }else {
 	    		  
 	    		  ma.put(s, ma.get(s)+1);
 	    		  // total+=ma.get(s);
 	    		   
 	    		   //System.out.println(s+" repeated "+total+" times");
		        }
 	      }
		                  System.out.println();
		             Set<Character> keys = ma.keySet();
		             for(char key:keys) {
		            	 if(ma.get(key)>1)
		            		 System.out.println(key+" repeated "+ma.get(key)+" times");
		             }
       
	    // System.out.println(str.toString());
	     
	     
    	
      
     /*for(char ci:ch){
    	 System.out.print(ci);
     }*/
       
    
	}

}
