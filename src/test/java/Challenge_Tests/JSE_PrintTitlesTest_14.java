package Challenge_Tests;

import Challenge_Pages.LoginPage;
import Challenge_Pages.amazonPage;
import org.testng.annotations.Test;

public class JSE_PrintTitlesTest_14 extends TestBase {
    LoginPage LoginObject;


    @Test
    public void PrintTitle()  {
        LoginObject = new LoginPage(getDriver());
        LoginObject.Login("Admin", "admin123");
        LoginObject.PrintTitle();
    }

}
