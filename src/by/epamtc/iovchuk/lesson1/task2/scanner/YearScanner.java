/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;
import by.epamtc.iovchuk.lesson1.task2.validator.YearValidator;

/**
 * Класс для считывания года, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 * @see NumberScanner
 */
public class YearScanner extends CustomScanner {

    /**
     * Считывает год, введенный пользователем в консоль.
     *
     * @return введенный пользователем год
     * @throws CustomException если пользователь неверно ввел год
     */
    @Override
    public int readInt() throws CustomException {
        System.out.print("Введите номер года: ");

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner numberScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного года
         * */
        CustomValidator yearValidator = new YearValidator();

        //Введенный пользователем год
        int insertedYear = numberScanner.readInt();

        if (yearValidator.validate(insertedYear)) {
            return insertedYear;
        } else {
            throw new CustomException("Такого года не существует!");
        }
    }
}
