package Basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class screenshots {
	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");	
	WebDriver	driver = new FirefoxDriver();
	driver.manage(). timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//	WebDriverWait objec= new WebDriverWait(driver,5);
	//objec.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("give the xpath")));
	//Actions act = new Actions(driver);
	//act.doubleClick();
	driver.get("https://www.google.com");
	//to take a screenshot in selenium we are casting by importing the function
	//Takescreen, selenium doesn't have inbuild func for taking screenshots
	java.io.File srcFile =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new java.io.File("C://Downloads/takescreenshot.png"));
	
	}

}
