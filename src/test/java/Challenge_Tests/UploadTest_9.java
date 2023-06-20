package Challenge_Tests;

import Challenge_Pages.UploadPage;
import org.testng.annotations.Test;

public class UploadTest_9 extends TestBase{

    UploadPage UploadObject ;

    @Test
    public void Upload() {
        UploadObject = new UploadPage(getDriver());
        UploadObject.UploadData(UploadObject.SheetPath);
    }
}
