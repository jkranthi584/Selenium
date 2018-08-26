
public class StringUnique {

	      public static void main(String[] args) {
			boolean isUnique = false;
	    	   String sr="qerioulykeso";
	    	    char[] sc = sr.toCharArray();
	    	    for( char k: sr.toCharArray()) {
	    	    	System.out.println(k+" firstIndex is: "+sr.indexOf(k)+", its last index is: "+sr.lastIndexOf(k));
	    	    	if(sr.indexOf(k)==sr.lastIndexOf(k))
                        isUnique=true;
                        else {
                        	isUnique=false;
                        	break;
                        } 	
	    	    }
	    	   /* for(int i=0; i<sc.length; i++) {
	    	    	
	    	    	if(sr.indexOf(sc[i])==sr.lastIndexOf(sc[i]))
                          isUnique=true;
                          
                          else {
                        	  isUnique = false;
                        	  break;
                          }
                          
	    	    }*/
	    	    if(isUnique)
	    	    	System.out.println("string is unique");
	    	    else
	    	    	System.out.println("sring is not unique");
	    	   
		}
}
