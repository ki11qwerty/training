package SperaSoftTestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSettings extends Assert implements MyConstants {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", MY_PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
    }

//    @AfterTest
//    public void close() {
//        driver.quit();
//    }
}
