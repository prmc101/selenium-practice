package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * Created by Jay Vaghani
 */
public class TestRelativeLocators extends BaseTest {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void relativeLocators() {
        // above
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select"))).sendKeys("prime123@gmail.com");

        // below
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select"))).sendKeys("London");

        // near
//        driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin"))).click();

        // toRightOf
        driver.findElement(RelativeLocator.with(By.xpath("//input[@type='password']"))
                .toRightOf(By.tagName("label"))).sendKeys("Prime1234");

        // toLeftOf
        driver.findElement(RelativeLocator.with(By.linkText("Signin"))
                .toLeftOf(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]"))).click();

        // Chaining the Relative Locators
        // Example using above and below locator
        // Homework

    }
    @After
    public void tearDown() {
//        closeBrowser();
    }
}
