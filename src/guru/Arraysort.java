package guru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraysort {
	
public static void main(String[] args) {
	
	  /*part1
	int [] arr={5,9,1,3,8,4};
	  
	  
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));*/
	  Comparable [] arr={5,9,1,3,8, 4};
	  System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
	System.out.println("\nARrayList:: ");
	//ArrayList<Integer> arr2 = new ArrayList<Integer>();
	ArrayList<Comparable> arr2 = new ArrayList<Comparable>();
	arr2.add(5);
	arr2.add(6);
	arr2.add(9);
	arr2.add(1);
	arr2.add(3);
	System.out.println();
	Collections.sort(arr2);
	System.out.println(arr2);
	
	
	
	                         int arre[][]={{3,4,9,37},{3,7,19,182},{5,9,3,1}};
	                         
	                         int max=0,col = 0;
	                           int min=arre[0][0];
	                            for(int i=0; i<arre.length;i++){
	                            	
	                            	    for(int j=0; j<arre[i].length; j++){
	                            	    	
	                            	    	if(arre[i][j]<min){
	                            	    		min=arre[i][j];
	                            	    		col=j;
	                            	    	}
	                            	    }
	                            	   
	                            }
	                            System.out.println("Minimum number is:"+min);
	                            max=arre[0][col];
	                            int k=0;
	                            while(k<arre.length){
	                             if(arre[k][col]>max){
	                            	 max=arre[k][col];
	                            	
	                             }
	                             k++; 
	                           }System.out.println("Minium no found in the col :"+col);
	                             System.out.println("the maximum number in the array is: "+max);
}
	        
	        
	
}

