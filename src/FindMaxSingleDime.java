
public class FindMaxSingleDime {
//bubble sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,9,32,2,1};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
			System.out.print(arr[i]);
			if(arr[i]!=arr[arr.length-1])
				System.out.print(", ");
		}
		int x=5; int y=10;
		System.out.println("\nx: "+x+"\n y: "+y);
		  x=x+y;
		  y=x-y;
		  x=x-y;
		  System.out.println("x: "+x+"\n y: "+y);
	}

}
