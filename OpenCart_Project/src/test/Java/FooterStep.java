package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class FooterStep {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    @When("I scroll down to the footer")
    public void i_scroll_down_to_the_footer() {
        WebElement footer = driver.findElement(By.xpath("/html/body/footer"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
    }

    @Then("I should see the following footer links:")
    public void i_should_see_the_following_footer_links(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedLinks = dataTable.asList();
        WebElement footer = driver.findElement(By.xpath("/html/body/footer"));

        for (String linkText : expectedLinks) {
            boolean isPresent = footer.findElements(By.linkText(linkText)).size() > 0;
            Assert.assertTrue("Footer link not found: " + linkText, isPresent);
        }
    }

    @When("I click the footer link {string}")
    public void i_click_the_footer_link(String linkText) {
        WebElement footer = driver.findElement(By.xpath("/html/body/footer"));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(footer.findElement(By.linkText(linkText))));
        link.click();
    }

    @Then("I should be navigated to the {string} page")
    public void i_should_be_navigated_to_the_page(String pageTitle) {
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue("Not navigated to: " + pageTitle, driver.getTitle().contains(pageTitle));
        driver.quit();
    }
}
