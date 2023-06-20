package Challenge_Tests;

import Challenge_Pages.amazonPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LocalizationTest_27 extends TestBase{
    amazonPage AO ;

    @Test
    public void Localization()
    {
        AO = new amazonPage(getDriver());

        String signInTxt= ob.getProperty("language")+"SignIn";
        Assert.assertEquals(AO.SignIn.getText(),ob.getProperty(signInTxt),"SignIn Assertion");

        String pageTitle = ob.getProperty("language")+"Title";
        Assert.assertEquals(getDriver().getTitle(),ob.getProperty(pageTitle),"Page Title Assertion");
    }
}
