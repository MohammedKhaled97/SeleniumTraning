package Challenge_Pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;


public class LoginPage extends BasePage {

    public static String LoginURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static String HomePageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    public static String ExcelSheetName = "C:\\Users\\mabdelbaky\\eclipse-workspace\\TCoETraining\\Data\\Login.xlsx";
    public static String sheet_Invalid = "Sheet2";
    public static String sheet_valid = "Sheet1";

    public LoginPage(WebDriver driver) {
        super(driver);
        JSE = (JavascriptExecutor) driver;
    }

    @FindBy(partialLinkText = "Recruitment")
    public
    WebElement RecruitmentBTN;
    @FindBy(partialLinkText = "Vacancies")
    public
    WebElement VacancyBTN;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    public
    WebElement AdminBTN;

    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    public
    WebElement LogoutDrop;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    public
    WebElement Logout;

    @FindBy(name = "username")
    WebElement UserName;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement LoginBtn;


    public void Login(String User, String Pass) {
        UserName.sendKeys(User);
        Password.sendKeys(Pass);
        LoginBtn.click();
    }

    public void LoginCucumber(String User, String Pass) {
        UserName.sendKeys(User);
        Password.sendKeys(Pass);
    }

    public void ClickCucumber() {
        LoginBtn.click();
    }


    public void GetAllCookies() {
        Set<Cookie> AllCookies = driver.manage().getCookies();
        for (Cookie singleCooke : AllCookies) {
            System.out.println(singleCooke);
        }
    }

    public void PrintTitle() {
        String titleText = JSE.executeScript("return document.title;").toString();
        System.out.println(titleText);
    }




}
