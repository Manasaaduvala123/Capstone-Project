package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class ZeroBankLogin {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero Bank Login");
		{
			System.out.println("manual test::--> check user is unable to login with "+"invalid username and valid password cerdentials");
		}
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("123456");
		
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login successfully");
		
		
		System.out.println("Welcome to Zero Bank Login");
		{
			System.out.println("manual test::--> check user is unable to login with "+"valid username and invalid password cerdentials");
		}
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("7894561257kj");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login successfully");
		
		
		System.out.println("Welcome to Zero Bank Login");
		{
			System.out.println("manual test::--> check user is unable to login with "+"invalid username and invalid password cerdentials");
		}
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("123456");
		
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("45612578");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("login successfully");
		
		
		System.out.println("Welcome to Zero Bank Login");
		{
			System.out.println("manual test::--> check user is unable to login with valid credentials");
		}
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click on signin button
		driver.findElement(By.name("submit")).click();
		System.out.println("login successfully");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		

	}
}
