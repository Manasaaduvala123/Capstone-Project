package TestNG_package;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class EbayAllTestCases {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By search=By.id("gh-ac");
	By submit=By.id("sgnBt");
	private By search_btn;
	private By addToCartBtn;
	private By removeFromCartbtn;
	private CharSequence clear;
	
	public  EbayAllTestCases(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test(priority = 1)
	public void email_in()
	{
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("sanjanapenugonda3@gmail.com");
	}
	
	public void pass_in()
	{
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("Sanjana@123");
	}
	
	public void con_in()
	{
		driver.findElement(cont).click();
	}
	
	public void submit_in()
	{
		driver.findElement(submit).click();
	}
	
	@Test(priority = 2)
	public void search_in() throws InterruptedException
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys("watch");
		driver.findElement(search).sendKeys(Keys.ENTER);
		driver.findElement(search).sendKeys(clear);
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void testAddToCart() throws InterruptedException {
		 WebElement searchBox = driver.findElement(By.id("gh-ac"));
		 searchBox.clear();
	     searchBox.sendKeys("iPhone 14");
	     driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
	     Thread.sleep(3000);

	     // 2. Select first product
	     driver.findElement(By.xpath("//*[@id=\"item29154cb96d\"]/div/div[1]/div/a/div/img")).click();
	    

	     // Switch to product page tab
	     for (String handle : driver.getWindowHandles()) {
	         driver.switchTo().window(handle);
	     }

	     // 3. Click Add to Cart
	     WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"atcBtn_btn_1\"]/span/span"));
	     addToCartBtn.click();
	 
	     Thread.sleep(3000);
	} 
	@Test(priority = 4)

	public void removecart() {
		 WebElement removecart = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a/span/span"));
	     removecart.click();
	     WebElement remove = driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]"));
	     remove.click();
		
	}
	

	@Test(priority = 5)
	
	public void changeloginname() throws InterruptedException {
		// 3. Navigate to Personal Info
        driver.findElement(By.linkText("My eBay")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Summary")).click();
        Thread.sleep(2000);

        // Go to Account Settings → Personal Info
        driver.findElement(By.linkText("Account")).click();
        Thread.sleep(2000);
       

        driver.findElement(By.linkText("Personal Information")).click();
        Thread.sleep(3000);

        // 4. Click edit on Name
        driver.findElement(By.xpath("//a[contains(text(),'Edit') and contains(@href,'name')]")).click();
        Thread.sleep(2000);

        // 5. Change name
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.clear();
        firstName.sendKeys("Sanju");

        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.clear();
        lastName.sendKeys("Penugonda");

        driver.findElement(By.id("saveBtn")).click();
        Thread.sleep(3000);
    }
@Test(priority = 6)
	
	public void shopByCategoriesTest() throws InterruptedException {
	try {
		driver.get("https://www.ebay.com/");
	        driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span")).click();
	        driver.findElement(By.linkText("Electronics")).click();
	        System.out.println("Shop by Categories Test: Executed");
	    } catch (Exception e) {
	        System.out.println("Shop by Categories Test Failed: " + e.getMessage());
	    }
}
@Test(priority = 7)
public void shopByAllCategoriesTest() {
    try {
        driver.findElement(By.id("gh-cat")).click();
        driver.findElement(By.linkText("See all categories")).click();
        System.out.println("Shop by All Categories Test: Executed");
    } catch (Exception e) {
        System.out.println("Shop by All Categories Test Failed: " + e.getMessage());
    }
}

@Test(priority = 8)
public void productDescriptionTest() throws InterruptedException {
	// 1. Search for product
    driver.findElement(By.id("gh-ac")).sendKeys("headphones");
    driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
    Thread.sleep(3000);

    // 2. Find first product image
    WebElement productImage = driver.findElement(By.cssSelector(".s-item img"));

    // 3. Perform Right-Click (Context Click)
    Actions actions = new Actions(driver);
    actions.contextClick(productImage).perform();
    Thread.sleep(2000);

    System.out.println("Right-click performed on product image ");
}
@Test(priority = 9)
public void languageChnage() throws InterruptedException {
	 WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
	 country.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("Spain")).click();
	 	
      }

}