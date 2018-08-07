import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDubplicateinStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		char[] st = "crapwrap".toCharArray();
		
		 Map<Character,Integer> map =new HashMap<Character,Integer>();
            for(char ch: st) {
            	
            	if(map.containsKey(ch))
            		map.put(ch, map.get(ch)+1);
            	else
            		map.put(ch, 1);
            }//map can contain dublicate keys to eliminate that we are
            // creating set
        Set<Character> keys =       map.keySet();
        for(Character key: keys) {
        	  if(map.get(key)>1)
        		  System.out.println(key+" repeated "+map.get(key)+" times");
        	  else
        		  if(map.get(key)==1)
        			  System.out.println(key+" is a uqique key");
        }
        
        for(int i=8; i>2; i--) {
        	for(int j=1; j<i; j++)
        		System.out.print(j);
        	 System.out.println();
        }
        for(int i=1; i<8; i++) {
        	for(int j=1; j<i; j++)
        		System.out.print(j);
        	for(int k=i; k>0; k--)
        		System.out.print(k);
        	 System.out.println();
        	 
        }

	}
}