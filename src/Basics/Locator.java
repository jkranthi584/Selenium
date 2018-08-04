package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
     /*
      * driver.get("https://tin.tin.nsdl.com/pantan/StatusTrack.html");
      
     driver.findElement(By.xpath(".//*[@id='main-container']/div[2]/form/table/tbody/tr/td/table/tbody/tr[2]/td[3]/select")).click();
	
	*/
     driver.get("https://www.neftuonline.in/students_login_neftu/users/login.php");
     driver.findElement(By.id("e_no")).sendKeys("1510108052010004");
     driver.findElement(By.xpath(".//input[@size='12']")).sendKeys("12-05-1987");
     driver.findElement(By.name("mname")).sendKeys("Ameen Unnisa");
     driver.findElement(By.className("dbButton")).click();
     
     /*driver.get("https://www.facebook.com");
     //driver.findElement(By.linkText("Forgotten account?")).click();
      driver.findElement(By.partialLinkText("Forgotten ")).click();
      */
     
	}
}
     


