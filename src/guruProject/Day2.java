package guruProject;

import java.io.File;

import org.apache.xalan.xsltc.compiler.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Day2 {
	static WebDriver driver; // Selenium control driver
    private static String baseUrl; // baseUrl of Website Guru99
	
	public static void setUp() {
		
		File pathToBinary = new File(Day2Util.path);
		/*ChromeOptions options = new ChromeOptions();
		 options.addExtensions(new File("/path/to/extension.crx"));
		 options.setBinary(new File(pathToBinary));*/
	   driver  = new ChromeDriver();
	   baseUrl = Day2Util.BASE_URL;
	   driver.get(baseUrl+"/V4/");
		
	}
	public static void main(String[] args) {
		String userName, password;
		setUp();
		String actualTitle, expectedTitle;
		driver.findElement(By.name("uid")).clear(); 
		driver.findElement(By.name("uid")).sendKeys(Day2Util.USER_NAME);

	    driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
	    driver.findElement(By.name("password")).sendKeys(Day2Util.PASSWD);  // Enter Password

		 driver.findElement(By.name("btnLogin")).click();
		 actualTitle = driver.getTitle();
		 expectedTitle=Day2Util.EXPECT_TITLE;
		 
		 if(actualTitle.contains(expectedTitle)) {
			 
			 System.out.println("Script Passed");
		 }else {
			     System.out.println("title didn't match");
		 }
		 driver.close();
		 
		 
	}

}
