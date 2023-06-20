package Challenge_Tests;

import Challenge_Pages.CalendarFirstPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalenderFirstTest_24 extends TestBase {
    CalendarFirstPage Fo;

    @Test
    public void EnterDate() throws InterruptedException {
        Fo = new CalendarFirstPage(getDriver());
        Fo.EnterDate();


    }
}
