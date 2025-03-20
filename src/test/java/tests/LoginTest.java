package tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.ScreenShotUtil;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @Test(priority = 1)
    public void testWithValidCredentials() {
        test = extent.createTest("Valid Login Test");
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
        boolean loginSuccess = loginPage.login("tomsmith", "SuperSecretPassword!");

        if (loginSuccess) {
            test.pass("Login successful!");
        } else {
            test.fail("Login failed!");
        }
        Assert.assertTrue(loginSuccess, "Login should be successful");
    }


    @Test(priority = 2)
    public void testWithInvalidCredentials() {
        test = extent.createTest("Invalid Login Test");
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);

        boolean loginSuccess = loginPage.login("invalidUser", "wrongPassword");

        if (!loginSuccess) {
            test.pass("Login failed as expected!");
        } else {
            test.fail("Login succeeded unexpectedly!");
            ScreenShotUtil.captureScreenshot(driver, "Login Failed");
        }

        Assert.assertFalse(loginSuccess, "Login should fail with invalid credentials");
    }


    }

