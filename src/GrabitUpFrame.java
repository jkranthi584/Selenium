import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrabitUpFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		 int i = SwitchingFrame(driver, By.className("recaptcha-checkbox-checkmark"));
		 
		 driver.switchTo().frame(i);
	
		 driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		       Thread.sleep(3000L);
		  driver.switchTo().defaultContent();
		  
	           int fame2=  SwitchingFrame(driver,By.className("recaptcha-verify-button"));
	                  driver.switchTo().frame(fame2);
	           WebElement ele = driver.findElement(By.id("recaptcha-verify-button"));
	             
		     if(!(ele.getText().equalsIgnoreCase("verify") && ele.isDisplayed())) {
		    	 
		    	   ele.click();
		    	   Thread.sleep(3000L);
		    	   ele = driver.findElement(By.id("recaptcha-verify-button"));
		    	    ele.click();
		    	    
		     }
              ele.click();
	}
	
	public static int SwitchingFrame(WebDriver driver, By locator) {
		int i;
		
		  int frameCount = driver.findElements(By.tagName("iframe")).size();
		  
		  for(i=0; i<frameCount; i++) {
			  
			  driver.switchTo().frame(i);
			 int elementCount = driver.findElements(locator).size();
			  if(elementCount>0)
				  break;
			  else
				  driver.switchTo().defaultContent();
		  }
			  driver.switchTo().defaultContent();
		
		return i;
	}

}
