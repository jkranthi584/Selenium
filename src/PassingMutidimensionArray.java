
public class PassingMutidimensionArray {

	public static int[][]printArray(int[][]a){
		   
		//int temp[][]= new int[a.length][a[0].length];
		  int [][]temp=new int[a[0].length][a.length];
		   System.out.println("length of the first ele in array is: "+a[0].length);
		    System.out.println("arrayLength is: "+a.length);
		     for(int i=0; i<a[0].length; i++) {
		   
		    	 for(int j=0; j<a.length; j++)
		    		//temp[i][j]=a[i][j];
		    	    temp[i][j]=a[j][i];
		 
		     }		
		   
		     
		    return temp;
		
	}	
	//http://ecomputernotes.com/java/array/passing-two-dimensional-array-to-a-method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[][];
          int[][] multiArray = {
        		  {7,8,9},
        		  {1,2,3}
          };
          System.out.println("The two rows three columns:");
          
          for(int i=0;i<multiArray.length; i++) {
        	  for(int j=0;j<multiArray[i].length; j++) 
        		  
        		  System.out.print(" the array is at the index "+ i+" " + j+":  " +multiArray[i][j]);
        	             System.out.println();
        	  
        	         
          }
            result= printArray(multiArray);
            System.out.println("Three rows and 2 columns");
            for(int k=0; k<result.length; k++) {
            	for(int l=0; l<result[k].length; l++)
            		 System.out.print(" the array is at the index "+ k+" " + l+":  " +result[k][l]);
            	     
            	                     System.out.println();
        		
            }
          
	}

}
