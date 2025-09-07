package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.time.Duration;

public class ChangeCurrencyStep {

    WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));

    @When("User changes currency to {string}")
    public void user_changes_currency_to(String currencyName) throws InterruptedException {
        WebElement currencyDropdown = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-link.dropdown-toggle"))
        );
        currencyDropdown.click();
        String currencyCode = "";
        if (currencyName.equalsIgnoreCase("Euro")) {
            currencyCode = "EUR";
        } else if (currencyName.equalsIgnoreCase("Dollar")) {
            currencyCode = "USD";
        } else if (currencyName.equalsIgnoreCase("Pound")) {
            currencyCode = "GBP";
        }

        WebElement currencyOption = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='" + currencyCode + "']"))
        );
        currencyOption.click();
        Thread.sleep(1000);
    }

    @Then("Currency should be displayed as {string}")
    public void currency_should_be_displayed_as(String expectedSymbol) {
        WebElement priceElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-thumb .price"))
        );

        String priceText = priceElement.getText();
        Assert.assertTrue(priceText.contains(expectedSymbol),
                "Currency symbol not updated! Expected: " + expectedSymbol + ", Actual: " + priceText);
       
    }
}
