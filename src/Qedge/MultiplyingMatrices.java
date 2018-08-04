package Qedge;

import java.util.Scanner;

public class MultiplyingMatrices {
	
	public static void main(String[] args) {
		//Matrices = First Matrix col * second Matric row
		// col1 * row2
		//r1=rowfirst of firstARray 
		//r2 = rowSeocnd of second array
		//c1 rowfirst c2 row second
		int r1,c1,r2,c2,i,j,k,sum=0;
		
		Scanner usersInput = new Scanner(System.in);
		
		System.out.println("etner no of rows and column");
		
		
		r1=usersInput.nextInt();
		c1= usersInput.nextInt();
		int first[][] = new int[r1][c1];
		System.out.println("Enter no of elements of the first");
		for(i=0; i<r1; i++)
		for(j=0; j<c1; j++)
			first[i][j]=usersInput.nextInt();
		
		System.out.println("enter the no of row and columns");
		r2=usersInput.nextInt()
				;
		c2=usersInput.nextInt();
		if(c1!=r2)
			System.out.println("tner matrices cannot be multiplied");
		else{
			int second[][]=new int[r2][c2];
			int multiply[][]= new int[r1][c2];
			
			System.out.println("enter the no of elements for second matrix");
			
			for(i=0; i<r2; i++)
				for(j=0; j<c2; j++)
					
			    second[i][j]=usersInput.nextInt();
			
			     //S
			     
			     for(i=0; i<r1;i++){
			    	 
			    	 for(j=0; j<c2;j++)
			    	 {
			    		 for(k=0; k<c1; k++){
			    			 //first row is static second col is static
			    		// first col is changing   second row is changing
			    			 sum=sum+first[i][k] * second[k][j];
			    			 
			    		 }
			    		 multiply[i][j]=sum;
			    		 sum=0;
			    		 
			    	 }
			     }
			     System.out.println("multiplication of matrix is...");
			     
			     for(i=0; i<r1;i++){
			    	 for(j=0; j<c2;j++)
			    		 System.out.println(multiply[i][j]+"\t");
			    	 
			    	 System.out.println("\n");
			     }
			      
		}
	}

}
