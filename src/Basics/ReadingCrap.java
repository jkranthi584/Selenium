package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadingCrap {

	
	
	  public static void main(String[] args) throws Throwable {
		/*  String filepath="./crap/crapcrap.txt";
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		List<String> list = new ArrayList<String>();
		String data= br.readLine();
		String crap="";
	  while(data !=null){
		for(int i=0;i<data.length()-1; i++){
			String path="./crap/crapest.txt";
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(data);
			bw.flush();
			bw.close();
			data= br.readLine();
		}
		try {
			System.out.println(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path="./crap/crapest.txt";
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(data);
		bw.flush();
		bw.close();*/
			BufferedReader reader;
			try {
				String filepath="./crap/crapcrap.txt";
				reader = new BufferedReader(new FileReader(
						filepath));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					BufferedWriter bw = new BufferedWriter(new FileWriter("./crap/crapest.txt"));
					// read next line
					line = reader.readLine();
					  
					
					
				}
				
				reader.close();
				BufferedWriter bw = new BufferedWriter(new FileWriter("./crap/crapest.txt"));
				/*while(line !=null){
					
				bw.write(line);
				 bw.newLine();
				}
				bw.flush();
				bw.close();*/
				bw.write(line);
				bw.newLine();
				bw.close();
						
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
	  }

