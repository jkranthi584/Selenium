package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Assert;

public class LinksAutomation {
	public static void main(String[] args) throws InterruptedException {
/*System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");		
	WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
WebElement header =driver.findElement(By.xpath(".//ul[@id='s0-container']"));
System.out.println("How many links are in the header section");
System.out.println(header.findElements(By.tagName("a")).size());
System.out.println("num of links in the buy part of the footer");
WebElement buy = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
System.out.println(buy.findElements(By.tagName("a")).size());
String BeforeClicking = null;
String AfterClicking;
for(int i = 0; i<buy.findElements(By.tagName("a")).size();i++){
System.out.println(buy.findElements(By.tagName("a")).get(i).getText());
	
	if(buy.findElements(By.tagName("a")).get(i).getText().contains("Stores"))
	{
		System.out.println(driver.getTitle());
		BeforeClicking =driver.getTitle();
	
		//WebDriverWait dk = new WebDriverWait(driver,5);
		
		//driver.findElements(By.tagName("a"));
		
        // dk.until(ExpectedConditions.invisibilityOfElementLocated(By.tagName("a")));
		buy.findElements(By.tagName("a")).get(i).click();
		break;
		
		
		
	}
}
	System.out.println(driver.getTitle());

	//next steps show you how to compare the get-title strings are they same or not
	/*AfterClicking = driver.getTitle();
	if(BeforeClicking!=AfterClicking){
		if(driver.getPageSource().contains("Find out what's inside"))
//boolean abc=driver.findElement(By.xpath(".//*[@id='CentralArea']/div/div[2]/table/tbody/tr[1]/td/div[1]/div/div")).isDisplayed();	
//boolean ab = driver.findElement(By.cssSelector("div[id='CentralArea']")).isDisplayed();
			//if(ab == true)	
  System.out.println("Pass");
		
	}else{
		System.out.println("Fail");
	}*/
	AfterClicking=driver.getTitle();

     if(BeforeClicking!=AfterClicking)
       {
    	 Thread.sleep(4000L);
    	 //if(driver.getPageSource().contains("Search for a Store")){
         //comment this following  If loop and the result will be the same
    	 // to find out text on the page without its xpath
    	 boolean abc = driver.findElement(By.xpath(".//div[@class='tl']")).isDisplayed();
    	   if(abc==true){
    		   System.out.println("PASS");
    	 }else{
    		 System.out.println("FAIL");
    	 }
    	       
    	 
    	 
     }

 
 
        driver.quit();
 
	}

	   
}
