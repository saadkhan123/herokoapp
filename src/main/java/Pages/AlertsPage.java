package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseTest;

public class AlertsPage extends BaseTest {

    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String handleAlert(String alertType) {
        driver.findElement(By.xpath("//button[contains(text(),'" + alertType + "')]")).click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;

    }
}
