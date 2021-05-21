/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task1;

/**
 * Класс-сервис для вычисления последней цифры
 * квадрата целого числа.
 */
public class LastNumberSquareService {

    /**
     * Вычисляет последнюю цифру квадрата целого числа.
     *
     * @param number целое число, для которого вычисляется
     *               последнюю цифру квадрата
     * @return последнюю цифру квадрата целого числа
     */
    public int calculate(int number) {
        int lastDigit;
        int sqrtLastDigit;

        /*
         * Берется модуль, т.к. при введенном отрицательном числе
         * возращает последнюю цифру со знаком минус
         */
        lastDigit = Math.abs(number % 10);

        sqrtLastDigit = (int) (Math.pow(lastDigit, 2) % 10);

        return sqrtLastDigit;
    }
}
