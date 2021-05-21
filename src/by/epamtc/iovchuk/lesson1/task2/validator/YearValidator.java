/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.validator;

import by.epamtc.iovchuk.lesson1.CustomValidator;

/**
 * Класс для проверки корректности номера года.
 */
public class YearValidator extends CustomValidator {

    /**
     * Проверяет, верно ли пользователь ввел год.
     *
     * @param year год для проверки
     * @return true, если пользователь правильно ввел год
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
