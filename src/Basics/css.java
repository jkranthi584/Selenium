package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.neftuonline.in/students_login_neftu/users/login.php");
	driver.findElement(By.cssSelector("input[id='e_no']")).sendKeys("1150434010400095");
	driver.findElement(By.xpath(".//*[@name='mname']")).sendKeys("Gaitri Devi");
	driver.findElement(By.cssSelector("[size='12']")).sendKeys("20-01-1984");
	driver.findElement(By.xpath(".//input[@type='submit']")).click();
	

	}

}
