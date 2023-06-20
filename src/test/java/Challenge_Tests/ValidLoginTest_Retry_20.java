package Challenge_Tests;

import Challenge_Pages.LoginPage;
import Listeners.Retry_Test;
import Utilities.HelperFunc;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidLoginTest_Retry_20 extends TestBase {
    LoginPage LoginObject;
    HelperFunc HelperObject;

    @Test(dataProvider = "ValidData",retryAnalyzer = Retry_Test.class)
    public void ValidLogin(String User, String Pass)  {
        LoginObject = new LoginPage(getDriver());
        LoginObject.Login(User, Pass);
       // Thread.sleep(2000);
        LoginObject.LogoutDrop.click();
        LoginObject.Logout.click();
        Assert.assertTrue(false);

    }



    @DataProvider
    public Object[][] ValidData() throws IOException {
        HelperObject = new HelperFunc(getDriver());
        return HelperObject.readDatavalid(LoginObject.ExcelSheetName, LoginObject.sheet_valid);
    }
}
