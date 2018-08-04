import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Frames {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//now before below steps create a Method
       
	      int number=    findingCorrectFrame(driver, By.id("recaptcha-anchor"));
	      driver.switchTo().frame(number);
	      driver.findElement(By.id("recaptcha-anchor")).click();
		
	   
		
		
	}
	///1 step after declaring the website
	public static int findingCorrectFrame(WebDriver driver, By path){
		
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for(i=0; i<framecount; i++) {
			driver.switchTo().frame(i);
			System.out.println("the value of i(means how many iframes are there in the page: "+ framecount);
            
      int count =  driver.findElements(path).size();
      if(count>0) {
    	  System.out.println("frame index is: "+i);
    	  break;
      }else {
    	  
    	  System.out.println("Continue looping through the frames until you find a frame with this path");
    	  driver.switchTo().defaultContent();
      }
			
		}
		
		driver.switchTo().defaultContent();
		return i;
		
		}

}
