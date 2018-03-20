package WTF.test.java;
import WTF.MyCodeTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class TestMyCodeTest {
    private MyCodeTest mt;

    @TEST
public void testAddCalc(){
        mt = new MyCodeTest();
        Assert.assertEquals(6,mt.addCalc(2,2,2));
    }
    }
