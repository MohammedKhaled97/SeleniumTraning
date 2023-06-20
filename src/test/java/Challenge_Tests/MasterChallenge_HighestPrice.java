package Challenge_Tests;

import Challenge_Pages.HighestPrice_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterChallenge_HighestPrice extends TestBase {
    HighestPrice_Page SO;
    List<Float> Prices = new ArrayList<>();

    @Test(priority = 0)
    public void LogintoSite() {
        SO = new HighestPrice_Page(getDriver());
        SO.LoginSteps("standard_user", "secret_sauce");
    }

    @Test(priority = 1)
    public void GetSecondHighestPrice() {
        List<WebElement> PricesWithSign = getDriver().findElements(By.className("inventory_item_price"));
//        Iterator<WebElement> iterator = PricesWithSign.iterator();
//
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next().getText());
//        }

        for (int i = 0; i < PricesWithSign.size(); i++) {

            WebElement temp = PricesWithSign.get(i);
            Float PricesWithoutSign = Float.valueOf(temp.getText().replace("$", ""));
            Prices.add(PricesWithoutSign);
        }
        Collections.sort(Prices);
        System.out.println(Prices);
        System.err.println("The second highest Price Is : " + Prices.get(Prices.size() - 2));
    }
}
