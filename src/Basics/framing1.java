package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framing1 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		Thread.sleep(5000L);
	int number=	findingRightFrame(driver,By.id("recaptcha-anchor"));
	   driver.switchTo().frame(number);
	   driver.findElement(By.id("recaptcha-anchor")).click();
	   //back to  home page
	   driver.switchTo().defaultContent();
	  int number2= findingRightFrame(driver, By.cssSelector("button[id='recaptcha-verify-button']"));
			  //(driver,By.id("recaptcha-verify-button"));
	       Thread.sleep(4000L);
	     driver.switchTo().frame(number2);
	     Thread.sleep(4000L);
	     WebElement ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));;
	     ele.click();
	// driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	 
	  //driver.findElement(By.id("recaptcha-verify-button")).click();
	/* WebElement ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	  ele.click();
	  if (!ele.getText().equals("Verify") && ele.isDisplayed()) {
	  Thread.sleep(2000);
	  ele.click();
	  Thread.sleep(2000);
	  ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	  ele.click();
	  
	      }*///ifclosed
	
	}	
	
     //scope of the main driver is within dirver passing below the driver here as parameters so that we can use driver here	
	public static int findingRightFrame(WebDriver driver, By by){
		int i;
      int framecount  =	driver.findElements(By.tagName("iframe")).size();
      System.out.println(framecount);
      for( i=0; i<framecount; i++){
    	  
    	  driver.switchTo().frame(i);
    	  //now framewith this xpath exist or not
    	 int count =  driver.findElements(by).size();
    	 
    	 //size will return 0 if there is no object with this xpath
    	
    	 if(count >0){
    		// driver.findElement(by).click();
    		 break;
    	 }
    	 else{
    		 System.out.println("continue looping until the frame with this xpath is found");
    		 driver.switchTo().defaultContent();
    	 }
    	 
      }//forloop
      driver.switchTo().defaultContent();
	return i;
		
	}
	

}



