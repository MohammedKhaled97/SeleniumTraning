package Challenge_Tests;

import Challenge_Pages.CalendarSecondPage;
import org.testng.annotations.Test;

public class CalenderSecondTest_25 extends TestBase{
    CalendarSecondPage Fo ;

    @Test
    public void EnterDate() throws InterruptedException {
        Fo = new CalendarSecondPage(getDriver());
        Fo.EnterDate();
    }
}
