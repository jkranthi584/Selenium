package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class helliscalendar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
	WebDriver	driver = new FirefoxDriver();
	driver.get("https://www.aa.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#aa-leavingOn")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();
	Thread.sleep(4000L);
	driver.findElement(By.cssSelector("#aa-returningFrom")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[6]/a")).click();
	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
	Select s = new Select(driver.findElement(By.id("flightSearchForm.childPassengerCount")));
	s.selectByIndex(6);
	
	driver.findElement(By.id("bookingModule-submit")).click();
	
	}

}
