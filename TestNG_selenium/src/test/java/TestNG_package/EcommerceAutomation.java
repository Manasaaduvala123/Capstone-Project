package TestNG_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class EcommerceAutomation {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set path of ChromeDriver in your system
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");
    }

    // ----------------- Task 1: Login Test -----------------
    @Test(priority = 1)
    public void loginTest() {
        driver.findElement(By.className("login")).click();

        // Enter valid credentials (use your registered email/password here)
        driver.findElement(By.id("email")).sendKeys("testuser123@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Test@12345");

        driver.findElement(By.id("SubmitLogin")).click();

        WebElement accountPage = driver.findElement(By.className("page-heading"));
        Assert.assertTrue(accountPage.getText().contains("MY ACCOUNT"), "❌ Login failed!");
        System.out.println("✅ Login Test Passed");
    }

    // ----------------- Task 2: Product Search & Add to Cart -----------------
    @Test(priority = 2)
    public void productSearchAndAddToCart() throws InterruptedException {
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();

        // Select first product from results
        driver.findElement(By.cssSelector(".product-container a.product-name")).click();

        // Add to cart
        driver.findElement(By.name("Submit")).click();

        Thread.sleep(2000); // wait for popup
        WebElement successMsg = driver.findElement(By.cssSelector(".layer_cart_product h2"));
        Assert.assertTrue(successMsg.getText().contains("successfully added"), "❌ Product not added to cart!");
        System.out.println("✅ Product Search & Add to Cart Passed");
    }

    // ----------------- Task 3: Checkout Flow -----------------
    @Test(priority = 3)
    public void checkoutFlow() throws InterruptedException {
        // Proceed to checkout from popup
        driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();

        // Summary page
        driver.findElement(By.cssSelector(".cart_navigation a[title='Proceed to checkout']")).click();

        // Address step
        driver.findElement(By.name("processAddress")).click();

        // Shipping step
        driver.findElement(By.id("cgv")).click(); // agree to terms
        driver.findElement(By.name("processCarrier")).click();

        // Payment step
        driver.findElement(By.className("bankwire")).click();
        driver.findElement(By.cssSelector("#cart_navigation button")).click();

        WebElement confirmMsg = driver.findElement(By.cssSelector(".cheque-indent strong"));
        Assert.assertTrue(confirmMsg.getText().contains("Your order"), "❌ Order confirmation failed!");
        System.out.println("✅ Checkout Flow Passed");
    }

    // ----------------- Task 4: Logout Test -----------------
    @Test(priority = 4)
    public void logoutTest() {
        driver.findElement(By.className("logout")).click();
        WebElement loginPage = driver.findElement(By.id("email"));
        Assert.assertTrue(loginPage.isDisplayed(), "❌ Logout failed!");
        System.out.println("✅ Logout Test Passed");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
