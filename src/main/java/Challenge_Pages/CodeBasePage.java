package Challenge_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CodeBasePage extends BasePage{
    public CodeBasePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]")
    public WebElement FooterSection;


}
