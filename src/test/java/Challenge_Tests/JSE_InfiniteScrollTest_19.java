package Challenge_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSE_InfiniteScrollTest_19 extends TestBase{

    @Test
    public void Scroll () {
        JSE = (JavascriptExecutor) getDriver();

        long intialLength = (long) JSE.executeScript("return document.body.scrollHeight");

        while(true){
            JSE.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentLength = (long) JSE.executeScript("return document.body.scrollHeight");
            if(intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;
        }
    }

}
