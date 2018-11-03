package Basics;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Pagination {
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("disable-infobars");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
         driver.get("http://www.seleniumeasy.com/test/table-pagination-demo.html");
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Wait <WebDriver> wait  = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
        		 .ignoring(NoSuchElementException.class);
      WebElement element = driver.findElement(By.xpath("//td[contains(text(),'5')]"));
      wait.until(ExpectedConditions.textToBePresentInElement(element, "5"));
      
         ////ul[@id='myPager']/li/a
        	List<WebElement> eles = driver.findElements(By.xpath("//ul[@id='myPager']/li/a"));
   
        	for(int i=3; i<5; i++) {
        		
        		if(i==3) {
        			//eles.get(i).click();
        	WebElement elemento =driver.findElement(By.xpath("(//ul[@id='myPager']/li/a)["+i+"]"));
        	elemento.click();
        	 eleDisplay(driver,elemento);
        			Thread.sleep(5000);
        	 	     
        	 	    System.out.println("clicked "+i);  
        		 element = driver.findElement(By.xpath("//td[contains(text(),'10')]"));
        	      wait.until(ExpectedConditions.textToBePresentInElement(element, "10"));
        	      if(element.isDisplayed())System.out.println(element.getText());
        	      
        		}else if(i==4) {
        			//eles.get(i).click();
        		WebElement elemento =driver.findElement(By.xpath("(//ul[@id='myPager']/li/a)["+i+"]"));
                	elemento.click();
        			Thread.sleep(5000);
        			   System.out.println("clicked "+i);  
        			eleDisplay(driver,elemento);
        			 element = driver.findElement(By.xpath("//td[contains(text(),'13')]"));
      	        wait.until(ExpectedConditions.textToBePresentInElement(element, "13"));
      	              if(element.isDisplayed())System.out.println(element.getText());
        		 }
        		 
        		}
        	    
        	
	}
	  public static void eleDisplay(WebDriver driver, WebElement ele)  {
		  try {
				Thread.sleep(10000L);
				 if(ele.isDisplayed())
			    	  System.out.println(ele.getText()+" is working");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(NoSuchElementException c) {
				System.out.println("element is not a valid");
			}
		     
		      
	  }
        	
	}


