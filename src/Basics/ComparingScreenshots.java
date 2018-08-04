package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingScreenshots {
public static void main(String[] args) throws IOException {
    WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");

File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     driver.get("http://gmail.com");
     File src2=         ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


                      if(FileUtils.contentEquals(src1, src2)){
                    	  System.out.println("ScreenShots Matched");
                      }else{
                    	  System.out.println("Failed");
                      }
}                  
}
