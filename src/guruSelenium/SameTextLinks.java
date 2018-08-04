package guruSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameTextLinks {
	public static void main(String[] args) {
	String baseUrl=	"http://demo.guru99.com/selenium/newtours/";	
	String underConsTitle = "Under Construction: Mercury Tours";	
	 System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		;
		
		driver.get(baseUrl);
		
	    List<WebElement>linkElements= driver.findElements(By.tagName("a"));
	    
	            String[] linkTexts=new String[linkElements.size()];
	            
	    int i=0;
	    //extract the link texts of each link web element
	   for(WebElement e: linkElements) {
	    	linkTexts[i]=e.getText();
	    	i++;
	    	
	    }
		
	    //test each link
	    
		for (String t: linkTexts) {
			driver.findElement(By.linkText(t)).click();
		  
			if(driver.getTitle().equals(underConsTitle)) {
			System.out.println("\"" + t + "\"" + " is under construction");
		  
		}else {
			System.out.println("\"" + t + "\"" + "is working");
			
		}
			 driver.navigate().back();
		
	   }
		driver.quit();
	    
	  //test each link		
		/*for (String t : linkTexts) {							
		driver.findElement(By.linkText(t)).click();					
		if (driver.getTitle().equals(underConsTitle)) {							
            System.out.println("\"" + t + "\""								
                    + " is under construction.");			
        } else {			
            System.out.println("\"" + t + "\""								
                    + " is working.");			
        }		
		driver.navigate().back();			
    }		
		driver.quit();*/
   }
}
