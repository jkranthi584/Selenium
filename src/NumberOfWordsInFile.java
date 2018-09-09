import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NumberOfWordsInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File file = new File("C:\\Users\\ccomp\\workspace\\Selenium1\\79139506.txt");
       FileInputStream fis = new FileInputStream(file);
        
            byte[] bytear = new byte[(int) file.length()];
             fis.read(bytear);
             int count=0;
            String s = new String(bytear);
                String[] sarr = s.split(" ");
            for(int i=0; i<sarr.length; i++) {
            	count++;
            	System.out.print(sarr[i]+" ");
           
            	if(sarr[i].contains("."))
            		System.out.println();
            
            }
            
            System.out.print("Number of words in this file are: ");
    	   
            System.out.print(count);
            
       }
       
      // 
	}         


