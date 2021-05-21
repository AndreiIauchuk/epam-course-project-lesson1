/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.ConsoleNumberScanner;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task2.validator.MonthValidator;

/**
 * Класс для считывания месяца, введенного пользователем в консоль.
 */
public class MonthScanner extends CustomScanner {

    /**
     * Считывает месяц, введенный пользователем в консоль.
     *
     * @return введенный пользователем месяц
     * @throws CustomException если пользователь неверно ввел месяц
     */
    @Override
    public int read() throws CustomException {
        System.out.println("Введите месяц: ");

        /*
         * Объект класса-оболочки ConsoleScanner для считывания
         * из консоли целого числа, введенного пользователем
         */
        ConsoleNumberScanner consoleScanner = new ConsoleNumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного месяца
         * */
        MonthValidator monthValidator = new MonthValidator();

        //Введенный пользователем месяц
        int insertedMonth = consoleScanner.read();

        if (monthValidator.validate(insertedMonth)) {
            return insertedMonth;
        } else {
            throw new CustomException("Такого месяца не существует!");
        }
    }

}
