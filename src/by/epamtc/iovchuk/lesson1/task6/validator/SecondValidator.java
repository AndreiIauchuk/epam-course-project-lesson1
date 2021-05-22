/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число секундой.
 */
public class SecondValidator extends CustomValidator {

    /**
     * Максимальное количество секунд в одних сутках.
     */
    private final static int MAX_SECONDS_IN_DAY = 86400;

    /**
     * Проверяет, является ли указанное число секундой.
     *
     * @param second число для проверки
     * @return true, если указанное число является месяцем
     */
    @Override
    public boolean validate(int second) {
        if (second > 0) {

            if (second <= MAX_SECONDS_IN_DAY) {
                return true;
            } else {
                System.err.println("В сутках не более 86400 секунд!");
                return false;
            }

        } else {
            System.err.println("Секунда не может быть отрицательным числом!");
            return false;
        }

    }
}

