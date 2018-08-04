package Basics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FormMethos {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Before clicking on Multicity radio button");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
	System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		//multicity
		driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
		
		System.out.println("After clicking on MulticityRadioButton");
		Assert.assertFalse((driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed()));;
	System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());	
		//roundtrip
		//driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label")).click();
	driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).isEnabled();
	}
}
