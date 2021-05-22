/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task2.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.task2.validator.MonthValidator;

/**
 * Класс для считывания месяца, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 * @see NumberScanner
 */
public class MonthScanner extends CustomScanner {

    /**
     * Считывает месяц, введенный пользователем в консоль.
     *
     * @return введенный пользователем месяц
     * @throws CustomException если пользователь неверно ввел месяц
     */
    @Override
    public int readInt() throws CustomException {
        System.out.print("Введите номер месяц: ");

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner numberScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного месяца
         * */
        MonthValidator monthValidator = new MonthValidator();

        //Введенный пользователем месяц
        int insertedMonth = numberScanner.readInt();

        if (monthValidator.validate(insertedMonth)) {
            return insertedMonth;
        } else {
            throw new CustomException("Такого месяца не существует!");
        }
    }

}
