package datepicker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class DatePicker extends Utility {
    String baseUrl = "https://www.redbus.in/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void selectDate() {

        String year = "2030";
        String month = "May";
        String date = "25";

        clickOnElement(By.id("onward_cal"));
        while (true) {
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            System.out.println(monthYear); // Apr 2023
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//button[normalize-space()='>']"));
            }
        }

        // Select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table//td"));
        for (WebElement dt : allDates){
            if (dt.getText().equalsIgnoreCase(date)){
                dt.click();
                break;
            }
        }

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
