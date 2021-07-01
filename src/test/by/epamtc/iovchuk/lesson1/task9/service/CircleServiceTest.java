package test.by.epamtc.iovchuk.lesson1.task9.service;

import by.epamtc.iovchuk.lesson1.task9.service.CircleService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleServiceTest {

    CircleService circleService = new CircleService();

    @Test
    public void testCalculateCircumference_whenRadiusLessOrEqualsThanZero() {
        double radius = 0;
        assertCalculateCircumferenceValidationFails(radius);
    }

    @Test
    public void testCalculateCircumference() {
        double expected = 3.14;
        assertCalculateCircumferenceEqualsExpected(expected, 0.5);
    }

    private void assertCalculateCircumferenceValidationFails(double radius) {
        double expected = -1;
        assertCalculateCircumferenceEqualsExpected(expected, radius);
    }

    private void assertCalculateCircumferenceEqualsExpected(double expected, double radius) {
        double actual = circleService.calculateCircumference(radius);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testCalculateCircleArea_whenRadiusLessOrEqualsThanZero() {
        double radius = 0;
        assertCalculateCircleAreaValidationFails(radius);
    }

    @Test
    public void testCalculateCircleArea() {
        double expected = 3.14;
        assertCalculateCircleAreaEqualsExpected(expected, 1);
    }

    private void assertCalculateCircleAreaValidationFails(double radius) {
        double expected = -1;
        assertCalculateCircleAreaEqualsExpected(expected, radius);
    }

    private void assertCalculateCircleAreaEqualsExpected(double expected, double radius) {
        double actual = circleService.calculateCircleArea(radius);
        assertEquals(expected, actual, 0.01d);
    }
}