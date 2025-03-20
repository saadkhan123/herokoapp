package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;
import utilities.WaitUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadPage extends BaseTest {

    WebDriver driver;
    WaitUtils waitUtils;
    private By fileUpload = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By getUploadedFileName = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    // public void uploadFile(String filePath) {
    // Method to upload a file using Robot class
    public void uploadFile(String filePath) {

        try {
            WebElement inputField = driver.findElement(fileUpload);
            inputField.sendKeys(filePath); // Send file path directly
            waitUtils.waitForElementClickable(uploadButton).click();
        } catch (Exception e) {
            System.out.println("File upload failed: " + e.getMessage());
        }
    }
    public String isFileUploaded() {
        return driver.findElement(getUploadedFileName).getText();
    }
}


