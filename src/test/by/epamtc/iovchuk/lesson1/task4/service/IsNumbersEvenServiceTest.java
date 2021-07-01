package test.by.epamtc.iovchuk.lesson1.task4.service;

import by.epamtc.iovchuk.lesson1.task4.service.IsNumbersEvenService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsNumbersEvenServiceTest {

    IsNumbersEvenService isNumbersEvenService = new IsNumbersEvenService();

    @Test
    public void testCheckEvenNumbers_whenNumbersAreEven() {
        int[] evenNumbers = {2, 8, 4, 0, 2};
        assertEqualsExpected(true, evenNumbers, 2);
    }

    @Test
    public void testCheckEvenNumbers_whenNumbersAreOdd() {
        int[] oddNumber = {1, 5, 3};
        assertEqualsExpected(false, oddNumber, 3);

    }

    private void assertEqualsExpected(boolean expected, int[] numbers, int evenNumberCount) {
        boolean actual = isNumbersEvenService.checkEvenNumbers(numbers, evenNumberCount);
        assertEquals(expected, actual);
    }

} 
