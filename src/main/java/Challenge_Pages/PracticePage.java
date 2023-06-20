package Challenge_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticePage extends BasePage {

    public PracticePage(WebDriver driver) {
        super(driver);
        JSE = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//a[@href='/courses/javascript-for-beginners']//div[@class='zen-course-img']//div[@class='zen-course-thumbnail']//img[@alt='course image']")
    public WebElement CourseBTN;

    @FindBy(id = "hide-textbox")
    public WebElement HideButton;

    @FindBy(id = "show-textbox")
    public WebElement ShowButton;

    @FindBy(xpath = "//*[@id=\"course-list\"]/div[4]")
    public WebElement SelenuimCourse;

    @FindBy(partialLinkText = "Open Tab")
    public WebElement OpenTab;

    @FindBy(id = "openwindow")
    public WebElement OpenWindow;

    public void IframeClick() {

        ClickBtn(CourseBTN);
    }

    public void ClickTab() {

        OpenTab.click();
    }

    public void ClickWindow()  {

        OpenWindow.click();
    }

    public void Hide() {
        JSE.executeScript("arguments[0].click();", HideButton);
    }

    public void Show() {
        JSE.executeScript("arguments[0].click();", ShowButton);
    }
}
