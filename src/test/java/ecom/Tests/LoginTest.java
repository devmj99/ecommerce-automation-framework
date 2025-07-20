package ecom.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import ecom.example.Utils.ExcelReader;
import ecom.example.Pages.loginPage;
import ecom.example.Utils.driverManager;
import java.util.List;
import java.time.Duration;
public class LoginTest {
    WebDriver driver;
    loginPage loginPage;
    ExcelReader excelReader;

    @BeforeClass
    public void setUp() {
        driver= driverManager.getDriver();
        loginPage = new loginPage(driver);
        excelReader = new ExcelReader();
    }
    @BeforeMethod
    public void navigate(){
        driver.get("https://www.automationexercise.com/login");
    }

    @Test
    public void testLogin(String username, String password, boolean isSuccess) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testLoginPageTitle() {
        String expectedTitle = "Login - Automation Exercise";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Login page title mismatch");
    }

    @Test
    public void testLoginButtonDisplayed() {
        // Replace with actual locator
        WebElement loginBtn = driver.findElement(By.xpath(""));
        Assert.assertTrue(loginBtn.isDisplayed(), "Login button is not displayed");
    }

    @Test
    public void testUsernameFieldEnabled() {
        // Replace with actual locator
        WebElement usernameField = driver.findElement(By.xpath(""));
        Assert.assertTrue(usernameField.isEnabled(), "Username field is not enabled");
    }

    @Test
    public void testPasswordFieldEnabled() {
        // Replace with actual locator
        WebElement passwordField = driver.findElement(By.xpath(""));
        Assert.assertTrue(passwordField.isEnabled(), "Password field is not enabled");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
        System.out.println("Test resources cleaned up.");
    }

}
