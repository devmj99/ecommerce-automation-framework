package ecom.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import ecom.example.Utils.driverManager;

public class RegitrationTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterTest() {
        // Add any per-test cleanup if needed
        System.out.println("Test method completed.");
    }

    @BeforeMethod
    public void navigate() {
        driver.get("https://www.automationexercise.com/register");
    }

    @Test
    public void testRegistrationPageTitle() {
        String expectedTitle = "Register - Automation Exercise";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Registration page title mismatch");
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
        System.out.println("Test resources cleaned up.");
    }


}

