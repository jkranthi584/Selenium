package Qedge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	
	
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.navigate().to("https://www.path2usa.com/travel");
	 
	 //driver.switchTo().alert().dismiss();
	 String send="//*[@id='fb-cboxClose']";
	 
	// driver.findElement(By.xpath(send)).click();
	 String dontshowagain="//*[@id='fb-slide-panel']/div[3]/a";
	 
	 driver.findElement(By.xpath(dontshowagain)).click();;
	 
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}

		}
    }
}
