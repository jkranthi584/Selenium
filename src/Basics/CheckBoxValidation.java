package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxValidation {
/*Checkbox Validation:  To verify that a checkbox is checked or not.
 *  Selenium provides a method called isEnabled(). It’s a boolean method which returns true 
 * if the checkbox is checked and returns false if it is not checked.*/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
              String xpath="//*[@id=\"layered_id_attribute_group_1\"]";
          WebDriver driver = new ChromeDriver();
              driver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/size-s-l");
                driver.findElement(By.xpath(xpath)).click();
                Thread.sleep(4000L);
              boolean status=     driver.findElement(By.xpath(xpath)).isEnabled();   
        if(status)
        	System.out.println("checked");
        else
        	System.out.println("uncheck");
	}

}
