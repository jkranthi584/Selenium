package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rahul {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();

		driver.findElement(By.xpath(".//*[@id='dp1500196721520']/div/div[1]/table/tbody/tr[5]/td[7]/a")).click();

/*int i=0;

while(i<5)

{

driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();

i++;*/

}

		
	}
	


