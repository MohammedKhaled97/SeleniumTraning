package Challenge_Tests;

import Challenge_Pages.DoubleClickPage;
import org.testng.annotations.Test;

public class DoubleClickTest_3 extends TestBase{
    DoubleClickPage DoubleObject ;
    @Test
    public void DoubleClick() {
        DoubleObject = new DoubleClickPage(getDriver());
        getDriver().switchTo().frame(DoubleObject.Iframe);
        DoubleObject.DoubleClick();
    }

}
