package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class UrlValidation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("first atuomation script");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		
		String expectedurl= "https://www.selenium.dev";
		String actualurl="https://www.selenium.dev";

			driver.manage().window().maximize();
			Thread.sleep(5000);
			if(expectedurl.equals(actualurl))
			{
				System.out.println("url validation successfull");
			}
			else
			{
				System.out.println("url validation failed");
			}
			driver.close();
			System.out.println("page loaded successfully");
			
		}
		
		
	}
