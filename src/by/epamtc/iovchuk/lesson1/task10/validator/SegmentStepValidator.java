/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число шагом.
 */
public class SegmentStepValidator extends CustomValidator {

    /**
     * Проверяет, является ли указанное число шагом.
     *
     * @param step число для проверки
     * @return true, если указанное число является радиусом
     */
    @Override
    public boolean validate(double step) {
        if (step > 0) {
            return true;
        } else {
            System.err.println("Шаг не может быть отрицательным числом!");
            return false;
        }
    }
}
