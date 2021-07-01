/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.scanner;

import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.validator.Validator;

public class SegmentStepScanner {

    public double readStep() {
        NumberScanner segmentStepScanner = new NumberScanner();
        Validator validator = new Validator();

        System.out.print("Введите шаг: ");

        //Введенный пользователем шаг
        double insertedStep = segmentStepScanner.readDouble();

        while (!validator.validateOverZero(insertedStep)) {
            insertedStep = readStep();
        }

        return insertedStep;

    }
}
