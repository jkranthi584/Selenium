import java.util.HashMap;

public class LengthofLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(findingSubstring("abcdeasofhlijkmwualdpz"));
	}
	public static int findingSubstring(String s){
	     
     	int len=0;	
   char []chars =s.toCharArray();
     HashMap<Character,Integer>map = new HashMap<Character,Integer>();  
  for(int i=0; i<chars.length; i++){
      
     
      
      if(!map.containsKey(chars[i]))
          map.put(chars[i], i);
          
          else{
             len= Math.max(len, map.size());
             System.out.println(map);
             map.clear();
          }
          
  }
  
  
  System.out.println(map);
  System.out.println("size: "+map.size());
  
   return Math.max(len, map.size());
 
 
}

}
