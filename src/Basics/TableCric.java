package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCric {
	public static void main(String[] args) {int sum=0;
	System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
	
	       WebElement table =  driver.findElement(By.xpath(""));
	         
		          List<WebElement> cols =table.findElements(By.xpath(""));
		          
		          for(int i=0; i<cols.size()-2;i++){
		        	  
		        	       String value=driver.findElement(By.cssSelector("")).getText();
		        	       
		        	   int valueint=    Integer.parseInt(value);
		        	   
		        	   sum= sum + valueint;
		        	   System.out.println(sum);
		        	             
		        	             
		          }
		          
		          
		        String extras=       driver.findElement(By.xpath("//*[text()='Extras']")).getText();
		        
		                      int extrasint= Integer.parseInt(extras);
		                         
		                      System.out.println(extrasint);
		                          int total = sum + extrasint;
		                          System.out.println(total);
		                      
		                      
		                      
		                String expectedvalue=      driver.findElement(By.xpath("//*[text()='Total]")).getText();
		                
		                  int totalint=             Integer.parseInt(expectedvalue);
		                  
		                  if(totalint==total){
		                	  
		                	  System.out.println("count matched!!!");
		                  }
		                  else{
		                	  System.out.println("count doesnt Match");
		                  }
	
		 
	}

}
