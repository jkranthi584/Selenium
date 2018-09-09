
public class FindMiddleIndex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       // int[] arr= {6,2,2,5,2,2,1};
		int arr[]= {2,2,5,6,4,1,4,9,2,2,1,79};
		//int[] arr={2,3,5,6,3,1};
		int startIndex=0;
    	int lastIndex =arr.length-1;
    	int sumRight =0;
    	int sumLeft=0;
        while(true) {
        	
        	if(sumLeft>sumRight)
        		sumRight+=arr[lastIndex--];
        	else {
     		   System.out.println("before: "+startIndex);
     		   sumLeft+= arr[startIndex++];
     		   System.out.println("after: "+startIndex);
     		
     	   }
        	  
        	  if(startIndex>lastIndex) {
        		  if(sumRight==sumLeft)
        			  break;
        		  else
        			  throw new Exception("not a valid array");
        	  }
        	
        }
          System.out.println("Middle index is: "+lastIndex);
	}

}
