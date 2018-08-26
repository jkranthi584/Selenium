
public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[][]= {
				{5,3,22,1},
				{6,9,0,5},
				{-8,1,2,3}
				
		};
		int col=0;
		int min=arr[0][0];
          for(int i=0; i<arr.length;i++) {
        	  
        	 for(int j=0; j<arr[i].length; j++) {
        		  if(arr[i][j]<min) {
        			  min=arr[i][j];
        			  col=j;
        		  }
        	 }
          }
          int max = arr[0][col];
          int k=0; 
          while(k<2) {
        	  if(arr[k][col]>max)
        		  max=arr[k][col];
        	  k++;
          }
          System.out.println("Min "+min);
          System.out.println(max);
	}

}
