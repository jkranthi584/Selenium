
public class PatterProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=8; i>2; i--) {
			for(int j=1; j<i; j++)
				System.out.print(j+" ");
			
			 System.out.println();
		}
		for(int i=1;i<8; i++) {
			for(int j=1; j<=i; j++)
				System.out.print(j+" ");
			System.out.println();
			
		}
		for(int i=1; i<8; i++) {
			for(int j=7; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	
	    for(int i=1; i<8; i++) {
	    	
	    	for(int j=1; j<i; j++) 
	    		 System.out.print(j+" ");
	    	
	    	
	    	
	    	for(int k=i; k>0; k--)
	    		System.out.print(k+" ");
	    	
	    	System.out.println();
	    }
	    	
       
	}

}
