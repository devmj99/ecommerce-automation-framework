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

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
        System.out.println("Test resources cleaned up.");
    }

}
