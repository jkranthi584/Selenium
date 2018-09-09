package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class AutoSuggestiveDropDownJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver", "C://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		  WebElement element = driver.findElement(By.name("fromPlaceName"));
		 driver.findElement(By.name("fromPlaceName")).sendKeys("BEN");
			Thread.sleep(6000L);
			         String text="";
			   /* do{
			    	 element.sendKeys(Keys.DOWN);
			     String script = "return document.getElementById(\"fromPlaceName\").value;";
			      	//driver.findElement(By.name("fromPlaceName"))
			              JavascriptExecutor jp = (JavascriptExecutor)driver;
			      text = (String)  jp.executeScript(script);
			       
			        System.out.println(text);
			    }while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")); */      
		           int i=0;
			         while(!text.contains("HYDERABAD INTERNATION AIPORT")){
			        	 
			        	 element.sendKeys(Keys.DOWN);
			        	   i++;
		                	  String script = "return document.getElementById(\"fromPlaceName\").value;";
		  			      	//driver.findElement(By.name("fromPlaceName"))
		                	  JavascriptExecutor jp = (JavascriptExecutor)driver;
		  			         text = (String)  jp.executeScript(script);
		                	  
		                	  System.out.println(text);
		                	 // i++;
		                	  
		                	  if(i>10)
		                		  break;
		                  }
		            
		           
		           
		           
		                	  if(i>10)
		                		  System.out.println("Element is not present");
		                	  
		                  
		       

		
		        
		      /*  while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")){
		        	
		        	driver.findElement(By.name("fromPlaceName")).sendKeys(Keys.DOWN);
		        }*/
	}

}
