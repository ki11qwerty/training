package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.List;

public class DriverSettings extends Assert implements MySettingsConstants {

    WebDriver driver;
    Select select;

    @BeforeTest
    public void setUp() {
        List<WebElement> listOfElements ;
        System.setProperty("webdriver.chrome.driver", MY_PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
    }
    public Select getSelect(WebElement element){
        select = new Select(element);
        return select;
    }
    @AfterTest
    public void close() {
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
