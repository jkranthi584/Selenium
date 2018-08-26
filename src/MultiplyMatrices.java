import java.util.Scanner;

public class MultiplyMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter dimension of first Matrix");
            int m=scan.nextInt();
            int n= scan.nextInt();
            int arr[][]=new int[m][n];
            System.out.println("Enter no of element for first Matrix");
            for(int i=0; i<m; i++)
            	for(int j=0; j<n; j++)
            		arr[i][j]=scan.nextInt();
            System.out.println("Enter the dimension of second Matrix");
              int p=scan.nextInt();
              int q=scan.nextInt();
              if(n!=p)
            	  System.out.println("entered matrices cannot be multiplied");
              else {
            	    int[][] second=new int[p][q];
            	    System.out.println("Enter the no of elements for the second Matrices");
            	     
            	    for(int i=0; i<p; i++)
                    	for(int j=0; j<q; j++)
                    		second[i][j]=scan.nextInt();
            	        int[][] multiply = new int[m][q];
            	        System.out.println("Mutliplying the Matrices");
            	        int sum=0;
            	        for(int i=0; i<m; i++) {
                        	for(int j=0; j<q; j++) {
                        		for(int k=0;k<n;k++) {
                        		  sum+= arr[i][k] * second[k][j];
                        		}
                        	 multiply[i][j]=sum;
                        	  sum=0;
            	        }
            	     }
            	        /* 1*1+2*3+3*5 = 22 1*2+2*4+3*6=28
            	         * 
            	         * 4*1+5*3+6*5=  49    4*2+5*4+6*6=64
            	         */
       		    	
            	        System.out.println("Multiplied Matrices are");
            	        for(int i=0; i<m; i++) {
                        	for(int j=0; j<q; j++)
                        		System.out.print(multiply[i][j]+"\t");
            	        
            	                   System.out.println();
            	        }
              }
             /* 22 	28 	
              49 	64 */
	}

}
