package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import java.time.Duration;

public class AddToCartStep {

    WebDriver driver;

    @Given("I am on the Tutorials Ninja homepage")
    public void i_am_on_the_tutorials_ninja_homepage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @When("I choose the featured product {string}")
    public void i_choose_the_featured_product(String productName) {
        WebElement product = driver.findElement(By.linkText(productName));
        product.click();
    }

    @When("I click on {string}")
    public void i_click_on(String buttonName) {
        if (buttonName.equalsIgnoreCase("Add to Cart")) {
            driver.findElement(By.id("button-cart")).click();
        }
    }

    @Then("my shopping cart count should be incremented by {int}")
    public void my_shopping_cart_count_should_be_incremented_by(Integer expectedCount) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textMatches(
            By.id("cart-total"),
            java.util.regex.Pattern.compile(expectedCount + " item")
        ));

        String cartText = driver.findElement(By.id("cart-total")).getText();
        Assert.assertTrue(cartText.contains(expectedCount.toString()),
            "Cart count not matching! Actual: " + cartText);
    }

    @Then("the cart total should reflect the product price")
    public void the_cart_total_should_reflect_the_product_price() {
        String cartText = driver.findElement(By.id("cart-total")).getText();
        Assert.assertTrue(cartText.contains("$123.20"),
            "Cart total price not matching! Actual: " + cartText);
        driver.quit();
    }
}
