package Challenge_Tests;

import Challenge_Pages.CodeBasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class JSE_Scroll2BottomTest_17 extends TestBase{

    CodeBasePage OB;

    @Test
    public void ScrollBottom()  {
        OB = new CodeBasePage(getDriver());
        JSE = (JavascriptExecutor) getDriver();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(OB.FooterSection));
        JSE.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
