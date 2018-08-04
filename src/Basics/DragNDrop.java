package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//ui-state-highlight
		Thread.sleep(5000L);
		//driver.switchTo().frame(0);
		
		
	     Actions act = new Actions(driver);
	     
	     
	     driver.switchTo().frame(0);
	     
	     
	    /* WebElement drag=	driver.findElement(By.xpath(".//*[@id='draggable']"));
	 	WebElement drop = driver.findElement(By.xpath(".//*[@id='droppable']"));*/
	 	 WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));
		    


		 
	    	
	    	act.dragAndDrop(source, target).build().perform();
	    	
	    	if(target.getAttribute("class").contains("ui-state-highlight"))
	    		System.out.println("passed");
	    	else
	    		System.out.println("failed!");
	    		
	    	driver.close();
	    		
	    	}
	    
	     
		
	}


