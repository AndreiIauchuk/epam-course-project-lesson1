package test.by.epamtc.iovchuk.lesson1.task8.service;

import by.epamtc.iovchuk.lesson1.task8.service.FunctionService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionServiceTest {

    FunctionService functionService = new FunctionService();

    @Test
    public void testCalculateFunctionSystem_whenNumberOverThenThree() {
        double expected = 9;
        assertEqualsExpected(expected, 3);
    }

    @Test
    public void testCalculateFunctionSystem_whenNumberLessThenThree() {
        double expected = -0.2;
        assertEqualsExpected(expected, 1);
    }

    private void assertEqualsExpected(double expected, double number) {
        double actual = functionService.calculateFunctionSystem(number);
        assertEquals(expected, actual, 0.01d);
    }

}