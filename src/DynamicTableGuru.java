import java.text.NumberFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.parser.ParseException; 
public class DynamicTableGuru {
	
	
	
	
	  /*  public static void main (String[] args)
	{
	    WebDriver wd;
	    System.setProperty ("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe") ;
	    wd = new ChromeDriver();
	    wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
	     wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebElement baseTable = wd.findElement(By.tagName("table"));
	    
	    //To fimd third row of table
	    WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
	    
	    WebElement tableRowText = baseTable.findElement(By.xpath ("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]"));
	    
	    String rowtext = tableRow.getText();
	    System.out.println("Third row of table : "+rowtext);
	    
	    //to get 3rd row's 2nd column data
	    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
	    String valueIneed = cellIneed.getText();
	    System.out.println("Cell value is : " + valueIneed); 
	    wd.close();
	}    //*[@id='leftcontainer']/table/tbody/tr[3]
  */
	  public static void main (String[] args) throws java.text.ParseException{ 
	        String max;
	        double m=0,r=0;
	        WebDriver wd; 
	        System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	        wd = new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
	        //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	            NumberFormat f =NumberFormat.getNumberInstance(); 
	           
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
	        wd.close();
	    }
	

}



