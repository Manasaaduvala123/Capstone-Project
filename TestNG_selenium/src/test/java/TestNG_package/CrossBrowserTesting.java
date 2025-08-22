package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.edge.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
  @Test
  public void chromebrowser1() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  String expectedtitle="online shopping";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
	  Thread.sleep(2000);
	  
  }
  public void firefoxbrowser() throws InterruptedException {
	  System.setProperty("webdriver.firefox.driver","C:\\Users\\manasaaduvala\\OneDrive\\Desktop\\Selenium\\geckodriver-v0.36.0-win32");
	  driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
	  String expectedtitle="online shopping";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
	  Thread.sleep(2000);
	  
  }
  public void edgebrowser() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\manasaaduvala\\OneDrive\\Desktop\\Selenium\\edgedriver_win64.zip");
	  driver=new EdgeDriver();
	  driver.get("https://www.flipkart.com/");
	  String expectedtitle="online shopping";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle," Title validation fail");
	  Thread.sleep(2000);
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
