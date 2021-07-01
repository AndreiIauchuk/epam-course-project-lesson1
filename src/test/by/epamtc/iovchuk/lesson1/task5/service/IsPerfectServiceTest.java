package test.by.epamtc.iovchuk.lesson1.task5.service;

import by.epamtc.iovchuk.lesson1.task5.service.IsPerfectService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsPerfectServiceTest {

    IsPerfectService isPerfectService = new IsPerfectService();

    @Test
    public void testIsPerfect_whenNumberIsPerfect() {
        int perfectNumber = 6;
        assertEqualsExpected(true, perfectNumber);
    }

    @Test
    public void testIsPerfect_whenNumberIsNotPerfect() {
        int notPerfectNumber = 7;
        assertEqualsExpected(false, notPerfectNumber);
    }

    private void assertEqualsExpected(boolean expected, int number) {
        boolean actual = isPerfectService.isPerfect(number);
        assertEquals(expected, actual);
    }

} 
