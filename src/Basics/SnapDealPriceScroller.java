package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDealPriceScroller {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		String url ="https://www.snapdeal.com/products/mobiles-mobile-phones/filters/Form_s~Smartphones?sort=plrty&q=Form_s%3ASmartphones%7CPrice%3A790%2C86348%7C"
	;    driver.get(url);
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 WebElement element = driver.findElement(By.xpath("//div[@class='left-wrapper']/div[@class='comp-left-filter']/div[2]/div[@class='filter-content']/div/div[2]/span[2]"));
 	
	              wait.until(ExpectedConditions.visibilityOf(element));
	            
	              /*FileInputStream fis = new FileInputStream(new File("C:\\Users\\ccomp\\workspace\\Selenium1\\Snapdeal.properties"));
	              Properties prp = new Properties();
	              prp.load(fis);*/
	              scrollHorizantally();
	             
	              //mouseMove(prp.getProperty("username"));
	              
		}
   
	          
	 
	public static void mouseMove(String Locator){
		 
		  System.out.println(Locator);
		  String split[] = Locator.split(":");
		  String locatorType = split[0];
		  System.out.println(locatorType);
		  String locatorValue = split[1];
		
		  
		  System.out.println(locatorValue);
		 /* Actions obj = new Actions(driver);
		  WebElement ele = null;
		    if(locatorType.toLowerCase().equals("id")){
		    	ele = driver.findElement(By.id(locatorValue));
		    	
		    }else
		    	if(locatorType.toLowerCase().equals("xpath")){
		    	ele = driver.findElement(By.xpath(locatorValue));
		    	}
		    obj.moveToElement(ele);
		    obj.build().perform();*/
	 }
	
	
        public static void scrollHorizantally(){
        	
        	 /* String[] split = locator.split(":");
        	          String locatorType = split[0];
        	          String locatorValue = split[1];*/
        	WebElement element = driver.findElement(By.xpath("//div[@class='left-wrapper']/div[@class='comp-left-filter']/div[2]/div[@class='filter-content']/div/div[2]/span[2]"));
        	WebElement element2 = driver.findElement(By.xpath("//div[@class='left-wrapper']/div[@class='comp-left-filter']/div[2]/div[@class='filter-content']/div/div[1]/a[2]"));
        	 String str = element.getText();
        	 System.out.println("the str:"+str);
        	 while(!str.contains("8000")){
        		 
        	
        	JavascriptExecutor jp = (JavascriptExecutor) driver;;
        	  //jp.executeScript("window.scrollBy(-1000,0);",element2);
        	  //String path ="/html[1]/body[1]/div[10]/div[9]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[2]";

        	  /*function getElementByXpath(path) {
        		  return document.evaluate(path, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;
        		}

        		console.log( getElementByXpath("/html[1]/body[1]/div[10]/div[9]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/a[2]"));
*/

       // String js =	  "return document.evaluate("+path+", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).";
       //jp.executeScript(js+"=scrollLeft:"+ -100 +"px;");
        //  js.executeScript("$(\"#ui-id-2\").animate({ scrollTop: \""+100*i+"px\" })");
                //jp.executeScript(js, "\"scrollLeft -= 50 \"");
                //jp.executeScript("$("+path+").animate({scrollLeft:-100px})");
        		String leftScrollbar =".price-slider-scroll.right-handle.ui-slider-handle.ui-state-default.ui-corner-all.hashAdded";
        	//String leftScrollbar = "document.querySelectorAll(\".price-slider-scroll.left-handle.ui-slider-handle.ui-state-default.ui-corner-all.hashAdded\")";
        	//jp.executeScript(leftScrollbar+".animate({ scrollLeft: \"100px\" })");
        		jp.executeScript("$(\""+leftScrollbar+"\").animate({ scrollLeft: \"100px\" })");
        }
      }
}
