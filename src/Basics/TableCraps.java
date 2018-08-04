package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableCraps{
	
	
	//(//div[@class='wrap batsmen'])[1]/div[9]
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.espncricinfo.com/series/8037/scorecard/415281/Australia-vs-India-9th-Match,-Group-A-icc-champions-trophy/");;

		String path="(//div[@class='wrap batsmen'])[";
		String path2="]/div[";
				String path3= "]";
         /*       
		for(int i=1; i<=6; i++){
			
			for(int j=1; j<=8; j++){
				
				String crass=driver.findElement(By.xpath(path+i+path2+j+path3)).getText();
				
				System.out.print(crass+" ");
		  }
			System.out.println();

	   }*/ 
				
				                //All rows and cols
				
				WebElement table=   driver.findElement(By.xpath("//div[@class='scorecard-section batsmen']"));
				
				 List<WebElement>    rows    =   table.findElements(By.xpath("//div[@class='wrap batsmen']"));
				 
				  /*  List<WebElement>    cols=           table.findElements(By.xpath("(//div[@class='wrap batsmen'])[1]/div"));
				    
				       
				              System.out.println("The no of rows are: "+rows.size());
				    

				    			System.out.println("this num  of the columns are: "+cols.size());
				    
				        String cols1 = "(//div[@class='wrap batsmen'])[";
				       
				        String cols3="]/div[";
				       
				        String cols4="]";
				    
				    for(int i=1; i<=rows.size();i++){
				    	
				    	for(int j=1; j<=cols.size()-3;j++){
				    		
				    		
				    	String crap=	driver.findElement(By.xpath(cols1+i+cols3+j+cols4)).getText();
				    		
				    		System.out.print(crap+" ");
				    	}
				    	System.out.println();
				    }*/
				//fetching a data from all rows and 1 column
				/* System.out.println("Runs");
				   for(int i=1; i<=rows.size(); i++){
					   
					   String solo="(//div[@class='wrap batsmen'])[";
					   String solo2=  "]/div[5]";
					   
					   
					   System.out.println(driver.findElement(By.xpath(solo+i+solo2)).getText());
				   }*/
				 //All rows and cols
				 
				 for(int i=0; i<rows.size(); i++){
					 
					 String way=rows.get(i).getText();
					 System.out.print(way+" ");
					 
				 }
				 //System.out.println();
				    
				 
	}
	
}