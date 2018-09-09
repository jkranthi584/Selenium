package Basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScroll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   ChromeOptions cop = new ChromeOptions();
	   cop.addArguments("disable-infobars");

	/*DesiredCapabilities dc = DesiredCapabilities.chrome();
	dc.setCapability(ChromeOptions.CAPABILITY,true );*/
	/*
      WebDriver driver = new ChromeDriver(cop);
		driver.get("https://www.snapdeal.com/");
	        
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Subscribe')]"));
	    Object obj = ((JavascriptExecutor)driver)
	    		.executeScript("arguments[0].scrollIntoView(true);",ele);
	      ele = (WebElement) obj;
	     Actions act = new Actions(driver);
	     act.moveToElement(ele).build().perform();
	      Wait <WebDriver>wait = new FluentWait<WebDriver>(driver)
	    		  .
		
	    	 Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
	    			 .withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
	    			 .ignoring(NoSuchElementException.class);
	    	 
	           ChromeOptions opt = new ChromeOptions();
	    	opt.addArguments("disable-infobars");
	    	DesiredCapabilities dc =  DesiredCapabilities.chrome();
	    	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        
	    	FirefoxProfile fp = new FirefoxProfile();
	          ((JavascriptExecutor)driver).executeScript("window.scroll(x,y)");
	  
	    	
	    	        File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	        FileUtils.copyFile(src, new File("c:\\user\\screeenot"));
	    	        int min =0;*/
	    	        Random r = new Random();
	    	   
	    	        
	    	        for(int i=0; i<10; i++) {
	    	        	int rand = 1 + r.nextInt(100);
	    	             if(i!=9)
	    	        	System.out.print(rand+", ");
	    	             else
	    	            	 System.out.print(rand);
	    	        }
	    	System.out.println();
	    	        String m="random";
	    	        String t="";
	    	        for(int i=m.length()-1; i>=0; i--)
	    	        	t+= m.charAt(i);
	    	        
	    	        if(m.equalsIgnoreCase(t))
	    	        	System.out.println("palindrome");
	    	        else
	    	        	System.out.println("it isnt");
	    
	    	
	}

}
