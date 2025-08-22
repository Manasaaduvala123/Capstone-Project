package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Practice {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(3000);
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		
		//perofrm mouse over actions
	
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement motors=driver.findElement(By.xpath("//*[@id=\"gh-cat\"]/option[17]"));
		act.moveToElement(motors).perform();
		Thread.sleep(3000);
		
		WebElement sports=driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[1]/div[3]/div/a[3]"));
		act.moveToElement(sports).perform();
		Thread.sleep(3000);
		
		WebElement fashion=driver.findElement(By.xpath("/html/head/meta[11]"));
		act.moveToElement(fashion).perform();
		*/
	}

}
