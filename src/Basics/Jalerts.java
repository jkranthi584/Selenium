package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jalerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath(".//*[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//accept(); use for okay, yes, done i.e positive answers
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//dismiss(); for negative answers
	  //if you want to enter text in Java alert box
		//driver.switchTo().alert().sendKeys("enter text here");
	}
	
}
	


