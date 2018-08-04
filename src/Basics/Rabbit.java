package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");		
		 WebDriver driver = new ChromeDriver();		
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.rabb.it/");
			//driver.findElement(By.xpath(".//*[@class='headerLayout']/div[2]/div[1]/div[3]"));
			
			findFrames(driver,By.xpath(".//*[@class='headerLayout']/div[2]/div[1]/div[3]") );
			
			
			
     
	}
	
	public static int findFrames(WebDriver driver, By path){
		
		
		 
		
int i;//local variable
		
		//below commented out not using in this lecture
	//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//this one is we are using for now
	int framecount =driver.findElements(By.tagName("iframe")).size();	
	System.out.println("No of frames are: "+framecount);
		//driver.switchTo()
	
	for(i=0; i<framecount; i++)
		
  {
		
		   driver.switchTo().frame(i);
	// frame with this xpath present in the frame to which we switched or not, storing in count
	int count = driver.findElements(path).size();//size is 0 means no object/element presing in the frame
	//withthis xpath
	
		  if(count>0)//size is 1 or more means object with this xpath is there
			  // count is greater zero means with that xpath frame is present
		    {
			  //here, by = by.xpath/css selector
			//driver.findElement(by).click();
			
			  break;
		            
		        }else{
			 System.out.println("continue looping");
			 
		        }
		  
	       }
	driver.switchTo().defaultContent();
	    return i;
		
	}

}