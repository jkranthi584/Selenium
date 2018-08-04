package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		Actions act = new Actions(driver);
	      act.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
	        Thread.sleep(5000);
	      driver.findElement(By.linkText("Health")).click();
	      
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      driver.navigate().back();
	      driver.navigate().back();
              WebElement ele = driver.findElement(By.linkText("Fashion"));
              act.moveToElement(ele).build().perform();
	      Thread.sleep(5000);
	      driver.findElement(By.linkText("Jewelry")).click();
	      
	}

}
