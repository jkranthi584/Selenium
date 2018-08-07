import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDubplicateinString {
public static void main(String[] args) {
	
	String s = "idosuckreallysuck";
	   char[] chars = s.toCharArray();
	  Map <Character, Integer> characters = new HashMap<Character, Integer>();
	  
	   for(Character ch: chars) {
		   
		   if(characters.containsKey(ch)) {
			   
			   characters.put(ch, characters.get(ch)+1);
			   System.out.print(ch+" ");
		   }
		   else
			   characters.put(ch, 1);
		   
	   }
	   System.out.println();
	           Set<Character> keys =    characters.keySet();
	          for(Character key: keys) {
	        	  if(characters.get(key)>1)
	        		  System.out.println(key+" repeated " +characters.get(key)+" times");
	          }
	  
	
			
}


}