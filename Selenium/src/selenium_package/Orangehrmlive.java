package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orangehrmlive {
	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException
	{
		System.out.println("manual test-->"+testexecution);
		WebElement user=driver.findElement(By.name("username"));
		user.click();
		user.sendKeys(user1);
		
		WebElement pass=driver.findElement(By.name("password"));
		user.click();
		pass.sendKeys(pass1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/input")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	public  static void main(String[] args)throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);		
		loginStep(driver,"456789","admin123","unable to login");
		loginStep(driver,"Admin","456123","unable to login");
		loginStep(driver,"4567vbnj89","njggyuk12","unable to login");
		loginStep(driver,"","","unable to login");
		loginStep(driver,"Admin","Admin123","user is able to login");


		
	}
	}
