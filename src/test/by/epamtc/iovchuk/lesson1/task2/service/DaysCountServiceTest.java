package test.by.epamtc.iovchuk.lesson1.task2.service;

import by.epamtc.iovchuk.lesson1.task2.service.DaysCountService;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaysCountServiceTest {

    DaysCountService daysCountService = new DaysCountService();

    @Test
    public void testCalculateDaysCount_whenYearLessThenZero() {
        int expected = -1;
        int year = -1;
        int month = 1;
        testCalculateDaysCount(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthLessThenZero() {
        int expected = -1;
        int year = 0;
        int month = -1;
        testCalculateDaysCount(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthEqualsZero() {
        int expected = -1;
        int year = 0;
        int month = 0;
        testCalculateDaysCount(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthOverTwelve() {
        int expected = -1;
        int year = 0;
        int month = 13;
        testCalculateDaysCount(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthIsFebruaryAndYearIsNotLeap() {
        int expected = 28;
        int year = 0;
        int month = 2;
        testCalculateDaysCount(expected, year, month);
    }

    @Test
    public void testCalculateDaysCount_whenMonthIsFebruaryAndYearIsLeap() {
        int expected = 29;
        int year = 4;
        int month = 2;
        testCalculateDaysCount(expected, year, month);
    }

    private void testCalculateDaysCount(int expected, int year, int month) {
        int actual = daysCountService.calculateDaysCount(year, month);
        assertEquals(expected, actual);
    }
}
