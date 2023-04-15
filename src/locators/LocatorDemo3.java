package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest3() {
       // Relative Xpath
        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobile");

        // xpath with or
        //input[@id='small-searchterms' or @name = 'q']

        // xpath with and
        //input[@id='small-searchterms' and @placeholder = 'Search store']

        //xpath with contains()
        //tagName[contains(@attribute,'value')]
        //input[contains(@id, 'sear')]

        // xpath with starts-with
        //tagName[starts-with(@attribute,'value')]
        //input[starts-with(@id, 'small')]

        //xpath with text()
        //tagName[text() = 'value')]
        //a[text() = 'Log in']

        // xpath with chained
        //ul[@class='top-menu notmobile']//a[text() = 'Computers ']



    }

    @After
    public void tearDown() {
//        closeBrowser();
    }


}
