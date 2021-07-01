package test.by.epamtc.iovchuk.lesson1.task2.service;

import by.epamtc.iovchuk.lesson1.task2.service.DaysCountService;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaysCountServiceTest {

    DaysCountService daysCountService = new DaysCountService();

    @Test
    public void testCalculateDaysCount_whenYearLessThenZero() {
        int year = -1;
        int month = 1;
        assertValidationFails(year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthLessThenZero() {
        int year = 0;
        int month = -1;
        assertValidationFails(year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthEqualsZero() {
        int year = 0;
        int month = 0;
        assertValidationFails(year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthOverTwelve() {
        int year = 0;
        int month = 13;
        assertValidationFails(year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthIsFebruaryAndYearIsNotLeap() {
        int year = 0;
        int month = 2;
        int expected = 28;
        assertEqualsExpected(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthIsFebruaryAndYearIsLeap() {
        int year = 4;
        int month = 2;
        int expected = 29;
        assertEqualsExpected(expected, year, month);
    }

    private void assertValidationFails(int year, int month) {
        int expected = -1;
        assertEqualsExpected(expected, year, month);
    }

    private void assertEqualsExpected(int expected, int year, int month) {
        int actual = daysCountService.calculateDaysCount(year, month);
        assertEquals(expected, actual);
    }
}
