import java.util.ArrayList;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,9,9,8,8,5,3,22,3,9,1,1,8,4,3,3,4,7,99};
	     int arry[]= {5,9,0,22,92};    
		ArrayList<Integer> arre = new ArrayList<Integer>();
		String right ="maaarrllddf";
	   /* for(int i=0; i<arr.length; i++) {
	    	boolean common= false;
	    	for(int j=0; j<arry.length; j++) {
	    		if(arr[i]==arry[j]) 
	    			System.out.println(arry[j]+" common");
	    			
	    			
	    		  
	    	}*/
		/*  int count =0;
		  
		  char temp = right.charAt(0);
		  
		   for (int i=0; i<right.length(); i++) {
			   
	    	   if(right.charAt(i)==temp)
	    		   count++;
	    	   else
	    	   {
	    		   System.out.print(temp +""+count);
	    		   count =1;
	    		   temp =right.charAt(i);
	    		   
	    	   }
		   }
	    	*/   //System.out.print(temp +""+count);
		
		String one= "mcay";
		String two ="amc";
	        char[] chars = one.toCharArray();
		//for(int i=0; i<one.length(); i++) {
			
			/*if(one.charAt(i)== two.charAt(i)) {
				char temp  = one.charAt(i);
				System.out.print(temp);
			}*/
	        /*StringBuilder second = new StringBuilder(two);
	        boolean isAnagram = false;
		for(Character ch: chars) {
			       
			      int index = second.indexOf(""+ch);
			      System.out.println(index);
			      if(index != -1)
			    	  second.deleteCharAt(index);
			         
		}
		   	    	  System.out.println(second.length());
		  if(second.length()==0)
			  isAnagram =true;
		    */
	       boolean isAnagram = false;
	       StringBuilder first = new StringBuilder(one);
	                char[]   secondCh =   two.toCharArray();
	                for(Character ch:secondCh) {
	                	int index = first.indexOf(""+ch);
	                	if(index != -1) 
	                		first.deleteCharAt(index);
	                	
	                }
	          if(first.length() == 0)
	        	  isAnagram = true;
	          
		  if(isAnagram)
			  System.out.println("Strings are anagram");
		  else
			 System.out.println("Strings are not anagram");
    }
		
		
	}


