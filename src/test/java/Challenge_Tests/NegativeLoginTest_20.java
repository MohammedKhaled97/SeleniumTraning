package Challenge_Tests;

import Challenge_Pages.LoginPage;
import Utilities.HelperFunc;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class NegativeLoginTest_20 extends TestBase {
    LoginPage LoginObject;
    HelperFunc HelperObject;

    @Test(dataProvider = "InValidData")
    public void NegativeLogin(String User, String Pass) {
        LoginObject = new LoginPage(getDriver());
        LoginObject.Login(User, Pass);
    }

    @DataProvider
    public Object[][] InValidData() throws IOException {
        HelperObject = new HelperFunc(getDriver());
        return HelperObject.readDatavalid(LoginObject.ExcelSheetName, LoginObject.sheet_Invalid);
    }
}
