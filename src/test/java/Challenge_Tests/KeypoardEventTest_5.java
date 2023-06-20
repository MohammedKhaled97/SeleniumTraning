package Challenge_Tests;

import Challenge_Pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeypoardEventTest_5 extends TestBase {


    LoginPage LoginPageObject;
    Robot robot = new Robot();

    public KeypoardEventTest_5() throws AWTException {
    }

    @Test(priority = 0)
    public void LoginValid() {
        LoginPageObject = new LoginPage(getDriver());
        LoginPageObject.Login("Admin", "admin123");

    }

    @Test(priority = 1)
    public void KeyboardHandle() {
        Action = new Actions(getDriver());


        String Recruitment = LoginPageObject.RecruitmentBTN.getText();
        String CurrentURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        String RecURL = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";


        LoginPageObject.AdminBTN.sendKeys(Keys.TAB);
        while (!CurrentURL.equals(RecURL)) {
            Action.keyDown(Keys.TAB).perform();
            String Active = getDriver().switchTo().activeElement().getText();
            CurrentURL = getDriver().getCurrentUrl();
            // System.err.println(Active);
            if (Active.equals("Recruitment")) {
                Action.sendKeys(Keys.ENTER).perform();
              //  Thread.sleep(1000);
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_L);
             //   Thread.sleep(1000);
                /////////////
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_C);
            //    Thread.sleep(1000);
                //////////////
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_T);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_T);
            //    Thread.sleep(1000);
                ////////////////////
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyPress(KeyEvent.VK_ENTER);
             //   Thread.sleep(1000);
            }

        }

    }
}
