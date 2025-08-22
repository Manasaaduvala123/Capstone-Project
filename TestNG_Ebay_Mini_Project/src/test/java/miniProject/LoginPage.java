package miniProject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();
        Thread.sleep(2000);

        WebElement usernameField = driver.findElement(By.id("userid"));
        usernameField.sendKeys("manasaaduvala123@gmail.com");

        WebElement continueBtn = driver.findElement(By.id("signin-continue-btn"));
        continueBtn.click();
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("@admin123"); 

        WebElement signInBtn = driver.findElement(By.id("sgnBt"));
        signInBtn.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ug")));
        

        Assert.assertTrue(driver.getTitle().contains("eBay"), "Login failed!");
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
