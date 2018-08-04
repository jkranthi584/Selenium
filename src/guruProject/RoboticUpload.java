package guruProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboticUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://toolsqa.com/automation-practice-form/");
     Thread.sleep(3000);
      String path="‪C:\\Users\\ccomp\\Downloads\\fool.png";
       StringSelection src = new StringSelection(path);
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
       driver.findElement(By.id("‪photo")).click();
       
       Robot rb = new Robot();
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       
       rb.keyRelease(KeyEvent.VK_CONTROL);
       
       rb.keyRelease(KeyEvent.VK_V);
       rb.delay(3000);
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);
       
      
	}

}
