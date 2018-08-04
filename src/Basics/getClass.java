package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getClass {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		//*[@id="gbw"]/div/div/div[1]/div[1]/a
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 
		String cls = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).getAttribute("class");
	
	       if(cls.equalsIgnoreCase("gb_P"))
	    	   System.out.println("passed");
	       else
	    	   System.out.println("fialed");
	       
	       driver.close();
	}

}
