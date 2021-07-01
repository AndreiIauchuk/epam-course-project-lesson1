/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс для считывания площади квадрата, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания вещественного числа.
 * </p>
 * @see NumberScanner
 */
public class SquareAreaScanner {

    /**
     * Считывает площадь внешнего квадрата,
     * введенную пользователем в консоль.
     *
     * @return введенный пользователем месяц
     */
    public double readSquare() {
        NumberScanner squareAreaScanner = new NumberScanner();
        Validator validator = new Validator();

        System.out.print("Введите площадь внешнего квадрата: ");

        //Введенный пользователем год
        double insertedSquareArea = squareAreaScanner.readDouble();

        while (!validator.validateOverZero(insertedSquareArea)) {
            insertedSquareArea = readSquare();
        }

        return insertedSquareArea;

    }
}
