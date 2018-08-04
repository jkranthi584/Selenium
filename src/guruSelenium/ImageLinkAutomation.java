package guruSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLinkAutomation {
	
	
	 public static void main(String[] args) throws Exception {									
	        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
	        System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();					
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
	        driver.get(baseUrl);					
	        //click on the "Facebook" logo on the upper left portion		
				driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();					
                  Thread.sleep(4000L);
				//verify that we are now back on Facebook's homepage		
				if (driver.getTitle().equals("Facebook - log in or sign up")) {							
	            System.out.println("We are back at Facebook's homepage");					
	        } else {			
	            System.out.println("We are NOT in Facebook's homepage");					
	        }		
					driver.close();		
					
	 }		

}
