package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValidation {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		
		Select dropdown =new Select(driver.findElement(By.xpath("//*[@id=\"flightSearchForm.adultPassengerCount\"]")));
	boolean status =	dropdown.isMultiple();
/*To verify whether a dropdown allows multiple selections or not.
There is a method called isMultiple(). This method is a boolean method which returns true
 if the dropdown allows multiple selections else will return false.*/
		if(status)
		System.out.println("working fine");
	else
		System.out.println("Not working properly");
	}
}
