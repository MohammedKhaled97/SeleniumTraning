package Challenge_Tests;

import Challenge_Pages.PracticePage;
import org.testng.annotations.Test;

public class JSE_Show_HideTest_16 extends TestBase{
    PracticePage PracticeObject ;

    @Test(priority = 0)
    public void Hide ()  {
        PracticeObject = new PracticePage(getDriver());
        PracticeObject.Hide();
    }
    @Test(priority = 1)
    public void Show ()  {
        PracticeObject = new PracticePage(getDriver());
        PracticeObject.Show();
    }
}
