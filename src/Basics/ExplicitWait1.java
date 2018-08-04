package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//auto suggestive drop-down options video 84
public class ExplicitWait1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://fantasycricket.dream11.com/in/");
	
	WebDriverWait dk = new WebDriverWait(driver,5);
	
	driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("ja");
	
	dk.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
	//driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("ja");
	driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[5]/p")).click();

          }
}
