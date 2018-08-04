package Basics;

		
		import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

import org.apache.commons.lang3.text.WordUtils;
import org.jsoup.Jsoup;
		import org.jsoup.nodes.Document;
		import org.jsoup.nodes.Element;
		import org.jsoup.select.Elements;



		public class ExtractingCrap {

		    public static void main(String[] args) throws Exception {
		        //String url = "https://stackoverflow.com/questions/2835505";
		        
		        String url = "http://services.groupkt.com/state/get/USA/all";
		        Document document = Jsoup.connect(url).ignoreContentType(true).get();

		        String text = document.select("body").text();
		        System.out.println("Question: \n" + text);
		        
		          

		        Elements answerers = document.select("body");
		        for (Element answerer : answerers) {
		        	 System.out.println("Answerer: " + answerer.text());
		        	
		        		 
		        		    
		        	 }
		               FileWriter fw = new FileWriter("./crapp/craps.txt");
		               BufferedWriter bw =new BufferedWriter(fw);
		               bw.write(text);
		               bw.flush();
		               bw.close();
		               
		               BreakingText();
		                   
		        	}
		    
		    
		    public static String fileReader() throws IOException{
		    	String data;
		    	FileReader re = new FileReader("./crapp/craps.txt");
		    	
		    	    BufferedReader bw = new BufferedReader(re);
		    	  String crap =  bw.readLine();
		    	  
		    	  return crap;
		    	
		    }
		    
		    
		    
		    public void searchFile(String fName, String lookup) throws FileNotFoundException{
		    	  Scanner in = new Scanner(new File(fName));
		    	  // Assumes the file has two "words" per line
		    	  while(in.hasNext()){
		    	    String name = in.next();
		    	    String number = in.next();
		    	    if(name.equals(lookup)){
		    	      System.out.println(number);
		    	    }
		    	  }
		    	}
		    
		    public static void BreakingText() throws IOException{
		    	String S = ExtractingCrap.fileReader();
		    	String F = WordUtils.wrap(S, 45);

		        String[] F1 =  F.split(System.lineSeparator());

		        System.out.println(F1[0]);

		        System.out.println(F1[1]);

		        F1[2] = F1[2] +'\b'+'\b'+'\b'+"...";
                 
		        System.out.println(F1[2]);
		        FileWriter fw = new FileWriter("./crapp/crapss.txt");
		        
		        BufferedWriter bw = new BufferedWriter(fw);
		        bw.write(F1[2]);
		        bw.flush();
		        bw.close();
		        
		        
		    }
		    
		        }
		        	
		    

		
		
	


