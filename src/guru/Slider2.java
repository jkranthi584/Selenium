package guru;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Slider2 {
 static  WebDriver driver;
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	int maxValue = 39000;		
	driver.get("https://www.snapdeal.com/search?keyword=mobile%20phone&santizedKeyword=&catId=479&categoryId=0&suggested=true&vertical=&noOfResults=20&clickSrc=suggested&lastKeyword=&prodCatId=&changeBackToAll=false&foundInAll=false&categoryIdSearched=&cityPageUrl=&categoryUrl=&url=&utmContent=&dealDetail=&sort=rlvncy&q=Price%3A49%2C135000%7C");
	   
	
	/*int number = verifyinPriceSlider(driver,maxValue);	
	      if(maxValue>number)
	    	  System.out.println(number);*/
	      
	         scrollMe(driver);
		
		//WebElement ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
	}  
	public static int verifyinPriceSlider(WebDriver driver, int price) throws ParseException {
		
		//int number;
		
		WebElement ele =  driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
		String text="";
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		  
		text =   driver.findElement(By.className("to-price-text")).getText();
	        // System.out.println(text);
	         /*Actions act = new Actions(driver);
	         Dimension dim = ele.getSize();
	         //while(text.equals("8000"))
	         
	         int x = dim.getWidth();*/
	            
	       
			int number=0;
			do {
				try {
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("view-more-parent-cat")));
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			Actions act = new Actions(driver);
		         Dimension dim = ele.getSize();
		         //while(text.equals("8000"))
		         
		         int x = dim.getWidth();
	        	
	        	ele = 	 driver.findElement(By.xpath("//div[@data-name='Price']/descendant::a[2]"));
	        	act.clickAndHold(ele).moveByOffset(x-45,0).release().build().perform();
	        
	        	text =   driver.findElement(By.className("to-price-text")).getText();
	        	 String arr[] = text.split(" ");
		          //System.out.println(arr[1]);

		           NumberFormat n= NumberFormat.getNumberInstance();
		           ///parsing the text into a Number
		              Number no = n.parse(arr[1]);

		              // saving the string representation of an object into a text
		                      arr[1]= no.toString();

		                //parsing the text 
		              number= Integer.parseInt(arr[1]);
	        	
	        	
	        	while(!ele.isDisplayed()) {
	        	try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	                   }
	         
	                //price2 =   Integer.parseInt(price);
	              /* if(m<=price2) {
	            	   System.out.println("filter is working just fine: "+price2);
	            	   return;
	               }*/
	        }while(number>=price);
			
			return number;
	}
	
	
	public static void scrollMe(WebDriver driver) {
		
		WebElement ele = 	driver.findElement(By.id("see-more-products"));
		System.out.println(ele.getText());
		/*while(true) {
			
			   if(!ele.isDisplayed()) {
				   if(ele.getText().contains("SHOW 81 - 160 ITEMS")){
					   System.out.println("Done Scrolling");
					   break;
				   }
			   }*/
		   do {
			   ele = 	driver.findElement(By.id("see-more-products"));
			   try {
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				Thread.sleep(500); 
				System.out.println(ele.getText());
			   }catch(Exception e) {
				   System.out.println("Exception occured");
			   }
		}while(!(ele.getText().contains("SHOW 81 - 160 ITEMS")));
		   
		   System.out.println(ele.getText());
		        driver.close();
	}
}
