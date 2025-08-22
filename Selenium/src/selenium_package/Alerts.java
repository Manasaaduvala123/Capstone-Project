package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement samplealert=driver.findElement(By.id("alertButton"));
		samplealert.click();
		Thread.sleep(4000);
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement timealert=driver.findElement(By.id("timeButton"));
		timealert.click();
		Thread.sleep(6000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		
		Thread.sleep(2000);	
		WebElement confrimalert=driver.findElement(By.id("confrimButton"));
		confrimalert.click();
		Thread.sleep(2000);
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		WebElement promptalert=driver.findElement(By.id("promptButton"));
		promptalert.click();
		Thread.sleep(2000);
		Alert alert4=driver.switchTo().alert();
		alert4.sendKeys("harry");
		alert4.accept();
		
		
	}

}
