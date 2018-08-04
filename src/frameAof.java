
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameAof {

	  
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
	            int frame1 =  switchingFrame(driver,By.className("recaptcha-checkbox-checkmark"));
	            
	             driver.switchTo().frame(frame1);
	              Thread.sleep(3000L);
	              driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
	             driver.switchTo().defaultContent();
	            
	           int frame2 = switchingFrame(driver,By.id("recaptcha-verify-button"));
	           
	       
	              driver.switchTo().frame(frame2);
	              
	              Thread.sleep(4000L);
	                 
	              WebElement ele = driver.findElement(By.id("recaptcha-verify-button"));
	                   Thread.sleep(3000L);
	              
	                if(!(ele.getText().equalsIgnoreCase("verify") && ele.isDisplayed())) {
	                	
	                	 ele.click();
	                	 Thread.sleep(3000);
	                	 ele.click();
	                	
	                }
	                
	                ele.click();

	}
    public static int switchingFrame(WebDriver driver,  By path) {
    	int i;
    	int frameCount = driver.findElements(By.tagName("iframe")).size();
    	
         for(i=0; i<frameCount; i++) {
        	 driver.switchTo().frame(i);
        	 int eleCount =  driver.findElements(path).size();
        	 
        	  if(eleCount>0)
        		  break;
        	  else
        		  driver.switchTo().defaultContent();
         }
         
          driver.switchTo().defaultContent();
        	  return i;
         
    	
    }
}
