package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragDropPage extends BasePage{
    public DragDropPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "draggable")
    public
    WebElement DragELE;
    @FindBy(id = "droppable")
    public
    WebElement DropELE;
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    public
    WebElement Iframe;
}

