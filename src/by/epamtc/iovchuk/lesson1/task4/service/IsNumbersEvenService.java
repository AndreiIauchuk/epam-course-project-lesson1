/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task4.service;

/**
 * Класс-сервис для определения, является ли
 * число четным.
 */
public class IsNumbersEvenService {

    /**
     * Общее количество введенных четных целых чисел.
     */
    private int countEvenNumbers;

    /**
     * Проверяет, содержит ли указанный массив
     * указанное количество четных чисел.
     *
     * @param numbers          массив для проверки
     * @param evenNumbersCount количество четных чисел
     *                         для проверки
     * @return true, если массив содержит
     * указанное количество четных чисел
     */
    public boolean checkEvenNumbers(int[] numbers, int evenNumbersCount) {
        for (int number : numbers) {
            if (isEven(number)) {
                ++countEvenNumbers;
            }

           if (checkEvenNumbersCount(evenNumbersCount)) {
               return true;
           }
        }

        return false;
    }

    /**
     * Проверяет, является ли указанное число четным.
     *
     * @param number число для проверки на четность
     * @return true, если число четное
     */
    private boolean isEven(int number) {
        return (number % 2) == 0;
    }

    private boolean checkEvenNumbersCount(int evenNumbersCount) {
        return (countEvenNumbers >= evenNumbersCount);
    }
}
