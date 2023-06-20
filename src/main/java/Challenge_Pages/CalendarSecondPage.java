package Challenge_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarSecondPage extends BasePage{

    public static String Date = "05/07/2023";

    public CalendarSecondPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "datepicker")
    public WebElement CalenderBTN;



    public void EnterDate() throws InterruptedException {
        CalenderBTN.sendKeys(Date);
        CalenderBTN.sendKeys(Keys.ENTER);
    }
}
