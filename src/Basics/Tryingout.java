package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryingout {

	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
	//WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		           WebElement table=        driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1)"));
	
	           int columns=  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(4)")).size();
	           
	           for(int i=0; i<columns-2; i++){
	        	   //System.out.println(table.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[4])["+i+"]")).get(i).getText());
	        	   
	        	   //String path="div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(4)";
	        	   String path="//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[4]";
	        	   System.out.println(table.findElements(By.xpath(path)).get(i).getText());
	           }
		   
        }
}
