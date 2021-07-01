/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс для считывания радиуса, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания вещественного числа.
 * </p>
 *
 * @see NumberScanner
 */
public class RadiusScanner {

    /**
     * Считывает радиус, введенный пользователем в консоль.
     *
     * @return введеннуя пользователем секунду
     */
    public double readRadius() {
        NumberScanner radiusScanner = new NumberScanner();
        Validator validator = new Validator();

        System.out.print("Введите радиус: ");

        //Введенное пользователем число
        double insertedRadius = radiusScanner.readDouble();

        validator.validateOverZero(insertedRadius);

        while (!validator.validateOverZero(insertedRadius)) {
            insertedRadius = readRadius();
        }

        return insertedRadius;

    }
}
