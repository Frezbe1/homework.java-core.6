import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void start() {
        System.out.println("test start");
        sut = new Calculator();
    }

    @BeforeAll
    public static void started() {
        System.out.println("TESTS START");
    }

    @AfterEach
    public void finish() {
        System.out.println("test completed");
        sut = null;
    }

    @AfterAll
    public static void end() {
        System.out.println("TESTS END");
    }

    @Test
    public void testAbs() {
        int x = -10, expected = 10;

        int result = sut.abs.apply(x);

        assertEquals(expected, result);
    }

    @Test
    public void testPow() {
        int x = 11, expected = 121;

        int result = sut.pow.apply(x);

        assertEquals(expected, result);
    }


    @Test
    public void testIsPositive() {
        int x = 10, y = -2;

        assertTrue(sut.isPositive.test(x));
        assertFalse(sut.isPositive.test(y));
    }
}
