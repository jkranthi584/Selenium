package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imnorobot {
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");	
	//WebDriver	driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");		
 WebDriver driver = new ChromeDriver();		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/recaptcha/api2/demo");
	//driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
	driver.findElement(By.cssSelector("#recaptcha-anchor"));
	int number = findFrameNumber(driver,(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")));
	driver.switchTo().frame(number);
	Thread.sleep(4000L);
	driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
	//driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
	
	

	}
	
	
	
	
	
	public static int findFrameNumber(WebDriver driver, By by){
		
		int i;//global variable
		
		//below commented out not using in this lecture
	//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//this one is we are using for now
	int framecount =driver.findElements(By.tagName("iframe")).size();	
		//driver.switchTo()
	
	for(i=0; i<framecount; i++)
		
  {
		
		   driver.switchTo().frame(i);
	// frame with this xpath present in the frame we switched or not, storing in count
	int count = driver.findElements(by).size();
	
		  if(count>0)
			  // count is greater zero means with that xpath frame is present
		    {
			  //here by = by.xpath/css selector
			//driver.findElement(by).click();
			  break;
		            
		        }else{
			 System.out.println("continue looping");
			 
		        }
		  
	       }
	driver.switchTo().defaultContent();
	    return i;
		
	}

}
