package ecom.example.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            WebDriverManager.chromedriver()
                .cachePath("drivers")      
                .avoidBrowserDetection()   
                .avoidOutputTree()         
                .setup();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!/n!!!!!!!!!!!!!");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");                     
            options.addArguments("--disable-gpu");                  
            options.addArguments("--window-size=1920,1080");        
            options.addArguments("--remote-allow-origins=*");       
            options.addArguments("--disable-extensions");           
            options.addArguments("--disable-infobars");             
            options.addArguments("--no-sandbox");                   
            options.addArguments("--disable-dev-shm-usage");        

            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
