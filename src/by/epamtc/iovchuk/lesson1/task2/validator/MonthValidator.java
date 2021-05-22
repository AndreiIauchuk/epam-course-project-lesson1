/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число месяцем.
 */
public class MonthValidator extends CustomValidator {

    /**
     * Проверяет, является ли указанное число месяцем.
     *
     * @param month число для проверки
     * @return true, если указанное число является месяцем
     */
    @Override
    public boolean validate(int month) {
        if (month > 0) {

            if (month <= 12) {
                return true;
            } else {
                System.err.println("Номер месяца не может быть больше 12!");
                return false;
            }

        } else {
            System.err.println("Номер месяца не может меньше единицы!");
            return false;
        }
    }
}
