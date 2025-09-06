package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import java.time.Duration;

public class LoginStep
{

    static WebDriver driver;
    @Given("I am on the Login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @When("I enter {string} in the Email field")
    public void i_enter_in_the_email_field(String email) {
        driver.findElement(By.id("input-email")).sendKeys(email);
    }

    @When("I enter {string} in the Login Password field")
    public void i_enter_in_the_login_password_field(String password) {
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    @When("I click on the Login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        String text = driver.findElement(By.cssSelector("h2")).getText();
        if (text.contains("My Account")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        driver.quit();
    }

	public void user_is_on_tutorialninja_homepage() {
		// TODO Auto-generated method stub
		
	}

	public void user_logs_in_with_email_and_password(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}
