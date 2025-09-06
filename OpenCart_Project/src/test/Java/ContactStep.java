package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactStep {

    WebDriver driver;

    @Given("User is on the Contact Us page")
    public void user_is_on_the_contact_us_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=information/contact");
        Thread.sleep(1000);
    }

    @When("User enters name {string}")
    public void user_enters_name(String name) {
        driver.findElement(By.id("input-name")).sendKeys(name);
    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
    }

    @When("User enters enquiry {string}")
    public void user_enters_enquiry(String enquiry) {
        driver.findElement(By.id("input-enquiry")).sendKeys(enquiry);
    }

    @When("User clicks on Submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        Thread.sleep(2000); 
    }

    @Then("User should be redirected to the success page")
    public void user_should_be_redirected_to_the_success_page() {
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("contact/success")) {
            System.out.println("Successfully redirected to the success page.");
        } else {
            System.out.println("Redirection failed. Current URL: " + currentUrl);
        }
        driver.quit();
    }

}
