package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("https://www.jqueryui.com/droppable");
		System.out.println("how many numbers of frames are there?");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);		
		Actions hate = new Actions(driver);
		//driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Thread.sleep(4000L);
		driver.findElement(By.id("draggable")).click();
	hate.doubleClick(drag);
		
		hate.dragAndDrop(drag, drop).build().perform();
		//hate.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[5]/a")).click();
		
		
		//driver.quit();
	}

}
