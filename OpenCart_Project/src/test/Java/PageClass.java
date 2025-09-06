package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

    WebDriver driver;

    // --- Login ---
    By myAccountDropdown = By.xpath("//*[@id='top-links']/ul/li[2]/a");
    By loginLink = By.linkText("Login");
    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.cssSelector("input.btn.btn-primary");

    // --- Logout ---
    By logoutLink = By.linkText("Logout");

    // --- Search ---
    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");

    // --- Add to Cart ---
    By firstProduct = By.xpath("(//div[@class='product-thumb'])[1]//button[@type='button' and @onclick]");
    By cartButton = By.id("cart-total");
    By removeFromCart = By.cssSelector("button[title='Remove']");

    // --- Change Currency ---
    By currencyDropdown = By.cssSelector("button.btn.btn-link.dropdown-toggle");
    By currencyOption = By.xpath("//button[text()='€ Euro']"); // Example: Euro

    // --- Contact Page ---
    By contactLink = By.linkText("Contact Us");
    By enquiryBox = By.id("input-enquiry");
    By submitEnquiry = By.cssSelector("input.btn.btn-primary");

    // --- Change Password ---
    By changePasswordLink = By.linkText("Change your password");
    By oldPasswordField = By.id("input-password"); // replace if different
    By newPasswordField = By.id("input-password-new");
    By confirmPasswordField = By.id("input-password-confirm");
    By passwordContinueButton = By.cssSelector("input.btn.btn-primary");

    // --- Menus ---
    By desktopsMenu = By.linkText("Desktops");
    By macMenu = By.linkText("Mac");

    public PageClass(WebDriver driver) {
        this.driver = driver;
    }

    // --- Login Actions ---
    public void clickMyAccount() {
        driver.findElement(myAccountDropdown).click();
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // --- Logout Action ---
    public void clickLogout() {
        driver.findElement(myAccountDropdown).click();
        driver.findElement(logoutLink).click();
    }

    // --- Search Actions ---
    public void searchProduct(String productName) {
        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    // --- Add to Cart Actions ---
    public void addFirstProductToCart() {
        driver.findElement(firstProduct).click();
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public void removeFromCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement removeBtn = wait.until(ExpectedConditions.elementToBeClickable(removeFromCart));
        removeBtn.click();
    }

    // --- Change Currency Actions ---
    public void changeCurrency() {
        driver.findElement(currencyDropdown).click();
        driver.findElement(currencyOption).click();
    }

    // --- Contact Page Actions ---
    public void goToContactPage() {
        driver.findElement(contactLink).click();
    }

    public void fillEnquiry(String message) {
        driver.findElement(enquiryBox).sendKeys(message);
        driver.findElement(submitEnquiry).click();
    }

    // --- Change Password Actions ---
    public void goToChangePassword() {
        driver.findElement(changePasswordLink).click();
    }

    public void changePassword(String oldPass, String newPass) {
        driver.findElement(oldPasswordField).sendKeys(oldPass);
        driver.findElement(newPasswordField).sendKeys(newPass);
        driver.findElement(confirmPasswordField).sendKeys(newPass);
        driver.findElement(passwordContinueButton).click();
    }

    // --- Menu Navigation ---
    public void hoverOnDesktops() {
        Actions actions = new Actions(driver);
        WebElement desktop = driver.findElement(desktopsMenu);
        actions.moveToElement(desktop).perform();
    }

    public void clickMacMenu() {
        driver.findElement(macMenu).click();
    }
}
