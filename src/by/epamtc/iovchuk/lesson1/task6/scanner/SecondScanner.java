/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task6.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task6.validator.SecondValidator;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для считывания секунды, введенной пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания целого числа.
 * </p>
 *
 * @see NumberScanner
 */
public class SecondScanner extends CustomScanner {

    /**
     * Считывает секунду, введенную пользователем в консоль.
     *
     * @return введеннуя пользователем секунду
     * @throws CustomException если пользователь неверно ввел секунду
     */
    @Override
    public int readInt() throws CustomException {
        System.out.print("Введите секунду: ");

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner numberScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного месяца
         * */
        CustomValidator secondValidator = new SecondValidator();

        //Введенная пользователем секунда
        int insertedSecond = numberScanner.readInt();

        if (secondValidator.validate(insertedSecond)) {
            return insertedSecond;
        } else {
            throw new CustomException("Введенное число не является секундой!");
        }
    }
}
