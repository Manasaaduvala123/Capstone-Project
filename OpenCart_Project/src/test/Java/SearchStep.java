package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchStep {
	WebDriver driver= DriverFactory.getDriver();
    @Given("User is on the TutorialNinja homepage")
    public void user_is_on_the_tutorialninja_homepage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(1000);
    }
    @When("User searches for {string}")
    public void user_searches_for(String productName) throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000); 
    }
    @Then("User should see the search results for {string}")
    public void user_should_see_the_search_results_for(String productName) throws InterruptedException {
        WebElement searchResult = driver.findElement(By.cssSelector("div.product-layout"));
        if (searchResult.isDisplayed()) {
            System.out.println("Search results displayed for: " + productName);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchResult);
            Thread.sleep(1000);
        } else {
            System.out.println("No search results found for: " + productName);
        }
    }
    @Then("wait for {int} seconds")
    public void wait_for_seconds(Integer seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	public void user_selects_the_hp_lp3065_product() {
		// TODO Auto-generated method stub
		
	}
}
