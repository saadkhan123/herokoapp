package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;
import utilities.WaitUtils;


public class LoginPage extends BaseTest {

    WebDriver driver;
    WaitUtils waitUtils;

//    @FindBy(id = "username") private WebElement userName;
//    @FindBy(id = "password") private WebElement password;
//    @FindBy(css = "button[type='submit']") private WebElement loginBtn;
//
//    @FindBy(id = "flash") private WebElement errorMsg;
//    @FindBy(css = "a[href = '/logout']") private WebElement logoutBtn;

    private By userName = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.cssSelector("button[type='submit']");
    private By errorMessage = By.id("flash");
    private By logoutBtn = By.cssSelector("a[href='/logout']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean login(String username, String pass) {
        waitUtils.waitForElementVisible(userName).sendKeys(username);
        waitUtils.waitForElementVisible(password).sendKeys(pass);
        waitUtils.waitForElementClickable(loginBtn).click();

        return !driver.findElements(logoutBtn).isEmpty();
    }


    public String getErrorMessage() {
        return waitUtils.waitForElementVisible(errorMessage).getText();
    }




}
