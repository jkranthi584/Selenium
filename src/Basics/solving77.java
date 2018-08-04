package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import junit.framework.Assert;

public class solving77 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");		
	WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
//WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
	
	//Actions n = new Action(driver);
	System.out.println("Total number of links on page");
 System.out.println(driver.findElements(By.tagName("a")).size());
 // no of links in the footer
 System.out.println("Num of links in the footer");
WebElement footer= driver.findElement(By.xpath(".//footer[@id='glbfooter']"));
System.out.println(footer.findElements(By.tagName("a")).size());
WebElement header =driver.findElement(By.xpath(".//ul[@id='w0-container']"));
System.out.println("How many links are in the header section");
System.out.println(header.findElements(By.tagName("a")).size());
System.out.println("num of links in the buy part of the footer");
WebElement buy = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
System.out.println(buy.findElements(By.tagName("a")).size());
String BeforeClicking = null;
String AfterClicking;
for(int i = 0; i<buy.findElements(By.tagName("a")).size();i++){
//System.out.println(buy.findElements(By.tagName("a")).get(i).getText());
	
	if(buy.findElements(By.tagName("a")).get(i).getText().contains("Stores"))
	{
		System.out.println(driver.getTitle());
		//BeforeClicking =driver.getTitle();
		buy.findElements(By.tagName("a")).get(i).click();
		break;
		
		
		
	}
}
	System.out.println(driver.getTitle());

	//next shows you how to compare the get title strings tells you are they same or not
	AfterClicking = driver.getTitle();
	if(BeforeClicking!=AfterClicking){
		//if(driver.getPageSource().contains("Find out what's inside"))
boolean abc=driver.findElement(By.xpath(".//*[@id='CentralArea']/div/div[2]/table/tbody/tr[1]/td/div[1]/div/div")).isDisplayed();	
//boolean ab = driver.findElement(By.cssSelector("div[id='CentralArea']")).isDisplayed();
			//if(ab == true)
		if(abc ==true)
  System.out.println("Pass");
		
	}else{
		System.out.println("Fail");
	}



 
 
 
        driver.quit();
 
	}

	   
}