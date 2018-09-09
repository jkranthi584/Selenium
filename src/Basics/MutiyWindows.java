package Basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MutiyWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          ChromeOptions opt = new ChromeOptions();
           opt.addArguments("disable-infobars");
           WebDriver driver  = new ChromeDriver();
           driver.get("");
           String main= driver.getWindowHandle();
           
         Set<String> winds = driver.getWindowHandles();
         ArrayList<String> windows = new ArrayList<String>(winds);
	     for(int i=0; i<winds.size(); i++) {
	    	 driver.switchTo().window(windows.get(i)).getTitle();
	    	 driver.close();
	    	 
	    	 
	     }
	     
	     for(String wind: winds) {
	    	 if(!main.equalsIgnoreCase(wind)) {
	    		 driver.switchTo().window(wind).getTitle();
	    		 driver.close();
	    	 }
	     }
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	     
	     for(int i=0; i<links.size(); i++) {
	    	 
	    	links.get(i).click();
	    String text =	links.get(i).getText();
            File src =     ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("c:\\users\\ccomp\\"+text+".png"));
               driver.navigate().back();
            links=driver.findElements(By.tagName("a"));
	     }
	
	}

}
