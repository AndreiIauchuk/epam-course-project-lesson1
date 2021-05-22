/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task9.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task9.validator.RadiusValidator;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

/**
 * Класс для считывания радиуса, введенного пользователем в консоль.
 * <p>
 * Использует класс {@code NumberScanner} для считывания вещественного числа.
 * </p>
 *
 * @see NumberScanner
 */
public class RadiusScanner extends CustomScanner {

    /**
     * Считывает радиус, введенный пользователем в консоль.
     *
     * @return введеннуя пользователем секунду
     * @throws CustomException если пользователь неверно ввел секунду
     */
    @Override
    public double readDouble() throws CustomException {

        /*
         * Объект класса NumberScanner для считывания
         * из консоли числа, введенного пользователем
         */
        CustomScanner radiusScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного радиуса
         * */
        CustomValidator radiusValidator = new RadiusValidator();

        System.out.print("Введите радиус: ");

        //Введенное пользователем число
        double insertedRadius = radiusScanner.readDouble();

        if (radiusValidator.validate(insertedRadius)) {
            return insertedRadius;
        } else {
            throw new CustomException("Введенное число не является радиусом!");
        }
    }
}
