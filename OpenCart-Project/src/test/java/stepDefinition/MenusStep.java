package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MenusStep {
    WebDriver driver;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @When("I hover over all the main menu items")
    public void i_hover_over_all_the_main_menu_items() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> menus = driver.findElements(By.cssSelector("ul.nav.navbar-nav > li > a"));
        for (WebElement menu : menus) {
            actions.moveToElement(menu).perform();
            System.out.println("Hovered on menu: " + menu.getText());
            Thread.sleep(1000);
        }
    }

    @Then("I should see all menus highlighted")
    public void i_should_see_all_menus_highlighted() {
        driver.quit();
    }
}
