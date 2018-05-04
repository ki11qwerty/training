package MyTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyBot extends DriverSettings {
    @Test
    public void MyBotTest(){
        driver.get("https://vk.com/ki11qwerty");
        driver.findElement(By.name("email")).sendKeys(Login);
        driver.findElement(By.name("pass")).sendKeys(Password);
        driver.findElement(By.id("quick_login_button")).click();
       // driver.findElement(By.className("left_label inl_bl")).click(); // чет хуйня какая то
    }
}
