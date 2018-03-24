package ki11qwerty;


import org.junit.*;

public class TestMain {
    Main mn;

    @Before
    public void startTest() {
        mn = new Main();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(4, mn.calcAdd(2, 2));
    }

    @Test
    public void testDeduct() {
        Assert.assertEquals(4, mn.calcDeduct(8, 4));
    }
    @Test
    public void testDiv() {
        Assert.assertEquals(4, mn.calcDiv(80, 20));
    }
    @Test
    public void testMult() {
        Assert.assertEquals(20, mn.calcMult(4, 5));
    }
    @After

}
