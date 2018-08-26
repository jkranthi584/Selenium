
public class PatterProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 3 4 5 6 7
		//i 2 3 4 5 6
		//1 2
		for(int i=8; i>2; i--) {
			for(int j=1; j<i; j++)
				System.out.print(j+" ");
			
			 System.out.println();
		}
		//1
		//1 2
		//1 2 3
		//1 2 3 4 5 6 7
		for(int i=1;i<8; i++) {
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
			
		}
		//7 6 5 4 3 2 1
		//7 6 5 4 3 2
		for(int i=1; i<8; i++) {
			for(int j=7; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	   
	    for(int i=1; i<8; i++) {
	    	
	    	for(int j=1; j<i; j++) 
	    		 System.out.print(j+" ");
	    	
	    	
	    	//1 
	    	//1 2 1
	    	//1 2 3 2 1
	    	for(int k=i; k>0; k--)
	    		System.out.print(k+" ");
	    	
	    	System.out.println();
	    }
	    	
	     //1 2 3 4
       /*1 * i=1 
        * 2 1 2 1
        * 3 1 2 3 2 1
        * 4
        * */
	}

}
