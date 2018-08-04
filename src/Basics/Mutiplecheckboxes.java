package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mutiplecheckboxes {
	
	public static void main(String[] args) {
		
		System.setProperty("", "");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
		List <WebElement> webelements = driver.findElements(By.id(""));
		System.out.println(Integer.toString(webelements.size()));
		for(WebElement elmnt: webelements){
			
			elmnt.click();
		}
	}

}
