package Basics;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulTabs {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.naukri.com");
	
	String	parent =driver.getWindowHandle();
	System.out.println("the parent id is "+parent);
	
	   Set<String>wincount=     driver.getWindowHandles();
	                      
	                       ArrayList<String>listofwin = new ArrayList<String>(wincount);
	                       driver.switchTo().window(listofwin.get(3));
	                       System.out.println(driver.getTitle()+"the last child?");
	                       driver.close();
	                       driver.switchTo().window(listofwin.get(2));
	                 String title2=      driver.getTitle();
	                       System.out.println("the second child title is: "+title2);
	                              driver.close();
	                       driver.switchTo().window(listofwin.get(0));
	                 String ptitle=      driver.getTitle();
	                 System.out.println("The parent title is : "+ptitle);
                      driver.close();
	                 driver.switchTo().window(listofwin.get(1));
	                 String title1=driver.getTitle();
	                 System.out.println("The first child title is: "+title1);
	                 driver.close();
	                       
	                         
	
}

}