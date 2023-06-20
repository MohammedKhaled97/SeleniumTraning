package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RightClickPage extends BasePage {
    public RightClickPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"authentication\"]/span")
    WebElement RightClickBTN;

    @FindBy(xpath = "//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")
    WebElement EditBTN;


    public void RighClick() throws InterruptedException {
        Action = new Actions(driver);

        Action.contextClick(RightClickBTN).perform();

        ClickBtn(EditBTN);

    }

    public void AlertHandle() {
        Alert = driver.switchTo().alert();
        Alert.accept();
    }
}
