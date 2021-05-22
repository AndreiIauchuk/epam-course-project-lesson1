/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task3.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.task3.validator.SquareAreaValidator;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;

/**
 * Класс для считывания площади квадрата, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания вещественного числа.
 * </p>
 * @see NumberScanner
 */
public class SquareAreaScanner extends CustomScanner {

    /**
     * Считывает площадь внешнего квадрата,
     * введенную пользователем в консоль.
     *
     * @return введенный пользователем месяц
     * @throws CustomException если пользователь неверно ввел площадь
     */
    @Override
    public double readDouble() throws CustomException {
        System.out.print("Введите площадь внешнего квадрата: ");

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner squareAreaScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного года
         * */
        CustomValidator squareAreaValidator = new SquareAreaValidator();

        //Введенный пользователем год
        double insertedSquareArea = squareAreaScanner.readDouble();

        if (squareAreaValidator.validate(insertedSquareArea)) {
            return insertedSquareArea;
        } else {
            throw new CustomException("Введенное число не является площадью квадрата!");
        }
    }
}
