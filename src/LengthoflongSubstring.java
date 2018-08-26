import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LengthoflongSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 String m="rightwrong";
		  char[] cha = m.toCharArray();
		int len =0;
		 Map<Character,Integer>maps = new HashMap<Character,Integer>();
		 
		   for(char ch:cha) {
			   
			   /*if(!maps.containsKey(ch)) 
				   maps.put(ch, 1);
			   else {
				  // maps.put(ch, maps.get(ch)+1);
				   System.out.println(maps.toString());
				   len = Math.max(len, maps.size());
				    maps.clear();
			   }
				   
			   
		   }
		   System.out.println(maps.toString());
		   System.out.println("size of the map: "+maps.size());
		   System.out.println(Math.max(len, maps.size()));*/
			   
			     if(maps.containsKey(ch))
			    	 maps.put(ch, maps.get(ch)+1);
			     else
			     
			    	 maps.put(ch, 1);
		   }
		           Set<Character> keys = maps.keySet();
		           for(char key:keys) {
		        	   if(maps.get(key)>1)
		        		   System.out.println(key+" repeated "+maps.get(key)+" times");
		        	    
		        	     
		        	     else
		        	    	 if(maps.get(key)==1)
		        	    	 System.out.println(key+" is a unique key");
		           }
		       
	}

}
