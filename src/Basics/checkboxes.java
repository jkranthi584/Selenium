package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/spicejet.com");
		//validate whether checkbox is selected by default
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		//driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		
	}

}
