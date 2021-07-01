/*
 * Copyright (c) 2021. All rights reserved.
 */

package by.epamtc.iovchuk.lesson1.task10;

import by.epamtc.iovchuk.lesson1.exception.FirstOverLastIndexException;
import by.epamtc.iovchuk.lesson1.task10.entity.Segment;
import by.epamtc.iovchuk.lesson1.task10.scanner.SegmentPointsScanner;
import by.epamtc.iovchuk.lesson1.task10.scanner.SegmentStepScanner;
import by.epamtc.iovchuk.lesson1.task10.service.FunctionService;

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

    public static void main(String[] args) {
        FunctionService functionService = new FunctionService();
        SegmentPointsScanner segmentPointsScanner = new SegmentPointsScanner();
        SegmentStepScanner segmentStepScanner = new SegmentStepScanner();

        double start = segmentPointsScanner.readSegmentStart();
        double end = segmentPointsScanner.readSegmentEnd();
        double step = segmentStepScanner.readStep();

        Segment segment = new Segment(start, end, step);

        Map<Double, Double> functionValuesMap;
        try {
            functionValuesMap = functionService
                    .calculateFunction(
                            segment.getStart(),
                            segment.getEnd(),
                            segment.getStep()
                    );
        } catch (FirstOverLastIndexException e) {
            e.printStackTrace();
            return;
        }

        functionValuesMap.forEach((value, functionValue) ->
                System.out.println(value + " | " + functionValue));

    }

}
