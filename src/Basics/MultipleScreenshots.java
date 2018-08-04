package Basics;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleScreenshots {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.ebay.in");
		driver.get("http://newtours.demoaut.com");
		////*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[1]/h3/a
	//WebElement link = driver.findElement(By.tagName("footer"));
		//WebElement link = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li"));
		/*WebElement buy = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(buy.findElements(By.tagName("a")).size());
		List<WebElement> linkss=buy.findElements(By.tagName("a"));*/
		
List<WebElement> linkss= 		driver.findElements(By.tagName("a"));
	System.out.println(linkss.size());
		
		for(int i=0; i<linkss.size(); i++){
			
		String sname=	linkss.get(i).getText();
		   linkss.get(i).click();
		   System.out.println(sname);
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src,new File("E:\\multipleScreenshots\\"+sname+".jpg"));
		  driver.navigate().back();
	         linkss =    driver.findElements(By.tagName("a"));
		    
		}
		
		
		

		

	}
	
	
	

}
