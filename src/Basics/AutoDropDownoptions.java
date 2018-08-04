package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//auto suggestive drop-down options video 84
public class AutoDropDownoptions {
public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
	//WebDriver driver= new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	//driver.get("https://fantasycricket.dream11.com/in/");
	//driver.manage().window().maximize();
	
	WebDriverWait dk = new WebDriverWait(driver,5);
	   driver.findElement(By.xpath("//*[@id='sbse5']/div[2]")).sendKeys("eclipse");
	//driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("ja");
	 dk.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sbse5']/div[2]/b")));
	//dk.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
	driver.findElement(By.xpath(("//*[@id='sbse5']/div[2]/b"))).click();
	//driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[5]/p")).click();
    
          }
}