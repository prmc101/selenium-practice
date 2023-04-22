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
public class LocatorDemo5 extends BaseTest {

    String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest5() {
        // Self --- Select the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'ITC Ltd.')]/self::a")).getText();
        System.out.println(text); // ITC Ltd.

        // Parent --- Select the parent of the current node (always one)
        text = driver.findElement(By.xpath("//a[contains(text(),'ITC Ltd.')]/parent::td")).getText();
        System.out.println(text); // ITC Ltd.

        //Child --- Select the children of current node (one or many)
        List<WebElement> children = driver.findElements(By.xpath("//a[contains(text(),'ITC Ltd.')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements :" +children.size()); // 5

        //Ancestor --- Select all ancestors (parent grandparent etc)
        text = driver.findElement(By.xpath("//a[contains(text(),'ITC Ltd.')]/ancestor::tr")).getText();
        System.out.println(text); // ITC Ltd. A 400.30 408.25 + 1.99
        //Descendant -- Select all descendants (children, grand children etc)
        //a[contains(text(),'ITC Ltd.')]/ancestor::tr/descendant::*

        // Following -- Select everything in document after the closing tag of the current node.
        //a[contains(text(),'ITC Ltd.')]/ancestor::tr/following::tr

        // Following-Sibling  -- Select all siblings after the current node

        // Preceding -- Select all nodes that appear before the current node in the document
        //a[contains(text(),'ITC Ltd.')]/ancestor::tr/preceding::tr

        // Preceding-sibling -- Select all siblings before the current node

    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}
