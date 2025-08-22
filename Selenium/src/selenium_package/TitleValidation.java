package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class TitleValidation {
		public static void main(String[] args) throws InterruptedException {
			System.out.println("first atuomation script");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.selenium.dev");
	
			String expectedtitle="selenium dev";
			String actualtitle="selenium";

				driver.manage().window().maximize();
				Thread.sleep(5000);
				if(expectedtitle.equals(actualtitle))
				{
					System.out.println("Title validation successfull");
				}
				else
				{
					System.out.println("Title validation failed");
				}
				driver.close();
				System.out.println("page loaded successfully");
				
			}
			
			
		}

