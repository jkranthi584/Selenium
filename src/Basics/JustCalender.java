package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustCalender {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	     driver.get("https://www.path2usa.com/travel-companions");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.cssSelector("#travel_date")).click();
	     while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July")){
	    	 

	    	 driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	 		
	     }
	     
	     int count = driver.findElements(By.className("day")).size();
	     
	        /* for(int i=0; i<count; i++){
	        	 String text= driver.findElements(By.className("day")).get(i).getText();
	        	 if(text.equalsIgnoreCase("9")){
	        		 driver.findElements(By.className("day")).get(i).click();
	        	
	        	  break;
	         }
	        	
	     
	     
	     
	
     }*/  int i=0;
	     while(i<count){
	    	 String text= driver.findElements(By.className("day")).get(i).getText();
	    	 
	    	 if(text.equalsIgnoreCase("9")){
        		 driver.findElements(By.className("day")).get(i).click();
        	
        	  break;
         }
	    	 i++; 
	    	 
	     }
     }
}