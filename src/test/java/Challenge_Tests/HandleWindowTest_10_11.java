package Challenge_Tests;

import Challenge_Pages.HandleMultipleWindowsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HandleWindowTest_10_11 extends TestBase{
    HandleMultipleWindowsPage HandleWindowsObject ;

    @Test
    public void HandleWindow() throws InterruptedException {
        HandleWindowsObject = new HandleMultipleWindowsPage(getDriver());
        HandleWindowsObject.Click();
        String Parent = getDriver().getWindowHandle();
        ArrayList<String> Windows = new ArrayList<String> (getDriver().getWindowHandles());
        if (Parent.equals(Windows.get(0)))
        {
            getDriver().switchTo().window(Windows.get(1));
            getDriver().manage().window().maximize();
            String Title= getDriver().getTitle();
            System.out.println(Title);
            Assert.assertEquals(getDriver().getCurrentUrl(),HandleWindowsObject.TwitterLink,"New Window Assert");
        }

    }
}
