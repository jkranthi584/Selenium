
public class GenericMethod {
	//GenericMethod
	public static <E> void printArray(E[] inputArray) {
		
		//display Array elements
		for(E element: inputArray)
			System.out.printf("%s ", element);
		
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Create arrays of integer, Doube,Chracter
		Integer[] intArray = {1,2,3,4,5,6};
		 Double [] doubleArray= {1.1,2.2,3.3,4.4};
		 Character[] charArray = {'a','b','c','d'};
		 System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}


