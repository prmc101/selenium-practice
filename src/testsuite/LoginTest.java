package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedMessage, actualMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        //Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the Email address to email field element
        emailField.sendKeys("prime123@gmail.com");
       //Find the Password Field Element and send password on password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //Find the Login btn Element and click
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found1";
        WebElement actualTextElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualMessage = actualTextElement.getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
