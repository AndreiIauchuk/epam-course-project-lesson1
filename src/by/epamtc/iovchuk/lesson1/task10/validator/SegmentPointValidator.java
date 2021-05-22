/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.validator;

public class SegmentPointValidator {

    public boolean validate(double segmentStart,
                            double segmentEnd) {
        if (segmentStart < segmentEnd) {
            return true;
        } else {
            System.err.println("Значение конца отрезка должно быть больше " +
                    "значения начала отрезка!");
            return false;
        }
    }
}
