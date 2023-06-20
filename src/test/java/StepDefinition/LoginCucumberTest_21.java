package StepDefinition;

import Challenge_Pages.LoginPage;
import Challenge_Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginCucumberTest_21 extends TestBase {
    LoginPage Lo ;


    @Given("the User is at Login Page")
    public void User_At_LoginPage()
    {
        Lo = new LoginPage(getDriver());
        Assert.assertEquals(getDriver().getCurrentUrl(),Lo.LoginURL,"Login Page Assertion");
    }

    @When("User Enter {string} , {string}")
    public void Enter_Data(String Username , String Pass)
    {
        Lo.LoginCucumber(Username,Pass);
    }

    @When("Click on Login Button")
    public void LoginClick()
    {
        Lo.ClickCucumber();
    }

    @Then("user Logged in Successfully")
    public void HomePage()
    {
        Assert.assertEquals(getDriver().getCurrentUrl(),Lo.HomePageURL,"HomePage Assertion");
    }



}
