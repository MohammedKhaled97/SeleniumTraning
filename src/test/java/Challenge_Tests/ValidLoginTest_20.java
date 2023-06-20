package Challenge_Tests;

import Challenge_Pages.LoginPage;
import Utilities.HelperFunc;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidLoginTest_20 extends TestBase {
    LoginPage LoginObject;
    HelperFunc HelperObject;

    @Test(dataProvider = "ValidData")
    public void ValidLogin(String User, String Pass) {
        LoginObject = new LoginPage(getDriver());
        LoginObject.Login(User, Pass);
        Assert.assertTrue(false);
    }



    @DataProvider
    public Object[][] ValidData() throws IOException {
        HelperObject = new HelperFunc(getDriver());
        return HelperObject.readDatavalid(LoginObject.ExcelSheetName, LoginObject.sheet_valid);
    }
}
