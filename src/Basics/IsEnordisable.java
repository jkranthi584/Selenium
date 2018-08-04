package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnordisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	WebDriver	driver = new FirefoxDriver();
	driver.get("https://www.aa.com/");
	System.out.println("Is Return button is enble bfore clicking one way button");
System.out.println(driver.findElement(By.xpath(".//*[@id='aa-returningFrom']")).isDisplayed());
//driver.findElement(By.xpath(".//*[@id='aa-returningFrom']")).isEnabled();
System.out.println(driver.findElement(By.xpath(".//*[@id='aa-returningFrom']")).isEnabled());
	//driver.findElement(By.cssSelector("#aa-returningFrom")).isEnabled();
	//driver.findElement(By.xpath(".//*[@id='aa-returningFrom']")).isDisplayed();
	
	//".//*[@id='bookingModule']/div[1]/div[1]/ul/li[2]/label/span[2]"
	driver.findElement(By.xpath(".//*[@id='bookingModule']/div[1]/div[1]/ul/li[2]/label/span[2]")).click();
	System.out.println("Return button is after clicking one way button");
	
System.out.println(driver.findElement(By.xpath(".//*[@id='aa-returningFrom']")).isDisplayed());
	driver.findElement(By.xpath(".//*[@id='bookingModule']/div[1]/div[1]/ul/li[2]/label/span[2]")).isEnabled();
	System.out.println(driver.findElement(By.xpath(".//*[@id='bookingModule']/div[1]/div[1]/ul/li[2]/label/span[2]")).isEnabled());
}

}
