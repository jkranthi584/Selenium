package Basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String path = "//div[@id='leftcontainer']/table/tbody/tr/td[";
            WebDriver driver = new ChromeDriver();
            
            driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
            
          WebElement table =  driver.findElement(By.xpath("//div[@id='leftcontainer']/table"));
          
                 List<WebElement> rows =             table.findElements(By.tagName("tr"));
                 
                 System.out.println(rows.size());
                 
                 for(int i=0; i<rows.size(); i++){
          
           // List <WebElement> cols= 	 rows.get(i).findElements(By.tagName("td["+3+"]"));
           List<WebElement> cols = rows.get(i).findElements(By.xpath(path+3+"]"));
            //Vakrangee
            if(cols.get(i).getText().contains("776")){
                            	System.out.println("present"); 
                            	break;
                             }
                         
                 }
                 driver.close();

	}

}
