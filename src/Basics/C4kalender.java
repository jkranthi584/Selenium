package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4kalender {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.switchTo().alert();
	     driver.findElement(By.xpath("//*[@id='fb-slide-panel']/div[3]/a")).click();
		driver.findElement(By.cssSelector("input#travel_date")).click();
		
		WebElement store= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
           
		     
		    while(!(store.getText().contains("May"))){
		    	
		    	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		    }
		int dayCount=    driver.findElements(By.className("day")).size();
		    
		  for(int i=0; i<dayCount; i++){
			  
		String text=	  driver.findElements(By.className("day")).get(i).getText();
			  
		    if(text.equalsIgnoreCase("20")){
		    	
		    	
		    	driver.findElements(By.className("day")).get(i).click();
				break;
			}
			  
		  }
		    
	}

}
