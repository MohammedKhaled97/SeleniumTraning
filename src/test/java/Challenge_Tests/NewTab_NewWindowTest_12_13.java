package Challenge_Tests;

import Challenge_Pages.PracticePage;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NewTab_NewWindowTest_12_13 extends TestBase {
    PracticePage new_Tab_Window_Object;

    @Test(priority = 0)
    public void HandleTab()  {
        new_Tab_Window_Object = new PracticePage(getDriver());
        new_Tab_Window_Object.ClickTab();
        String Parent = getDriver().getWindowHandle();
        ArrayList<String> Windows = new ArrayList<String>(getDriver().getWindowHandles());
        if (Parent.equals(Windows.get(0))) {
            getDriver().switchTo().window(Windows.get(1));
            getDriver().manage().window().maximize();
            String Title = getDriver().getTitle();
            System.out.println(Title);
            getDriver().switchTo().window(Windows.get(0));
        }

    }

    @Test(priority = 1)
    public void HandleWindow()  {

        new_Tab_Window_Object.ClickWindow();
        String Parent = getDriver().getWindowHandle();
        ArrayList<String> Windows = new ArrayList<String>(getDriver().getWindowHandles());
        if (Parent.equals(Windows.get(0))) {
            getDriver().switchTo().window(Windows.get(2));
            getDriver().manage().window().maximize();
            String Title = getDriver().getTitle();
            System.out.println(Title);
        }

    }
}
