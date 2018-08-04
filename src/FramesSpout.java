import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSpout {
	//public WebDriver driver;
	//not working public driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	int number=	findingFrameonPage(driver, By.id("recaptcha-anchor"));
	driver.switchTo().frame(number);
	driver.findElement(By.id("recaptcha-anchor")).click();
	driver.switchTo().defaultContent();
	
	  int number2=   findingFrameonPage(driver, By.cssSelector("button[id='recaptcha-verify-button"));
	  Thread.sleep(4000);
		driver.switchTo().frame(number2);
		 Thread.sleep(4000);
	WebElement	elmnt =driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
		if(!elmnt.getText().equals("Verify")&& elmnt.isDisplayed()) {
			
			Thread.sleep(4000);
			elmnt.click();
			 Thread.sleep(4000);
			elmnt = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
			elmnt.click();
			
		}
		elmnt.click();
		System.out.println();
		  
	}//scope of the main driver is within dirver passing below the driver here as parameters so that we can use driver here	
	//1 step after specifying the website name
	public static int findingFrameonPage(WebDriver driver, By path) {
		int i;
	int numberofFrames =driver.findElements(By.tagName("iframe")).size();
	
	int num = numberofFrames;
	System.out.println("number of frames on this page is: "+ num);
	for(i=0; i<num; i++) {
		
		System.out.println("Value of i is: "+ i);
		driver.switchTo().frame(i);

   	 //size will return 0 if there is no object with this xpath
	int count=	driver.findElements(path).size();
	
	    if(count > 0) {
	    	System.out.println("count is: "+count);
	      //driver.findElement(path).click();
	      break;
	      //break is use to stop looping if item/object is found 
	    }else {
	    	
	    	System.out.println("continue looping until frame is found with this path");
	    	driver.switchTo().defaultContent();
	    }
	    
	    
		
	}
	driver.switchTo().defaultContent();
		
		return i;
	}
	

}
