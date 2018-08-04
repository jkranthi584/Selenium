package Qedge;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KalenderPath {

	public static void main(String[] args)  throws AWTException {
		  
		
		// TODO Auto-generated method stub
		
		System.setProperty

("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.manage().window().maximize();
//#travel_date
Robot rbo = new Robot();
  rbo.mouseMove(364,605);
//rbo.mouseMove(395, 490);
    rbo.delay(4000);

   rbo.mousePress(InputEvent.BUTTON1_MASK);
   rbo.mouseRelease(InputEvent.BUTTON1_MASK);
		//driver.findElement(By.cssSelector("#travel_date")).click();
		driver.findElement(By.name("travel_date")).click();
		WebElement store= driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
           
		     
		    while(!(store.getText().contains("September"))){
		    	
		    	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		    }
		int dayCount=    driver.findElements(By.className("day")).size();
		    
		  for(int i=0; i<dayCount; i++){
			  
	String text=	  driver.findElements(By.className("day")).get
(i).getText();
			  
		    if(text.equalsIgnoreCase("20")){
		    	
		    	
		    	driver.findElements(By.className("day")).get(i).click();
				break;
			}
			  
		  }
		    
	}
}
