package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DoubleClickPage extends BasePage {
    public DoubleClickPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body//div")
    WebElement DemoColor;

    @FindBy(xpath = "//div[@class='demo code-demo']//iframe")
    public
    WebElement Iframe;


    public void DoubleClick() {
        Action = new Actions(driver);
        Action.doubleClick(DemoColor).perform();
    }
}
