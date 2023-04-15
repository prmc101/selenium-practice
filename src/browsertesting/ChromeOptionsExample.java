package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeOptionsExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");  // Disable browser notification
        options.addArguments("--incognito");  // Open Browser in private window
        options.addArguments("--headless");  // Open Browser in private window

        String baseUrl = "https://demo.nopcommerce.com/";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver(options);
        // Open the URL into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("Page Title :" + driver.getTitle());
    }
}
