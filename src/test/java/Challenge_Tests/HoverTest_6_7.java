package Challenge_Tests;


import Challenge_Pages.LoginPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest_6_7 extends TestBase{
    LoginPage LoginPageObject;


    @Test(priority = 0)
    public void LoginValid()  {
        LoginPageObject = new LoginPage(getDriver());
        LoginPageObject.Login("Admin", "admin123");

    }

    @Test(priority = 1)
    public  void HoverTest() {

        Action = new Actions(getDriver());
        Action.moveToElement(LoginPageObject.RecruitmentBTN).click().build().perform();
        Action.moveToElement(LoginPageObject.VacancyBTN).click().build().perform();
    }


}
