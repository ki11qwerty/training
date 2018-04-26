package SperaSoftTestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

import java.io.File;


public class WebDriverTest {

   final String MY_PATH_TO_CHROME_DRIVER ="/JavaProjects/Tools/chromedriver.exe";


    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver",MY_PATH_TO_CHROME_DRIVER);
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/registration/");
    }
}
