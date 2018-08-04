package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	public static void main(String[] args) throws InterruptedException {
//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");		
//	WebDriver	driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		
	Actions action = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//driver.get("https://www.jqueryui.com/droppable");
	//driver.get("https://www.jqueryui.com/resizable");
	driver.get("http://jqueryui.com/slider/#colorpicker");
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(frame);
	//WebElement drag =driver.findElement(By.id("draggable"));
	//WebElement drop =driver.findElement(By.id("droppable"));
	//action.doubleClick(drag);
	Thread.sleep(4000L);
	//action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	//WebElement drag = driver.findElement(By.xpath(".//div[@id='resizable']/div[3]"));
	 WebElement drag = driver.findElement(By.xpath(".//div[@id='blue']/span"));
	
	action.clickAndHold(drag).moveByOffset(20, 0).release().build().perform();
	Thread.sleep(4000L);
	action.clickAndHold(drag).moveByOffset(100, 0).release().build().perform();
	//action.contextClick(drag);
	
	
	
	
	//action.dragAndDrop(drag, drop).perform();

	Thread.sleep(4000L);
	driver.quit();
	
	}

}
