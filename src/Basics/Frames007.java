package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames007 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int frameid = findFrame(driver, By.id("recaptcha-anchor"));
	                  driver.switchTo().frame(frameid);
	                  driver.findElement(By.id("recaptcha-anchor")).click();
	                  
	                  driver.switchTo().defaultContent();
	                  
	            int number=  findFrame(driver, By.xpath("//*[@id='recaptcha-verify-button']"));
	                 driver.switchTo().frame(number);
	                 
	                 
	              WebElement element=   driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	                 
	                   Thread.sleep(3000L);
	                 
	                  while(!element.getText().equals("Verify")&& element.isDisplayed()){
	                	  
	                	  Thread.sleep(4000L);
	                	  element.click();
	                     // element=   driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
	                     // element.click();
	                      
	                  }
	                  
	                  element.click();
	                 // driver.close();
	
	
	}/*
	public static int findFrame(WebDriver driver, By path){
		
	        int i;
	        
	     int framecount=   driver.findElements(By.tagName("iframe")).size();
	     System.out.println("the no of framcount"+framecount);
	     
	     for(i=0; i<framecount; i++){
	    	 
	    	 driver.switchTo().frame(i)
;
	    	 
	    	 System.out.println("the value of i is: "+i);
	    	 
	    int pathcount=	 driver.findElements(path).size();
	    	 
	    
	        if(pathcount>0){
	        	
	        	
	        	System.out.println("the i is inside if condition is: "+i);
	        	break;
	        }
	        else{
	        	
	        	System.out.println("Continue looping");
	        	driver.switchTo().defaultContent();
	        	
	        	
	        }
	    	 
	     }
	        
		driver.switchTo().defaultContent();
		
	   return i; 
	
	}   
}
	*/
	
	
	public static int findFrame(WebDriver driver, By path){
		
		int i;
		
	int framecount=	 driver.findElements(By.tagName("iframe")).size();
		
	       System.out.println("The no of framecount is: "+framecount);
	       
	       for(i=0; i<framecount; i++){
	    	   
	    	   driver.switchTo().frame(i);
	    	   System.out.println("The value of i is: "+i);
	    	int pathcount=   driver.findElements(path).size();
	    	System.out.println("no of elements with this path are: "+pathcount);
	    	
	    	if(pathcount>0){
	    		
	    		//i=pathcount;
	    		 System.out.println("the value of i is: "+i);
	    		 break;
	    	}
	    	else{
	    		
	        System.out.println("Continue looping");
	        driver.switchTo().defaultContent();
	    	}
	    	   
	    	   
	       }
	       
	       driver.switchTo().defaultContent();
	       return i;
		
	}
	}
	

