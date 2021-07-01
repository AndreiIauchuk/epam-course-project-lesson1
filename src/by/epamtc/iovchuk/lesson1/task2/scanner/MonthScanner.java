/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

/**
 * Класс для считывания месяца, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 *
 * @see NumberScanner
 */
public class MonthScanner {

    /**
     * Объект класса NumberScanner для считывания
     * из консоли числа, введенного пользователем
     */
    private final NumberScanner numberScanner = new NumberScanner();

    private final static int MIN_MONTH_NUMBER = 1;

    private final static int MAX_MONTH_NUMBER = 12;

    /**
     * Считывает месяц, введенный пользователем в консоль.
     *
     * @return введенный пользователем месяц
     */
    public int readMonth() {
        Validator validator = new Validator();

        System.out.print("Введите номер месяца: ");

        //Введенный пользователем месяц
        int insertedMonth = numberScanner.readInt();

        while (!validator.validateOverOrEqualsMin
                (insertedMonth, MIN_MONTH_NUMBER)) {

            insertedMonth = readMonth();
        }

        while (!validator.validateLessOrEqualsMax
                (insertedMonth, MAX_MONTH_NUMBER)) {

            insertedMonth = readMonth();
        }

        return insertedMonth;
    }

}
