package Challenge_Tests;

import Challenge_Pages.PracticePage;
import org.testng.annotations.Test;

public class IframeSwitchTest_2 extends  TestBase{

    PracticePage IframeObject;
    @Test
    public void IFrameClick()  {

        IframeObject = new PracticePage(getDriver());
        getDriver().switchTo().frame("courses-iframe");
        IframeObject.IframeClick();
    }
}
