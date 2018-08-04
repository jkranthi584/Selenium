package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kalender {
	
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	driver.get("https://www.path2usa.com/travel-companions");
	//clicking the datepicker's button
	driver.findElement(By.cssSelector("#travel_date")).click();
//boolean flag= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
	
	//driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
	WebElement crazyOne= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
	
	/*while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July"))
	{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		
		
	}*/
	    while(!crazyOne.getText().contains("April")){
	    	
	    	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	    }
	//putting the all items in the list and comparing if any of it equals to specified date
	List<WebElement> month= driver.findElements(By.className("day"));//.//*[@id='month-dropdown']/option[4]/text()
	
	// List<WebElement> by  =driver.findElements(By.id("#day"));
	//how many items are present by using'size' and storing it in count variable
	 int count = driver.findElements(By.className("day")).size();
	 //int count =by.size();
	for(int i=0; i<count; i++){
		
	String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("8")){
			
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
		
		
		
		
	}
	
	//driver.close();
	
	
	
	
     }
	

}
