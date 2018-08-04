package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	
System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/");
		driver.findElement(By.xpath(".//*[@id='tab-hotels']")).click();
	    driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys("New York (and vicinity), New York, United States of America");
	    driver.findElement(By.xpath(".//*[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB);

        
	 driver.findElement(By.xpath(".//*[@id='hotelFromDate']")).sendKeys(Keys.ENTER);   
	  driver.findElement(By.xpath(".//*[@id='navTravel']")).click();
	  driver.findElement(By.xpath(".//*[@id='navTripFlightAlerts']")).click();
	  WebDriverWait d = new WebDriverWait(driver,20);
	  d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='content']/div[1]/div[1]/a")));
	 
	  driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[1]/a")).click();
	 // d.until(ExpectedConditions.textToBePresentInElement(By.xpath("dfdfdfd"), "SIGN IN"));
	
	
	}

}
