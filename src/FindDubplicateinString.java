import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDubplicateinString {
public static void main(String[] args) {
	
	String s = "lolidosuckreallysuck";
	//String s ="aaaabbbccd";
	   char[] chars = s.toCharArray();
	/*  Map <Character, Integer> characters = new HashMap<Character, Integer>();
	  
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
	        	  if(characters.get(key)>=1)
	        		 // System.out.println(key+" repeated " +characters.get(key)+" times");
	        		  System.out.print(key);
	        	      System.out.print(characters.get(key));
	          }
	  */
	   boolean isUnique = false;
	   String str = "super shallow bat duper spider bat";
	    String[] yes = str.split(" ");
	    char[] c = str.toCharArray();
	    Map<String,Integer> maps = new HashMap<String,Integer>();
	   /* 
	    for(int i=0; i<c.length; i++) {
	    	if(str.indexOf(c[i])==str.lastIndexOf(c[i]))
	    	    isUnique = true;
	    	else{
	    		isUnique=false;
	    		break;
	    	}
	      ArrayList<String> ar = new ArrayList<String>();
	      for(String y:yes) {
	       if(str.indexOf(y)==str.lastIndexOf(y))
	    	  isUnique=true;
	       else {
	    	 isUnique = false;
	    	 break;
	    	 
	      }
	    } 	
	    */
	     /*  if(isUnique)
	    	   System.out.println("String is unique");
	       else
	    	   System.out.println("String isn't unique");*/
	       
	    	int len=0;
	    	int ben =0;
	    	String crap="rightbrongsimth";
	    		
	    		 Map<Character, Integer> mp = new HashMap<Character,Integer>();
	    		 
	              for(char ch:crap.toCharArray()) {
	            	  
	            	  if(!mp.containsKey(ch)) {
	            		  mp.put(ch,1);
	            		 ben= Math.max(ben, mp.size());
	            		 
	            	  }
	            	  else {
	            		 
	            		  //System.out.println(mp.toString());
	            		 len=  Math.max(len, mp.size());
	            		 //System.out.println(len);
	            		  mp.clear();
	            		 // System.out.println(mp.isEmpty());
	            		  
	            		  
	            	  }
	            	  
	              }
	              System.out.println("length of the longest unique Substring is: ");
	              if(ben>len) 
	            	 System.out.print(ben);
	              else
	            	  System.out.print(len);
	              int arr[]= {85,78,92,4,5,8,29,33};
	          
	            	 
	          	// arr[]={11,9,9,8,8,5,3,22,33,9,1,1,8,4,3,3,3,4,7,199};
	           /*for(int i=0; i<arr.length; i++) {
	        	   
	        	   for(int j=i+1; j<arr.length; j++) {
	        		  
	        		   if(arr[i]>arr[j]) {
	        			   arr[i]=arr[i]+arr[j];
	        			   arr[j]=arr[i]-arr[j];
	        			   arr[i]=arr[i]-arr[j];
	        			   
	        		   }
	        	   }
	        	   System.out.println(arr[i]);
	           }*/
	        String d="dbca";
	        String a="abcd";
	       char[] x = d.toCharArray();
	       Arrays.sort(x);
	      for(char p:x)
	    	  System.out.print(p);
	     int br[]= {5,9,8,7,3};
	     Arrays.sort(br);
	     System.out.println();
	    // System.out.println(arr[arr.length-1]+", ");
	     for(int i=br.length-1; i>=0; i--)
	    	 System.out.print(br[i]);
	      
  }
	    
}


