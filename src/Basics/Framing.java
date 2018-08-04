package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framing {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		Thread.sleep(5000L);
		   Framing obj = new Framing();
		 int number=    obj.findingFrame(driver);
		 System.out.println("Frame Index is: "       +number);
		 
		 
		
		
	}
     //scope of the main driver is within dirver passing below the driver here as parameters so that we can use driver here	
	public int findingFrame(WebDriver driver){
		int i;
      int framecount  =	driver.findElements(By.tagName("iframe")).size();
      System.out.println("the framecount is: "+framecount);
      for( i=0; i<framecount; i++){
    	  
    	  driver.switchTo().frame(i);
    	  //now framewith this xpath exist or not
    	 int count =  driver.findElements(By.id("recaptcha-anchor")).size();
    	 
    	 //size will return 0 if there is no object with this xpath
    	
    	 if(count >0){
    		 driver.findElement(By.id("recaptcha-anchor")).click();
    		 break;
    	 }
    	 else{
    		 System.out.println("continue looping until the frame with this xpath is found");
    	 }
    	  
      }//forloop
      driver.switchTo().defaultContent();
	return i;
		
	}
	

}
