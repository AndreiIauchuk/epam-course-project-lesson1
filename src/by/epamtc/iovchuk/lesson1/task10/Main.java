/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10;

import by.epamtc.iovchuk.lesson1.exception.CustomException;
import by.epamtc.iovchuk.lesson1.scanner.CustomScanner;
import by.epamtc.iovchuk.lesson1.scanner.NumberScanner;
import by.epamtc.iovchuk.lesson1.task10.scanner.SegmentStepScanner;
import by.epamtc.iovchuk.lesson1.task10.service.FunctionService;
import by.epamtc.iovchuk.lesson1.task10.validator.SegmentPointValidator;
import by.epamtc.iovchuk.lesson1.task10.validator.SegmentStepValidator;
import by.epamtc.iovchuk.lesson1.validator.CustomValidator;

import java.util.Map;

/**
 * Составить программу для вычисления значений функции F(x)
 * на отрезке [а, b] с шагом h. Результат представить в виде таблицы,
 * первый столбец которой – значения аргумента,
 * второй - соответствующие значения функции.
 * <blockquote><pre>
 *     F(x) = tg(x)
 * </pre></blockquote>
 * Класс Main.
 *
 * @author Иовчук Андрей
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        /*
         * Класс-сервис для вычисления значений функции F(x) = tg(x)
         * на отрезке [а, b] с шагом h.
         */
        FunctionService functionService = new FunctionService();

        /*
         * Объект класса NumberScanner для считывания
         * из консоли точки на отрезке, введенной пользователем
         */
        CustomScanner segmentPointScanner = new NumberScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенной точки на отрезке
         */
        SegmentPointValidator segmentPointValidator = new SegmentPointValidator();

        /*
         * Объект класса SegmentStepScanner для считывания
         * из консоли шага, введенного пользователем
         */
        CustomScanner segmentStepScanner = new SegmentStepScanner();

        /*
         * Объект валидатора для проверки корректности
         * введенного шага
         */
        CustomValidator segmentStepValidator = new SegmentStepValidator();

        System.out.print("Введите начало отрезка [a,b]: ");

        //Начало отрезка
        double segmentStart = segmentPointScanner.readDouble();

        System.out.print("Введите конец отрезка [a,b]: ");

        //Конец отрезка
        double segmentEnd = segmentPointScanner.readDouble();

        if (segmentPointValidator.validate(segmentStart, segmentEnd)) {

            //Шаг
            double segmentStep = segmentStepScanner.readDouble();

            if (segmentStepValidator.validate(segmentStep)) {

                /*
                 * Карта, содержащая информацию об значении аргументов
                 * и соответсвующих значениях функции.
                 */
                Map<Double, Double> functionValuesMap
                        = functionService.calculateFunction(segmentStart, segmentEnd, segmentStep);

                functionValuesMap.forEach((value, functionValue) ->
                        System.out.println(value + " | " + functionValue));
            }

        }
    }

}
