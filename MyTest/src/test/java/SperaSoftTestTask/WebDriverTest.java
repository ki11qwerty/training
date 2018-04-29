package SperaSoftTestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

//extends Assert
public class WebDriverTest {
    WebElement firstName;// = driver.findElement(By.id("name_3_firstname"));
    WebElement lastName;

    @Test
    public void test1() {
        //driver.get("http://demoqa.com/registration/");
        driver.get("https://vk.com");
        firstName = driver.findElement(By.id("index_email"));
        firstName.click();
        firstName.sendKeys("tasuke34@gmail.com");
        firstName = driver.findElement(By.id("index_pass"));
        firstName.click();
        firstName.sendKeys("");
        firstName = driver.findElement(By.id("index_login_button"));
        firstName.click();
        try {
            Thread.sleep(1500);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("post_field")).click();
        driver.findElement(By.id("post_field")).clear();
        driver.findElement(By.id("post_field")).sendKeys("Bot_1 ready: misiion complite!");
        try {
            Thread.sleep(1500);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("send_post")).click();
       // firstName = driver.findElement(By.id("name_3_firstname"));
       // lastName = driver.findElement(By.id("name_3_lastname"));
      // firstName.click();
     //  firstName.sendKeys("ебать того рот, работает вроде");
//       try {
//           for (int i = 0; i< 5 ; i++){
//               Thread.sleep(100);
//               firstName.sendKeys("!");
//           }
//       }catch (InterruptedException e){
//           e.printStackTrace();
//       }
//       lastName.click();
//       lastName.sendKeys("бля ну прикольно жеж XD");
//       lastName.clear();
//       try{
//           Thread.sleep(1000);
//       }catch (InterruptedException e){
//           e.printStackTrace();
//       }
//
//       lastName.sendKeys("охуеннчик");
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//       firstName.clear();
//        firstName.sendKeys("Aleksey");
//        lastName.clear();
//        lastName.sendKeys("Antonov");
//
//
//     //   driver.findElement(By.className("name")).click();
    }

}
