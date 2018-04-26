package SperaSoftTestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

//extends Assert
public class WebDriverTest extends DriverSettings {


    @Test
    public void test1() {
        assertTrue(driver.getTitle() != null);
        driver.moveByOffset(int xOffset, int yOffset);
    }

}
