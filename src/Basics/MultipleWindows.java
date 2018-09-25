package Basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	static WebDriver driver;
	@Test
	public void test_closeAllWindowsExceptMainWind() {
		
		driver = new ChromeDriver();
		String windowTitle = getCurrentWindowTitle();
		
	}
	public String getCurrentWindowTitle() {
		  String windowTitle = driver.getTitle();
		  return windowTitle;
	}
         public static void waitForNewWindowAndSwitchToIt(WebDriver driver) throws InterruptedException {
        	 String cHandle = driver.getWindowHandle();
        	 System.out.println(driver.getTitle());
        	String newWindow =null;
        	     Set<String> allwindowHandles =  driver.getWindowHandles();   
        	     
        	     for(int i=0; i<20; i++) {
        	    	if(allwindowHandles.size()>1)
        	    	{
        	    		for(String window: allwindowHandles) {
        	    			if(!window.equals(cHandle))
        	    				newWindow=window;
        	    			driver.switchTo().window(newWindow);
        	    			         break;
        	    			
        	    		}
        	    		
        	    	}else
        	    		 Thread.sleep(3000);
        	    	  if(cHandle == newWindow)
        	    		  throw new RuntimeException("Time out - No Window Found");
        	
        	 }
         }
        	   public static   boolean closeAllOtherWindows(String openWindowHandles) {
        	    	   //we are getting all windows handles
        	    	             Set<String> handles = driver.getWindowHandles();
        	    	             for(String handle:handles) {
        	    	            	 if(!openWindowHandles.equals(openWindowHandles)) {
        	    	            		 driver.switchTo().window(handle);
        	    	            	       driver.close();
        	    	            	 }
        	    	             }
        	    	    /* loop through the all the windows
        	    	    *    focuswindow is not same as the passed window
        	    	    *     switch to the focuswindow and close it
        	    	    *    
        	    	    * */
        	    	             driver.switchTo().window(openWindowHandles);
        	    	             if(driver.getWindowHandles().size()==1)
        	    	            	 return true;
        	    	             else
        	    	            	 return false;
        	    	             
        	     }
        	   public String getMainWindowHandle() {
        		   
        		   return driver.getWindowHandle();
        	   }
        	 
         }

