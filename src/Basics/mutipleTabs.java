package Basics;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutipleTabs {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.naukri.com");
	
	String	parent =driver.getWindowHandle();
	System.out.println("the parent id is "+parent);
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
	     Set<String> allWindows = driver.getWindowHandles();
	     
	     ArrayList<String> tabs = new ArrayList<String>(allWindows);
	    // tabs.get(0);
	     //tabs.get(1);
	   //  tabs.get(2);
	   /*  driver.switchTo().window(tabs.get(2));
	     driver.close();
	     driver.switchTo().window(tabs.get(1));
	     driver.close();
	     driver.switchTo().window(tabs.get(0));
	     System.out.println("the title of parent window is "+driver.getTitle());
	     */
	   for(String window:allWindows ){
		   
		   driver.switchTo().window(window).close();
	   }
	}
	
}
