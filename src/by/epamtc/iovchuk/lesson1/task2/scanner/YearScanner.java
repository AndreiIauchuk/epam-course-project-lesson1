/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс для считывания года, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 *
 * @see NumberScanner
 */
public class YearScanner {

    /**
     * Объект класса NumberScanner для считывания
     * из консоли числа, введенного пользователем
     */
    private final NumberScanner numberScanner = new NumberScanner();

    /**
     * Считывает год, введенный пользователем в консоль.
     *
     * @return введенный пользователем год
     */
    public int readYear() {
        Validator validator = new Validator();

        System.out.print("Введите номер года: ");

        //Введенный пользователем год
        int insertedYear = numberScanner.readInt();

        while (!validator.validateOverOrEqualsZero(insertedYear)) {
            insertedYear = readYear();
        }

        return insertedYear;
    }
}

