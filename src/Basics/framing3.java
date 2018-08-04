package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framing3 {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		 //driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
		
		Thread.sleep(5000L);
	int number=	findingRightFrame(driver,By.id("recaptcha-anchor"));
	   driver.switchTo().frame(number);
	   driver.findElement(By.id("recaptcha-anchor")).click();
	   //back to  home page
	   driver.switchTo().defaultContent();
	  int number2= findingRightFrame(driver,By.id("recaptcha-verify-button"));
	       Thread.sleep(4000);
	     driver.switchTo().frame(number2);
	     Thread.sleep(4000L);
	  driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	 
	  driver.findElement(By.id("recaptcha-verify-button")).click();
	 WebElement ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	  ele.click();
	  if (!ele.getText().equals("Verify") && ele.isDisplayed()) {
	  Thread.sleep(2000);
	  ele.click();
	  Thread.sleep(2000);
	  ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	  ele.click();
	  
	      }//ifclosed
	
	}	
	
     //scope of the main driver is within dirver passing below the driver here as parameters so that we can use driver here	
	public static int findingRightFrame(WebDriver driver, By path){
		int i;
      int framecount  =	driver.findElements(By.tagName("iframe")).size();
      System.out.println(framecount);
      for( i=0; i<framecount; i++){
    	  System.out.println("the valuse of i is:  "+i);
    	  
    	  driver.switchTo().frame(i);
    	  //now framewith this xpath exist or not
    	 int count =  driver.findElements(path).size();
    	 
    	 //size will return 0 if there is no object with this xpath
    	
    	 if(count >0){
    		//driver.findElement(by).click();
    		 System.out.println(i);
    		 break;
    	 }
    	 else{
    		 System.out.println("continue looping until the frame with this xpath is found");
    		 driver.switchTo().defaultContent();
    	 }
    	 
      }//forloop
      driver.switchTo().defaultContent();
      
      System.out.println("retuning i in below step: "+i);
	return  i;
		
	}
	

}



