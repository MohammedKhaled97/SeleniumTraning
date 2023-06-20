package Challenge_Tests;


import Utilities.Configuration_Reader;
import Utilities.HelperFunc;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestBase extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static JavascriptExecutor JSE;
    static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
    public Actions Action;
    Configuration_Reader ob = new Configuration_Reader();
    HelperFunc HelpObject;

    public static WebDriver getDriver() {
        return drivers.get();
    }

    @BeforeTest
    @Parameters({"browser", "URL"})
    public void BeforeTest(@Optional("Chrome") String browser, String URL) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            Map<String, Object> chrome_prefs = new HashMap<String, Object>();
            chrome_prefs.put("intl.accept_languages", ob.getProperty("language"));
            chromeOptions.setExperimentalOption("prefs", chrome_prefs);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            drivers.set(driver);

        } else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            drivers.set(driver);
        } else if (browser.equalsIgnoreCase("Chrome_HeadLess")) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            //options.setHeadless(true);
            driver = new ChromeDriver(options);
            drivers.set(driver);
        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get(URL);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterTest
    public void AfterTest() throws InterruptedException {

        getDriver().quit();

    }

    @AfterMethod
    public void AfterMethod(ITestResult TestResult) throws IOException {
        String Statues = String.valueOf(TestResult.getStatus());

        if (Statues.equalsIgnoreCase("1")) {
            Statues = "PassTestCases";
        } else {
            Statues = "FailTestCases";
        }
        String Path = "ScreenShoot/" + Statues + "/" + TestResult.getName() + ".png";
        if (TestResult.getStatus() == ITestResult.FAILURE) {
            HelpObject.ScreenShoot(Path);
            Allure.addAttachment(TestResult.getName(), new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        } else if (TestResult.getStatus() == ITestResult.SUCCESS) {

            HelpObject.ScreenShoot(Path);
            Allure.addAttachment(TestResult.getName(), new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        }


    }


}
