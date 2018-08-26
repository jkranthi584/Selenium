import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;



import Basics.c4calendar;

public class PrintDublicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // String mo="dlfjlfedeoru";
      /* Map<Character,Integer> maps = new HashMap<Character,Integer>();
       
       for(char m:mo.toCharArray()) {
    	   if(maps.containsKey(m))
    		   maps.put(m, maps.get(m)+1);
    	   else
    		   maps.put(m, 1);
       }
              
                Set<Character> keys = maps.keySet();
               for(char key:keys) {
            	   if(maps.get(key)>1)
            		   System.out.println(key+": "+maps.get(key));
               }*/
		String mo="dlfs";
		String mk="flyds";
		if(mo.length() != mk.length())
			System.out.println("Strings are not equal");
		else {
		 char[] o = mo.toCharArray();
		  char[] k = mk.toCharArray();
		  Arrays.sort(o);
		  Arrays.sort(k);
             boolean s= Arrays.equals(o, k);
             if(s)
            	 System.out.println("anagram");
             else
            	 System.out.println("not anagram");
		}
	}

}
