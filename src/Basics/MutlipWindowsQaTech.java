package Basics;

import java.util.Set;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MutlipWindowsQaTech {
  static WebDriver driver;
	@Test
	public void test_closeAllWindowsExceptMainW() throws InterruptedException{
		
		   driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		
	   String windowTitle = getCurrentWindowTitle();
	             String mainWindow =   getMainWindowHandle(driver);
	             waitForNewWindowAndSwitchToIt(driver);
	          String title =   driver.getTitle();
	          System.out.println(title);
	             
	             
	  Assert.assertTrue(closeAllOtherWindows(mainWindow));
	    Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"),"Main window title is not matching");
	  // Assert.assertTrue(mainWindow.contains("Jobs - Recruitment"),"Main window title is not matching");
	}
	public String getCurrentWindowTitle(){
		
		String windowTitle= driver.getTitle();
		return windowTitle;
	}
	public String getMainWindowHandle(WebDriver driver){
		return driver.getWindowHandle();
	}
	public String getCurrentWindowHandle(){
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	public static boolean closeAllOtherWindows(String openWindowHandles){
		Set<String>  allwindowHandles=driver.getWindowHandles();
		
		for(String currentWindow: allwindowHandles){
			
			if(!currentWindow.equals(openWindowHandles)){
				driver.switchTo().window(currentWindow);
				driver.close();
			}
		}
		driver.switchTo().window(openWindowHandles);
		if(driver.getWindowHandles().size() ==1)
			return true;
			else 
				return false;
	}
	
	
	public void waitForNewWindowAndSwitchToIt(WebDriver driver) throws InterruptedException{
		
		     String cHandle =       driver.getWindowHandle();
		     System.out.println(driver.getTitle());
	
	            String newWindowHandle = null;
	            Set<String> allwindowHandles = driver.getWindowHandles();
	            
	            //Wait for 20 seconds for the new window and throw exception if not found
	                 
	            
	         for(int i=0; i<20; i++){
	        	 
	        	 if(allwindowHandles.size() > 1){
	        		 for(String windHandler: allwindowHandles){
	        			 
	        			 if(!windHandler.equals(cHandle))
	        				 newWindowHandle = windHandler;
	        		 }
	        		 
	        		 driver.switchTo().window(newWindowHandle);
	        		         break;
	        	 }else
	        		 Thread.sleep(1000);
	        	 
	        	 
	        	 if(cHandle == newWindowHandle){
	        		 throw new RuntimeException("Time out - No Window Found");
	        	 }
	         }
	
	}
	
	
}
