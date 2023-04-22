package datepicker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

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

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
