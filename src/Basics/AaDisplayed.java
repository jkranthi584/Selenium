package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AaDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	WebDriver	driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
	//right on indeed
	driver.get("https://www.aa.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id='bookingModule']/div[1]/div[1]/ul/li[2]/label")).click();
	  ////*[@id="aa-returningFrom"]
	   if(!(driver.findElement(By.id("aa-returningFrom")).isDisplayed())){
		    
		   ////*[@id='bookingModule']/div[1]/div[1]/ul/li[1]/label/span[1]
		  driver.findElement(By.xpath("//*[@id='bookingModule']/div[1]/div[1]/ul/li[1]/label/span[2]")).click();
		    driver.findElement(By.name("origin")).sendKeys("hyderabad");
		    driver.findElement(By.linkText("My trips")).click();
		Thread.sleep(5000L);
		     WebElement  element = driver.findElement(By.name("firstName"));
                WebDriverWait wait  = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
		   element.sendKeys("crap");
		    driver.findElement(By.name("lastName")).sendKeys("Last crap");
		   driver.findElement(By.name("recordLocator")).sendKeys("9090");
		  
		   
	   }
	}

}
