package Challenge_Tests;

import Challenge_Pages.RightClickPage;
import org.testng.annotations.Test;

public class RightClickTest_4 extends TestBase{
    RightClickPage RightObject;
    @Test
    public void RightClick() throws InterruptedException {
        RightObject = new RightClickPage(getDriver());
        RightObject.RighClick();
        RightObject.AlertHandle();
    }
}
