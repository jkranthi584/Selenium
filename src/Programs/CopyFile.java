package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fout = null;
		try{
			
			String path="C://Users//ccomp/documents/doc.txt";
			String destination="C://Users//ccomp//documents//addo.txt";
			File infile = new File(path);
			
		    File outfile = new File(destination);
		    fis = new FileInputStream(infile);
		    fout=new FileOutputStream(outfile);
		    
		    
		    
		    byte[] duffer = new byte[1024];
		    int length;
		    while((length =fis.read(duffer) )>0){
		    	
		    	fout.write(duffer, 0, length);
		    	
		    }
		    fis.close();
		    fout.close();
		    System.out.println("file copied sucessfully");
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
		
	}
}
