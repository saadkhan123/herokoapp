# Herokuapp assessment

# Setup Instructions:

1) Started with creating a Maven project on IntelliJ.
2) Choose Selenium with TestNG
3) Added the required libraries in pom.xml are mentioned in the below section.
4) Used Page Of Object model for reusability and maintainability.
5) Created the BaseTest class for the driver initialization and setup/teardown methods.
6) Created WaitUtil class and added functions based on Explicit wait for better synchronization.
7) Created Screenshot class to add Screenshot feature on the test failure.
8) Added testng.xml to execute test in parallel.
9) Added WebDriverManager to manage the browser automatically.
10) Added ExtentReports for reporting.
11) Added TestExecutionListener class to get some delay before and after every test steps.
12) All the tests are being maintained in separate class.
13) All the locators and functions being gathered in the page of every test.
14) In the screenshot folder - The screenshots will be saved
15) In the test-output folder - Test results will be saved in ExtentReports.html



# Libraries what I have used to complete the tasks are mentioned below : 

    <!-- Selenium -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.17.0</version>
        </dependency>


        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.1</version>
            <scope>test</scope>
        </dependency>


        <!-- WebDriver Manager (Automatically manages browser drivers) -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.7.0</version>
        </dependency>


        <!-- Apache Commons IO (For file handling, screenshots, etc.) -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.15.0</version>
        </dependency>


        <!-- Apache Commons Lang (For string and utility operations) -->
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.14.0</version>
        </dependency>


        <!-- Extent Reports (For HTML Test Reporting) -->
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>5.1.1</version>
        </dependency>
