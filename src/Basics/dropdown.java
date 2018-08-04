package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		Select s = new Select(driver.findElement(By.id("gh-cat")));
		s.selectByValue("2984");// it will seclect the baby 
		s.selectByVisibleText("Books");
		driver.findElement(By.cssSelector(".gh-control")).click();
		   
		/*driver.get("http://spicejet.com/");
		  
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	      s.selectByVisibleText("3 Adults");
	      driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	      driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
	      
	    //driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	    driver.findElement(By.xpath("(.//a[@value='GOI'])[2]")).click();
	    
		
		
		*/
	
		
		
		
	}

}
