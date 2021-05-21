/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3;

import by.epamtc.iovchuk.lesson1.CustomValidator;

import java.util.Scanner;

public class SquareAreaValidator extends CustomValidator {
    @Override
    /**
     * Проверяет, верно ли пользователь ввел площадь квадрата
     *
     * @param insertedSquareArea площадь квадрата для проверки
     * @return true, если пользователь правильно ввел площадь квадрата
     */
    public boolean validate(double insertedSquareArea) {
        if (consoleScanner.hasNextDouble()) {
            outsideSquareArea = consoleScanner.nextDouble();

            if (outsideSquareArea > 0) {
                consoleScanner.close();
                return true;
            } else {
                System.err.println("Площадь квадрата не может быть отрицательным числом!");
                consoleScanner.close();
                return false;
            }

        } else {
            System.err.println("Введите целое число!");
            consoleScanner.close();
            return false;
        }
    }
}
