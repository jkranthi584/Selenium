package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBooksResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.amazon.in/s/ref=nb_sb_noss/260-0624115-1694409?url=search-alias%3Daps&field-keywords=books");
     
  String result=   driver.findElement(By.id("s-result-count")).getText().split(" ")[3]+" results"; 
                  System.out.println(result);
	}

}
