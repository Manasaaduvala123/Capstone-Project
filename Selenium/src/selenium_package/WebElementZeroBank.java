package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;
public class WebElementZeroBank {
public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException
{
	System.out.println("manual test-->"+testexecution);
	WebElement user=driver.findElement(By.id("user_login"));
	user.sendKeys(user1);
	
	WebElement pass=driver.findElement(By.id("user_password"));
	pass.sendKeys(pass1);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(500);
}
public  static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/login.html");
	System.out.println("welcome to zero bank login page");
	
	loginStep(driver,"456789","password","unable to login");
	loginStep(driver,"username","456123","unable to login");
	loginStep(driver,"4567vbnj89","njggyuk12","unable to login");
	loginStep(driver,"","","unable to login");
	loginStep(driver,"username","password","user is able to login");


	
}
}
