package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

public class CommonSteps {

    public static WebDriver driver;  // Shared WebDriver

    @Given("User is on TutorialNinja homepage")
    public void user_is_on_tutorialninja_homepage() {
        if(driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.get("https://tutorialsninja.com/demo/");
    }

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}

