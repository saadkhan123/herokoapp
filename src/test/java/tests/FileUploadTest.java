package tests;

import Pages.FileUploadPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.ScreenShotUtil;
import java.io.File;
import java.nio.file.Paths;


public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        test = extent.createTest("File Upload Test");
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        driver.get("https://the-internet.herokuapp.com/upload");

        String filePath = Paths.get("src/test/java/uploads/sample.txt").toAbsolutePath().toString();
        fileUploadPage.uploadFile(filePath);

        String text = fileUploadPage.isFileUploaded().toString();

        if(fileUploadPage.isFileUploaded().equals("sample.txt")) {
            test.pass("File uploaded successfully");
        }
        else {
            test.fail("File upload failed!");
            ScreenShotUtil.captureScreenshot(driver, "File upload failed");
        }

    }

}


