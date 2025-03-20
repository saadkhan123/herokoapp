package tests;

import Pages.AlertsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.ExtentManager;


public class AlertsTest extends BaseTest {

    private AlertsPage alertsPage;

    @Test
    public void handleJsAlert() {

        test = extent.createTest("Javascript Alert Test");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        alertsPage = new AlertsPage(driver);

        // Handling JS Alert
        String alertText = alertsPage.handleAlert("JS Alert");

        if (alertText.equals("I am a JS Alert")) {
            test.pass("Successfully handled JS Alert");
        } else {
            test.fail("Could not handled JS Alert");
        }
    }

    @Test
    public void handleJsConfirmAlert() {

        test = extent.createTest("Javascript Alert Test");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        alertsPage = new AlertsPage(driver);

        // Handling JS Confirm
        String confirmText = alertsPage.handleAlert("JS Confirm");
        //Assert.assertEquals(confirmText, "I am a JS Confirm");

        if (confirmText.equals("I am a JS Confirm")) {
            test.pass("Successfully handled JS Confirm Alert");
        } else {
            test.fail("Could not handled JS Confirm Alert");
        }
    }


    @Test
    public void handleJsPromptAlert() {

        test = extent.createTest("Javascript Alert Test");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        alertsPage = new AlertsPage(driver);

        // Handling JS Prompt
        String promptText = alertsPage.handleAlert("JS Prompt");
        Assert.assertEquals(promptText, "I am a JS prompt");


        if (promptText.equals("I am a JS prompt")) {
            test.pass("Successfully handled JS Prompt Alert");
        } else {
            test.fail("Could not handled JS Prompt Alert");
        }

    }
}
