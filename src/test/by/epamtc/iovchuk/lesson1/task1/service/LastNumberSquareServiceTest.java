package test.by.epamtc.iovchuk.lesson1.task1.service;

import by.epamtc.iovchuk.lesson1.task1.service.LastNumberSquareService;
import static org.junit.Assert.*;
import org.junit.Test;

public class LastNumberSquareServiceTest {

    LastNumberSquareService lastNumberSquareService
            = new LastNumberSquareService();

    @Test
    public void testCalculate_whenNumberIsPositive() {
        int number = 4;
        int expected = 6;
        assertEqualsExpected(expected, number);
    }

    @Test
    public void testCalculate_whenNumberIsNegative() {
        int number = -8;
        int expected = 4;
        assertEqualsExpected(expected, number);
    }

    @Test
    public void testCalculate_whenNumberIsZero() {
        int number = 0;
        int expected = 0;
        assertEqualsExpected(expected, number);
    }

    private void assertEqualsExpected(int expected, int number) {
        int actual = lastNumberSquareService.calculate(number);
        assertEquals(expected, actual);
    }

}