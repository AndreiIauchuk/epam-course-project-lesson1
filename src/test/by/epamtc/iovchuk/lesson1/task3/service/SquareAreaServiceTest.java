package test.by.epamtc.iovchuk.lesson1.task3.service;

import by.epamtc.iovchuk.lesson1.task3.service.SquareAreaService;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareAreaServiceTest {

    SquareAreaService squareAreaService = new SquareAreaService();

    @Test
    public void testCalculateInsideSquareArea_whenOutsideSquareAreaLessThenZero() {
        double outsideSquareArea = -1;
        assertCalculateInsideSquareAreaValidationFails(outsideSquareArea);
    }

    @Test
    public void testCalculateInsideSquareArea_whenAreaEqualsZero() {
        double outsideSquareArea = 0;
        assertCalculateInsideSquareAreaValidationFails(outsideSquareArea);
    }

    @Test
    public void testCalculateInsideSquareArea_whenAreaEqualsEight() {
        double outsideSquareArea = 8;
        double expected = 2;
        assertCalculateInsideSquareAreaEqualsExpected(expected, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenInsideSquareAreaLessThenZero() {
        double insideSquareArea = -1;
        double outsideSquareArea = 1;
        assertCalculateDivideValidationFails(insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenInsideSquareAreaEqualsZero() {
        double insideSquareArea = 0;
        double outsideSquareArea = 1;
        assertCalculateDivideValidationFails(insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenOutsideSquareAreaLessThenZero() {
        double insideSquareArea = 1;
        double outsideSquareArea = -1;
        assertCalculateDivideValidationFails(insideSquareArea, outsideSquareArea);
    }

    @Test
    public void testCalculateDivide_whenOutsideSquareAreaEqualsZero() {
        double insideSquareArea = 1;
        double outsideSquareArea = 0;
        assertCalculateDivideValidationFails(insideSquareArea, outsideSquareArea);
    }

    private void assertCalculateInsideSquareAreaValidationFails(double outsideSquareArea) {
        double expected = -1;
        assertCalculateInsideSquareAreaEqualsExpected(expected, outsideSquareArea);
    }

    private void assertCalculateInsideSquareAreaEqualsExpected(double expected,double outsideSquareArea) {
        double actual = squareAreaService.calculateInsideSquareArea(outsideSquareArea);
        assertEquals(expected, actual, 0.01d);
    }

    private void assertCalculateDivideValidationFails(double insideSquareArea, double outsideSquareArea) {
        int expected = -1;
        assertCalculateDivideEqualsExpected(
                expected,
                insideSquareArea,
                outsideSquareArea);
    }

    private void assertCalculateDivideEqualsExpected(int expected,
                                                     double insideSquareArea,
                                                     double outsideSquareArea) {

        int actual =  squareAreaService.calculateDivide(insideSquareArea, outsideSquareArea);
        assertEquals(expected, actual);
    }

}