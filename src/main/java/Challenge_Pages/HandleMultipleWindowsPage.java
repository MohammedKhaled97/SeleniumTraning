package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandleMultipleWindowsPage extends BasePage{
    public HandleMultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public String TwitterLink = "https://twitter.com/Lambdatesting";
    @FindBy(partialLinkText = "Follow On Twitter")
    public WebElement TwitterBTN;

    public void Click () throws InterruptedException {
        TwitterBTN.click();
    }
}
