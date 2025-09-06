package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class RegistrationStep {

    WebDriver driver;

    @Given("I am on the Registration page")
    public void i_am_on_the_registration_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    }

    @When("I enter {string} in the Registration First Name field")
    public void i_enter_in_the_registration_first_name_field(String firstName) {
        driver.findElement(By.id("input-firstname")).sendKeys(firstName);
    }

    @When("I enter {string} in the Registration Last Name field")
    public void i_enter_in_the_registration_last_name_field(String lastName) {
        driver.findElement(By.id("input-lastname")).sendKeys(lastName);
    }

    @When("I enter {string} in the Registration Email field")
    public void i_enter_in_the_registration_email_field(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
    }

    @When("I enter {string} in the Registration Telephone field")
    public void i_enter_in_the_registration_telephone_field(String phone) {
        driver.findElement(By.id("input-telephone")).sendKeys(phone);
    }

    @When("I enter {string} in the Registration Password field")
    public void i_enter_in_the_registration_password_field(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    @When("I enter {string} in the Registration Confirm Password field")
    public void i_enter_in_the_registration_confirm_password_field(String confirmPassword) {
        driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
    }

    @When("I select {string} for Registration Newsletter subscription")
    public void i_select_for_registration_newsletter_subscription(String option) {
        if(option.equalsIgnoreCase("Yes")) {
            driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
        } else {
            driver.findElement(By.xpath("//input[@name='newsletter'][@value='0']")).click();
        }
    }

    @When("I check the Registration Privacy Policy checkbox")
    public void i_check_the_registration_privacy_policy_checkbox() {
        driver.findElement(By.name("agree")).click();
    }

    @When("I click on the Registration Continue button")
    public void i_click_on_the_registration_continue_button() {
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }

    @Then("I should see the Registration success message {string}")
    public void i_should_see_the_registration_success_message(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//h1")).getText();
        assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }
}
