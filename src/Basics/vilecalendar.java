package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vilecalendar {
	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
	
	
	driver.get("https://www.path2usa.com/travel-companions");
	//April 23
	
	           
 String dontshowagain="//*[@id='fb-slide-panel']/div[3]/a";
	 Thread.sleep(5000L);
	  
WebElement alertbox=	 driver.findElement(By.xpath("//*[@id='fb-slide-panel']/div[3]/a]"));
	 
	 WebDriverWait wait = new WebDriverWait(driver,30);
	// wait.until(ExpectedConditions.visibilityOf(alertbox)).click();
	 
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='fb-slide-panel']/div[3]/a']")))).click();
	// driver.findElement(By.xpath(dontshowagain)).click();
	driver.findElement(By.xpath(".//*[@id='travel_date']")).click();  
	
/*
 *  WebDriverWait wait= new WebDriverWait(driver,30);
          
            wait.until(ExpectedConditions.visibilityOf(post.publish));
 */
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

