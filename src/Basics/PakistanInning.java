package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PakistanInning {

	
	public static void main(String[] args) {
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		          // WebElement ing2=               driver.findElement(By.xpath("//div[@id='innings_2']/div[1]"));
		    WebElement ing2 =    driver.findElement(By.cssSelector("#innings_2 > div:nth-child(1"));
		                                                  List <WebElement>cols=     ing2.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
	                       //List <WebElement> cols=         ing2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
	
	              for(int i=0; i<cols.size()-2; i++){
	            	  
	            	         String value= cols.get(i).getText();  
	            	                 int intValue=  Integer.parseInt(value);
	            	                 
	            	                 sum= sum+intValue;
	            	                // System.out.println(sum);
	              }
	              String extras=   driver.findElement(By.xpath("(//div[text()='Extras']/following-sibling::div)[3]")).getText();
	              //ing2 didnt work, remember!
	                          // String  Extras=    ing2.findElement(By.xpath("//*[text()='Extras']/following-sibling::div")).getText();
	                           
	                                                 int intExtras = Integer.parseInt(extras);
	                                                 System.out.println(intExtras);
	                                                 
	                                                 int total=sum + intExtras;
	                                                 System.out.println("the total of second ingis: "+total);
	                               
	            String  totalValue=    driver.findElement(By.xpath("(//*[text()='Total'])[2]/following-sibling::div[1]")).getText();
	                                                 
	                       
	              int intTotalValue=         Integer.parseInt(totalValue);
	              System.out.println(intTotalValue);
	              
	              if(total==intTotalValue){
	            	  System.out.println("you are right");
	              }
	              else{
	            	  System.out.println("you are wrong");
	              }
	}
}
