package guruSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {
	/*Remember following two things when uploading files in WebDriver
There is no need to simulate the clicking of the "Browse" button. 
WebDriver automatically enters the file path onto the file-selection text box
 of the <input type="file"> element.
 
  2)When setting the file path in your Java IDE, use the proper escape character for the back-slash.*/
	
	
	public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        String baseUrl = "http://demo.guru99.com/selenium/upload/";
        System.setProperty("webdriver.chrome.driver","C://Users//ccomp//Desktop//chromedriver.exe");					
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\console.log");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }

}