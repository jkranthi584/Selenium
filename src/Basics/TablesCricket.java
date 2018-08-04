package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesCricket {
	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
	WebElement table=	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	           List <WebElement> cols=    table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
	            //div[class='cb-col cb-col-100 cb-scrd-itms'] 
	               for(int i=0;i<cols.size()-2; i++){
	            	   
	            	 String value=    cols.get(i).getText();
	            	 
	            	     int valueint=        Integer.parseInt(value);
	            	     
	            	      sum=sum+valueint;
	            	     // System.out.println(sum);
	            	                
	               }
	           String Extras= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	           
	                int Extrasint=             Integer.parseInt(Extras);
	                
	                  int TotalValue = sum + Extrasint;
	                  System.out.println(TotalValue);
	                  
	                  String expectedValue= driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	                  
	                            int actualTotalValue=            Integer.parseInt(expectedValue);
	                            
	                            if(actualTotalValue == TotalValue){
	                            	
	                            	System.out.println("the count matched!!!");
	                            	
	                            }
	                            else{
	                            	
	                            	System.out.println("count is wrong");
	                            }
	               
	           
	}
}
