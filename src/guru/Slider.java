package guru;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	static WebDriver driver;
	public static void main(String[] args) throws java.text.ParseException {
		
		  String dumo ="139000";
		   int ko =   Integer.parseInt(dumo);
		   if((ko<50000))
		    System.out.println(ko);
	////div[@data-name='Price']/descendant::a[2]
		System.setProperty("webdriver.driver.chrome", "C:\\ChromeDriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/search?keyword=mobile%20phone&santizedKeyword=&catId=479&categoryId=0&suggested=true&vertical=&noOfResults=20&clickSrc=suggested&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy&q=Price%3A49%2C135000%7C");
		
	WebElement ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
	String text="";
	text =   driver.findElement(By.className("to-price-text")).getText();
         System.out.println(text);
         Actions act = new Actions(driver);
         Dimension dim = ele.getSize();
         //while(text.equals("8000"))
         
         int x = dim.getWidth();
        do {
        	ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
        	act.clickAndHold(ele).moveByOffset(x-55,0).release().build().perform();
        	text =   driver.findElement(By.className("to-price-text")).getText();
           while(!ele.isDisplayed()) {
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
          String arr[] = text.split(" ");
          //System.out.println(arr[1]);
           NumberFormat n= NumberFormat.getNumberInstance();
           ///parsing the text into a Number
              Number no = n.parse(arr[1]);
              // saving the string representation of an object into a text
               arr[1]= no.toString();
                //parsing the text 
                 int m = Integer.parseInt(arr[1]);
               if(m<=90000)
            	   return;
          
        }while(!text.contains("90000"));
        }
         
	public static void verifyPriceFilter() throws ParseException {
		
		
		WebElement ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
		String text="";
		text =   driver.findElement(By.className("to-price-text")).getText();
	         System.out.println(text);
	         Actions act = new Actions(driver);
	         Dimension dim = ele.getSize();
	         //while(text.equals("8000"))
	         
	         int x = dim.getWidth();
	        do {
	        	ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
	        	act.clickAndHold(ele).moveByOffset(x-55,0).release().build().perform();
	        	text =   driver.findElement(By.className("to-price-text")).getText();
	           while(!ele.isDisplayed()) {
	        	try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	          String arr[] = text.split(" ");
	          //System.out.println(arr[1]);
	           NumberFormat n= NumberFormat.getNumberInstance();
	           ///parsing the text into a Number
	              Number no = n.parse(arr[1]);
	              // saving the string representation of an object into a text
	               arr[1]= no.toString();
	                //parsing the text 
	                 int m = Integer.parseInt(arr[1]);
	               if(m<=90000)
	            	   return;
	          
	        }while(!text.contains("90000"));
	}
	
}
