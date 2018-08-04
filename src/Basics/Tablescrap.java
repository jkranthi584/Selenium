package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablescrap {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.espncricinfo.com/series/8037/scorecard/415281/Australia-vs-India-9th-Match,-Group-A-icc-champions-trophy/");;
		 WebElement table=   driver.findElement(By.xpath("//div[@class='scorecard-section batsmen']"));
		               List<WebElement>    rows    =   table.findElements(By.xpath("//div[@class='wrap batsmen']"));
		               System.out.println(rows.size());
		               
                          		               
		               for(int i=0; i<rows.size();i++){
		            	 
		            	   
		            	WebElement row=rows.get(i);
		            	
		            	  //System.out.println(row.getText());
		            	
		            	//String r=   row.getText();
		            	//System.out.println(r);
		            	
		            /*List <WebElement>	cols=   row.findElements(By.tagName("td"));
		            	   for(int j=0; j<cols.size();j++){
		            		     WebElement col = cols.get(j);
		            		   System.out.println(col.getText());
		            	   }*/
		                  String part1= "[class='wrap batsmen'] :nth-child(";
		                		  
		                		  String part2=")";
		                  String path="//div[@class='wrap batsmen']/div[";
		                		  
		                	String path2="]";
		                          //table.findElement(By.cssSelector(part1+part2));
		                          
		                          for(int j=1; j<4; j++){
		                        	  
		                        	 
		                        String know=	  driver.findElement(By.xpath(path+j+path2)).getText();
		                        //div[@'class='wrap batsmen']/div[" 
		                        //"]";
		                        System.out.println(know);
		                        	  
		                          }
		                          
		                  
		               }
		                          
		
		
	}

}
