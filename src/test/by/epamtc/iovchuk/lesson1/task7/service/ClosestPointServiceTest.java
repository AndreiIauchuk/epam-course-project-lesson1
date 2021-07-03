package test.by.epamtc.iovchuk.lesson1.task7.service;

import by.epamtc.iovchuk.lesson1.exception.NullException;
import by.epamtc.iovchuk.lesson1.task7.entity.Point;
import by.epamtc.iovchuk.lesson1.task7.service.ClosestPointService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClosestPointServiceTest {

    ClosestPointService closestPointService = new ClosestPointService();

    Point point1 = new Point(5, 4);
    Point point2 = new Point(10, 2);
    Point point3 = new Point(4, 5);

    @Test(expected = NullException.class)
    public void testDefineClosestPoint_whenPointIsNull() throws NullException {
        closestPointService.defineClosestPoint(null, point1);
    }

    @Test
    public void testDefineClosestPoint_whenPoint1IsClosest() throws NullException {
        testDefineClosestPoint(point1, point1, point2);
    }

    @Test
    public void testDefineClosestPoint_whenPointsAreEquidistant() throws NullException {
        testDefineClosestPoint(point1, point1, point3);
    }

    private void testDefineClosestPoint(Point expected, Point point1, Point point2) throws NullException {
        Point actual = closestPointService.defineClosestPoint(point1, point2);
        assertEquals(expected, actual);
    }

}