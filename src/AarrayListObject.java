import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AarrayListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /* ArrayList<Object> obj  = new ArrayList<Object>();
           
           obj.add(98373939);
           obj.add("dfedf");
           obj.add(5);
           obj.add("dfere@dm.com");
      
             String arr [] = new String[obj.size()];
             obj.toArray(arr);
           
            	 
            	
        		   
       for(String a:arr)
    	   System.out.println(a);*/
		
	System.out.println  ( printNextLargestNumber(145, 4));
	sumOfArray(20);
	String s1 = "JavaJ2eeStrutsHibernate";
	 
    String s2 = "StrutsHibernateJavaJ2ee";
     if(s1.length()!=s2.length())
    	 System.out.println("String are not equal in length");
     else {
    	 String s3 = s1 + s1;
    	 if(s3.contains(s2))
    		 System.out.println("s2 is a rotated version of s1");
    	 else
    		 System.out.println("s2 is a rotated version of s1");
     }
	    int intarr[]={10,12, 9, 12, 9, 10, 9, 10, 11,10};
	  ArrayList <Integer> arr = new ArrayList<Integer>();
	 
	    for(int i=0,count=1; i<intarr.length; i++) {
	    	if(!arr.contains(intarr[i])) {
	    		arr.add(intarr[i]);
	    	for(int  j=i+1;j<intarr.length; j++) {
	    		if(intarr[i]==intarr[j]) 
	    			count++;
	    	}
	    	if(count>1) {
	    		System.out.print(intarr[i]+": "+count+" ");
	    		count=1;
	    	}else
	    		System.out.print(" "+intarr[i]+": "+count);
	      }	
	    	
	   }
	    System.out.println();
	    ArrayList<Integer>at = new ArrayList<Integer>();
	    int narr[]={4, 3, 2, 4, 9, 2};
	    int len=narr.length;
	    for(int i = 0; i<len; i++) {
	      	//if(!at.contains(narr[i])) {
	    	for(int j=i+1; j<narr.length; j++) {
	    		if(j+1<narr.length && narr[i]==narr[j]) {
	    		
	    			  narr[j]= narr[len-1];
	    	           len--;
	    	           j--;
	    		}
	    	
	         }
	    	  System.out.print(narr[i]);
	     
	  }
	    System.out.println();
	    char[] com = new char[5];
	  /*String gji="";
	    String java ="JavaConcaptOfaTeheDay";
	        for (char ch: java.toCharArray()){
	         
	    	if( java.indexOf(ch)==java.lastIndexOf(ch)) {
	    		  
	         		System.out.println(ch);
	    	} 
	         
	    	else {
	    	    for(int i=0; i<java.length(); i++) {
	    	    	for(int j=i+1; j<java.length(); j++) {
	    	    	     if(java.charAt(i)==java.charAt(j)) {
	    	    	    	 System.out.println(java.charAt(i));
	    	    	    	  return;
	    	    	     }
	    	    	}
	    	    }
	    	}
	    	     
	    	}
	        */
	    
	    Map<Character,Integer> maps = new HashMap<Character,Integer>();
	   
	        String java ="JkvaConcepetOfTheDay";
	        char[] crap = java.toCharArray();
	        for(char c: crap) {
	        	if(maps.containsKey(c))
	        		maps.put(c, maps.get(c)+1);
	        	else
	        		maps.put(c, 1);
	        }
	        for(char c: crap)
	        {
	        	if(maps.get(c)==1) {
	        	   System.out.println("the first unrepeated char in String is: "+c);
	        	     break;
	        	}
	        }
	        for(char c:crap) {
	        	if(maps.get(c)>1) {
	        		System.out.println("the first repeated character is: "+c);
	        	   break;
	        	}
	        }
	       
	    	String rev="Java Concept Of The Day";
	    	String trev [] =rev.split(" ");
	    	for(int i=0; i<trev.length; i++) {
	    		String word = trev[i];
	    		for(int j=word.length()-1; j>=0; j--)
	    			System.out.print(word.charAt(j));
	    		System.out.print(" ");
	    	}
	    	//avaJ tpecnoC fO ehT yaD
	    	
	}
  
	public static int printNextLargestNumber(int number, int digit) {
		      char c =  Integer.toString(digit).charAt(0);
		      
		   for(int i= number; i>0; --i) {
			   if(Integer.toString(i).indexOf(c)==-1)
				   return i;
		   }
			return -1;
	}
  public static void sumOfArray(int number) {
	 // int arr[]= {10,10,9,3,16,4,6,8,12};
	int arr[]=  {4, 5, 7, 11, 9, 13, 8, 12} ;
	  for(int i=0; i<arr.length; i++) {
		 /* if(i+1<arr.length && arr[i]+arr[i+1]==number)
			  System.out.println(arr[i]+" "+arr[i+1]);*/
		  for(int j=i+1; j<arr.length; j++) {
			  if(arr[i]+arr[j]==number)
				  System.out.println(arr[i]+" "+arr[j]);
		  }
	  }
  }
}
