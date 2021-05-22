/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task5.service;

/**
 * Класс-сервис для определения, является ли
 * число совершенным.
 */
public class IsPerfectService {

    /**
     * Проверяет, является ли введенное число совершенным.
     *
     * @param number число для проверки на совершенность
     * @return true, если число совершенное
     */
    public boolean isPerfect(long number) {
        return (number == calculateDividersSum(number));

    }

    /**
     * Вычислет сумму делителей числа.
     *
     * @return сумму делителей числа
     */
    private long calculateDividersSum(long number) {
        /*
         * Сумма делителей введенного числа. Изначально равна единице,
         * т.к. любое число при делении самого на себя равно единице
         */
        long dividersSum = 1;

        /*
         * Максимально возможный делитель числа, равный половине
         * указанного числа
         */
        long maxDivider = number / 2;

        for (long divider = 2; divider <= maxDivider; divider++) {
            if ((number % divider) == 0) {
                dividersSum += divider;
            }
        }

        return dividersSum;
    }
}
