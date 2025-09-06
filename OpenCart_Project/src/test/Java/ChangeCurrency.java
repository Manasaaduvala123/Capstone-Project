package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import org.testng.Assert;
import java.time.Duration;

public class ChangeCurrency {

    WebDriverWait wait = new WebDriverWait(CommonSteps.driver, Duration.ofSeconds(10));

    @When("User changes currency to {string}")
    public void user_changes_currency_to(String currencyName) throws InterruptedException {
        // Click currency dropdown
        WebElement currencyDropdown = wait.until(
            ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-link.dropdown-toggle"))
        );
        currencyDropdown.click();

        // Map currency name to button 'name' attribute
        String currencyCode = "";
        switch(currencyName.toLowerCase()) {
            case "euro": currencyCode = "EUR"; break;
            case "dollar": currencyCode = "USD"; break;
            case "pound": currencyCode = "GBP"; break;
        }

        // Click the currency button
        WebElement currencyOption = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='" + currencyCode + "']"))
        );
        currencyOption.click();

        // Wait 1 second to view changes
        Thread.sleep(1000);
    }

    @Then("Currency should be displayed as {string}")
    public void currency_should_be_displayed_as(String expectedSymbol) {
        // Wait for product price to reflect new currency
        WebElement priceElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-thumb .price"))
        );

        String priceText = priceElement.getText();
        Assert.assertTrue(priceText.contains(expectedSymbol),
                "Currency symbol not updated! Expected: " + expectedSymbol + ", Actual: " + priceText);
    }
}
