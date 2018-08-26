import java.util.HashMap;

public class LengthofLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* System.out.println(findingSubstring("apdepsofhslijkmwudbz"));
         System.out.println("************************************************");
         System.out.println(findingSubstring("memesklpjsto"));*/
		 char[] m = "MCAE".toCharArray();
	      String n="AMEC";
	      
	      
	     StringBuilder st = new StringBuilder(n);
	     for(Character ch: m) {
	    	 int index = st.indexOf(""+ch);
	    	 if(index!=-1)
	    		 st.deleteCharAt(index);
	     }
	  
	      if(st.length()==0)
	    	  System.out.println("it is anagram");
	      else
	    	  System.out.println(st.length()+ " not anagram");
	}
	public static int findingSubstring(String s){
	     
     	int len=0;	
   char []chars =s.toCharArray();
     HashMap<Character,Integer>map = new HashMap<Character,Integer>();  
  /*for(int i=0; i<chars.length; i++){
      
     
      
      if(!map.containsKey(chars[i]))
          map.put(chars[i], i);
          
          else{
             len= Math.max(len, map.size());
             System.out.println("clear: "+map);
             map.clear();
          }
          
  }*/
   
      for(Character ch:chars) {
    	  
    	   if(!map.containsKey(ch)) 
    		   map.put(ch,1);
    		  
    	    else
    	   {  map.put(ch,map.get(ch)+1);
    		   System.out.println(map);
    	    len = Math.max(len, map.size());
    		    map.clear();
    		    
    	   }
    	   
      }
  
  System.out.println("Map: "+map);
  System.out.println("size: "+map.size());
  
   return Math.max(len, map.size());
 
      
}

}
