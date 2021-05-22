/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число годом.
 */
public class YearValidator extends CustomValidator {

    /**
     * Проверяет, является ли указанное число годом.
     *
     * @param year число для проверки
     * @return true, если указанное число является годом
     */
    @Override
    public boolean validate(int year) {
        if (year >= 0) {
            return true;
        } else {
            System.err.println("Год не может быть меньше нуля!");
            return false;
        }
    }
}
