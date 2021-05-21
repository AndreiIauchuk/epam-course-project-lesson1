/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.ConsoleNumberScanner;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.CustomValidator;
import by.epamtc.iovchuk.lesson1.task2.validator.YearValidator;

/**
 * Класс для считывания года, введенного пользователем в консоль.
 */
public class YearScanner extends CustomScanner {

    /**
     * Считывает год, введенный пользователем в консоль.
     *
     * @return введенный пользователем год
     * @throws CustomException если пользователь неверно ввел год
     */
    @Override
    public int read() throws CustomException {
        System.out.println("Введите год: ");

        /*
         * Объект класса-оболочки ConsoleScanner для считывания
         * из консоли целого числа, введенного пользователем
         */
        ConsoleNumberScanner consoleScanner = new ConsoleNumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного года
         * */
        CustomValidator yearValidator = new YearValidator();

        //Введенный пользователем год
        int insertedYear = consoleScanner.read();

        if (yearValidator.validate(insertedYear)) {
            return insertedYear;
        } else {
            throw new CustomException("Такого года не существует!");
        }
    }
}
