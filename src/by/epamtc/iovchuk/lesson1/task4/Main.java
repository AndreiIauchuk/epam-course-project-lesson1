/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task4;

import by.epamtc.iovchuk.lesson1.task4.scanner.NumbersScanner;
import by.epamtc.iovchuk.lesson1.task4.service.IsNumbersEvenService;

/**
 * Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 * false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 * <p>
 * Класс Main.
 * </p>
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) {
        NumbersScanner numbersScanner = new NumbersScanner();
        IsNumbersEvenService isNumbersEvenService = new IsNumbersEvenService();

        int[] numbers = numbersScanner.readNumbers(4);

        System.out.println(isNumbersEvenService.checkEvenNumbers(numbers, 2));
    }


}
