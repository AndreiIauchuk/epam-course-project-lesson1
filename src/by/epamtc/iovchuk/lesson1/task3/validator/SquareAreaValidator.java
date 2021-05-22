/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3.validator;

import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для проверки, является ли указанное число площадью квадрата.
 */
public class SquareAreaValidator extends CustomValidator {

    /**
     * Проверяет, является ли указанное число площадью квадрата.
     *
     * @param squareArea число для проверки
     * @return true, если указанное число является площадью квадрата
     */
    @Override
    public boolean validate(double squareArea) {
        if (squareArea > 0) {
            return true;
        } else {
            System.err.println("Площадь квадрата должна быть больше нуля!");
            return false;
        }


    }
}
