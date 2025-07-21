package ecom.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;   
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/section/div/div/div[1]/div/form/input[2]")
    WebElement usernameField;

    @FindBy(xpath = "/html/body/section/div/div/div[1]/div/form/input[3]")
    WebElement passwordField;

    @FindBy(xpath = "/html/body/section/div/div/div[1]/div/form/button")
    WebElement loginButton;


    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void loginWithoutUsername(String password) {
        // Do not enter username
        passwordField.sendKeys(password);
        loginButton.click();
    }
    public void loginWithoutPassword(String username) {
        usernameField.sendKeys(username);
        // Do not enter password
        loginButton.click();
    }

}
