package SperaSoftTestTask;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
public class CalcTest {
    Calc calc;

    @BeforeTest
    public void startTest() {
        calc = new Calc();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(4, calc.sum(2, 2));
        Assert.assertEquals(5,calc.sum(3,2));
    }
    @Test
    public void testSum2(){
        Assert.assertEquals(12,calc.sum(2,10));
    }
}
