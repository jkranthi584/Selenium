import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
		       System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       
		           driver.get("https://www.google.com/recaptcha/api2/demo");
		       int count = switchingFrame(driver,By.className("recaptcha-checkbox-checkmark"));
		                   driver.switchTo().frame(count);
		                          Thread.sleep(3000L);
                  driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
                         driver.switchTo().defaultContent();
                                Thread.sleep(3000L);
                   int count2= switchingFrame(driver,By.id("recaptcha-verify-button"));
                              driver.switchTo().frame(count2);
                         
                   
                     WebElement ele   =  driver.findElement(By.id("recaptcha-verify-button"));
                      if(!(ele.getText().equals("Verify")&&ele.isDisplayed())) {
                    	  
                    	         ele.click();
                    	        Thread.sleep(3000);
                    	   
                    	 ele  = driver.findElement(By.id("recaptcha-verify-button"));
                    	  ele.click();
                    	     
                      }
                              ele.click();      
                             driver.close();                     
                         
	}
		
		public static int switchingFrame(WebDriver driver, By path) {
			
			 int i;
			 int frameCount =  driver.findElements(By.tagName("iframe")).size();
			 
					     for(i=0; i<frameCount; i++) {
					    	  driver.switchTo().frame(i);
					    	 
					    	int eleCount =  driver.findElements(path).size();
					    	
					    	  if(eleCount>0) 
					    		 //System.out.println("Element is found with that");
					    		 break;
					    		  
					    	  
					    	  else 
					    		  driver.switchTo().defaultContent();
					    
					     }
			     driver.switchTo().defaultContent();
			
			        return i;
			
		}

}