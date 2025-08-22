package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import graphql.Assert;
public class AssertExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

		public void title()
		{
			String expectedtitle="selenium dev";
			WebDriver driver;
			String actualtitle=driver.getTitle();
			System.out.println("expected title:"+expectedtitle);
			System.out.println("actual title:"+actualtitle);

		}
		
		public void url()
		{
			String expectedurl="https://www.selenium.dev/";
			String actualurl=driver.getCurrentUrl();
			Assert.assertEquals(actualurl, expectedurl, " URL validation failed");
			System.out.println("expected URL:"+expectedurl);
			System.out.println("actual url:"+actualurl);
		}
		public void afterClass()
		{
			driver.close();
		}
		/*
		Assert.assertTrue(false,"No, search button is not available on page");		WebElement search1=driver.findElement(By.id("gh-ac"));
		search1.sendKeys("watch");
		search1.sendKeys(Keys.ENTER);
		*/
	}



