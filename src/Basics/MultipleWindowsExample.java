package Basics;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MultipleWindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		 DesiredCapabilities cap = new DesiredCapabilities().chrome();
		 cap.setCapability(ChromeOptions.CAPABILITY, option);
		 option.addArguments("disable-infobars");
		 cap.setAcceptInsecureCerts(true);
		 
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://www.naukri.com");
		String main = driver.getWindowHandle();
		 Set<String> mwinds = driver.getWindowHandles();
		    ArrayList<String> mu = new ArrayList<String>(mwinds);
		   //  System.out.println(mu.toString());
		    /* for(int i=1; i<mwinds.size(); i++) {
		    	System.out.println( i+": "+driver.switchTo().window(mu.get(i)).getTitle());
		    	driver.close();
		     }*/
		     driver.switchTo().window(main).getTitle();
		     for(String wind:mwinds) {
		    	  if(!main.equalsIgnoreCase(wind)) 
		    		  
		    		  driver.switchTo().window(wind).close();
		    	  
		     }
		                    
		     /*for(String wind:mwinds) {
		    	 
		    	 if(main.equalsIgnoreCase(arg0))
		     }*/
		 
            
	}

}
