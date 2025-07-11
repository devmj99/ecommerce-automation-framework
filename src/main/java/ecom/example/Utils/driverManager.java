package ecom.example.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            // Optimized WebDriverManager setup
            WebDriverManager.chromedriver()
                .cachePath("drivers")              // Custom local cache path (optional)
                .avoidBrowserDetection()           // Skip checking installed Chrome version
                .avoidOutputTree()                 // Clean up console output
                .setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");                     // Run without GUI
            options.addArguments("--disable-gpu");                  // Disable GPU (headless performance)
            options.addArguments("--window-size=1920,1080");        // Full HD window size
            options.addArguments("--remote-allow-origins=*");       // Chrome 111+ workaround
            options.addArguments("--disable-extensions");           // No unnecessary extensions
            options.addArguments("--disable-infobars");             // Remove "Chrome is being controlled..."
            options.addArguments("--no-sandbox");                   // Useful in some CI systems
            options.addArguments("--disable-dev-shm-usage");        // Prevent /dev/shm issues in containers

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
