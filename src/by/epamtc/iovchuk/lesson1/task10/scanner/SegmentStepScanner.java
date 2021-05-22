/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.scanner;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task10.validator.SegmentStepValidator;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

public class SegmentStepScanner extends CustomScanner {

    @Override
    public double readDouble() throws CustomException {

        /*
         * Объект класса NumberScanner для считывания
         * из консоли точки на отрезке, введенной пользователем
         */
        CustomScanner segmentPointScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного шага на отрезке
         * */
        CustomValidator segmentStepValidator = new SegmentStepValidator();

        System.out.print("Введите шаг: ");

        //Введенный пользователем шаг
        double insertedStep = segmentPointScanner.readDouble();

        if (segmentStepValidator.validate(insertedStep)) {
            return insertedStep;
        } else {
            throw new CustomException("Введенное число не является шагом!");
        }

    }
}
