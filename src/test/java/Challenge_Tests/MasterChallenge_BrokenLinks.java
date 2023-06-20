package Challenge_Tests;

import Challenge_Pages.amazonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class MasterChallenge_BrokenLinks extends TestBase {
    amazonPage AO;

    @Test
    public void BrokenLinks()  {
        AO = new amazonPage(getDriver());

        List<WebElement> ALLLinks = getDriver().findElements(By.tagName("a"));
        System.out.println(ALLLinks.size());

        for (int i = 0; i < ALLLinks.size(); i++) {
            WebElement Link = ALLLinks.get(i);
            String URL = Link.getAttribute("href");
            if (URL == null || URL.isEmpty() || URL.startsWith("javascript")) {
                System.out.println("URL is empty or configured for another tag or not correct");
            }
            else
            {
                AO.verifyLinks(URL);
            }
        }
    }
}
