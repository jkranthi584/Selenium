package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRahul {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         


driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");     

          WebElement table=      driver.findElement(By.tagName("Table"));
                           //WebElement table=     driver.findElement(By.xpath("//article[@class='sub-module scorecard']/ul/li/div[2]/div[1]"));
             List<WebElement> rows=                   table.findElements(By.tagName("tr"));
             
                            /*  int i=0;
                              for(WebElement row: rows){

                            	  
                            	  i++;
                            	  
                     List<WebElement>       cols=	  row.findElements(By.tagName("td"));
                     
                             System.out.println("no of cols in: " +i+ "row are " +cols.size());
                             
                             
                             for(WebElement col: cols){
                            	 
                            	 
                            	 System.out.print(col.getText());
                            	 System.out.print("  ");
                             }
                            	  System.out.println();
                               
                              }*/
             
	               List<WebElement> rowcount= table.findElements(By.tagName("tr"));
	               
	               for(int i=0; i<rowcount.size(); i++){
	            	   
	            	 WebElement row=  rowcount.get(i);
	            	   
	            	  List<WebElement> colcount=     row.findElements(By.tagName("td"));
	            	  
	            	   
	            		 System.out.println("no of coloums in "+i+" row are:  "+colcount.size());
	            		 for(int j=0; j<colcount.size(); j++){
	            			 //following step is wrong, we want it to print out only one time for the cols, hence it
	            			 // sould be in the first for=loop
	            	    	// System.out.println("no of coloums in "+i+"row are"+colcount.size());	
	            	    	WebElement     col=   colcount.get(j);
	            	    	           System.out.print(  col.getText()+" ");
	            	    	           //System.out.println(" ");
	            	    	        
	            	    }
	            	    System.out.println();
	            	      
	               }
	}

}
