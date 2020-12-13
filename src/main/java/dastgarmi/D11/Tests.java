package dastgarmi.D11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class Tests {
    @BeforeClass
    public static void initTestClass() {
        System.out.print(1);
    }

    @AfterClass
    public static void endTestClass() {
        System.out.print(2);
    }

    @Before
    public void setup() {
        System.out.print(3);
    }

    @After
    public void tearDown() {
        System.out.print(4);
    }

    @Test
    public void test1() {
        System.out.print(5);
    }

    @Test
    public void test2() {
        System.out.print(6);
    }
}
