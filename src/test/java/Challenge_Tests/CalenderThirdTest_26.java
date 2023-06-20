package Challenge_Tests;

import Challenge_Pages.CalenderThirdPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class CalenderThirdTest_26 extends TestBase{
    CalenderThirdPage Fo ;

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Calendar Test Case")
    @Link(name = "calendar Link",url = "https://webdriveruniversity.com/Datepicker/index.html")
    @Epic("EP_120")
    @Flaky
    public void EnterDate() throws InterruptedException {
        Fo = new CalenderThirdPage(getDriver());
        Fo.EnterDate();
    }
}
