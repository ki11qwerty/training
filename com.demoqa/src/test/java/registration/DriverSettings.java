package registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DriverSettings extends Assert implements MySettingsConstants {

    WebDriver driver;
    Select select;
    ArrayList<String> countryList;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", MY_PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void createCountryList() {
        //read .txt file with all available countries and add to list
        try (BufferedReader br = new BufferedReader(new FileReader("countryList.txt"))) {
            String str;
            countryList = new ArrayList<String>();
            while ((str = br.readLine()) != null) {
                if (!str.isEmpty()) {
                    countryList.add(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File countryList.txt not found");
        }
    }

    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }

    @AfterTest
    public void close() {
        countryList.clear();
        driver.quit();
    }
}
