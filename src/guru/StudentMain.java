package guru;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StudentMain {
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Bob", 7, 8.9);
		Student s2 = new Student("James",9, 6.5);
		Student s3 = new Student("Kane",6,6.0);
		
		Student [] students ={s1,s2,s3};
		
		        System.out.println("\n Unsorted ARrays");
		        System.out.println(Arrays.toString(students));
		        Arrays.sort(students);
		        System.out.println("\n Sorted Arrays: ");
		        System.out.println(Arrays.toString(students));
		        
		        ArrayList<Student> students2 = new ArrayList<Student>();
		        students2.add(s1);
		        students2.add(s2);
		        students2.add(s3);
		        
		        System.out.println("unsorted ARraysList");
		        System.out.println(students2);
		        Collections.sort(students2);
		        System.out.println("\n Sorted ArraysList");
		        System.out.println(students2);
		        
		        
		        
		        
		        
		
	}

}
