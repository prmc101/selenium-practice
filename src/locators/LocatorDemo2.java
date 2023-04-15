package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest2() {
        // Class name Locator --- To find multiple elements
        List<WebElement> sliderElementList = driver.findElements(By.className("nivo-imageLink"));
        System.out.println("Total slide is : " +sliderElementList.size());

        //Tag name Locator  -- To find Multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links = " + links.size());
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
