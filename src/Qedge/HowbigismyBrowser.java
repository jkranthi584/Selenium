package Qedge;

import java.awt.AWTException;

import java.awt.Dimension;

import java.awt.Robot;

import java.awt.Toolkit;

import java.awt.event.InputEvent;

import java.awt.event.KeyEvent;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.sun.jna.platform.win32.OaIdl.ELEMDESC._ELEMDESC;



public class HowbigismyBrowser {
	@Test
	  
	public void f() throws AWTException, Exception {
		  
		 
		/*System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			
	driver.navigate().to("http://www.seleniumhq.org/download/");
			driver.manage().window().maximize();

			
			
	// Browse
			
	driver.findElement(By.linkText("3.7.0")).click();
			
			Thread.sleep(2000L);	
			
	Robot rb=new Robot();
			
			
	rb.keyPress(KeyEvent.VK_TAB);
			
	rb.keyRelease(KeyEvent.VK_TAB);
			
	        
	 rb.delay(2000);
			
			
	rb.keyPress(KeyEvent.VK_ENTER);
			
	rb.keyRelease(KeyEvent.VK_ENTER);
			
			
	 rb.delay(2000);
			
	Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
			System.out.println(size);
			
			
			rb.mouseMove(1050, 85);
			
			rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			
			rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					
			rb.delay(1000);
			
	rb.mouseMove(1050, 120);
			
			 
	rb.delay(1000);
			
			
	rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			
	rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	Thread.sleep(4000L);
	
	driver.close();
			
			
	  
	}



}
