package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WishlistStep {

    WebDriver driver;

    @Given("I am logged in to TutorialsNinja")
    public void i_am_logged_in_to_tutorialsninja() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        // Navigate to Login
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();

        // Enter valid credentials (use your own test account here)
        driver.findElement(By.id("input-email")).sendKeys("manasaaduvala123@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("newpass123");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }

    @When("I navigate to the {string} category")
    public void i_navigate_to_the_category(String categoryName) {
        driver.findElement(By.linkText(categoryName)).click();
    }

    @When("I add the {string} product to the Wish List")
    public void i_add_the_product_to_the_wish_list(String productName) {
        // Click on heart icon for the product (relative to product name)
        WebElement product = driver.findElement(By.linkText(productName));
        WebElement wishlistBtn = product.findElement(By.xpath("../../..//button[@data-original-title='Add to Wish List']"));
        wishlistBtn.click();
    }

    @Then("I should see a success message {string}")
    public void i_should_see_a_success_message(String expectedMessage) {
        WebElement alert = driver.findElement(By.cssSelector(".alert"));
        Assert.assertTrue(alert.getText().contains(expectedMessage),
                "Expected message not found. Actual: " + alert.getText());
    }

    @Then("the product {string} should be listed in my Wish List")
    public void the_product_should_be_listed_in_my_wish_list(String productName) {
        // Navigate to Wish List
        driver.findElement(By.linkText("Wish List")).click();

        List<WebElement> wishlistItems = driver.findElements(By.cssSelector("table.table tbody tr td a"));
        boolean found = false;
        for (WebElement item : wishlistItems) {
            if (item.getText().equals(productName)) {
                found = true;
                break;
            }
        }


        Assert.assertTrue(found, "Product not found in Wish List: " + productName);

        driver.quit();
    }
}
