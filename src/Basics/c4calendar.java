package Basics;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class c4calendar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		driver.get("https://www.alaskair.com");
		driver.findElement(By.cssSelector("#departureDate1")).click();
		//List<WebElement> month= driver.findElements(By.xpath(".//*[@id='month-dropdown']/option[4]"));//.//*[@id='month-dropdown']/option[4]/text()
		Select s = new Select(driver.findElement(By.xpath(".//*[@id='month-dropdown']")));
		s.selectByIndex(3);
		// List<WebElement> by  =driver.findElements(By.id("#day"));
		 int count = driver.findElements(By.id("#day")).size();
		 //int count =by.size();
		for(int i=0; i<count; i++){
			
		String text=driver.findElements(By.id("#day")).get(i).getText();
			if(text.equalsIgnoreCase("8")){
				
				driver.findElements(By.id("#day")).get(i).click();
				break;
			}
			
			
			
			
		}
		
		//driver.close();
	}
}

	

		
		
		
		
	
		

	



