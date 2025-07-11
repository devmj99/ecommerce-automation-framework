package ecom.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import ecom.example.Pages.loginPage;
import ecom.example.Utils.driverManager;
import java.util.List;
import java.time.Duration;
public class LoginTest {
    WebDriver driver;
    loginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = driverManager.getDriver();
        driver.get("https://www.automationexercise.com/login");
        loginPage = new loginPage(driver);
    }

    @Test
    public void Login() {
        loginPage.login("useremail@gmail.com", "userpassword");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        List<WebElement> elements=driver.findElements(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a"));
        Assert.assertFalse(elements.isEmpty(),"Element not found-login Might have failed");
    }

    @AfterMethod
    public void tearDown() {
        driverManager.quitDriver();
    }
}
