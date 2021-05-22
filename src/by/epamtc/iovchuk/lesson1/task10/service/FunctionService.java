/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10.service;

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
     * @param segmentEnd конец отрезка
     * @param segmentStep шаг
     * @return карту вида <Аргумент функции> -- <Значение функции>
     */
    public Map<Double, Double> calculateFunction(double segmentStart,
                                                 double segmentEnd,
                                                 double segmentStep) {

        /*
         * Объекта класса-сервиса для вычисления
         * длины окружности и площади круга
         */

        //Карта значений вида <Аргумент функции> -- <Значение функции>
        Map<Double, Double> functionValuesMap = new LinkedHashMap<>();

        for (double segmentPoint = segmentStart;
             segmentPoint <= segmentEnd;
             segmentPoint += segmentStep) {

            functionValuesMap.put(segmentPoint, Math.tan(segmentPoint));
        }

        return functionValuesMap;
    }
}
