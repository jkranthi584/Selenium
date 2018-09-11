import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DublicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /*int arr []= {10,20,30,5,4,1,3,2};
          
          int sum=65;*/
          
          /*for(int i=0; i<arr.length-3;i++) {
        	  for(int j=i+1; j<arr.length-2; j++) {
        		  for(int k=j+1; j<arr.length-1; j++) {
        			  for(int l=k+1; l<arr.length; l++)
        			  {
        				  if(arr[i]+arr[j]+arr[k]+arr[l]==sum)
        					  System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
        			  }
        		  }
        	  }
          }*/
          
		Map <Character, Integer> maps = new HashMap<Character, Integer>();
		
          String kd="daffcckklllflc";
          String s="";
         /* for(int i=0, count=1; i<kd.length(); i++) {
        	    if(i+1<kd.length() && kd.charAt(i)==kd.charAt(i+1))
        	    	count++;
        	    else {
        	       s+=       Character.toString(kd.charAt(i));
        	       if(count>1)
        	       s+=     Integer.toString(count);
        	       count =1;
        	    }
          }
          System.out.print(s);*/
       String jom="righgtwron";
       
            Map<Character, Integer> mps = new TreeMap<Character,Integer>();
            int len=0;
            for(char j:jom.toCharArray()) {
            	
            	if(!mps.containsKey(j))
            		mps.put(j, 1);
            	else {
            	System.out.println(mps.toString());
            	  len = Math.max(len, mps.size());
            	  System.out.println("Previous: "+len);
            	  mps.clear();
            		
            	}
            }
            System.out.println(mps.toString());
            System.out.println(len);
            String kar = "adbdabbbcabcbdf";
       char [] ab ="aaafafkkllmff".toCharArray();
        Set<Character>set = new LinkedHashSet<Character>();
             int temp=ab[0];
             int sum=0;
       for(int i=0; i<ab.length; i++) {
    	     if(ab[i]==temp)
    	    	 sum++;
    	     else {
    	    	 if(!set.contains(ab[i])) 
    	    		 set.add(ab[i]);
    	    		 temp=ab[i];
    	    	 
    	     }
       }
    	    /* 
    	     for(char ss:set)
    	    	 System.out.print(ss);*/
      Object[] adr = set.toArray();
      Arrays.sort(adr);
      for(Object obj:adr) {
    	  System.out.print(obj);
      }
     // System.out.println(temp+""+sum);
      System.out.println();
      char []alpha="abcdefghijklkmnopqrstuvwxyz".toCharArray();
          
        for(int i=0; i<alpha.length; i++){
        	int k=i+1;
        	alpha[i]=Character.toUpperCase(alpha[i]);
        	System.out.print(alpha[i]+""+k);
        	
        }
        System.out.println();
        String my="My name is ABC";
        
        String[] arr = my.split(" ");
         for(int i=arr.length-1; i>=0; i--) {
        	
        	 System.out.print(arr[i]+" ");
        	  
         }
         System.out.println();
         int are[]= {30,10,5,55,91};
         Arrays.sort(are);
         System.out.println("Etner  numbers");
         Scanner user = new Scanner(System.in);
         int total = user.nextInt();
         
         int ar[]=new int[total];
         for(int i=0;i<total; i++)
         	 ar[i]= user.nextInt();
            Arrays.sort(ar);
         for(int i=0; i<ar.length-1; i++) {
        	 
         	while(i+1 <ar.length && ar[i]<ar[i+1]) {
         		
         		  System.out.print(ar[i]+" ");
         		   ar[i]=ar[i]+1;
         		  
         	 }
         	 System.out.println();
          }
         System.out.println(ar[ar.length-1]);
        
         /*for(int i=0; i<are.length-1; i++) {
        	 
        	while(i+1 <are.length && are[i]<are[i+1]) {
        		
        		  System.out.print(are[i]+" ");
        		   are[i]=are[i]+1;
        		  
        	 }
        	 System.out.println();
         }
       */
	}
}
