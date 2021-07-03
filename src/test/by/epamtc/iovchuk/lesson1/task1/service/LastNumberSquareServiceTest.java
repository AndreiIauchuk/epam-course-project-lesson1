package test.by.epamtc.iovchuk.lesson1.task1.service;

import by.epamtc.iovchuk.lesson1.task1.service.LastNumberSquareService;
import static org.junit.Assert.*;
import org.junit.Test;

public class LastNumberSquareServiceTest {

    LastNumberSquareService lastNumberSquareService
            = new LastNumberSquareService();

    @Test
    public void testCalculate_whenNumberIsPositive() {
        int expected = 6;
        int number = 4;
        testCalculate(expected, number);
    }

    @Test
    public void testCalculate_whenNumberIsNegative() {
        int expected = 4;
        int number = -8;
        testCalculate(expected, number);
    }

    @Test
    public void testCalculate_whenNumberIsZero() {
        int expected = 0;
        int number = 0;
        testCalculate(expected, number);
    }

    private void testCalculate(int expected, int number) {
        int actual = lastNumberSquareService.calculate(number);
        assertEquals(expected, actual);
    }

}