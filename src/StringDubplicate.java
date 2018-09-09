import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringDubplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String d="daljaojledlfdaafcbbtb";
        
        //System.out.println("Tree for Ascending Order");
        //  Map <Character,Integer> maps = new TreeMap<Character,Integer>();
       // System.out.println("LinkedHashMap for insertion order");
       Map<Character,Integer> maps =   new LinkedHashMap<Character,Integer>();
        char[] c = d.toCharArray();
       for(char b:c) {
    	   if(maps.containsKey(b))
    		   maps.put(b, maps.get(b)+1);
    	   else
    		   maps.put(b, 1);
    	   
       }
      /*Set<Character> keys = maps.keySet();
       for(Character key:keys) {
    	   if(maps.get(key)==1)
    		   System.out.print(key+": "+maps.get(key));
    	   System.out.print(" ");
       }*/
       for(char b:c) {
       
       if(d.indexOf(b)==d.lastIndexOf(b))
    	   System.out.println(b+" is unique");
          
	   }
       String ma ="Super man bat man He man spider man";
       String[] ar = ma.split(" ");
       int sum=0;
       System.out.println(ar[3]);
      for(int i=0; i<ar.length; i++) {
    	  
    	  
    		if(ar[i].equalsIgnoreCase(ar[i]))
    			  sum++;
    			  
    	  
      }
      System.out.println("man is repeated : "+sum);
	
	String comd="www.cameron.com dfd";
	   String[] arr = comd.split(" ");
	      
	 StringBuilder sb = new StringBuilder();
	      for(int i=0; i<arr.length; i++) {
	    	 sb.append(arr[i]);
	    	 if(arr[i]!=arr[arr.length-1])
	    		 sb.append("%20");
	      }
	      System.out.println(sb.toString());
	}
}
