package Basics;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruTableDynamic {
	
	
	  public static void main (String[] args) throws ParseException{ 
	        String max;
	        double m=0, r=0;
	        WebDriver wd; 
	        System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
	        wd = new ChromeDriver();
	        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	    
	        for (int i =1;i<rows.size();i++)
	        {    //max is a string
	        	//i+1 because there is one last row in not included into the count
	            max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
	          //Reason for using Number format: Exception in thread "main" java.lang.NumberFormatException: For input string: "1,807.65"
	            NumberFormat f =NumberFormat.getNumberInstance(); // casting into a decimal format
	        // casting into number format so that we can convert it to primitive type, like int,double,etc
	           //casting string into a double using numberFormat object
	              
	           Number num = f.parse(max);//
	          
	            max = num.toString();
	            System.out.println("The max is what max=numt.toString():");
	            
	            //System.out.println(max = num.toString());
	            System.out.println("the max value is now "+max);
	            //converting string into a double
	            m = Double.parseDouble(max);
	            System.out.println("What is m in double.parseDouble(max)");
	           System.out.println( m = Double.parseDouble(max));
	            if(m>r)
	             {    
	                r = m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
	        wd.close();
	    }
	}
	
	


