package tests;

import Pages.TablePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.BaseTest;


public class TableTest extends BaseTest {

    @Test
    public void testTableData() {
        test = extent.createTest("Dynamic Table Test");
        driver.get("https://the-internet.herokuapp.com/tables");
        TablePage tablePage = new TablePage(driver);

        for(WebElement name : tablePage.extractCompanyNames()) {
            //System.out.println(name.getText());
        }

        // Use the last name to search the company name
        Assert.assertTrue(tablePage.isCompanyPresent("Doe"), "Company should be present in the table");
        test.pass("Company is Present in the table");
    }
}