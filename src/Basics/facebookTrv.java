package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookTrv {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		 //WebDriver driver = new FirefoxDriver();
		 System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys("i got it");
	}

}
