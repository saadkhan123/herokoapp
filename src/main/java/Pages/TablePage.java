package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class TablePage extends BaseTest {

    WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> extractCompanyNames() {
        return driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td[1]"));
    }

    public boolean isCompanyPresent(String companyName) {
        return extractCompanyNames().stream().anyMatch(webElement -> webElement.getText().equals(companyName));
    }


}
