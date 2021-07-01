/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс для считывания секунды, введенной пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 *
 * @see NumberScanner
 */
public class SecondScanner {

    /**
     * Считывает секунду, введенную пользователем в консоль.
     *
     * @return введеннуя пользователем секунду
     */
    public int readSecond() {
        System.out.print("Введите секунду: ");

        NumberScanner numberScanner = new NumberScanner();
        Validator validator = new Validator();

        //Введенная пользователем секунда
        int insertedSecond = numberScanner.readInt();

        while (!validator.validateOverZero(insertedSecond)) {
            insertedSecond = readSecond();
        }

        return insertedSecond;

    }
}
