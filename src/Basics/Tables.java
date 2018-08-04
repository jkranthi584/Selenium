package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
WebDriver	driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Webdriverwait ac = new WebdriverWait(driver, 5)

driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
//
WebElement table = driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));
List<WebElement>noofrows = table.findElements(By.tagName("tr"));
System.out.println("No of rows in the table: "+noofrows.size());
//for(WebElement i=0; i < noofrows; i++){
    int i = 0;
for(WebElement eachrow:noofrows)
{
	//int i=0;
	i++;
   //finding no of tds in eachrow through enchance forloop iteration
    List<WebElement>eachcoloumn=eachrow.findElements(By.tagName("td"));
   
    System.out.println("No of coloumns in "+i+" th row are "+eachcoloumn.size());
   //this for loop for retrieving the value inside each coloumn
    for(WebElement text:eachcoloumn){
    	System.out.println(text.getText());
        }
   }
	
	
}
	}


