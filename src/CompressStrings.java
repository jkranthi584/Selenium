import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CompressStrings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String k = "adbdabbbcabcbdf";
		 char[] ss= k.toCharArray();
		 int sum=0;
		 char temp=k.charAt(0);
		 System.out.println(temp);
		 int co=0;
		 Set<Character> set = new LinkedHashSet<Character>();
			for(int i=0; i<k.length(); i++) {
				if(k.charAt(i)==temp) 
					sum++;
					
				
				else {
		
			
				    if(!set.contains(k.charAt(i))) 
				    	set.add(k.charAt(i));
					//System.out.print(temp+" "+ 1);
				    //temp=k.charAt(i);
				     
				    
				    temp=k.charAt(i);
				      //sum=1;
				    }
				}
			
			    /*   Object[] so = set.toArray();
			       Arrays.sort(so);
			for(Object se:so) 
				
				System.out.print(se);
			*/
				/*System.out.print(temp+""+sum);
			System.out.println();*/
		
				
			/*	int [] arr= {5,7,9,12,61};
				int min=arr[0];
				for(int i=0; i<arr.length; i++)
				{ 
					for(int j=i+1;j<arr.length; j++) {
						int t=0;
					  if(arr[i]<arr[j])
					  {  t=arr[i];
						  arr[i]=arr[j];
						  arr[j]=t;
						  arr[i]=arr[i]+arr[j];
						  arr[j]=arr[i]-arr[j];
						  arr[i]=arr[i]-arr[j];
						  
					  }
					}
			    System.out.print(arr[i]);
			    if(arr[i]!=arr[arr.length-1])
			    System.out.print(",");
			    
						
				
				}*/
			int sumo=0;
			String mo="aaabbbcccccddddff";
			char t = mo.charAt(0);
			for(int i=0; i<mo.length(); i++) {
				
		        if(mo.charAt(i)==t)
		        	sumo++;
		        else 
		        {
		        	System.out.print(t+""+sumo);
		        	
		        	t=mo.charAt(i);
		        	sumo=1;
		        }
		        
			}
			 System.out.println(t+""+sumo);
			 
			
		 String ui="huknnnnnjjkkklhhin";
		 /*String[] gh= ui.split("");
		 int c=1;
		 ArrayList <String>arr = new  ArrayList<String>();
		 for(int i=0;i<gh.length; i++) {
			 arr.add(gh[i]);
			 if(i+1<gh.length && gh[i].equalsIgnoreCase(gh[i+1])) {
				 //if(arr.contains(gh[i+1]))
				    arr.remove(gh[i+1]);
				  c++;
			 }
			 else {
				 if(c>1) arr.add(Integer.toString(c));
				  c=1;
			 }
				 
		 
		 }
		 System.out.println(arr.toString());
		     Object[] hj = arr.toArray();
		     for(Object obj: hj)
		    	 System.out.print(obj);*/
		 String pi="";
	      for(int i=0,count=1; i<ui.length(); i++) {
	    	  //int count=1;
	    	  if(i+1<ui.length() && ui.charAt(i)==ui.charAt(i+1))
	    		  count++;
	    	  else {
	    		pi+= Character.toString(ui.charAt(i));
	    	     if(count>1)
	    	    	pi+= Integer.toString(count);
	    	       count=1;
	    		  
	    	  }
	        
	      }
	      System.out.println(pi);
	      
	}

}
