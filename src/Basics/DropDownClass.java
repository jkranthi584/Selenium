package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		String url ="https://jqueryui.com/droppable/";
		driver.get(url);
		Actions act = new Actions(driver);
		Thread.sleep(5000L);
		   //WebElement source= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		   driver.switchTo().frame(0);
		  /* WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);*/
		
		
		  WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));
		    
		        act.dragAndDrop(source, target).build().perform();

				 
		     String clas=   target.getAttribute("class");
		    //if(target.getAttribute("class").contains("ui-state-highlight"))
		     if(clas.equalsIgnoreCase("ui-widget-header ui-droppable ui-state-highlight"))
		    	 System.out.println("passed");
		     else
		    	 System.out.println("failed");
		     
		     driver.close();
		
	}

}
