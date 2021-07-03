package test.by.epamtc.iovchuk.lesson1.task9.service;

import by.epamtc.iovchuk.lesson1.task9.service.CircleService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleServiceTest {

    CircleService circleService = new CircleService();

    @Test
    public void testCalculateCircumference_whenRadiusLessOrEqualsThanZero() {
        double expected = -1;
        double radius = 0;
        testCalculateCircumference(expected, radius);
    }

    @Test
    public void testCalculateCircumference() {
        double expected = 3.14;
        double radius = 0.5;
        testCalculateCircumference(expected, radius);
    }

    private void testCalculateCircumference(double expected, double radius) {
        double actual = circleService.calculateCircumference(radius);
        assertEquals(expected, actual, 0.01d);
    }

    @Test
    public void testCalculateCircleArea_whenRadiusLessOrEqualsThanZero() {
        double expected = -1;
        double radius = 0;
        testCalculateCircleArea(expected, radius);
    }

    @Test
    public void testCalculateCircleArea() {
        double expected = 3.14;
        double radius = 1;
        testCalculateCircleArea(expected, radius);
    }

    private void testCalculateCircleArea(double expected, double radius) {
        double actual = circleService.calculateCircleArea(radius);
        assertEquals(expected, actual, 0.01d);
    }
}