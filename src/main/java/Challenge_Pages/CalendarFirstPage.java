package Challenge_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CalendarFirstPage extends BasePage{
    public CalendarFirstPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "day")
    public WebElement CalenderBTN;

    public static String Year= "2023";
    public static String Month= "10";
    public static String Day= "26";


    public void EnterDate() throws InterruptedException {
        Action = new Actions(driver);
        CalenderBTN.sendKeys(Year);
        CalenderBTN.sendKeys(Keys.TAB);
        CalenderBTN.sendKeys(Month);
        CalenderBTN.sendKeys(Day);
    }
}
