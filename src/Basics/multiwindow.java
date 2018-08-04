package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		
		String	parent =driver.getWindowHandle();
		System.out.println("the parent id is "+parent);
		
			//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		     Set<String> allWindows = driver.getWindowHandles();
		     //Object[] win_ids = allWindows.toArray();
		     // String pop=      win_ids.toString();
		             
		    // System.out.println("the array of windows: "+pop);
		     int count = allWindows.size();
		     System.out.println("the number of all windows are: "+count);
		     //using enhance for loop
		     
		     for(String child: allWindows){
		    	 
		    	 
		    	 if(!parent.equalsIgnoreCase(child)){
		    		 
		    		 driver.switchTo().window(child);
		    		// driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		    		 System.out.println("child window title is "+driver.getTitle());
		    		 Thread.sleep(4000);
		    		 driver.close();
		    	 }
		     }
		     driver.switchTo().window(parent);
		     System.out.println("the title of parent window is "+driver.getTitle());
		     
		     driver.close();
	}

}
