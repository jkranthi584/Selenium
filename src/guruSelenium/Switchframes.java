package guruSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Switchframes {
	  public static void main(String[] args) throws Exception {
		  System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		  //	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");  
		  //	WebDriver driver = new FirefoxDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	    driver.switchTo().frame("packageFrame");
	       
	        driver.findElement(By.linkText("AjaxElementLocator")).click();
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("packageListFrame");
	        driver.findElement(By.linkText("All Classes")).click();
	       
	        Thread.sleep(4000L);
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.partialLinkText("org.openqa.selenium")).click();
	        driver.close(); 
	    }
}