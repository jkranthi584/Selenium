package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class confuse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		driver.get("https://www.alaskair.com");
	
		driver.findElement(By.cssSelector("#departureDate1")).click();
		Select s = new Select(driver.findElement(By.xpath(".//*[@id='month-dropdown']")));
		s.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@id='day15']")).click();
		driver.findElement(By.xpath(".//*[@id='day23']")).click();
		
		driver.close();
}
	
}
