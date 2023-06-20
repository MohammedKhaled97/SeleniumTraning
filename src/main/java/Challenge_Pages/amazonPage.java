package Challenge_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class amazonPage extends BasePage {
    public JavascriptExecutor JSE;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span/span")
    public WebElement SignIn_Btn;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement SignIn;



    public amazonPage(WebDriver driver) {
        super(driver);
        JSE = (JavascriptExecutor) driver;
    }

    public void Howver() {
        JSE.executeScript("arguments[0].click();", SignIn_Btn);
    }


    public void verifyLinks(String URL)  {
        try {
            URL url = new URL(URL);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(10000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() >= 400)
            {
                System.out.println(URL + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }
            else if (httpURLConnect.getResponseCode() >= 200 && httpURLConnect.getResponseCode() < 300)
            {
                System.out.println(URL + " - " + httpURLConnect.getResponseMessage());
            }
            else if (httpURLConnect.getResponseCode() >= 300 && httpURLConnect.getResponseCode() < 400)
            {
                System.out.println(URL + " - " + httpURLConnect.getResponseMessage());
            }
            else
            {
                System.out.println(URL + " - " + "is a broken link");
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
