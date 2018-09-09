package Basics;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.sun.jna.Platform;

public class CheckBoxValidation {
/*Checkbox Validation:  To verify that a checkbox is checked or not.
 *  Selenium provides a method called isEnabled(). It’s a boolean method which returns true 
 * if the checkbox is checked and returns false if it is not checked.*/
	public static void main(String[] args) throws InterruptedException, HeadlessException, AWTException, IOException {
		// TODO Auto-generated method stub
              String xpath="//*[@id=\"layered_id_attribute_group_1\"]";
              
          WebDriver driver = new ChromeDriver();
              driver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/size-s-l");
                driver.findElement(By.xpath(xpath)).click();
                Thread.sleep(4000L);
              boolean status=     driver.findElement(By.xpath(xpath)).isEnabled();   
        if(status)
        	System.out.println("checked");
        else
        	System.out.println("uncheck");
        Wait<WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
        		.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
           
        
      wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
      
      JavascriptExecutor je = (JavascriptExecutor)driver;
      
        je.executeScript("arguments[0].style.textDecoration='none'","");
      
      
          
	}

}
