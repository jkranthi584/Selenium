package Basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//lecture 67
public class multiplewindow {
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
	driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click();
	System.out.println("Before performing the switching of windows");
	System.out.println(driver.getTitle());
	
	Set<String>ids = driver.getWindowHandles();
	
	Iterator<String> it = ids.iterator();
	String parentid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	System.out.println("Switching to the Child ");
	System.out.println(driver.getTitle());
	

	driver.switchTo().window(parentid);
	System.out.println("switching driver back to the parent now: ");
	System.out.println(driver.getTitle());
	
	   driver.quit();
	   //driver.close();
	  
		
	}
	
	

}
