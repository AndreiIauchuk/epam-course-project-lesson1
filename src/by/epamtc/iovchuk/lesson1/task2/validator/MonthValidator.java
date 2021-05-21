/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.validator;

import by.epamtc.iovchuk.lesson1.CustomValidator;

/**
 * Класс для проверки корректности номера месяца.
 */
public class MonthValidator extends CustomValidator {

    /**
     * Проверяет, верно ли пользователь ввел месяц.
     *
     * @param month месяц для проверки
     * @return true, если пользователь правильно ввел месяц
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
