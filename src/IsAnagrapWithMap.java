import java.util.HashMap;
import java.util.Map;

public class IsAnagrapWithMap {

	public static void main(String[] args) {
		String one ="aercb";
	    String two ="caesbrk";
		// TODO Auto-generated method stub
	boolean isAnagram = false;
	int s =0;
	   Map <Character,Integer> map = new HashMap<Character,Integer>();
	    for(Character ch:one.toCharArray()) {
	    	
	    	if(map.containsKey(ch)) 
	    		map.put(ch, map.get(ch)+1);
	    	else 
	    		map.put(ch, 1);
	    		
	    	
	    	
	    }
	    for(Character ch:two.toCharArray()) {
	    	
	    	if(!map.containsKey(ch)) 
	    		isAnagram = false;
	    	else {
	    		
	    		map.put(ch, map.get(ch)-1);
	    		if(map.get(ch)==0)
	    			map.remove(ch);
	    		 
	    	}
	    	isAnagram = map.isEmpty();
	    	
	    }
	   System.out.println(isAnagram);
	   StringBuilder second = new StringBuilder(two);
	   for(Character ch: one.toCharArray()) {
		    int index =  second.indexOf(""+ch);
		    
		    if(index !=-1)
		    	second.deleteCharAt(index);
		   
	   }
	    if(second.length()==0)
	    	System.out.println("is anagram");
	    
	   // boolean anagram = isAnagram(one, two);
	  //  System.out.println(anagram);
	   /* boolean isAnagram = true;
Map<Character, Integer> map = new HashMap<>();
		
		for(char c: one.toCharArray())
			if(map.containsKey(c))
				map.put(c, map.get(c) + 1);
		
			else
				map.put(c, 1);
		
		for(char c: two.toCharArray())
			if(!map.containsKey(c))
				isAnagram = false;
		
			else
			{
				map.put(c, map.get(c) - 1);
			
				if(map.get(c) == 0)
					map.remove(c);
			}
		
		isAnagram = map.isEmpty();
		System.out.println(isAnagram);*/
	}
	
	
	private static boolean areAnagrams(String one, String two)
	{
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: one.toCharArray())
			if(map.containsKey(c))
				map.put(c, map.get(c) + 1);
		
			else
				map.put(c, 1);
		
		for(char c: two.toCharArray())
			if(!map.containsKey(c))
				return false;
		
			else
			{
				map.put(c, map.get(c) - 1);
			
				if(map.get(c) == 0)
					map.remove(c);
			}
		
		return map.isEmpty();
	}
	public static boolean isAnagram(String one, String two) {
		boolean isAnagram = false;
		 Map <Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch: one.toCharArray()) {
	    	System.out.println(ch +" "+map.get(ch));
	    	if(map.containsKey(ch)) 
	    		
	    		map.put(ch, map.get(ch)+1);
	    	else
	    		map.put(ch,1);
	    	
	    	
	    }
	   
	    for(Character ch: two.toCharArray()) {
	    	  System.out.println(map.get(ch));
	    	 // System.out.println(ch+" " +!map.containsKey(ch));
	    	if(!map.containsKey(ch)){
	    		//return false;
	    		isAnagram = false;
	    		//System.out.println(isAnagram);
	    	System.out.println("dfldfd");
	    		return false;
	    	 // break;
	    	}else {
	    		map.put(ch, map.get(ch)-1);
	    		if(map.get(ch)==0)
	    			map.remove(ch);
	    		 isAnagram = true;
	    	}
	    /*	if(map.isEmpty())
	    	System.out.println(map.isEmpty());*/
	    }
	    return map.isEmpty();
	}
 

}
