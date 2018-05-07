package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DriverSettings implements Constantable {
    WebDriver driver;
    Select select;
    String Login;
    String Password;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", WEB_DRIVER_CHROME);
        driver = new ChromeDriver();
        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\JavaProjects\\Tools\\Pass.txt"))){
            Login=bf.readLine();    //input or create Pass.txt File to this folder with first line login,2 line - pass
            Password=bf.readLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found ");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("oops BufferedReader was broken :(");
        }
    }
    public Select getSelect(WebElement element){
        select = new Select(element);
        return select;
    }
    @Ignore//AfterTest
    public void close(){
        driver.quit();
    }
}
