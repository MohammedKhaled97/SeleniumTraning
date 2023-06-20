package Challenge_Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public JavascriptExecutor JSE;
    public Actions Action;
    public Alert Alert;


   public BasePage (WebDriver driver)
   {
       this.driver= driver;
       PageFactory.initElements(driver,this);

   }

   public void ClickBtn(WebElement Button)
   {
       Button.click();

   }


}
