package Challenge_Tests;

import Challenge_Pages.LoginPage;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CookiesLoginTest_1 extends TestBase {
    LoginPage LoginPageObject;

    @Test(priority = 1)
    public void LoginValid()  {
        LoginPageObject = new LoginPage(getDriver());
        LoginPageObject.Login("Admin", "admin123");
        Cookie LoginCookies = getDriver().manage().getCookieNamed("orangehrm");
        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        getDriver().manage().deleteAllCookies();
        getDriver().manage().addCookie(LoginCookies);
        getDriver().navigate().refresh();

    }

    @Test(priority = 0)
    public void CookiesValidation()  {
        LoginPageObject = new LoginPage(getDriver());
        LoginPageObject.GetAllCookies();
    }


}
