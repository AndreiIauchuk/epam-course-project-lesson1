/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.service;

import by.epamtc.iovchuk.lesson1.exception.FirstOverLastIndexException;
import by.epamtc.iovchuk.lesson1.validator.Validator;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Класс-сервис для вычисления значений функции F(x) = tg(x)
 * на отрезке [а, b] с шагом h.
 */
public class FunctionService {

    /**
     * Вычисляет значений функции F(x) = tg(x)
     * на отрезке [а, b] с шагом h.
     *
     * @param segmentStart начало отрезка
     * @param segmentEnd   конец отрезка
     * @param segmentStep  шаг
     * @return пару вида <Аргумент функции> -- <Значение функции>,
     * либо null, если неверно указаны параметры отрезка
     * @throws FirstOverLastIndexException если индекс начала отрезка
     *                                     больше индекса конца отрезка
     */
    public Map<Double, Double> calculateFunction(double segmentStart, double segmentEnd, double segmentStep)
            throws FirstOverLastIndexException {

        Validator validator = new Validator();

        if (!validator.validateFirstIndexLessThenLast(segmentStart, segmentEnd)) {
            throw new FirstOverLastIndexException();
        }

        if (!validator.validateOverZero(segmentStep)) {
           return null;
        }

        Map<Double, Double> functionValuesMap = new LinkedHashMap<>();

        for (double segmentPoint = segmentStart;
             segmentPoint <= segmentEnd;
             segmentPoint += segmentStep) {

            functionValuesMap.put(segmentPoint, Math.tan(segmentPoint));
        }

        return functionValuesMap;
    }
}
