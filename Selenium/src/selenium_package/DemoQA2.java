package selenium_package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoQA2 {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	 driver.findElement(By.cssSelector("input#firstName")).sendKeys("manasa");
     driver.findElement(By.cssSelector("input#lastName")).sendKeys("aduvala");
	
     driver.findElement(By.cssSelector("input#userEmail")).sendKeys("manasa@gmail.com");
     
     driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();

     driver.findElement(By.cssSelector("input#userNumber")).sendKeys("9876543210");
         
     driver.findElement(By.cssSelector("input#dateOfBirthInput")).click();
	driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
	driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
	driver.findElement(By.cssSelector("div[aria-label=\"choose Tuesday, April 1st, 2025\"]")).click();

	WebElement subjectBox = driver.findElement(By.cssSelector("input#subjectsInput"));
    subjectBox.sendKeys("civics");
    subjectBox.sendKeys(Keys.ENTER);

    driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();

    driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("123 Main Street, City");

    WebElement stateDropdown = driver.findElement(By.cssSelector("#react-select-3-input"));
    stateDropdown.sendKeys("NCR");
    stateDropdown.sendKeys(Keys.ENTER);

    WebElement cityDropdown = driver.findElement(By.cssSelector("#react-select-4-input"));
    cityDropdown.sendKeys("Delhi");
    cityDropdown.sendKeys(Keys.ENTER);

    driver.findElement(By.cssSelector("button#submit")).click();

    Thread.sleep(3000);
    driver.quit();
}
}