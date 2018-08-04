package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imnorobot1 {
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");	
	//WebDriver	driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");		
 WebDriver driver = new ChromeDriver();		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.megatypers.com/register");
	driver.findElement(By.xpath(".//div[@class='rc-anchor-center-container']/div/span/div[5]"));
	//driver.findElement(By.xpath(".//div[@class='recaptcha-checkbox-checkmark']"));
	//driver.findElement(By.cssSelector("#recaptcha-anchor"));
	//int number = findFrameNumber(driver,(By.xpath(".//div[@class='recaptcha-checkbox-checkmark']")));
	int number = findFrameNumber(driver,By.xpath(".//div[@class='rc-anchor-center-container']/div/span/div[5]"));
	driver.switchTo().frame(number);
	Thread.sleep(4000L);
	driver.findElement(By.xpath(".//*[@class='rc-anchor-center-container']/div/span/div[5]")).click();
	//driver.findElement(By.xpath(".//div[@class='recaptcha-checkbox-checkmark']")).click();
	//driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
	
	driver.switchTo().defaultContent();
	//define the xpath after finding it in a website
	//int number1 = findFrameNumber(driver,(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")));
    // driver.switchTo().frame(number1);
    // driver.findElement(By.xpath("find the website and xpath of it")).click();
	}
	
	
	
	
	






	public static int findFrameNumber(WebDriver driver, By by){
		
		int i;//global variable
		
		//below commented out not using in this lecture
	//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//this one is we are using for now
	int framecount =driver.findElements(By.tagName("iframe")).size();
	System.out.println("No of frames present on the page with this tagName: "+framecount);
		//driver.switchTo()
	
	for(i=0; i<framecount; i++)
		
  {
		
		   driver.switchTo().frame(i);
	// frame with this xpath present in the frame to which we switched or not, storing in count
	int count = driver.findElements(by).size();//size is 0 means no object/element presing in the frame
	//withthis xpath
	
		  if(count>0)//size is 1 or more means object with this xpath is there
			  // count is greater zero means with that xpath frame is present
		    {
			  //here, by = by.xpath/css selector
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

