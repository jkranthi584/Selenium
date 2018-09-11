import java.util.Arrays;
import java.util.Scanner;

public class CTSAddingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Etner  numbers");
        Scanner user = new Scanner(System.in);
        int total = user.nextInt();
        //5 91 30 55 20
        int ar[]=new int[total];
        System.out.println("Enter the numbers one after the other");
        for(int i=0;i<total; i++)
        	 ar[i]= user.nextInt();
           Arrays.sort(ar);
        for(int i=0; i<ar.length-1; i++) {
       	 
        	while(i+1 <ar.length && ar[i]<ar[i+1]) {
        		
        		  System.out.print(ar[i]+" ");
        		   ar[i]=ar[i]+1;
        		  
        	 }
        	 System.out.println();
         }
        System.out.println(ar[ar.length-1]);
	}

}
