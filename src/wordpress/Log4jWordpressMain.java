
package wordpress;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Log4jWordpressMain {

   public WebDriver driver;
   FileInputStream fis;
   Properties prop;
   
	@Test
	public void login() throws Exception{
		String path="C:\\Users\\ccomp\\workspace\\Selenium1\\src\\wordpress\\wordpress.properties";
		
		fis= new FileInputStream(path);
		
		prop = new Properties();
		
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		 driver = new ChromeDriver();
		 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	   // driver.get("https://wordpress.com");
	    //driver.get("https://wordpress.com/?apppromo");
	    driver.get(prop.getProperty("url"));
	    
		WordpressHome home = new WordpressHome(driver);
		
		home.Signin().click();
		
		System.out.println("we are logged in");
		
		home.Email().sendKeys(prop.getProperty("email"));
		
         home.getPassword().sendKeys(prop.getProperty("password"));
         
         home.LogIn().click();
         
      String title=   driver.getTitle();
      
         System.out.println("the title is: "+title);
         
         WritingPost post = new WritingPost(driver);
         
         Thread.sleep(3000L);
         
         post.clickWrite().click();
         
         Thread.sleep(4000L);
         
         post.hitTitle().sendKeys(prop.getProperty("ptitle"));
         
         
          post.writeText().sendKeys(prop.getProperty("message"));
          
       
          //Thread.sleep(6000L);
            WebDriverWait wait= new WebDriverWait(driver,30);
          
            wait.until(ExpectedConditions.visibilityOf(post.publish));
            
          Actions double_C=new Actions(driver);
           
          //post.hitPulishTwice();
          Thread.sleep(2000);
          double_C.doubleClick(post.hitPulishTwice()).build().perform();
          
          Thread.sleep(4000L);
          
          post.hitPulishSecond().click();
         
          /*Robot rb = new Robot();
          rb.delay(2000);
          
          rb.mouseMove(965, 208);
          
          rb.delay(1000);

  		
  		rb.mousePress(InputEvent.BUTTON1_MASK);
  	
  	rb.mouseRelease(InputEvent.BUTTON1_MASK);*/
  	
          	
          Thread.sleep(6000);
          
          ValidatingTitle vt= new ValidatingTitle(driver);
          System.out.println("navigating to different page");
          Thread.sleep(2000);
         WebElement tl=  vt.getSiteTitle();
       //Assert.assertEquals(object, expected);
     Assert.assertEquals(tl.getText(),"Site Title");
        //String siteTitle = "Site Title";
        
        	
        	/*if(tl.getText().equalsIgnoreCase("Site pitle")){
        		
        		System.out.println("Title Matched!!!");
        	}
        	else{
        		
        		ValidatingTitle.getScreenShot("MismatchTitle");
        	}*/
         
         
         
         
           
         System.out.println("Test completed");
		 
 		;
 	
 		
 		}
 	@AfterTest
 	public void teardown()
 	{
 		
 		driver.close();
 		//driver=null;
 		
 	}
          
          
		
	} 
	


