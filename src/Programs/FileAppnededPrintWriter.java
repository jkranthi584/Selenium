package Programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileAppnededPrintWriter {

	
	public static void main(String[] args) {
		try{
			String path="C://users//ccomp//documents//doc.txt";
			File file = new File(path);
			
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println();
			pw.println("crap crap crap");
			pw.println("2.crap crap crap crap");
			pw.println("3. crap crap crap crap crap ");
			pw.close();
			
			System.out.println("Datas has been added to the file");
		}catch(Exception ioe){
			System.out.println("Exception Occured: ");
			
			ioe.printStackTrace();
		}
	}
}
