package Qedge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxIsSelected_orNot {
public static void main(String[] args) {
	
	
	  
	System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	  driver.get("http://echoecho.com/htmlforms09.htm");
	  
List<WebElement> checkboxes=	      driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
                             System.out.println("no of checkboxes are: "+checkboxes.size());
                             
                             for(int i=0; i<checkboxes.size();i++){
                            	  if(!checkboxes.get(i).isSelected()){
                            		  
                            		  checkboxes.get(i).click();
                            	  }
                            	  else{
                            		  System.out.println(checkboxes.get(i).getAttribute("value"));
                            	  }
                             }
	      
}
}
