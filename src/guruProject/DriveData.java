package guruProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
public class DriveData{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path ="C:\\Users\\ccomp\\workspace\\Selenium1\\src\\testData.xls";
		String url ="http://www.demo.guru99.com/V4/";
		//WebDriver driver = new ChromeDriver();
		//driver.get(url);
		/*river.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password1);
*/
		
		Workbook wb = Workbook.getWorkbook(new File(path));
		    Sheet sheet=          wb.getSheet("Data");
		    String crap=   sheet.getCell(2, 3).getContents();
		    System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");
		    
			  System.out.println(crap);
		            int num= sheet.getRows();
		               System.out.println(num);    
		               System.out.println("username   password");
	            for(int i=1; i<num; i++) {
	            String craps=	sheet.getCell(1,i).getContents();
	          // driver.findElement(By.name("uid")).clear();
	    		//driver.findElement(By.name("uid")).sendKeys(craps);
	    		 String crap2=  sheet.getCell(2, i).getContents();
	    		//driver.findElement(By.name("password")).clear();
	    		//driver.findElement(By.name("password")).sendKeys(crap2);
	    		 //driver.navigate().refresh();
	    		 //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    		
	          
	            System.out.print(craps+"    ");
	                /*  if(crap2.contains("invalid")) {
	                	  System.out.println("  invalid");
	                  }*/
	                   System.out.print(crap2);
                   System.out.println();
	            	
	            }
		       
		

	}
}
