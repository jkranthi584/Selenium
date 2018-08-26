
public class CompressStrings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String k = "aaaabbbccddf";
		 char[] ss= k.toCharArray();
		 int sum=0;
		 char temp=k.charAt(0);
		 System.out.println(temp);
		 
			for(int i=0; i<k.length(); i++) {
				if(k.charAt(i)==temp)
					sum++;
				else {
					System.out.print(temp+""+sum);
				    temp=k.charAt(i);
				     sum=1;
				}
			 }
				System.out.print(temp+""+sum);
			System.out.println();
				
				int [] arr= {5,7,9,12,61};
				int min=arr[0];
				for(int i=0; i<arr.length; i++)
				{ 
					for(int j=i+1;j<arr.length; j++) {
						int t=0;
					  if(arr[i]<arr[j])
					  { /* t=arr[i];
						  arr[i]=arr[j];
						  arr[j]=t;*/
						  arr[i]=arr[i]+arr[j];
						  arr[j]=arr[i]-arr[j];
						  arr[i]=arr[i]-arr[j];
						  
					  }
					}
			    System.out.print(arr[i]);
			    if(arr[i]!=arr[arr.length-1])
			    	System.out.print(",");
			    
						
				}
			 
		 
	
	}

}
