/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task1.service;

/**
 * Класс-сервис для вычисления последней цифры
 * квадрата целого числа.
 */
public class LastNumberSquareService {

    /**
     * Вычисляет последнюю цифру квадрата указанного целого числа.
     *
     * @param number целое число, для которого вычисляется
     *               последняя цифра квадрата
     * @return последнюю цифру квадрата указанного целого числа
     */
    public int calculate(int number) {
        int lastDigit = number % 10;
        return (int) (Math.pow(lastDigit, 2) % 10);
    }

}
