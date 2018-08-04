package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EbayProject {

	
	        WebDriver driver;
	        
	        public void invokeBrowswer(String browser){
	        	
	        	switch(browser){
	        	
	        	case "firefox":
	        		driver=new FirefoxDriver();
	        		break;
	        	case "chrome":
	        		driver=new ChromeDriver();
	        		break;
	        	default:
	        		System.out.println("Invalid Browser");
	        		break;
	        	}
	        	driver.get("https://www.ebay.in");
	        }
	        public String searchItems(String product, String category) throws InterruptedException{
	        	driver.findElement(By.id("gh-ac")).sendKeys(product);
	        	Select dropDown = new Select(driver.findElement(By.id("gh-cat")));
	        	dropDown.selectByVisibleText(category);
	        	/*Actions act= new Actions(driver);
	        	Thread.sleep(3000);
	        	act.sendKeys(Keys.TAB);
	        	Thread.sleep(3000);
	        	act.sendKeys(Keys.ENTER);*/
	        	driver.findElement(By.id("gh-btn")).click();
	        	
	        return driver.findElement(By.className("listingscnt")).getText();
	        }
	        public void getAllProduct(){
	        	//Now scroll down to each product one by one and fetch its details.
	    List<WebElement>allproducts=    	driver.findElements(By.xpath("//ul[@id='ListViewInner']/li"));
	            for(WebElement product: allproducts){
	            	
	            	int x=product.getLocation().x;
	            	int y=product.getLocation().y;
	            	scrollTo(x,y);
	            String sProduct =	product.getText();
	            	System.out.println(sProduct);
	            	System.out.println("**********************");
	            	
	            }
	            
	           
	        }
	        private void scrollTo(int x, int y){
            	
	        	String jsCommand;
	        	JavascriptExecutor js;
	        js=	(JavascriptExecutor)driver;
	    	jsCommand = String.format("window.scrollTo(%d,%d)", x, y);
	    	            js.executeScript(jsCommand);
	    	
            }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
               EbayProject ebay = new EbayProject();
               ebay.invokeBrowswer("chrome");
              String crap= ebay.searchItems("Apple watches", "Watches");
                  System.out.println(crap);
               //ebay.getAllProduct();
	}

}
