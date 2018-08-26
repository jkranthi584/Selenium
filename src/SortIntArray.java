import java.util.Arrays;

public class SortIntArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          int arr[]= {7,9,88,-33,2,12,6,1};
          Arrays.sort(arr);
          /*for(int i=0; i<arr.length; i++)
        	  System.out.print(arr[i]+", ");
          System.out.println("\n DESC");
          System.out.print("{ ");
          for(int i=arr.length-1; i>=0; i--) {
        	  if(arr[i]==arr[0])
        	  System.out.print(arr[i]);
        	  else 
        		  System.out.print(arr[i]+", ");
          }*/
         // System.out.print(" }");
          
          int[] ar= {6,2,2,5,2,2,1};
          int startIndex=0;
          int lastIndex=ar.length-1;
          //a is sumRight,b = sumLeft
           int a=0,b=0;
        /*   while(true) {
        	   
        	   if(b>a) 
        		   //1+2+2=+5
        		 a+=ar[lastIndex--];
        	   else 
        		   //6+2+2
        			   b+=ar[startIndex++];
        		if(startIndex>lastIndex) {
        			System.out.println(startIndex);
        			if(a==b)
        				break;
        			 else
           			  throw new Exception("not a valid array");
        			
        		}
        			  
        		
           }
           System.out.println(lastIndex);
          */
           
           
           while(true) {
        	   
        	   if(b>a)
        		   a+= ar[lastIndex--];
        	   else
                  b+=ar[startIndex++];
        	 if(startIndex>lastIndex) {
        		 if(a==b)
        			 break;
        	 }
          }
           System.out.println(lastIndex);
	}

}
