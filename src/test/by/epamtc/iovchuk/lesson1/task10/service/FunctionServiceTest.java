package test.by.epamtc.iovchuk.lesson1.task10.service;

import by.epamtc.iovchuk.lesson1.exception.FirstOverLastIndexException;
import by.epamtc.iovchuk.lesson1.task10.service.FunctionService;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FunctionServiceTest {

    FunctionService functionService = new FunctionService();
    double segmentStart = 1;
    double segmentEnd = 3;
    double segmentStep = 1;

    @Test(expected = FirstOverLastIndexException.class)
    public void testCalculateFunction_whenFirstIndexOverSecond() throws FirstOverLastIndexException {
        functionService.calculateFunction(segmentEnd, segmentStart, segmentStep);
    }

    @Test
    public void testCalculateFunction_whenStepLessOfEqualsThanZero() throws FirstOverLastIndexException {
        assertNull(
                functionService.calculateFunction(segmentStart, segmentEnd, 0));
    }

    @Test
    public void testCalculateFunction() throws FirstOverLastIndexException {
        Map<Double, Double> expected = new LinkedHashMap<>();
        expected.put(1.0, 1.5574077246549023);
        expected.put(2.0, -2.185039863261519);
        expected.put(3.0, -0.1425465430742778);

        assertEqualsExpected(expected);
    }

    private void assertEqualsExpected(Map<Double, Double> expected)
            throws FirstOverLastIndexException {
        Map<Double, Double> actual = functionService.calculateFunction(segmentStart, segmentEnd, segmentStep);
        assertEquals(expected, actual);
    }

}