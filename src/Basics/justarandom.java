package Basics;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class justarandom {
public static void main(String[] args) throws ParseException {
	WebDriver wd;String max;
	double m,r=0;
	System.setProperty("webdriver.chrome.driver", "C://Users//ccomp//Desktop//chromedriver.exe");
    wd = new ChromeDriver();
   wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
    
  List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
   
             System.out.println("total no of cols are:  " +col.size());
     List <WebElement> row = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        
       System.out.println("total no of rows are: "+row.size());
       
              for(int i=0; i<row.size(); i++){
            	  
            	    max= wd.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]")).getText();

                      NumberFormat f = NumberFormat.getNumberInstance();
                      Number num = f.parse(max);
                      max=num.toString();
                      
                     m=Double.parseDouble(max);
                     System.out.println(m+"\n r: "+r);
                     if(m>r){
                    	 r=m;
                    	// System.out.println("value inside the loop: "+r);
                     }
              
              }
              System.out.println("The maximum value is "+r);
              
  /* wd.get("http://demo.guru99.com/selenium/table/");
  //To locate table.
 WebElement mytable=wd.findElement(By.xpath("/html/body/table/tbody"));
 
 //To locate the row
          List<WebElement>  myrows= mytable.findElements(By.tagName("tr"));
          
      //System.out.println("the total no of rows are: " +myrows.size());
          
      int rowscount = myrows.size();
          for(int row=0; row<rowscount; row++){
           
        	// to calculate no of columns(cells) in that specific row      
  List<WebElement> mycols=  myrows.get(row).findElements(By.tagName("td"));
  
      int colscount = mycols.size();
      System.out.println("Number of rows" + row+ "columns count is" +colscount);
      
          //loop will execute till the last cell of that specific row
           for(int column=0; column<colscount;column++){
        	   
        	String cellText =   mycols.get(column).getText();
        	System.out.println("cell value of row number "+row+ "and the column number is "+column+"is: "+cellText);
        	   
           }
           
             
           
          
             System.out.println("****************************");
          }
  }  
}*/
      
             
   /* wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    wd.get("http://demo.guru99.com/selenium/table/");
    
    // locate the table
    
   WebElement table=  wd.findElement(By.xpath("/html/body/table/tbody"));
   
   //locate the row
   
      List<WebElement> rows=wd.findElements(By.tagName("tr"));
         
      int rowscount= rows.size();
      for(int row=0; row<rowscount; row++){
    	  
    	  List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
    	  int colscount = cols.size();
    	  System.out.println("Number of rows in the table:"+row+" are "+colscount);
    	  for(int column=0; column<colscount; column++ ){
    		  // to retrieve the text from a specific cell
    		  String celltext=cols.get(column).getText();
    		  System.out.println("Cell value of row number "+row +" and column number " + column +" is " + celltext);
    		 
    	  }
    	  System.out.println("************************");
      }
      wd.close();
  }

}*/
 
    
    /*wd.get("http://demo.guru99.com/selenium/table/");
    //To locate table.
   WebElement mytable=wd.findElement(By.xpath("/html/body/table/tbody"));
   
      List<WebElement> rows = mytable.findElements(By.tagName("tr"));
      int rowscount = rows.size();
      for(int row=0; row<rowscount; row++){
    	  List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
    	  int colscount=cols.size();
    	  System.out.println("Number of rows "+row + " columns count is "+colscount);
    	  for(int column=0; column<colscount;column++){
    		  
    		  String celltext= cols.get(column).getText();
    		  
    	  
    	  System.out.println("Cell Value of row number "+row+" and column number "+column+" Is "+celltext);
      }
      System.out.println("-------------------------------------------------- ");
      }*/
    	
      }
           
}

      
    
    




