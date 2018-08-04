package guruSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * The "By.linkText()"and "By.partialLinkText()" methods can access a link located outside
 *   and inside these block-level elements. Consider the HTML code below. 
 *   https://www.guru99.com/accessing-links-tables-selenium-webdriver.html
 */
public class LinkInsideandOutsidetag {
	
	public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/selenium/block.html";					
        System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("Inside")).click();					
        System.out.println(driver.getTitle());					
        driver.navigate().back();			
        driver.findElement(By.partialLinkText("Outside")).click();					
        System.out.println(driver.getTitle());					
        driver.quit();			
    }		

}
