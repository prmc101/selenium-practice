package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest4() {
       // CSS Selector
        //  tagName[attribute='value']
        driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Mobile");

        // input#small-searchterms
        // input.search-box-text.ui-autocomplete-input

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }


}
