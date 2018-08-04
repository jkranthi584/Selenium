package GuruProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GuruProject {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
	    driver.findElement(By.name("uid")).sendKeys("mngr101257");
	    driver.findElement(By.name("password")).sendKeys("yrubasa");
	    driver.findElement(By.name("btnLogin")).click(); 
	    //Assert.assertEquals("Welcome To Manager's Page" , "Welcome To Manager's Page");
	    
	    String actualtitle= driver.getTitle();
	    String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
	    if(actualtitle.contains(EXPECT_TITLE)) {
	    	System.out.println("test passed");
	    }else {
	    	System.out.println("Test Failed");
	    }
	    
	    driver.close();
	   
	}
	
	

}
