package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HighestPrice_Page extends BasePage{
    public HighestPrice_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    public WebElement UserName;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(id = "login-button")
    public WebElement LoginButton;

    public void LoginSteps(String User , String Pass)
    {
        UserName.sendKeys(User);
        Password.sendKeys(Pass);
        LoginButton.submit();
    }

}
