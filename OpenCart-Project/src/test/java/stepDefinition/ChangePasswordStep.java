package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.*;

public class ChangePasswordStep {

    WebDriver driver;

    @Given("user is on TutorialNinja homepage")
    public void user_is_on_tutorial_ninja_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @When("user navigates to Login page")
    public void user_navigates_to_login_page() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Login")).click();
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        driver.findElement(By.id("input-email")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @When("user navigates to Change Password page")
    public void user_navigates_to_change_password_page() {
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Password")).click();
    }

    @When("user enters new password {string} and confirm password {string}")
    public void user_enters_new_password_and_confirm_password(String newPassword, String confirmPassword) {
        driver.findElement(By.id("input-password")).sendKeys(newPassword);
        driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
    }

    @When("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    @Then("user should see a success message {string}")
    public void user_should_see_a_success_message(String expectedMessage) {
        String actualMessage = driver.findElement(By.cssSelector(".alert-success")).getText();
        if (!actualMessage.contains(expectedMessage)) {
            throw new AssertionError(
                "Expected message: " + expectedMessage + " but got: " + actualMessage
            );
        }
        driver.quit();
    }
}
