package MyCode;
import junit.framework.Assert;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyCodeTest{
    MyCode mct;
    @Test
    public void testaddCalc(){
        mct = new MyCode();
        Assert.assertEquals(18,mct.addCalc(5,5,8));
        Assert.assertEquals(9,mct.addCalc(3,3,3));
    }
}
