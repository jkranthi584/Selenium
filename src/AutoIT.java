import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C://Chromedriver.exe");
		     
		      ChromeOptions opt  = new ChromeOptions();
			 opt.addArguments("disable-infobars");
		      WebDriver driver = new ChromeDriver(opt);
		     
		      driver.get("http://toolsqa.com/automation-practice-form/");
		     
		     WebElement ele =  driver.findElement(By.id("photo"));
		     JavascriptExecutor je = (JavascriptExecutor)driver;
		     je.executeScript("arguments[0].scrollIntoView(true);",ele);
		     // je.executeScript("arguments[0].scrollIntoView(true)", ele);
		     
		       Wait<WebDriver> fd = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
		    		   .ignoring(NoSuchElementException.class);
		            WebDriverWait wt = new WebDriverWait(driver, 30);
		            wt.until(ExpectedConditions.elementToBeClickable(ele));
		         ele.click();
		      //driver.findElement(By.name("photo")).click();
		       Thread.sleep(5000);
		      Runtime.getRuntime().exec("c:\\users\\ccomp\\Documents\\guru.exe");
		      
		}
	
		
	}


