package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpage {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	
		//WebDriver driver = new FirefoxDriver();
		 // Open Application
		  driver.get("http://jqueryui.com");
		  
		 
		  // Wait for 5 second
		  Thread.sleep(5000);
		 
		 // This  will scroll page 400 pixel vertical
		  ((JavascriptExecutor)driver).executeScript("scroll(0,700)");
		  
		
		
	}
	
	
		
	}


