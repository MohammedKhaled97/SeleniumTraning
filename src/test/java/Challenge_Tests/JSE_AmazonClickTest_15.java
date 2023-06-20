package Challenge_Tests;

import Challenge_Pages.LoginPage;
import Challenge_Pages.amazonPage;
import org.testng.annotations.Test;

public class JSE_AmazonClickTest_15 extends TestBase {

    amazonPage amazonObject;

    @Test
    public void However() {
        amazonObject = new amazonPage(getDriver());
        amazonObject.Howver();
    }

}
