package Basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mulwindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
		 
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click();
		System.out.println("Before performing the switching of windows");
		System.out.println(driver.getTitle());
	
		Set<String> windows=        driver.getWindowHandles();
		
		    Iterator<String> it=        windows.iterator();
		    
		String parent=      it.next();
		String child= it.next();
		driver.switchTo().window(child);
		String crap= driver.getTitle();
		System.out.println(crap);
		driver.close();
         driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
         
		          driver.close();
		
	}

}
