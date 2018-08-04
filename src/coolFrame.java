import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class coolFrame {
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
	int number=	findingCorrectFrame(driver, By.id("recaptcha-anchor"));
	driver.switchTo().frame(number);
	 driver.findElement(By.id("recaptcha-anchor")).click();
	 driver.switchTo().defaultContent();
 int number2=	 findingCorrectFrame(driver, By.cssSelector("button[id='recaptcha-verify-button"));
		Thread.sleep(4000L);
		
		driver.switchTo().frame(number2);
		WebElement elmnt = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
		if(!elmnt.getText().equals("Verify") && elmnt.isDisplayed()) {
			Thread.sleep(4000L);
			
			elmnt.click();
			
			Thread.sleep(4000);
			elmnt = driver.findElement(By.cssSelector("button[id='recaptcha-verify-button']"));
			elmnt.click();
		}
		elmnt.click();
	}
	public static int findingCorrectFrame(WebDriver driver, By path) {
		
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		
		for( i=0; i<framecount; i++) {
			driver.switchTo().frame(i);
			System.out.println("the value of i(means how many iframes are there in the page: "+ framecount);
            int count = driver.findElements(path).size();
            if(count>0) {
            	 System.out.println(i);
           	  break;
             }else {
           	  
           	  System.out.println("Continue looping through the frames until you find a frame with this path");
           	  driver.switchTo().defaultContent();
             }	
            	
            
			
			
		}
		  
		driver.switchTo().defaultContent();
		
		
		return i;
		
		
		
	}

}
