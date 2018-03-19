package MyCode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class AppTest{
@Test
public void testAddCalc(){
        MyCode mc=new MyCode();
        Assert.assertEquals(15,mc.addCalc(5,5,5));
        }
}
