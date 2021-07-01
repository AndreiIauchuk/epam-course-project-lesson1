package test.by.epamtc.iovchuk.lesson1.task6.service;

import by.epamtc.iovchuk.lesson1.task6.service.PastTimeService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PastTimeServiceTest {

    PastTimeService pastTimeService = new PastTimeService();

    @Test
    public void testCalculatePastHours() {
        int expected = 2;
        assertCalculatePastHoursEqualsExpected(expected, 9000);
    }

    private void assertCalculatePastHoursEqualsExpected(int expected, int seconds) {
        int actual = pastTimeService.calculatePastHours(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePastHours_whenSecondLessThenOne() {
        assertCalculatePastHoursValidationFails(0);
    }

    @Test
    public void testCalculatePastHours_whenSecondOverMaxValue() {
        assertCalculatePastHoursValidationFails(900000);
    }

    private void assertCalculatePastHoursValidationFails(int seconds) {
        int expected = -1;
        assertCalculatePastHoursEqualsExpected(expected, seconds);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastHours() {
        int expected = 5;
        assertCalcRemainingSecondsAfterPastHoursEqualsExpected(expected, 3605);
    }

    private void assertCalcRemainingSecondsAfterPastHoursEqualsExpected(int expected, int seconds) {
        int actual = pastTimeService.calcRemainingSecondsAfterPastHours(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculatePastMinutes() {
        int expected = 5;
        assertCalculatePastMinutesEqualsExpected(expected, 300);
    }

    private void assertCalculatePastMinutesEqualsExpected(int expected, int seconds) {
        int actual = pastTimeService.calculatePastMinutes(seconds);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalcRemainingSecondsAfterPastMinutes() {
         int expected = 5;
         assertCalcRemainingSecondsAfterPastMinutesEqualsExpected(expected, 65);
    }

    private void assertCalcRemainingSecondsAfterPastMinutesEqualsExpected(int expected, int seconds) {
        int actual = pastTimeService.calcRemainingSecondsAfterPastMinutes(seconds);
        assertEquals(expected, actual);
    }


} 
