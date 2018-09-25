
public class ReverseAStringavaJ {
//reverse each word
	//“avaJ tpecnoC fO ehT yaD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="Java Concept Of The Day";
    	String trev [] =rev.split(" ");
    	for(int i=0; i<trev.length; i++) {
    		String word = trev[i];
    		for(int j=word.length()-1; j>=0; j--)
    			System.out.print(word.charAt(j));
    		      System.out.print(" ");
    	}
    //avaJ tpecnoC fO ehT yaD 
    	System.out.println();
    	int number =7373;
    	
    	int sum=0;
    	String arr = Integer.toString(number);
    	   for(int i=0; i<arr.length(); i++) 
    		  sum+=       Integer.parseInt(Character.toString((arr.charAt(i))));
    	   
    	   System.out.println(sum);
    	   int dar[]={14, 9, 11, 7, 8, 5, 3};
    	   for(int i=0; i<dar.length;i++) {
    		   for(int j=i+1; j<dar.length; j++)
    		   {
    			   if(dar[i]<dar[j])
    			   {
    				   int temp=dar[i];
    				     dar[i]=dar[j];
    				     dar[j]=temp;
    			   }
    		   }
    		   System.out.print(dar[i]+" ");
    	   }
    	   /*race
    	    * racecear
    	    * raececarracecear
    	    * raececarracecear
    	    * 
    	    * 
    	    * */
    	   
    	   String race="string";
    	   String res="";
    	   System.out.println();
    	   
    	   for(int i=race.length()-1; i>=0; i--) {
    		   res+=race.charAt(i);
    		  
    	   }
    	   if(res.equalsIgnoreCase(race))
    		  System.out.println(res+":  String is palindrome");
    	   else {
    	     do {
    	    	 for(int i=race.length()-1; i>=0; i--) {
    	    		 
    	    	     race+=race.charAt(i);	 
    	    	 }
    	     }while(!race.equalsIgnoreCase(race));
    	     
    	   System.out.println(race);
	   }
    	   
	}

}
