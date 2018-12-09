import java8inaction.junit.Math;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    private Math math;

    @Before
    public void setUp() {
        math = new Math();
    }

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        int actual = math.add(2, 6);
        Assert.assertEquals(8, actual);
        //Assert.assertTrue(true);
    }

    @Test
    public void multiply_TwoPlusTwo_ReturnsFour() {
        int actual = math.multiply(2, 6);
        Assert.assertEquals(12, actual);
        //Assert.assertTrue(true);
    }

    //@Ignore
    @Test(expected = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        math.divide(10, 0);
    }

    @After
    public void tearDown() {
        math = null;
    }
}
