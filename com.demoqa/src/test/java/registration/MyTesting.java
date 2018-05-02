package registration;
/*  at this address you can find a test plan for TEST TASK1:
 *   https://docs.google.com/spreadsheets/d/1kTudIjJuLhZfuhI5t-gA5GG6gGROgTpwmSJ7q34-D8I/edit#gid=0
 *
 *   message to the customer (TASK 3) i saved to file MessageToCustomer.txt
 *
 *   P.S and please rewrite the PATH in MySettingsConstants.java to your ChromeDriver
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import java.util.List;

public class MyTesting extends DriverSettings {
    @Test
    public void testEqualsCountryList_ID_TC2() throws Exception {
        driver.get(WEB_ADRESS);
        WebElement listText = driver.findElement(By.xpath("//*[@id=\"dropdown_7\"]"));
        getSelect(listText);
        List<WebElement> options = select.getOptions();
        int i = 0;
        for (WebElement option : options) {
            if (option.getText().equals(countryList.get(i)))
                i++;
            else
                throw new Exception();
        }
    }

    @Test
    public void testReRegestration_ID_TC4() throws Exception {
        driver.get(WEB_ADRESS);
        driver.findElement(By.id("name_3_firstname")).sendKeys("TestFirstName");
        driver.findElement(By.id("name_3_lastname")).sendKeys("TestLastName");
        driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]")).click();
        driver.findElement(By.id("phone_9")).sendKeys("1234567890");
        driver.findElement(By.id("username")).sendKeys("TestUserName12345Testing");
        driver.findElement(By.id("email_1")).sendKeys("test@e-mail.com");
        driver.findElement(By.id("password_2")).sendKeys("TestTest12345");
        driver.findElement(By.id("confirm_password_password_2")).sendKeys("TestTest12345");
        driver.findElement(By.name("pie_submit")).click();
        if (driver.findElement(By.className("piereg_login_error")).isDisplayed() != true)
            throw new Exception();
    }
}