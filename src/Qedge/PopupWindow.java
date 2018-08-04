package Qedge;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopupWindow {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.onlinesbi.com/");
		// click SBI bonanza link
		driver.findElement(By.xpath(".//*[@id='primary_navigation']/li[7]/a")).click();
		
	Set<String> windows =	driver.getWindowHandles();
	System.out.println("Number of windows are: "+windows);
	     Object[] win_ids =   windows.toArray();
	       String pop = win_ids[1].toString();
	       driver.switchTo().window(pop);
	       driver.findElement(By.id("txtsearch")).sendKeys("jeans");
	      // Sleeper.sleepTightInSeconds(2);
	       Thread.sleep(2000L);
	       driver.close();
	       driver.switchTo().window(win_ids[0].toString());
	         Thread.sleep(3000L)
	         ;
	         ////*[@id="primary_navigation"]/li[7]/a
	         ////*[@id="primary_navigation"]/li[9]/a
	         driver.findElement(By.xpath(".//*[@id='primary_navigation']/li[9]/a")).click();
	    
	         Thread.sleep(4000L);
	         
	     /*Set<String> newWindow= driver.getWindowHandles();
	     System.out.println("new windows of array are: "+newWindow);
	          Object[] tab= newWindow.toArray();
	        String newpop=   tab[1].toString();
	        driver.switchTo().window(newpop);*/
	        ////*[@id="eMail"]
	        Thread.sleep(2000L);
	        driver.findElement(By.id("eMail")).click();
	        Thread.sleep(2000L);
	                
	    		 driver.close();
	    		 
	    		// driver.switchTo().window(tab[0].toString());
	    		// Thread.sleep(4000L);
	    		 //driver.close();
	}

}
