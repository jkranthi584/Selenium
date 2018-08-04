package Qedge;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.onlinesbi.com/");
		//d.manage().window().maximize();
		
		String winid=d.getWindowHandle();
		System.out.println(winid);
	
		// click SBI bonanza link
	d.findElement(By.xpath(".//*[@id='primary_navigation']/li[7]/a")).click();
      
		//get multple window's ids
		Set<String> m_winids=d.getWindowHandles();
		System.out.println(m_winids);
		
		// get multiple ids from set of string
		 Object[] win_ids = m_winids.toArray();   // win_ids[0]---- main window id
		 										  // win_ids[1]---- popup window id	
		 
		 //pop up window id as a string 
		String pop= win_ids[1].toString();
		System.out.println("the pop is: "+pop);
		 
		 // connect window to popup window
		d.switchTo().window(pop);
		
		//Sleeper.sleepTightInSeconds(2);
		// enter data in search box of popup window
		d.findElement(By.id("txtsearch")).sendKeys("jeans");
		
		//Sleeper.sleepTightInSeconds(2);
		//close popup window
		d.close();
		
		// connect popUp window to main window
		d.switchTo().window(win_ids[0].toString());
		
		//Sleeper.sleepTightInSeconds(2);
		// click mCash link in main window
		d.findElement(By.xpath(".//*[@id='primary_navigation']/li[9]/a")).click();

		
		// close all
		d.quit();
		
	}
}


