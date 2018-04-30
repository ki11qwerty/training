package registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class MyTesting extends DriverSettings {
    @Ignore
    public void test01() {
        driver.get(WEB_ADRESS);
        driver.findElement(By.id("dropdown_7")).click();
    }

//    @Test
//    public void getOptionsText() {
//        WebElement listText = driver.findElement(By.id("dropdown_7"));//(By.xpath("(//*[@id='post-4272']//select)[1]"));
//        getSelect(listText);
//        List<WebElement> options = select.getOptions();
//        int i = 1;
//        for (WebElement option: options) {
//            System.out.println(i + ". Опция списка: " + option.getText());
//            i++;
//            }
 //   }

}
