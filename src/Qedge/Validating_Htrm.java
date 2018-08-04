package Qedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Htrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		String express= "Orangehrm";
	String actress=	driver.getTitle();
	System.out.println(actress);
	
	if(express.equalsIgnoreCase(actress)){
		
		
		System.out.println("Test is passed");
	}
	else{
		System.out.println("Sorry, Failed");
	}
	
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
		 
		 driver.findElement(By.name("Submit")).click();
		 String expression = "Welcome Admin";
	     String act=driver.findElement(By.xpath(".//*[@id='welcome']")).getText();
	     System.out.println(act);
	     if(expression.equalsIgnoreCase(act)){
	    	 
	    	 System.out.println("we are logged in");
	     }
	     else{
	    	 System.out.println("Login attempt failed");
	     }
	     driver.quit();
		
	}
}
