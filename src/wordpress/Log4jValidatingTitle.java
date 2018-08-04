package wordpress;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log4jValidatingTitle extends Log4jWordpressMain{
	
	public static Logger log=    LogManager.getLogger(Log4jWordpressMain.class.getName());
	public static WebDriver driver;
	//public ValidatingTitle(){}
	public Log4jValidatingTitle(WebDriver driver){
		//System.out.println("navigating to verify");
		log.info("navigated here");
		ValidatingTitle.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Site Title")
	WebElement title;
	
	public WebElement getSiteTitle(){
		
		return title;
	}
	
	public static void getScreenShot(String result) throws IOException{
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      
	String destination = "C:\\Users\\ccomp\\workspace\\Selenium1\\src\\wordpress\\screenshots\\"+result+"Screenshot.png";
	    FileUtils.copyFile(src, new File(destination));
	
	}
	
}
