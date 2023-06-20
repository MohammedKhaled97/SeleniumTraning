package Challenge_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalenderThirdPage extends BasePage {

    public static String Year = "2020";
    public static String Month = "Dec";
    public static String Day = "25";

    public CalenderThirdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"datepicker\"]/input")
    public WebElement CalenderField;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[1]")
    public WebElement PrevBTN;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[3]")
    public WebElement nextBTN;

    @FindBy(xpath = "/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")
    public WebElement Month_YearField;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/thead/tr/th[2]")
    public WebElement CurrentYear;
    List<WebElement> months;
    List<WebElement> days;

    String CurrentYearText;

    public void EnterDate() throws InterruptedException {
        CalenderField.click();
        Month_YearField.click();
        CurrentYearText = CurrentYear.getText();
        System.out.println(CurrentYearText);
        while (!CurrentYearText.equals(Year)) {
            CurrentYearText = CurrentYear.getText();
            if (Integer.valueOf(CurrentYearText) > Integer.valueOf(Year)) {
                PrevBTN.click();
                System.out.println("prev is clicked");
            } else if (Integer.valueOf(CurrentYearText) < Integer.valueOf(Year)) {
                nextBTN.click();
                System.out.println("Next is clicked");
            } else if (Integer.valueOf(CurrentYearText).equals(Integer.valueOf(Year))) {
                System.out.println("Equal ");
                months = driver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span"));

                for (int i = 0; i < months.size(); i++) {
                    if (Month.equalsIgnoreCase(months.get(i).getText()))
                        months.get(i).click();
                }
                days = driver.findElements(By.xpath("//td[@class='day']"));
                System.out.println(days.size());

                for (int i = 0; i < days.size(); i++) {
                    if (Day.equalsIgnoreCase(days.get(i).getText())) {
                        days.get(i).click();
                        break;
                    }
                }
            }

        }
    }
}
