package Programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AppendFile {
	public static void main(String[] args) {
		try{
		
		String content ="  "
				
				+"Now this is crap added to the crppiest file";
		
		
		File file = new File("C://users//ccomp//documents//crapcrap.txt");
		
		if(!file.exists()){
			file.createNewFile();
		
		}
		
		FileWriter fw = new FileWriter(file,true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
		System.out.println("Data has been appended to the file");
		
		}catch(Exception ioe){
			System.out.println("Exception has occured");
			ioe.printStackTrace();
			
		}
		
	}

}
