package test.by.epamtc.iovchuk.lesson1.task6.service;

import by.epamtc.iovchuk.lesson1.task6.service.PastTimeService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PastTimeServiceTest {

    PastTimeService pastTimeService = new PastTimeService();

    @Test
    public void testCalculatePastHours_whenSecondLessThenOne() {
        int expected = -1;
        int seconds = 0;
        testCalculatePastHours(expected, seconds);
    }

    @Test
    public void testCalculatePastHours_whenSecondOverMaxValue() {
        int expected = -1;
        int seconds = 900000;
        testCalculatePastHours(expected, seconds);
    }

    @Test
    public void testCalculatePastHours() {
        int expected = 2;
        int seconds = 9000;
        testCalculatePastHours(expected, seconds);
    }

    private void testCalculatePastHours(int expected, int seconds) {
        int actual = pastTimeService.calculatePastHours(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastHours() {
        int expected = 5;
        int seconds = 3605;
        int actual = pastTimeService.calcRemainingSecondsAfterPastHours(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePastMinutes() {
        int expected = 5;
        int seconds = 300;
        int actual = pastTimeService.calculatePastMinutes(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastMinutes() {
        int expected = 5;
        int seconds = 65;
        int actual = pastTimeService.calcRemainingSecondsAfterPastMinutes(seconds);
        assertEquals(expected, actual);
    }

}