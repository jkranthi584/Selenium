package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isenabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(3000L);
		//driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[1]/label")).isEnabled();
		driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).isEnabled();
	System.out.println(driver.findElement(By.cssSelector(".fd_heading.clearfix>h2")).getText());	
	}

}
