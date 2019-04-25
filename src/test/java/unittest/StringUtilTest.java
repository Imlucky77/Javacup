package unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    private StringUtil stringUtil;

    @Before
    public void setup() {
        stringUtil = new StringUtil();
    }

    @Test
    public void testStringUtil_Bad() {
        String result = stringUtil.concat("Hello ", "World");
        System.out.println("Result is: " + result);
    }

    @Test
    public void testStringUtil_Good() {
        String result = stringUtil.concat("Hello ", "World");
        assertEquals("Hello World", result);
    }
}
