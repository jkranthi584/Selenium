package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class mouseactions {
	public static void main(String[] args) {
//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
	DesiredCapabilities firefoxCapabilities = DesiredCapabilities.firefox();
	firefoxCapabilities.setCapability("marionette", true);
	//driver = new RemoteWebDriver(amazon.com, firefoxCapabilities);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.amazon.com/");
	
	Actions a = new Actions(driver);
	WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-shopall']"));
	a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("jumbo").doubleClick().build().perform();
	//WebElement(move).build().perform();
	// #twotabsearchtextbox
	//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-shopall']"))).build().perform();
	a.moveToElement(move).contextClick().build().perform();

      }
}
