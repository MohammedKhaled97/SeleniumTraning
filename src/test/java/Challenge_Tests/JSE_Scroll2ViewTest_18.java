package Challenge_Tests;

import Challenge_Pages.PracticePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSE_Scroll2ViewTest_18 extends TestBase{
    PracticePage PracticeObject ;

    @Test
    public void Scroll () {

        PracticeObject = new PracticePage(getDriver());
        JSE = (JavascriptExecutor) getDriver();
        getDriver().switchTo().frame("courses-iframe");
        JSE.executeScript("arguments[0].scrollIntoView();", PracticeObject.SelenuimCourse);

    }
}
