import java.util.Arrays;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       for(int i=1; i<7; i++) {
    	   for(int j=1; j<i; j++)
    		   System.out.print(j);
    	   System.out.println();
       }
       System.out.println();
       for(int i=7; i>0; i--) {
    	   for(int j=1; j<i; j++)
    		   System.out.print(j);
    	   System.out.println();
       }
        System.out.println();
        System.out.println("enter a number");
       Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<num; i++) {
        	for(int j=num; j>i; j--)
        		System.out.print(j);
        	System.out.println();
        	//System.out.println(i);
        	;
        }
        //8 7 6 5 4 3 2
        //8 7 6 5 4 3
        
        for(int i=2; i<9; i++) {
        	for(int j=8; j>=i; j--)
        		System.out.print(j);
        	    System.out.println();
        }
       for(int i=1;i<8; i++) {
    	   for(int j=1; j<=i; j++)
    		    System.out.print(j+", ");
    	     System.out.println();
    	    
       }
       //1 2 34 5 6 7
       //1 2 34 5 6
       
       for(int i=8; i>0; i--) {
    	   for(int j=1; j<i; j++)
    		   System.out.print(j);
    	   System.out.println();
       }
       
         //int i=1;
       int arr[]= {5,9,8,3,2};
       for(int i=0;i<arr.length; i++) {
    	   if(arr[i] != 4) 
    		   arr[3]=4;
       } 
       //1
       //1 25
      
    	  
    	   
        System.out.println(Arrays.toString(arr));
        
        for(int j=2; j<arr.length-1; j++) 
        	arr[j]=arr[j+1];
        
        System.out.println(Arrays.toString(arr));
        
        int [][]ar= {
        		{1,3,90,9},
        		{5,7,3,4},
        		{8,3,4,-1},
        		{9,2,3,5}
        };
        
        int col=0;
        int min=ar[0][0];
        int ii=0;
        int len=0;
        for(int i=0; i<ar.length; i++) {
             ii=ar.length;
        	for(int j=0; j<ar[i].length; j++) {
        		len=ar[i].length;
        		if(ar[i][j]<min) {
        			min = ar[i][j];
        			col=j;
        		}
        	}
        }
        System.out.println("Min "+min);
         int max=ar[0][col];
         
          int k=0;
          while(k<3) {
        	  if(ar[k][col]>max) {
        		   max=ar[k][col];
        		   
        	  }
        	  k++;
          }
            System.out.println("column: "+col);
          System.out.println("Max "+max);
          System.out.println("i: "+ii);
          System.out.println("length of arr[i].length is: "+len);
     }
	}



