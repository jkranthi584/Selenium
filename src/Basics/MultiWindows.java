package Basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
	      String parent=    driver.getWindowHandle();
	      
	      Set<String> windows=  driver.getWindowHandles();
	  
	                         Object[] win=   windows.toArray();
	                String pop=             win.toString();
	                
	                        
	                         
	      
	           int count=    windows.size();
	           System.out.println("no of windows: "+count);
	             for(String child:windows){
	            	 
	            	 if(!parent.equalsIgnoreCase(child)){
	            		 
	            		 driver.switchTo().window(child);
	            		String title= driver.getTitle();
	            		 System.out.println(title);
	            		 driver.close();
	            	 }
	             }
	        
	                   driver.switchTo().window(parent);
	                   System.out.println(driver.getTitle());
	                   driver.close();
	                   
	
	
	
	}
	
}
