package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage{
    public UploadPage(WebDriver driver) {
        super(driver);
    }
    public String SheetPath = "C:\\Users\\mabdelbaky\\eclipse-workspace\\TCoETraining\\Uploads\\ISTQB-CTFL_Syllabus_2018_v3.1.1.pdf";
    @FindBy(id = "file-upload")
    public WebElement ChooseCV_BTN;

    public void UploadData(String Path)  {
        ChooseCV_BTN.sendKeys(Path);
    }
}
