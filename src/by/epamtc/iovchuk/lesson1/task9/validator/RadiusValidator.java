/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число радиусом.
 */
public class RadiusValidator extends CustomValidator {

    /**
     * Проверяет, является ли указанное число радиусом.
     *
     * @param radius число для проверки
     * @return true, если указанное число является радиусом
     */
    @Override
    public boolean validate(double radius) {
        if (radius > 0) {
            return true;
        } else {
            System.err.println("Радиус не может быть отрицательным числом!");
            return false;
        }
    }

}
