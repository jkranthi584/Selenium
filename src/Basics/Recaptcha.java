package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recaptcha {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int frameid = findFrameNumber(driver, By.id("recaptcha-anchor"));
		driver.switchTo().frame(frameid);
		driver.findElement(By.id("recaptcha-anchor")).click();
		driver.switchTo().defaultContent();
		int number = findFrameNumber(driver, By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));;
		//ele.click();
		if (!ele.getText().equals("Verify") && ele.isDisplayed()) {
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		//ele = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
		//ele.click();
		}
		ele.click();
	}
	
	 public static int findFrameNumber(WebDriver driver, By path) throws InterruptedException {
		 int i;
		 int framecount = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("the framecount is: "+framecount);
		 for (i = 0; i < framecount; i++) {
		 System.out.println("value of i is: "+i);
		 driver.switchTo().frame(i);
		 int count = driver.findElements(path).size();
		 System.out.println("no of elementes with this path are: "+count);
		 if (count > 0) {
		 // driver.findElement(path).click();
		 System.out.println("the i is: "+i);
		 break;
		 } else {
		 System.out.println("Continue looping");
		 driver.switchTo().defaultContent();
		    }
		 }
		 driver.switchTo().defaultContent();
		 return i;

		 }

	
}
